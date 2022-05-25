import java.util.Scanner;

public Intendation{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int l3=s1.length();
                int x=sc.nextInt();
                String s=String.valueOf(x);
                int l1=s.length();
                // String c="00";
                // String v="0";
                if(l1==1){
                    s="00"+s;
                }else if(l1==2){
                    s="0"+s;
                }
                //System.out.print(c);
                //System.out.print(s);
                int h=15-l3;
                System.out.print(s1);
                for(int j=0;j<h;j++){
                    System.out.print(" ");
                }
                System.out.print(s);
                System.out.println();
            }
          
            System.out.println("================================");

    }
}



