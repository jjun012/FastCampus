package fc.java.part2;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = 10;
        if (x >= 0) {
            System.out.println("0or양수압니다");
        } else {
            System.out.println("음수입니다");
        }
        Scanner scan=new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("짝수입니다");
        }else{
            System.out.println("홀수입니다");
        }
        System.out.print("정수를 입력하세요: ");
        int nu=scan.nextInt();
        if(nu%12==0){
            System.out.println("12의 배수입니다");
        }else{
            System.out.println("12의 배수가 아닙니다");
        }
        System.out.print("년도를 입력하세요: ");
        int year=scan.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("윤년입니다");
        }else{
            System.out.println("윤년이 아닙니다");
        }

    }
}