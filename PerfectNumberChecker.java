import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerfectNumberChecker extends JFrame {
    private JTextField inputField;
    private JTextField resultField;

    public PerfectNumberChecker() {
        // Set up the JFrame
        setTitle("Perfect Number Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel inputLabel = new JLabel("Enter an integer:");
        inputField = new JTextField(10);

        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAndDisplayResult();
            }
        });

        // Set layout
        setLayout(new java.awt.GridLayout(3, 2));

        // Add components to the frame
        add(inputLabel);
        add(inputField);
        add(resultLabel);
        add(resultField);
        add(new JLabel()); // Empty label for spacing
        add(checkButton);

        // Set frame visibility
        setVisible(true);
    }

    private void checkAndDisplayResult() {
        String inputText = inputField.getText();
        try {
            int number = Integer.parseInt(inputText);
            int sum = calculateSumOfDigits(number);
            
            if (isPerfectNumber(number)) {
                resultField.setText(number + " is a perfect number.");
            } else {
                resultField.setText("Sum of digits: " + sum);
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input. Please enter an integer.");
        }
    }

    private boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    private int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PerfectNumberChecker());
    }
}
