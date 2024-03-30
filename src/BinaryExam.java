public class BinaryExam {
    public static void main(String[] args){
        int decimal=123;
        System.out.println("decimal = " + decimal);
        String binary=Integer.toBinaryString(decimal);
        System.out.println("binary = " + binary);
        String octal=Integer.toOctalString(decimal);
        System.out.println("octal = " + octal);
        String hexa=Integer.toHexString(decimal);
        System.out.println("hexa = " + hexa);
        
        int x=123;
        System.out.println("x = " + x);
        int y=0b1111011;
        System.out.println("y = " + y);
        int z=0173;
        System.out.println("z = " + z);
        int u=0x7b;
        System.out.println("u = " + u);
}}
