import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SmartCityProject extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton updateProfileButton;
    private JButton searchOptionsButton;
    private JButton selectOptionButton;
    private JButton bookingButton;
    private JButton paymentButton;
    private JButton confirmationButton;

    public SmartCityProject() {
        setTitle("Smart City Project");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));

        // Login
        JPanel loginPanel = new JPanel(new FlowLayout());
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        loginPanel.add(usernameLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        add(loginPanel);

        // Update Profile and Password
        JPanel updateProfilePanel = new JPanel(new FlowLayout());
        updateProfileButton = new JButton("Update Profile and Password");
        updateProfileButton.addActionListener(this);
        updateProfilePanel.add(updateProfileButton);
        add(updateProfilePanel);

        // Search for Options
        JPanel searchOptionsPanel = new JPanel(new FlowLayout());
        searchOptionsButton = new JButton("Search for Options");
        searchOptionsButton.addActionListener(this);
        searchOptionsPanel.add(searchOptionsButton);
        add(searchOptionsPanel);

        // Select Option
        JPanel selectOptionPanel = new JPanel(new FlowLayout());
        selectOptionButton = new JButton("Select Option");
        selectOptionButton.addActionListener(this);
        selectOptionPanel.add(selectOptionButton);
        add(selectOptionPanel);

        // Booking
        JPanel bookingPanel = new JPanel(new FlowLayout());
        bookingButton = new JButton("Booking");
        bookingButton.addActionListener(this);
        bookingPanel.add(bookingButton);
        add(bookingPanel);

        // Payment Window
        JPanel paymentPanel = new JPanel(new FlowLayout());
        paymentButton = new JButton("Payment Window");
        paymentButton.addActionListener(this);
        paymentPanel.add(paymentButton);
        add(paymentPanel);

        // Confirmation
        JPanel confirmationPanel = new JPanel(new FlowLayout());
        confirmationButton = new JButton("Confirmation");
        confirmationButton.addActionListener(this);
        confirmationPanel.add(confirmationButton);
        add(confirmationPanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SmartCityProject();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            login();
        } else if (e.getSource() == updateProfileButton) {
            updateProfile();
        } else if (e.getSource() == searchOptionsButton) {
            searchOptions();
        } else if (e.getSource() == selectOptionButton) {
            selectOption();
        } else if (e.getSource() == bookingButton) {
            booking();
        } else if (e.getSource() == paymentButton) {
            payment();
        } else if (e.getSource() == confirmationButton) {
            confirmation();
        }
    }

    private void login() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();
        // Perform login authentication logic here
        JOptionPane.showMessageDialog(this, "Login successful!");
    }

    private void updateProfile() {
        // Open a new window or dialog to update profile and password
        JOptionPane.showMessageDialog(this, "Profile and password updated successfully!");
    }

    private void searchOptions() {
        // Open a new window or dialog to search for options
        JOptionPane.showMessageDialog(this, "Options searched successfully!");
    }

    private void selectOption() {
        // Open a new window or dialog to select an option
        JOptionPane.showMessageDialog(this, "Option selected successfully!");
    }

    private void booking() {
        // Open a new window or dialog for booking
        JOptionPane.showMessageDialog(this, "Booking successful!");
    }

    private void payment() {
        // Open a new window or dialog for payment
        JOptionPane.showMessageDialog(this, "Payment successful!");
    }

    private void confirmation() {
        // Open a new window or dialog for confirmation
        JOptionPane.showMessageDialog(this, "Confirmation successful!");
    }
}