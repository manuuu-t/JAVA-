import java.util.*;
public class Complex{
    public static void main(String[] args){
       
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the real part of the  First complex number");
        int  x1 =sc.nextInt();
        System.out.println("Enter the imaginary part of the First complex number");
        int y1 =sc.nextInt();
        System.out.println("Enter the real part of the  Second complex number");
        int  x2 =sc.nextInt();
        System.out.println("Enter the imaginary part of the Second complex number");
        int y2 =sc.nextInt();
        System.out.println("First Complex number : "+ x1 + "+" + y1 +"i");
        System.out.println("First Complex number : "+ x2 + "+" + y2 +"i");
        int sum1=x1+x2;
        int sum2=y1+y2;
        System.out.println("Sum of both complex number is "+ sum1 + " + " + sum2 + "i");

    }
}