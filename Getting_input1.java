/*============================================================ 

Program for count number of input lines until the user enters -1 

============================================================*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s="";
	    int n=0;
	    while(sc.hasNextLine()){
            s=sc.nextLine();
            //System.out.println(s);
            if(s.equals("-1")){
                System.out.println(n);
                break;
            }
            else{
                n++;
                //System.out.print(s+" ");
            }
	    }
	}
}
/*
sample input 1
	24 
	hi 
	hello
	-1 
sample output -> 3

sample input 2
	hai hello 24
	-1 dad addakjda
	-1
sample output -> 2
*/
