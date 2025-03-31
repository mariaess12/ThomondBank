package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThomondBanks {
    private double idNo=0;
    private JPanel root;
    private JTabbedPane atmUserTabbedPane;
    private JTextField accountIdTextField;
    private JRadioButton depositAccountRadioButton;
    private JRadioButton currentAccountRadioButton;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton checkBalanceButton;
    private JButton logoutButton;
    private JButton createNewAccountButton;
    private JButton changeAirButton;
    private JButton changeOverdraftLimitButton;

    public ThomondBanks() {
        depositButton.setVisible(false);
        withdrawButton.setVisible(false);
        checkBalanceButton.setVisible(false);
        logoutButton.setVisible(false);

        accountIdTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double idNo = Double.parseDouble(accountIdTextField.getText());

                    // If idNo is equal to a specific valid number, show the buttons
                    if (idNo == 12345) { // Example valid ID
                        depositButton.setVisible(true);
                        withdrawButton.setVisible(true);
                        checkBalanceButton.setVisible(true);
                        logoutButton.setVisible(true);
                    } else {
                        // Hide buttons if the ID is not valid
                        depositButton.setVisible(false);
                        withdrawButton.setVisible(false);
                        checkBalanceButton.setVisible(false);
                        logoutButton.setVisible(false);

                        JOptionPane.showMessageDialog(null, "Invalid Account ID. Access Denied.");
                    }
                } catch (NumberFormatException ex) {
                    // If ID is not a number, hide buttons and show error
                    depositButton.setVisible(false);
                    withdrawButton.setVisible(false);
                    checkBalanceButton.setVisible(false);
                    logoutButton.setVisible(false);

                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric Account ID.");
                }
            }




        });

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {




            }
        });
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("Thomond Banks");
        frame.setContentPane(new ThomondBanks().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
