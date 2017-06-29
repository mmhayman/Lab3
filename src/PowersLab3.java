import java.util.Scanner;

/**
 * Created by michelhayman on 6/28/17.
 */
public class PowersLab3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String choice = "y";

        do {
            System.out.print("Please enter an integer: "); // get user input
            int userNum = scan.nextInt();

            String table = "Number" + "     " + "Squared" + "    " + "Cubed";  // creating the table

            String table1 = "======" + "     " + "=======" + "    " + "======"; // creating the table
            System.out.println(table); // printing the table so it it set up correctly
            System.out.println(table1); // printing second half so it looks pretty

            int numberSquared = 0; // initializing
            int numberCubed = 0; // intializing

            String out = ""; // initializing the string
            for (int i = 1; i <= userNum; i++) { // for loop

                numberSquared = (int) Math.pow(i, 2); // squaring user input
                numberCubed = (int) Math.pow(i, 3); // cubing user input

                out = ( i + "            " +  numberSquared  + "           " + numberCubed ); // creating string line
                System.out.println(out); // outputting string
            }


            System.out.println("Do you want to continue? (y/n)"); // asking if user wants to continue
            choice = scan.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));
    }

}

