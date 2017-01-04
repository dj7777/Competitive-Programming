import java.util.*;
public class BeautifulYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year= sc.nextInt();
        int d,e,f,g;
        //1987
        for(int i=year+1;i<=9999;i++){
            d= i%10; //1987%10 =7
            e= (i/10)%10; // 8
            f= (i/100)%10; //9
            g= (i/1000);
            if(d!=e && d!=f && d!=g && e!=f && e!=g && f!=g){
                System.out.println(i);
                break;
            }
        }
    }
}