import java.util.Scanner;
public class Search{
     public static void main(String args[]) {
 
        Scanner sc=new Scanner(System.in);
        int i;

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int a[]= new int[n];

        System.out.println(" Enter elements of Matrix");
        for(i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

        System.out.println("Enter the number to be searched");
        int m = sc.nextInt();

        for(i=0;i<n;i++){
                if(m==a[i]){
                    System.out.println("Element found");
                }
                else{
                    System.out.println("Not found");
                }
            }



        }
}