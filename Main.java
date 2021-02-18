import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Input your 1st message: ");
    String msg01 = input.nextLine();
    System.out.print("Input your 2nd message: ");
    String msg02 = input.nextLine();
    System.out.println(msg01 + " " + msg02);
  }
}