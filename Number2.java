import java.util.Scanner;

public class Number2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int v;
           if(i%2==0){
            v=i*n+1;
           
            for(int j=1;j<=n;j++){
                
               System.out.print(v + " ");
               v++;
            }
        }
        else{
            v=i*n+n;
           
            for(int j=1;j<=n;j++){
                
               System.out.print(v + " ");
               v--;
            }
        }

            
            System.out.println();
        }


sc.close();
}
}
