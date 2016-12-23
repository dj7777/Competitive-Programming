import java.util.*;
public class Tram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b,d=0,e=0;
        for(int i=1;i<=n;i++){
            a= sc.nextInt();
            b= sc.nextInt();

            d=d-a+b;
            if(d>e){
                e=d;
            }      
        }
        System.out.println(e);
    }    

}
