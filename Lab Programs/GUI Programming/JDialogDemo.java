import javax.swing.*;

public class JDialogDemo {
    public static void main(String[] args) {
        // Create the main application window (JFrame)
        JFrame frame = new JFrame("Main Window");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a button that opens the dialog
        JButton openDialogButton = new JButton("Enter Name");
        frame.add(openDialogButton); // Add the button to the JFrame
        
        // Create a dialog (JDialog)
        JDialog dialog = new JDialog(frame, "Name Input", true); // Modal dialog
        dialog.setSize(300, 150);
        
        // Add components to the dialog
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField(15);
        JButton okButton = new JButton("OK");
        
        JPanel panel = new JPanel();
        panel.add(nameLabel);  // Add label to the panel
        panel.add(nameField);  // Add text field to the panel
        panel.add(okButton);   // Add OK button to the panel
        dialog.add(panel);     // Add the panel to the dialog

        // Action listener for the "Enter Name" button
        openDialogButton.addActionListener(e -> dialog.setVisible(true));

        // Action listener for the "OK" button in the dialog
        okButton.addActionListener(e -> {
            String name = nameField.getText(); // Get the input from the text field
            if (!name.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
                dialog.setVisible(false); // Close the dialog after OK is clicked
            } else {
                JOptionPane.showMessageDialog(dialog, "Please enter your name.");
            }
        });

        // Show the main window
        frame.setVisible(true);
    }
}
