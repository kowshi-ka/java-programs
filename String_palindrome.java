import java.util.*;
public class Main
{
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s="";
	    while(sc.hasNext()){
	         s=sc.next();
	        String h="";
	        int l=s.length();
	        for(int i=l-1;i>=0;i--){
	            h+=s.charAt(i);
	        }
	        if(s.equals(h)){
	            break;
	        }else{
	            continue;
	        }
	    }
	    System.out.println("Palindrome found "+s);
	}
}
/*
sample input 1
hai
bai
.
.
.
mam
sample output -> Palindrome found mam
*/
