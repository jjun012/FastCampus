package fc.java.part4;

public class Employee{
    private String name;
    private int age;
    private String phone;
    private String emDate;
    private String dept;
    private boolean marriage;
    public Employee(){
        super();
    }

    public Employee(String name, int age, String phone, String emDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.emDate = emDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", emDate='" + emDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
