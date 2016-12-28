import java.util.*;
public class SoldierAndBananas{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k,n,w,sum=0;
        k= sc.nextInt(); n=sc.nextInt(); w=sc.nextInt();
        for(int i=1;i<=w;i++){
            sum += i*k;
        }
        int bal = sum - n;
        if(bal>0)
          System.out.print(bal);
        else
          System.out.print("0");
    }
}