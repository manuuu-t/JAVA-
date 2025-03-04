import java.util.Scanner;

class Student{
    String name;
    int Rollno;
    String group;

    Student(String name,int Rollno,String group){
    this.name = name;
    this.Rollno=Rollno;
    this.group=group;
    }
    public void printDetails(){
        
        System.out.println("Name :"+this.name+ ", Rollno : "+this.Rollno+ ", Group :"+this.group);

    }
}




public class Mrp{
    
    public static void main(String[] args ){

        Scanner sc =new Scanner(System.in);
        Student stud[]=new Student[3];
        for(int i=0;i<3;i++){
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter Rollno");
        int Rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Group :");
        String group = sc.nextLine();

        stud[i]= new Student(name,Rollno,group);
        }

        for(int i=0;i<3;i++){
        stud[i].printDetails();
        
        }

        
        sc.close();

    }
}
