package SOAL;

public class teacher {

    private String subject;

    public teacher(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void print() {
        System.out.println(subject);
    }

}