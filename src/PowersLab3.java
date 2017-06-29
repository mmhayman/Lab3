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
            System.out.println(table);
            System.out.println(table1);

            int numberSquared = 0;
            int numberCubed = 0;

            String out = "";
            for (int i = 1; i <= userNum; i++) {

                numberSquared = (int) Math.pow(i, 2);
                numberCubed = (int) Math.pow(i, 3);

                out = ( i + "            " +  numberSquared  + "           " + numberCubed );
                System.out.println(out);
            }


            System.out.println("Do you want to continue? (y/n)");
            choice = scan.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));
    }

}

