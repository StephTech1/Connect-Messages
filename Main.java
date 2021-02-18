import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    /**request input of 1st and 2nd*/
    System.out.print("Input your 1st message: ");
    String msg01 = input.nextLine();
    System.out.print("Input your 2nd message: ");

    String msg02 = input.nextLine();
    /**print out 2 sentences joined */
    System.out.println(msg01 + " " + msg02);
  }
}