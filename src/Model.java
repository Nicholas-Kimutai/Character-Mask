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

        //Mask first name
        String fmask="";
        int fmaskN=firstName.substring(1,firstName.length()-1).length();
        for(int i=0; i<fmaskN;i++){
            fmask+="*";
        }
        String newFirstName= firstName.substring(0,1) +fmask + firstName.substring(firstName.length()-1);
        System.out.println(newFirstName);

        //Mask last name
        String lmask="";
        int lmaskN=lastName.substring(1, lastName.length()-1).length();
        for(int j=0; j<lmaskN; j++){
            lmask+="*";
        }
        String newLastName=lastName.substring(0,1)+lmask+lastName.substring(lastName.length()-1);





    }
}
