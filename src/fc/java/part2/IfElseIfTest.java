package fc.java.part2;

public class IfElseIfTest {
    public static void main(String[] args) {
        int x = 84;
        if (x >= 0 && x <= 100) {
            if (x >= 90) {
                System.out.println("A반");
            } else if (x >= 85) {
                System.out.println("B반");
            } else {
                System.out.println("C반");
            }
        }else{
            System.out.println("유효한 점수가 아니다");
        }
    }
}
