import java.util.Scanner;
public class Symmetric{
     public static void main(String args[]) {
 
        Scanner sc=new Scanner(System.in);
        int i,j,flag=0;
    
        System.out.println("Enter number of rows and columns");
        int n = sc.nextInt();

        int a[][]= new int[n][n];

        System.out.println(" Enter elements of Matrix");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
        if(i!=j){
            if(a[i][j]==a[j][i]){
                flag=1;
            }
        }
            }
            if(flag==1)
            {
            System.out.println("Matrix is symmetric");
            }
            else{
            System.out.println("Matrix is not symmetric");
        }
        }
        
     
     }
}