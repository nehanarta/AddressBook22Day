package AddressBook;
import java.util.Scanner;

public class AddressBook {
    static void addContact(ContactsDetails Array[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Name:");
        String fName = sc.next();

        System.out.print("Enter the Last Name:");
        String lName = sc.next();

        System.out.print("Enter the Address:");
        String address = sc.next();

        System.out.print("Enter the City Name:");
        String city = sc.next();

        System.out.print("Enter the State Name:");
        String state = sc.next();

        System.out.print("Enter the ZIP Code:");
        int zip = sc.nextInt();

        System.out.print("Enter the Phone Number:");
        long phoneNumber = sc.nextLong();

        System.out.print("Enter the Email Id:");
        String email = sc.next();

        Array[0] = new ContactsDetails(fName, lName, address, city, state, zip, phoneNumber, email);
    }
    public static void main(String[]args) {
        ContactsDetails Array[] = new ContactsDetails[1];
        Scanner sc = new Scanner(System.in);

        int temp = 1;
        while (temp != 0) {
            System.out.println("[1.ADD_CONTACT]");
            System.out.print("choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact(Array);
                    break;
                case 2:
                    temp = 0;
                    break;
                default:
                    System.out.println("nothing");
                    break;
            }
        }
    }
}
