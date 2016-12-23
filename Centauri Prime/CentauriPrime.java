import java.util.*;
public class CentauriPrime{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());

        for(int i=1;i<=t;i++){
            String country = sc.nextLine().toLowerCase();
            char lastLetter = country.charAt(country.length() - 1);
            String ruler;
            switch(lastLetter){

                case 'y': ruler= "nobody";
                          break;
                case 'a': case 'e': case 'i': case 'o': case 'u': ruler = "a queen";
                break;

                default : ruler = "a king";
                          break; 
            }
                String str = String.format("Case #%d: %s is ruled by %s.", i, country, ruler);
               System.out.println(str);
            
        }
    }
}