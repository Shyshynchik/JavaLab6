import converter.FileConverter;
import model.Student;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;

@WebServlet(value = "/set-data")
public class FirstServlet extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter pw;
        try {
            pw = response.getWriter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        pw.println("<html>");
        pw.println("<h1>Post</h1>");

        Student student = new Student(request);

        FileConverter file = new FileConverter(student);

        String studentMarks = null;

        try {

            studentMarks = file.write();

        } catch (FileAlreadyExistsException e) {

            String path = request.getContextPath() + "/error";
            response.sendRedirect(path);

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);

        }
        pw.println("<p>" + studentMarks + "</p>");
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
