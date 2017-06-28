import java.util.Scanner;

/**
 * Created by michelhayman on 6/28/17.
 */
public class PowersLab3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String choice = "";
        String choice1 = "y";




        System.out.println("Please enter an integer: "); // get user input
        int userNum = scan.nextInt();

            System.out.println("Number" + "     " + "Squared" + "    " + "Cubed");
            System.out.println("======" + "     " + "=======" + "    " + "======");

            for (int i = 1; i < userNum; i++) {
                i = userNum;
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow( i, 3 );

                String out = ("   " + i + "    " + numberSquared + "     " + "    " + numberCubed);

                System.out.println(out);

                while (choice.equalsIgnoreCase("y")) {
                    System.out.println("Do you want to continue? (y/n)");
                    choice1 = scan.nextLine();

                }
                System.out.println("Goodbye!");
            }

            }

    }

