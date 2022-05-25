import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Simpleifelse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.print("Weird");
        }else if(n%2==0&&n>=2&&n<=5){
            System.out.print("Not Weird");
        }else if(n%2==0&&n>=6&&n<=20){
            System.out.print("Weird");
        }else if(n%2==0&&n>=20){
            System.out.print("Not Weird");
        }
    }
    }
