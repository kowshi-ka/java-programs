import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean  s=false;
	    for(int i=1;i<=n;i++){
	        if(i*i==n){
	            s=true;
	            break;
	        }
	    }
	    if(s==true && n%4==0){
	        System.out.println("Perfect Square and Leap year");
	    }else if(s==true){
	        System.out.println("Perfect Square");
	    }else if(n%4==0){
	        System.out.println("leap year");
	    }else
	        System.out.println("-1");
  }
}
