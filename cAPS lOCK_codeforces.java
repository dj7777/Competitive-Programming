import java.util.*;
public class capsLock{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        if(word.matches("^[a-z]?[A-Z]*$")){
            String ans = word.toLowerCase();
            if(word.charAt(0)>='a' && word.charAt(0)<= 'z'){
                ans = ans.substring(0,1).toUpperCase() + ans.substring(1);
            }
            word = ans;
        }
        System.out.println(word);
    }
}