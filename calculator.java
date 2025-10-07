import java.util.Scanner;

public class calculator {
    static int add(int a,int b){
        return(a+b);
    }
    static void add(double a,double b){
        System.out.println("Result="+(a+b));
    }
    static void add(int a,int b,int c){
        System.out.println("Result="+(a+b+c));
    }
    static void subtract(int a,int b){
        System.out.println("Result="+(a-b));
    }
    static void multiply(int a,int b){
        System.out.println("Result="+(a*b));
    }
    static void divide(int a,int b){
        if(b==0){
            System.out.println("Denominator cannot be zero");
        }
        else{
            if(a%b==0){
                System.out.println("Result="+(a/b));
            }
            else{
                System.out.println("Quotient="+(a/b));
                System.out.println("Remainder="+(a%b));
            }
        }
    }
}
class UserInterface{
   static Scanner input=new Scanner(System.in);
    static void performAddition(){
        System.out.println("Enter which addition you want to perform:");
        System.out.println("1.Addition of two integers");
        System.out.println("2.Addition of two doubles");
        System.out.println("3.Addition of three integers");
        System.out.println("Enter your choice(1/2/3)");
        int choice=input.nextInt();
        if(choice==1){
            System.out.print("Enter first number: ");
            int firstnumber= input.nextInt();
            System.out.print("Enter second number: ");
            int secondnumber= input.nextInt();
            calculator.add(firstnumber,secondnumber);
        }
        else if(choice==2){
            System.out.print("Enter first number: ");
            double firstnumber= input.nextDouble();
            System.out.print("Enter second number: ");
            double secondnumber= input.nextDouble();
            calculator.add(firstnumber,secondnumber);
        }
        else if(choice==3){
            System.out.print("Enter first number: ");
            int firstnumber= input.nextInt();
            System.out.print("Enter second number: ");
            int secondnumber= input.nextInt();
            System.out.print("Enter third number: ");
            int thirdnumber=input.nextInt();
            calculator.add(firstnumber,secondnumber,thirdnumber);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
    static void performSubtraction(){
        System.out.print("Enter first number: ");
        int firstnumber= input.nextInt();
        System.out.print("Enter second number: ");
        int secondnumber= input.nextInt();
        calculator.subtract(firstnumber,secondnumber);
    }
    static void performMultiplication(){
        System.out.print("Enter first number: ");
        int firstnumber= input.nextInt();
        System.out.print("Enter second number: ");
        int secondnumber= input.nextInt();
        calculator.multiply(firstnumber,secondnumber);
    }
    static void performDivision(){
        System.out.print("Enter dividend: ");
        int dividend= input.nextInt();
        System.out.print("Enter divisor: ");
        int divisor= input.nextInt();
        calculator.divide(dividend,divisor);
    }
    void mainmenu(){
        while(true){
            System.out.println("Welcome to CALCULATOR");
            System.out.println("Which action do you want to perform:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Enter your choice(1/2/3/4/5): ");
            int choice=input.nextInt();
            if(choice==1){
                performAddition();
            }
            else if(choice==2){
                performSubtraction();
            }
            else if(choice==3){
                performMultiplication();
            }
            else if(choice==4){
                performDivision();
            }
            else if(choice==5){
                System.out.println("Exited Successfully");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
    }

    public static void main(String[] args) {
        UserInterface obj=new UserInterface();
        obj.mainmenu();
    }
}