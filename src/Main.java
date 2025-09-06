import java.util.Scanner;

public class Main {

  private static String indented(String input) {
    return "    " + input;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your first name: ");
    String firstName = scanner.nextLine();

    System.out.print("Enter your middle name: ");
    String middleName = scanner.nextLine();

    System.out.print("Enter your last name: ");
    String lastName = scanner.nextLine();

    System.out.format(
      "Hey, %s %s %s, remember this:\n",
      firstName,
      middleName,
      lastName
    );

    System.out.println(indented("For his anger is but for a moment,"));
    System.out.println(indented("and his favor is for a lifetime."));
    System.out.println(indented("Weeping may tarry for the night,"));
    System.out.println(indented("but joy comes with the morning."));
    System.out.println("(Psalms 30:5 ESV)");

    scanner.close();
  }
}
