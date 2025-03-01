package fc.java.part2;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit=3625;
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);

        int num=2579;

        int su=5;
        if(su%2==0){
            System.out.println("작수입니다");
        }else{
            System.out.println("홀수입니ㅏ");
        }
    }
}
