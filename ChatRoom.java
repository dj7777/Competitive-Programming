import java.util.*;
public class ChatRoom{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word.chars().distinct().count()%2 ==0 ? "CHAT WITH HER!" : "IGNORE HIM!");
         
         
    }
}