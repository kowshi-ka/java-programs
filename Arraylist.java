import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int pos=sc.nextInt();
        int num=sc.nextInt();
        
        for(int i=0;i<=n;i++){
            if(i==pos-1){
                al.add(i,num);
            }
        }
        for(int i=0;i<=n;i++){
            System.out.print(al.get(i)+" ");
        }
	}
}
/*
5
1 3 5 7  8
2 5 
op 
1 5 3 5 7 8
*/
