import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String course = req.getParameter("course");

        HttpSession session = req.getSession();
        session.setAttribute("userName", name);
        session.setAttribute("course", course);

        String encodeName = URLEncoder.encode(name, StandardCharsets.UTF_8);
        Cookie cookie = new Cookie("user", encodeName);
        cookie.setMaxAge(60 * 60);
        res.addCookie(cookie);

        res.sendRedirect("welcome");
    }
}
