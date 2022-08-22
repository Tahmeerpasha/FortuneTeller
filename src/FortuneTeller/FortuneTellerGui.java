package FortuneTeller;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FortuneTellerGui extends JFrame implements ActionListener {
    private static final String NAME_LABEL = "Name:";
    private static final String DOB = "Date of birth:";
    private static final String YOB = "Year of birth:";
    private static final String MOB = "Month of birth(in numbers):";
    private static final String ZODIAC_SIGN = "Zodiac sign:";
    private static final String FORTUNE_LABEL = "Your fortune:";
    private static final String BUTTON_TEXT = "Tell My Fortune";
    FortuneTeller fortuneTeller;
    JTextField nameField = new JTextField();
    JTextField DOBField = new JTextField();
    JTextField ZODIACSIGNField = new JTextField();
    JTextField MOBField = new JTextField();
    JTextField YOBField = new JTextField();
    JTextArea resultField = new JTextArea();
    JButton calculateButton = new JButton(BUTTON_TEXT);
    JPanel mainPanel = new JPanel();
    public FortuneTellerGui(FortuneTeller fortuneTeller) {
        this.fortuneTeller = fortuneTeller;
        initialize();
    }
    private void initialize() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        mainPanel.setLayout(new GridLayout(13, 0));
        nameField.setBackground(new Color(169, 220, 227));
        DOBField.setBackground(new Color(169, 220, 227));
        MOBField.setBackground(new Color(169, 220, 227));
        YOBField.setBackground(new Color(169, 220, 227));
        ZODIACSIGNField.setBackground(new Color(169, 220, 227));
        Border border = BorderFactory.createLineBorder(Color.BLACK,7,true);
        mainPanel.setBorder(border);
        mainPanel.add(new JLabel(NAME_LABEL));
        mainPanel.add(nameField);
        mainPanel.add(new JLabel(DOB));
        mainPanel.add(DOBField);
        mainPanel.add(new JLabel(MOB));
        mainPanel.add(MOBField);
        mainPanel.add(new JLabel(YOB));
        mainPanel.add(YOBField);
        mainPanel.add(new JLabel(ZODIAC_SIGN));
        mainPanel.add(ZODIACSIGNField);
        mainPanel.add(calculateButton);
        mainPanel.add(new JLabel(FORTUNE_LABEL));
        mainPanel.add(resultField);
        mainPanel.setBackground(new Color(118, 137, 222, 255));
        getContentPane().add(mainPanel);
        calculateButton.addActionListener(this);
        calculateButton.setBackground(new Color(221, 209, 199));
//        calculateButton.setBounds(0,0,50,50);
//        setDefaultLookAndFeelDecorated(true);

    }
    private void alert(String message) {
        JOptionPane.showMessageDialog(this, message, "Error!", JOptionPane.ERROR_MESSAGE);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            boolean valid = true;
            if (!fortuneTeller.setName(nameField.getText())) {
                valid = false;
                alert("Invalid name!");
            } else if (!fortuneTeller.setIncome(DOBField.getText())) {
                valid = false;
                alert("Invalid Date of birth! Must not contain anything but numbers.");
            } else if (!fortuneTeller.setLocation(ZODIACSIGNField.getText())) {
                valid = false;
                alert("Invalid Zodiac sign!");
            } else if (!fortuneTeller.setAge(MOBField.getText())) {
                valid = false;
                alert("Invalid Month of birth! Must not contain anything but numbers.");
            } else if (!fortuneTeller.setHeight(YOBField.getText())) {
                valid = false;
                alert("Invalid Year of birth! Must not contain anything but numbers.");
            }
            if (valid) {
                resultField.setText(fortuneTeller.calculate());
            }
        }
    }
}