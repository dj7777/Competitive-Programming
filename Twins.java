import java.util.*;
public class Twins{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val[] =new int[n];
        int total=0,count=0;
        for(int i=0;i<n;i++){
            total += (val[i] = sc.nextInt());
        }       
        int half = total/2;
        int newTotal=0;
        Arrays.sort(val);
        for(int i=n-1;i>=0;i--){
            newTotal += val[i];
            count++;
            if(newTotal>half){
                break;
            }
        }   
        System.out.println(count);
    }
}