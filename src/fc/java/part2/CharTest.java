package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        char c='A';
        System.out.println("c = " + c);
        int a='A';
        System.out.println("a = " + a);
        int b='B'+1;
        System.out.println("(char)b = " + (char)b);
        char han='가';
        System.out.println("han = " + han);
        int hand='가';
        System.out.println("hand = " + hand);
        int hanU='\uAC00';
        System.out.println("(char)hanU = " + (char)hanU);
        char upp='A';
        char low=(char)(upp+32);
        System.out.println("low = " + low);
        char low1='u';
        char upp1=(char)(low1-32);
        System.out.println("upp1 = " + upp1);
        int data='1'+'2';
        System.out.println("data = " + data);
        char i='1'-48;
        char j='2'-48;
        int sum=i+j;
        System.out.println("sum = " + sum);
    }
}
