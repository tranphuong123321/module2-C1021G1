package bai_5_access_modifier.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name;
    private String classes;
    public Student(){
        this.name = "Trong";
        this.classes = "C09";
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Student test1 = new Student("Son","C10");
        System.out.println(test1);
        Student test = new Student();
        System.out.println(test);
    }
}

