// You are using Java
import java.util.Scanner;
class Addarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        int ele=sc.nextInt();
        //int c=0;
        //int brr[]=new int[c];
        for(int i=0;i<n;i++){
            if(i+1==pos){
                System.out.print(ele+" ");
            }
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        int h=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j])
                    h=arr[i];
            }
        }
        System.out.print(h+" ");
    }
}



















