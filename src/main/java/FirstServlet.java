import converter.FileConverter;
import model.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/set-data")
public class FirstServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1>Post</h1>");
        Student student = new Student(request);
        FileConverter file = new FileConverter(student);
        pw.println("<p>" + file.toFile() + "</p>");
        pw.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1>Hello world<h1>");
        pw.println(request.getParameter("mail"));
        pw.println("</html>");
    }
}
