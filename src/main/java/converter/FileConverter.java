package converter;

import model.Student;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileConverter {

    private final String path;
    private final Student student;

    public FileConverter(Student student) {
        this.path = "src/main/files/" + student.getFio() + ".txt";;
        this.student = student;
    }

    public String toFile() {

        StringBuilder response = new StringBuilder();

        if (checkStudent()) {
            return "Error. У студента уже есть оценка по этому предмету";
        }

        try
        {

            writeMark();

            FileReader reader = new FileReader(path);
            Scanner scan = new Scanner(reader);

            response.append("Название файла: ");
            response.append(student.getFio());
            response.append("<br><br>Содержание файла:<br>");

            while(scan.hasNextLine()) {
                response.append(scan.nextLine());
                response.append("<br>");
            }

            return response.toString();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return "Error";
    }

    private boolean checkStudent() {

        if (!(new File(path).isFile())) {
            return false;
        } else {
            return checkMark();
        }
    }

    private boolean checkMark() {

        try {

            FileReader reader = new FileReader(path);
            Scanner scan = new Scanner(reader);

            while(scan.hasNextLine()) {
                String subMark = scan.nextLine();
                if (!subMark.equals("")) {
                    String[] subMarkLine = subMark.split(" ");
                    String subject = subMarkLine[0];
                    String mark = subMarkLine[1];

                    if (subject.equals(student.getSubject()) && !mark.equals("2")) {
                        return true;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        return false;
    }

    private void writeMark() throws IOException {

        if ((new File(path).isFile())) {

            if (checkMarkExist()) {
                rewriteMark();
            } else {
                addMark();
            }
        } else {
            addMark();
        }
    }

    private boolean checkMarkExist() throws IOException {
        FileReader fr= new FileReader(path);
        Scanner scan = new Scanner(fr);

        int i = 1;

        while (scan.hasNextLine()) {
            String subString = scan.nextLine();
            if (!subString.equals("")) {
                String line = subString.split(" ")[0];
                if (line.equals(student.getSubject())){
                    return true;
                }
            }
        }

        fr.close();
        return false;
    }

    private void rewriteMark() throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(path));

        int i = 0;
        for (String s : lines) {
            if (!s.equals(""))
            {
                if (s.split(" ")[0].equals(student.getSubject())) {
                    lines.set(i, student.getSubject() + " " + student.getMark());
                }
            }
            i++;
        }

        Files.write(Paths.get(path), lines);
    }

    private void addMark() throws IOException {
        FileWriter writer = new FileWriter(path, true);
        writer.append(student.getSubject()).append(" ").append(student.getMark()).append("\n");
        writer.flush();
    }
}
