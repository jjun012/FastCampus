package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] std= new Student[4];
        std[0]=new Student("홍길동","컴공",33,"bit@empas.com",2023110,"010-1111-1111");
        std[1]=new Student("나길동","정통",23,"bit@empas.com",2023111,"010-1111-2222");
        std[2]=new Student("다길동","미소",20,"bit@empas.com",2023112,"010-1111-3333");
        std[3]=new Student("라길동","건축",27,"bit@empas.com",2023113,"010-1111-4444");
        for(int i=0;i<std.length;i++){
            System.out.println(std[i].toString());
        }
    }
}
