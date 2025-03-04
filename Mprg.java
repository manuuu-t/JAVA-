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




public class Mprg {
    
    public static void main(String[] args ){

        Student student1= new Student("Manu",07,"Green");
        Student student2= new Student("Liza",06,"Red");
        Student student3= new Student("Leo",05,"Yellow");


        student1.printDetails();
        student2.printDetails();
        student3.printDetails();

        

    }
}
