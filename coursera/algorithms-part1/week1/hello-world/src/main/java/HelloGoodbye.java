/**
 * Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello and goodbye messages as shown below
 * (with the names for the hello message in the same order as the command-line arguments and with the names for the goodbye
 * message in reverse order)
 *
 * @author tkaczenko
 */
public class HelloGoodbye {

    public static void main(String[] args) {
        String first = args[0];
        String second = args[1];
        System.out.printf("Hello %s and %s.\n", first, second);
        System.out.printf("Goodbye %s and %s.\n", second, first);
    }
}
