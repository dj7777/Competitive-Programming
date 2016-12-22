import java.util.*;
public class Reverse{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int nLine = Integer.valueOf(sc.nextLine());
        for(int i=1;i<=nLine;i++){
            String line = sc.nextLine();
            String words[] = line.split(" ");
            String reversedLine = "";
            for(int j= words.length-1; j>=0;j--){
                reversedLine += " " + words[j];
            }
            System.out.println("Case #" + i + ":" + reversedLine );
        } 
    }
}
