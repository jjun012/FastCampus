package fc.java.part2;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        int [][] a=new int[2][4];

        a[0][0]=10;
        a[0][1]=20;
        a[0][2]=30;
        a[0][3]=40;

        a[1][0]=50;
        a[1][1]=60;
        a[1][2]=70;
        a[1][3]=80;

        System.out.println(a[0][0]+"\t"+a[0][1]);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}
