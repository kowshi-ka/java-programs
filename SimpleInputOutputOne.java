import java.util.*;

public class SimpleInputOutputOne{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()){
            int n=scan.nextInt();
            System.out.println(n);
        }
    }
}
//I/P = 42
//      100
//      125
//O/P = 42
//      100
//      125
