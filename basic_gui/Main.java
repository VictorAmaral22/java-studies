import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello wild " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are ya?"));
        JOptionPane.showMessageDialog(null, "Cool, you are " + age + " years old...");
    }
}