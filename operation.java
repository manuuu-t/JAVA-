import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Enter your first name");
        String fname=sc.nextLine();
        System.out.println("Enter your last name");
        String lname=sc.nextLine();

        System.out.print(("Fullname :"));
        System.out.println(fname.concat(lname));
        
        












        sc.close();
    }
    
}
