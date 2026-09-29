import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Welcome to CFS</h2>");
        out.println("<p>You can contact us 7455064261</p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String course = req.getParameter("course");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Students Details:</h2>");
        out.println("<p>Student Name: "+name+" </p>");
        out.println("<p>Student Course: "+course+" </p>");
    }
}
