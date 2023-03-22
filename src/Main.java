import javax.swing.*;
/**
 *This class bundles all the methods that can be used when we write code without implementing them.
 * @version 1.0
 * Date: 22/03/2023
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    /**
     * This method will display the message to the screen.
     */
    public static void prompt (String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    /**
     * This method will request an int type input from the user.
     * @param message The message you want the user to see
     * @return The result of the user.
     */
    public static int readInt (String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
    /**
     * This method will request an char type input from the user.
     * In case of several letters it will return the first one.
     * @param message The message you want the user to see
     * @return The result of the user.
     */
    public static char readChar (String message) {
        return JOptionPane.showInputDialog(message).charAt(0);
    }
    /**
     * This method will request an String type input from the user.
     * @param message The message you want the user to sees
     * @return The result of the user.
     */
    public static String readString (String message) {
        return JOptionPane.showInputDialog(message);
    }
}