package converter;

import model.Student;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileConverter {

    private final String path;
    private final Student student;

    public FileConverter(Student student) {
        this.path = "src/main/files/" + student.getFio() + ".txt";
        this.student = student;
    }

    public String write() throws IOException {

        if (!isFileExists()) {
            File newFile = new File(path);
            newFile.createNewFile();
        }

        if (isMarkExists()) {
            throw new FileAlreadyExistsException("");
        }

        List<String> lines;

        try {
            lines = rewriteMark();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return getStringResponse(lines);
    }

    private boolean isFileExists() {
        return new File(path).isFile();
    }

    private boolean isMarkExists() throws FileNotFoundException {
        FileReader reader = new FileReader(path);
        Scanner scan = new Scanner(reader);

        while (scan.hasNextLine()) {
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

        return false;
    }

    private List<String> rewriteMark() throws IOException {
        Path filePath = Paths.get(path);

        List<String> lines = Files.readAllLines(filePath);

        int i = 0;
        boolean flag = true;
        for (String s : lines) {
            if (!s.equals("")) {
                if (s.split(" ")[0].equals(student.getSubject())) {
                    lines.set(i, student.getSubject() + " " + student.getMark());
                    flag = false;
                }
            }
            i++;
        }

        if (flag) {
            lines.add(student.getSubject() + " " + student.getMark());
        }

        Files.write(filePath, lines);
        return lines;
    }

    private String getStringResponse(List<String> lines) {
        StringBuilder response = new StringBuilder();

        response.append("Название файла: ");
        response.append(student.getFio());
        response.append("<br><br>Содержание файла:<br>");

        for (String line : lines) {
            response.append(line);
            response.append("<br>");
        }

        return response.toString();
    }
}
