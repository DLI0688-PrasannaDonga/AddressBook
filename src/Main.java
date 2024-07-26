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
        System.out.println("Enter your Zip: ");
        con.zip=sc.nextLine();
        System.out.println("Enter your PhoneNumber: ");
        con.phoneNumber=sc.nextLine();
        System.out.println("Enter your Email: ");
        con.email=sc.nextLine();
        System.out.println("Enter the person's firstName you wanna Edit");
       String name=sc.nextLine();
        if(name.equals(con.firstName)) {

            System.out.println("Enter the field you wanna edit");
            System.out.printf("first\n last\n address\n city\n state\n zip\n phoneNumber\n email\n");
            String field = sc.nextLine();

            switch (field) {
                case "first":
                    System.out.println("Enter the FirstName you wanna change");
                    con.firstName = sc.nextLine();
                    System.out.println(con.firstName);
                    break;
                case "last":
                    System.out.println("Enter the LastName you wanna change");
                    con.lastName = sc.nextLine();
                    System.out.println(con.lastName);
                    break;
                case "address":
                    System.out.println("Enter the Address you wanna change");
                    con.address = sc.nextLine();
                    System.out.println(con.address);
                    break;
                case "city":
                    System.out.println("Enter the city you wanna change");
                    con.city = sc.nextLine();
                    System.out.println(con.city);
                    break;
                case "state":
                    System.out.println("Enter the State you wanna change");
                    con.state = sc.nextLine();
                    System.out.println(con.state);
                    break;
                case "zip":
                    System.out.println("Enter the Zip you wanna change");
                    con.zip = sc.nextLine();
                    System.out.println(con.zip);
                    break;
                case "phoneNumber":
                    System.out.println("Enter the PhoneNumber you wanna change");
                    con.phoneNumber = sc.nextLine();
                    System.out.println(con.phoneNumber);
                    break;
                case "email":
                    System.out.println("Enter the Email you wanna change");
                    con.email = sc.nextLine();
                    System.out.println(con.email);
                    break;


            }
        }else{
            System.out.println("person doesn't exists");
        }

        System.out.println("After changes here is the Employee Details");
        con.displayDetails();
    }
}
