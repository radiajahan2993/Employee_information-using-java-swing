package com.mycompany.employee_information;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Employee_information extends JFrame {
    private JLabel nameLabel, ageLabel, companyLabel, positionLabel,phonenumberLabel, nationalityLabel;
    private JTextField nameField, ageField, companyField, positionField,phonenumberField;
    private JButton submitButton;
    private JComboBox<String> comboBox;
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    private JRadioButton foreignerRadioButton;
    private JRadioButton bangladeshiRadioButton;
    private ButtonGroup nationalityButtonGroup;

    public Employee_information() {
        setTitle("Employee Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 25);
        add(nameLabel);

        ageLabel = new JLabel("Age:");
        ageLabel.setBounds(20, 50, 80, 25);
        add(ageLabel);

        companyLabel = new JLabel("Company:");
        companyLabel.setBounds(20, 90, 80, 25);
        add(companyLabel);

        positionLabel = new JLabel("position:");
        positionLabel.setBounds(20, 130, 100, 25);
        add(positionLabel);
        
        phonenumberLabel = new JLabel("phone no.:");
        phonenumberLabel.setBounds(20, 160, 120, 25);
        add(phonenumberLabel);
        

        nameField = new JTextField();
        nameField.setBounds(120, 20, 200, 25);
        add(nameField);

        ageField = new JTextField();
        ageField.setBounds(120, 50, 200, 25);
        add(ageField);

        companyField = new JTextField();
        companyField.setBounds(120, 90, 200, 25);
        add(companyField);

        positionField = new JTextField();
        positionField.setBounds(120, 130, 200, 25);
        add(positionField);
        
        phonenumberField = new JTextField();
        phonenumberField.setBounds(120, 160, 200, 25);
        add(phonenumberField);

        comboBox = new JComboBox<>();
        comboBox.setBounds(20, 190, 100, 25);
        comboBox.addItem("male");
        comboBox.addItem("female");
        add(comboBox);

        nationalityLabel = new JLabel("Nationality:");
        nationalityLabel.setBounds(20, 220, 120, 25);
        add(nationalityLabel);

        foreignerRadioButton = new JRadioButton("Foreigner");
        foreignerRadioButton.setBounds(20, 250, 140, 25);
        add(foreignerRadioButton);

        bangladeshiRadioButton = new JRadioButton("Bangladeshi");
        bangladeshiRadioButton.setBounds(20, 280, 160, 25);
        add(bangladeshiRadioButton);

        nationalityButtonGroup = new ButtonGroup();
        nationalityButtonGroup.add(foreignerRadioButton);
        nationalityButtonGroup.add(bangladeshiRadioButton);

        checkBox = new JCheckBox("CheckBox");
        checkBox.setBounds(20, 310, 180, 25);
        add(checkBox);
        
        
        radioButton = new JRadioButton("Radio Button");
        radioButton.setBounds(20,340,210,25);
        add(radioButton);
        
        submitButton = new JButton("Submit");
        submitButton.setBounds(20, 370, 240, 25);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String company = companyField.getText();
                String position = positionField.getText();
                String phonenumber = phonenumberField.getText();
                String selectedOption = (String) comboBox.getSelectedItem();
                boolean radioButtonSelected = radioButton.isSelected();
                boolean checkBoxSelected =checkBox.isSelected();
                String selectedNationality = "";

                if (foreignerRadioButton.isSelected()) {
                    selectedNationality = "Foreigner";
                } else if (bangladeshiRadioButton.isSelected()) {
                    selectedNationality = "Bangladeshi";
                }


                String message = "Name: " + name +
                        "\nAge: " + age +
                        "\nCompany: " + company +
                        "\nPosition: " + position +
                        "\nphone no: " + phonenumber +
                        "\nSelected Option: " + selectedOption +
		        "\nNationality: " + selectedNationality +
                        "\nRadio Button Selected: " + radioButtonSelected +
                        "\nCheck Box Selected: " + checkBoxSelected;

                JOptionPane.showMessageDialog(null, message, "Employee Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Employee_information();
    }
}

