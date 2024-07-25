import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        Scanner sc= new Scanner(System.in);
        Contacts con = new Contacts();
        System.out.println("Enter your FirstName: ");
        con.firstName=sc.nextLine();
        System.out.println("Enter your LastName: ");
        con.lastName=sc.nextLine();
        System.out.println("Enter your Address: ");
        con.address=sc.nextLine();
        System.out.println("Enter your City: ");
        con.city=sc.nextLine();
        System.out.println("Enter your State: ");
        con.state=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter your Zip: ");
        con.zip=sc.nextLong();
        System.out.println("Enter your PhoneNumber: ");
        con.phoneNumber=sc.nextLong();
        System.out.println("Enter your Email: ");
        con.email=sc.nextLine();



    }
}
