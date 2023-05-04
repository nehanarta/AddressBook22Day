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
    static void editContact(String name, ContactsDetails Array[]) {
        Scanner sc = new Scanner(System.in);


        boolean flag = false;
        if (Array[0].firstName.equals(name)) {
            flag = true;
            if (flag == true) {
                System.out.println("1.LastName 2.Address 3.City 4.State 5.ZipCode 6.PhoneNumber 7.Email 8.Exit");
                int editOption = sc.nextInt();
                switch (editOption) {
                    case 1:
                        System.out.print("Edit last name:");
                        String tempLastName = sc.next();
                        Array[0].lastName = tempLastName;
                        break;
                    case 2:
                        System.out.print("Edit address:");
                        String tempAddress = sc.next();
                        Array[0].address = tempAddress;
                        break;
                    case 3:
                        System.out.print("Edit city:");
                        String tempCity = sc.next();
                        Array[0].city = tempCity;
                        break;
                    case 4:
                        System.out.print("Edit state:");
                        String tempState = sc.next();
                        Array[0].state = tempState;
                        break;
                    case 5:
                        System.out.print("Edit zip:");
                        int tempZip = sc.nextInt();
                        Array[0].zip = tempZip;
                        break;
                    case 6:
                        System.out.print("Edit phone:");
                        long tempPhoneNumber = sc.nextLong();
                        Array[0].phoneNumber = tempPhoneNumber;
                        break;
                    case 7:
                        System.out.print("Edit email:");
                        String tempEmail = sc.next();
                        Array[0].emailId = tempEmail;
                        break;
                    default:
                        System.out.println("nothing");
                        break;
                }
            } else {
                flag = false;
            }
        }
        if (flag == false)
            System.out.println(name + "not found");
    }

    static void displayContacts(ContactsDetails Array[]){

        if(Array[0] == null)
            System.out.println();
        else
            Array[0].displayContactDetails();

        System.out.println();
    }
    public static void main(String[]args) {
        ContactsDetails Array[] = new ContactsDetails[1];
        Scanner sc = new Scanner(System.in);

        int temp = 1;
        while (temp != 0) {
            System.out.println("ADD_CONTACT \\ EDIT  \\ DISPLAY ");
            System.out.print("choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContact(Array);
                    break;
                case 2:
                    System.out.print("Edit  Contact Details:");
                    String name = sc.next();
                    editContact(name,Array);
                    break;
                case 3:
                    displayContacts(Array);
                    break;
                case 4:
                    temp = 0;
                    break;
                default:
            }
        }
            }
        }

