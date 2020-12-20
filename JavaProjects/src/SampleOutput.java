/**
 *
 * @author Muhammad
 */
class SimpleOutput
{
    public static void main(String[] args)
    {
        //println
        /*output on a single line using System.out.println("...")
            -- note that we are printing out a String literal
            -- the output must be contained in ""'s or be a String type
         */
        System.out.println("------------  println     -----------");
        System.out.println("We're really cruising "
                + "fast now!");

        /*
         * Formatted output:
         *  %s ==> String
         *  \t ==> tab space in output
         *  \n ==> newline in output
         */

        System.out.println("Welcome to Sudoku\nPlease Enter your name:\tBilal\n");

        //printf
        System.out.println("------------  printf  -----------");
        System.out.printf("Hello %s\n", "Bilal");
        System.out.println("-------------------------------------");
        System.out.printf("%s\n%s\t%s\n"
                , "Welcome to the Sudoku program."
                , "Please enter your name:"
                , "Bilal");
        System.out.println("-------------------------------------");


        //if you want multiple lines, don't forget the /n!
        System.out.printf("%s", "Welcome to the Sudoku program.");
        System.out.printf("%s", "Please enter your name here:");

        //print
        System.out.println("-------------- print ----------");

        /*
         * Simply prints what you give it,
         * 	no substitutions like in printf
         */
        System.out.println("-------------------------------------");
        System.out.print("printer\n");
        System.out.print(32);
        System.out.println("-------------------------------------");
    }
}
