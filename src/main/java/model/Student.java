package model;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String fio;
    private String mark;
    private String subject;

    public Student(HttpServletRequest request) {
        this.fio = request.getParameter("lastName") + " "
                + request.getParameter("name") + " "
                + request.getParameter("patronymic");
        this.mark = request.getParameter("mark");
        this.subject = request.getParameter("subject");
    }

    public Student() {

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return fio + " " + subject + " " + mark;
    }
}
