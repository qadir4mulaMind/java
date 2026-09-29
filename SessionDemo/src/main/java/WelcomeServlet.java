import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        String name = (session != null) ? (String) session.getAttribute("userName") : "Guest";
        String course = (session != null) ? (String) session.getAttribute("course") : "Not Available";

        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equalsIgnoreCase("user")){
                    String cookiesUser = URLDecoder.decode(c.getValue(), StandardCharsets.UTF_8);
                }
            }
        }

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Welcome Buddy, "+name+"</h2>");
        out.println("<h2>Your course: "+course+"</h2>");
    }
}
