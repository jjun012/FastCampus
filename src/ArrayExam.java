public class ArrayExam {
    public static void main(String[] args) {

        int a;
        a=10;

        int[] b=new int [3];

        int[] x={1,2,3,4,5};
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

        char[] c={'A','P','P','L','E'};
        for(int i=0;i<c.length;i++ )
        {
            System.out.print((char)(c[i]+32));
        }
    }
}
