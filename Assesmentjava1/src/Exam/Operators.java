package Exam;
import java.util.Scanner;
public class Operators{
    public static void main(String[] args) {

        int num1,num2;
        double s1=0;
        char operator;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a values:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("select the operator : +,-,*,/");
        operator=sc.next().charAt(0);

        switch(operator)
        {
            case '+':
                s1=num1+num2;
                break;
            case '-':
                s1=num1-num2;
                break;
            case '*':
                s1=num1*num2;
                break;
            case '/':
                s1=num1/num2;
                break;
            case '%':
                s1=num1%num2;
                break;
            default :
                System.out.println("invalid operation");
                break;
        }
        System.out.println("The Output is:"+s1);


    }
}
