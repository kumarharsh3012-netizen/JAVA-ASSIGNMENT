import java.util.Scanner;

public class BankAccount{
    static String bankname;
    static{
        bankname="Axis Bank";
        System.out.println("Welcome to "+bankname+" banking system....");
    }
    static boolean search(int a,int[]arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]==a){
                return true;
            }
            i++;
        }
        return false;
    }
    static int index(int a, int[]arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]==a){
                return i;
            }
            i++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]accountnumbers=new int[1000];
        String[]holdernames=new String[1000];
        double[]balances=new double[1000];
        String[]emails=new String[1000];
        long[]phonenumbers=new long[1000];
        int accounts=0;
        int accountnos=1001;
        while(true){
            System.out.println("which task do you want to perform:");
            System.out.println("1.Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice(1/2/3/4/5/6): ");

            int choice = input.nextInt();
            input.nextLine();
            if(choice==1){
                System.out.print("Enter account holder name:");
                String accountholdername=input.nextLine();
                System.out.print("Enter initial deposit amount:");
                double balance=input.nextDouble();
                input.nextLine();
                System.out.print("Enter email id:");
                String email=input.nextLine();
                System.out.print("Enter phone number:");
                long phonenumber=input.nextLong();
                accountnumbers[accounts]=accountnos;
                holdernames[accounts]=accountholdername;
                balances[accounts]=balance;
                emails[accounts]=email;
                phonenumbers[accounts]=phonenumber;
                System.out.println("Account created successfully");
                System.out.println("Your account number is "+accountnos);
                accountnos++;
                accounts++;
            }
            else if(choice==2){
                System.out.print("Enter account number: ");
                int a=input.nextInt();
                if(search(a,accountnumbers)){
                    int c=index(a,accountnumbers);
                    System.out.print("Enter amount you want to deposit:");
                    double deposit=input.nextDouble();
                    balances[c]+=deposit;
                    System.out.println("Amount deposited successfully.");
                    System.out.println("your new balance is "+balances[c]);
                }
                else{
                    System.out.println("Account not found");
                }
            }
            else if(choice==3){
                System.out.print("Enter account number: ");
                int b=input.nextInt();
                if(search(b,accountnumbers)){
                    int d=index(b,accountnumbers);
                    System.out.print("Enter amount you want to withdraw:");
                    double withdraw=input.nextDouble();
                    balances[d]-=withdraw;
                    System.out.println("Amount withdrawn successfully.");
                    System.out.println("your new balance is "+balances[d]);
                }
                else{
                    System.out.println("Account not found");
                }
            }
            else if(choice==4){
                System.out.print("Enter account number: ");
                int m=input.nextInt();
                if(search(m,accountnumbers)){
                    int n=index(m,accountnumbers);
                    System.out.println("Account Holder Name: "+holdernames[n]);
                    System.out.println("Email id: "+emails[n]);
                    System.out.println("Phone number: "+phonenumbers[n]);
                    System.out.println("Avialable Balance "+balances[n]);
                }
                else{
                    System.out.println("Account not found");
                }
            }
            else if(choice==5){
                System.out.print("Enter account number: ");
                int p=input.nextInt();
                if(search(p,accountnumbers)){
                    int q=index(p,accountnumbers);
                    System.out.print("Enter new phone number: ");
                    phonenumbers[q]=input.nextLong();
                    input.nextLine();
                    System.out.print("Enter new email:");
                    emails[q]=input.nextLine();
                    System.out.println("Account details updated successfully");
                }
            }
            else if(choice==6){
                System.out.println("Banking system exited successfully");
                break;
            }
            else{
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}