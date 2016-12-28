/*
    Codeforces Question
*/

import java.util.*;
public class StonesOnTheTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char []stones = sc.next().toCharArray();
        int count =0;
         for(int i=0;i<n-1;i++){
             if(stones[i] == stones[i+1]){
                 count++;
             }
         }
         System.out.print(count);

    }
}