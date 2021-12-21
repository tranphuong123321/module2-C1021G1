package case_study.models;

public class Employee extends Person {
    String id;
    String name;
    String age;
    String sex;
    String idCard;
    String email;
    String level;
    String position;
    String salary;

    public Employee(int id, String name, int age, String address, String id1, String name1, String age1, String sex, String idCard, String email, String level, String position, String salary) {
        super(id, name, age, address);
        this.id = id1;
        this.name = name1;
        this.age = age1;
        this.sex = sex;
        this.idCard = idCard;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
