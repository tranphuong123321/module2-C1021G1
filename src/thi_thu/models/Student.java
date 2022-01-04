package thi_thu.models;

public class Student  extends Person{
    private String className;
    private int score;

    public Student() {
    }

    public Student(String className, int score) {
        this.className = className;
        this.score = score;
    }

    public Student(int id, String name, String dateOfBirth, String gender, String className, int score) {
        super(id, name, dateOfBirth, gender);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", score=" + score +
                '}';
    }
}
