import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to address book");

        Methods obj =new Methods();


        Scanner sc = new Scanner(System.in);
        String choice;
        ArrayList<Contacts> list = new ArrayList<Contacts>();

        do {
            System.out.println("1. Add person details ");
            System.out.println("2. Edit person details");
            System.out.println("3. Delete person details");
            System.out.println("4. Display details");
            System.out.println("5. Exit ");
            System.out.println("Enter your response : ");
            int enterChoice=sc.nextInt();
            switch (enterChoice){
                case 1:
                    obj.addDetails(list);
                    break;
                case 2:
                    obj.editDetails(list);
                    break;
                case 3:
                    obj.delDetails(list);
                    break;
                case 4:
                    for(Contacts c: list)
                        c.displayDetails();
                    break;
                case 5:
                    System.exit(0);
                    break;


            }

            System.out.println("Do you wanna continue Enter 'Y' else Enter 'N'");
            sc.nextLine();
            choice=sc.nextLine();
        }
        while (choice.equals("Y") || choice.equals("y") || choice.equals("Yes") || choice.equals("yes") );











//        for (Contacts c : list)
//            c.displayDetails();




//        System.out.println("Do you want to edit person details enter 'Y' else enter 'N'");
//        String entry = sc.nextLine();
//        if (entry.equals("Y") || entry.equals("Yes") || entry.equals("y") || entry.equals("yes")) {
//



//        System.out.println("Enter the person's firstName you wanna Edit");
//       String name=sc.nextLine();
//        if(name.equals(con.firstName)) {
//
//            System.out.println("Enter the field you wanna edit");
//            System.out.printf("first\n last\n address\n city\n state\n zip\n phoneNumber\n email\n");
//            String field = sc.nextLine();
//
//            switch (field) {
//                case "first":
//                    System.out.println("Enter the FirstName you wanna change");
//                    con.firstName = sc.nextLine();
//                    System.out.println(con.firstName);
//                    break;
//                case "last":
//                    System.out.println("Enter the LastName you wanna change");
//                    con.lastName = sc.nextLine();
//                    System.out.println(con.lastName);
//                    break;
//                case "address":
//                    System.out.println("Enter the Address you wanna change");
//                    con.address = sc.nextLine();
//                    System.out.println(con.address);
//                    break;
//                case "city":
//                    System.out.println("Enter the city you wanna change");
//                    con.city = sc.nextLine();
//                    System.out.println(con.city);
//                    break;
//                case "state":
//                    System.out.println("Enter the State you wanna change");
//                    con.state = sc.nextLine();
//                    System.out.println(con.state);
//                    break;
//                case "zip":
//                    System.out.println("Enter the Zip you wanna change");
//                    con.zip = sc.nextLine();
//                    System.out.println(con.zip);
//                    break;
//                case "phoneNumber":
//                    System.out.println("Enter the PhoneNumber you wanna change");
//                    con.phoneNumber = sc.nextLine();
//                    System.out.println(con.phoneNumber);
//                    break;
//                case "email":
//                    System.out.println("Enter the Email you wanna change");
//                    con.email = sc.nextLine();
//                    System.out.println(con.email);
//                    break;
//
//
//            }
//        }else{
//            System.out.println("person doesn't exists");
//        }
//
//        System.out.println("After changes here is the Employee Details");
//        con.displayDetails();
//
//


//deleting person details
//        System.out.println("If you wanna delete person details if yes enter 'Y' else enter 'N");
//        String choice = sc.nextLine();
//        if (choice.equals("y") || choice.equals("Y") || choice.equals("Yes") || choice.equals("yes")) {
//
//
//        }
    }
}

