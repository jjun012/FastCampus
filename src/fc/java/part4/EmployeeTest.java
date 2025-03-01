package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        RempVO vo= new RempVO("홍길동", 35,"010-1111-1111","2022-10-10","홍보부",true);

        // System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone+"\t"+vo.emDate+"\t"+vo.dept+"\t"+vo.marriage);
        System.out.println(vo.toString());
    }
}
