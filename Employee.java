import java.util.Scanner;

class Emp{
    int eno,salary;
    String name;

    Emp(int eno,String name,int salary){
        this.eno=eno;
        this.name=name;
        this.salary=salary;
    }
    public void printDetails(){

        System.out.println("Employe number  "+eno+", Name : "+name+ ", Salary : "+salary);
    }


}

public class Employee{
    public static void main(operation[] args){
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter no of Employees to be ");
        int n=sc.nextInt();
        Emp a[]= new Emp[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter employee number");
            int eno=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter name of employee");
            String name=sc.nextLine();
            System.out.println("Enter salary");
            int salary=sc.nextInt();
            a[i]=new Emp(eno,name,salary);
        }

        for(int i=0;i<n;i++){
            a[i].printDetails();
        }

        System.out.println(("Enter the emolyee number of employee to be searched"));
        int s=sc.nextInt();
        for(int i=0;i<n;i++){
            if(s==a[i].eno){
                a[i].printDetails();
            }
        }


        sc.close();
    }
   
}
