import java.util.Scanner;
public class BirthMonth {
    static void main() {
        Scanner in = new Scanner(System.in);

        int birthMonth = 0;

        IO.print("Enter your birth month [1-12]: ");

        if (in.hasNextInt()){
            birthMonth = in.nextInt();
            in.nextLine();

            if (birthMonth >= 1 && birthMonth <= 12){
                IO.println("You said your birth month is " + birthMonth);
            }
            else{
              IO.println("You said your birth month was " + birthMonth);
              IO.println("That is invalid, your answer must be [1-12].");
            }


        }






    }
}
