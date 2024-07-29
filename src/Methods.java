import java.util.ArrayList;
import java.util.Scanner;

public class Methods extends Main {
    int flag=0;
    Scanner sc = new Scanner(System.in);
    public void addDetails(ArrayList<Contacts> list ){

        System.out.println("Enter your FirstName: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your LastName: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your Address: ");
        String address = sc.nextLine();
        System.out.println("Enter your City: ");
        String city = sc.nextLine();
        System.out.println("Enter your State: ");
        String state = sc.nextLine();
        System.out.println("Enter your Zip: ");
        String zip = sc.nextLine();
        System.out.println("Enter your PhoneNumber: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter your Email: ");
        String email = sc.nextLine();


        list.add(new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email));

    }



    //Editing person details
    public void editDetails(ArrayList<Contacts> list){

    System.out.println("Enter the person's firstName you wanna Edit");
    String name = sc.nextLine();
            for (Contacts c : list) {
        if (name.equals(c.firstName)) {
            flag=1;
            System.out.println("Enter the field you wanna edit");
            System.out.printf("first\n last\n address\n city\n state\n zip\n phoneNumber\n email\n");
            String field = sc.nextLine();
            switch (field) {
                case "first":
                    System.out.println("Enter the FirstName you wanna change");
                    c.firstName = sc.nextLine();
                    System.out.println("After edit the FirstName person details");
                    c.displayDetails();
                    break;
                case "last":
                    System.out.println("Enter the LastName you wanna change");
                    c.lastName = sc.nextLine();
                    System.out.println("After edit the LastName person details");
                    c.displayDetails();

                    break;
                case "address":
                    System.out.println("Enter the Address you wanna change");
                    c.address = sc.nextLine();
                    System.out.println("After edit the Address, person details");
                    c.displayDetails();
                    break;
                case "city":
                    System.out.println("Enter the city you wanna change");
                    c.city = sc.nextLine();
                    System.out.println("After edit the City, person details");
                    c.displayDetails();
                    break;
                case "state":
                    System.out.println("Enter the State you wanna change");
                    c.state = sc.nextLine();
                    System.out.println("After edit the  State, person details");
                    c.displayDetails();
                    break;
                case "zip":
                    System.out.println("Enter the Zip you wanna change");
                    c.zip = sc.nextLine();
                    System.out.println("After edit the Zip, person details");
                    c.displayDetails();
                    break;
                case "phoneNumber":
                    System.out.println("Enter the PhoneNumber you wanna change");
                    c.phoneNumber = sc.nextLine();
                    System.out.println("After edit the PhoneNumber, person details");
                    c.displayDetails();
                    break;
                case "email":
                    System.out.println("Enter the Email you wanna change");
                    c.email = sc.nextLine();
                    System.out.println("After edit the Email, person details");
                    c.displayDetails();
                    break;


            }
        }
    }
            if (flag == 0) System.out.println("person doesn't exists");
}

  public void delDetails(ArrayList<Contacts> list){
      System.out.println("Enter the person Firstname you wanna delete");
      String delName = sc.nextLine();
      for (Contacts c : list) {
          if (delName.equals(c.firstName)) {
              flag=1;
              c = null;
              System.out.println("person details deleted successfully");

          }
      }
      if(flag==0){
          System.out.println("Invalid, person not found");
      }
  }



}
