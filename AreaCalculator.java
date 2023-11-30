import java.awt.*;
import java.awt.event.*;

public class AreaCalculator extends Frame implements ActionListener {
    private TextField input1, input2, resultField;

    public AreaCalculator() {
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Row 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new Label("Input 1:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        input1 = new TextField(10);
        add(input1, gbc);

        // Row 2
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new Label("Input 2:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        input2 = new TextField(10);
        add(input2, gbc);

        // Row 3
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new Label("Result:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        resultField = new TextField(20);
        resultField.setEditable(false);
        add(resultField, gbc);

        // Row 4
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        Button circleBtn = new Button("Calculate Circle Area");
        add(circleBtn, gbc);
        circleBtn.addActionListener(this);

        // Row 5
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        Button rectangleBtn = new Button("Calculate Rectangle Area");
        add(rectangleBtn, gbc);
        rectangleBtn.addActionListener(this);

        // Row 6
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        Button triangleBtn = new Button("Calculate Triangle Area");
        add(triangleBtn, gbc);
        triangleBtn.addActionListener(this);

        setTitle("Area Calculator");
        setSize(300, 250);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            double result = 0.0;

            double value1 = Double.parseDouble(input1.getText());
            double value2 = Double.parseDouble(input2.getText());

            if (ae.getActionCommand().equals("Calculate Circle Area")) {
                result = calculateCircleArea(value1);
                showMessage("Circle Area Calculated");
            } else if (ae.getActionCommand().equals("Calculate Rectangle Area")) {
                result = calculateRectangleArea(value1, value2);
                showMessage("Rectangle Area Calculated");
            } else if (ae.getActionCommand().equals("Calculate Triangle Area")) {
                result = calculateTriangleArea(value1, value2);
                showMessage("Triangle Area Calculated");
            }

            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException | ArithmeticException ex) {
            resultField.setText("Error: " + ex.getMessage());
        }
    }

    private double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    private double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    private void showMessage(String message) {
        Dialog dialog = new Dialog(this, "Message", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        okButton.addActionListener(e -> dialog.dispose());
        dialog.add(okButton);
        dialog.setSize(200, 100);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new AreaCalculator();
    }
}
