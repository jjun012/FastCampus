package fc.java.part2;

import java.io.*;
import java.util.*;

public class CallByReferenceExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        int[] num= new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            num[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<n;i++){
            if(num[i]>num[i+1]){
                num[i]=max;
            }else if(num[i]<num[i+1]){

            }
        }
    }
}