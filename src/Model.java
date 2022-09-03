import java.util.Scanner;

public class Model {

    public static void main(String[] args) {
        //Input username
        System.out.println("Enter your full name\n");
        Scanner newScanner= new Scanner(System.in);
        String fullName=newScanner.nextLine();

        //Split full name into first and last name
        int splitName=fullName.lastIndexOf(" ");
        String firstName=fullName.substring(0,splitName);
        String lastName=fullName.substring(splitName+1);

        System.out.println(firstName);

    }
}
