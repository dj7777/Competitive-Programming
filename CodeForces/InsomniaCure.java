import java.util.*;
public class InsomniaCure{
    public static void main(String args[]){
        int k,l,m,n,d,c=0;
        Scanner sc = new Scanner(System.in);
        k= sc.nextInt();
        l= sc.nextInt();
        m = sc.nextInt();
        n = sc.nextInt();
        d = sc.nextInt();

        for(int i=1;i<=d;i++){
            if(i%k == 0 || i%l ==0 || i%m ==0 || i%n ==0){
                c++;
            }
        }
        System.out.println(c);
    }
}