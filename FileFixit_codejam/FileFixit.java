import java.util.*;
public class FileFixit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
            String []line = sc.nextLine().split(" ");
            int n = Integer.valueOf(line[0]);
            int m = Integer.valueOf(line[1]);

            Node root = new Node("");

            for(int j=1;j<=n;j++){
                String path = sc.nextLine();
                root.mkdir(path);
            }

            int counter =0;
            for(int j=1;j<=m;j++){
                String path = sc.nextLine();
                counter += root.mkdir(path);
            }
              System.out.printf("Case #%d: %d\n", i, counter);
        }
    }
}

class Node{
    public String directoryName;
    public List<Node> subDirectories = new ArrayList<Node>();

    public Node(String directoryName){
        this.directoryName = directoryName;
    }

    public int mkdir(String path){

        if(path == null)
           return 0;

        String[] splitPath =splitUpPath(path);

        // check if sub directory already exist
        for(Node directory : subDirectories){
                if(directory.directoryName.equals(splitPath[0])){
                    return directory.mkdir(splitPath[1]);
                }
        }

        // create subDirectory

        Node node =new Node(splitPath[0]);
        subDirectories.add(node);
        return 1+ node.mkdir(splitPath[1]);
    }

    public String[] splitUpPath(String path){

        String []arr = new String[2];

        // remove first slash
        path = path.substring(1);

        int index = path.indexOf("/");

        // no sub directory
        if(index == -1 ){
            arr[0] = path;
            arr[1] = null;
        }

        else{
            arr[0] = path.substring(0,index);
            arr[1] = path.substring(index);
        }

        return arr;
    }

}