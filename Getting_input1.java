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
