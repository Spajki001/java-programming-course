import javax.swing.*;
import java.awt.*;

public class Calculator {
    private float answer;
    public Component createComponents() {

        //make JLabel objects with its text
            final JLabel FirstNum = new JLabel("First Number", SwingConstants.CENTER);
            final JLabel SecondNum = new JLabel("Second Number", SwingConstants.CENTER);
            final JLabel Result = new JLabel("The result is: ", SwingConstants.CENTER);

        //make JTextField objects
            final JTextField firstnum = new JTextField();
            final JTextField secondnum = new JTextField();

        //make JButton objects
            JButton Add = new JButton("+");
            JButton Subtract = new JButton("-");
            JButton Multiply = new JButton("*");
            JButton Divide = new JButton("/");
            JButton Equals = new JButton("=");

        //creating font object
            Font font = new Font("Cascadia code", Font.BOLD, 18);

        //Addition button action
            Add.addActionListener(e -> {
                float x = Float.parseFloat(firstnum.getText());
                float y = Float.parseFloat(secondnum.getText());
                answer = x + y;
            });

        //Subtraction button action
            Subtract.addActionListener(e -> {
                float x = Float.parseFloat(firstnum.getText());
                float y = Float.parseFloat(secondnum.getText());
                answer = x - y;
            });

        //Multiplying button action
            Multiply.addActionListener(e -> {
                float x = Float.parseFloat(firstnum.getText());
                float y = Float.parseFloat(secondnum.getText());
                answer = x * y;
            });

        //Division button action
            Divide.addActionListener(e -> {
                float x = Float.parseFloat(firstnum.getText());
                float y = Float.parseFloat(secondnum.getText());
                answer = x / y;
            });

        //Equals button action
            Equals.addActionListener(e -> {
                int intAnswer = (int)answer;
                if((answer - intAnswer) != 0.0)
                    Result.setText("The result is: " + answer);
                else
                    Result.setText("The result is: " + intAnswer);
            });

        //Creating a panel object and setting a border, layout and background colour
            JPanel panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(
                    30, 30, 30, 30));
            panel.setLayout(new GridLayout(5, 2));
            panel.setBackground(Color.darkGray);

        //Adding components on the panel

        //FirstNum label
            panel.add(FirstNum);
            FirstNum.setFont(font);

        //firstnum text field
            panel.add(firstnum);
            firstnum.setFont(font);
            firstnum.setHorizontalAlignment(JTextField.CENTER);

        //SecondNum label
            panel.add(SecondNum);
            SecondNum.setFont(font);

        //secondnum text field
            panel.add(secondnum);
            secondnum.setFont(font);
            secondnum.setHorizontalAlignment(JTextField.CENTER);

        //Addition button
            panel.add(Add);
            Add.setFont(font);

        //Subtraction button
            panel.add(Subtract);
            Subtract.setFont(font);

        //Multiplying button
            panel.add(Multiply);
            Multiply.setFont(font);

        //Division button
            panel.add(Divide);
            Divide.setFont(font);

        //Equals button
            panel.add(Equals);
            Equals.setFont(font);

        //Result label
            panel.add(Result);
            Result.setFont(font);

        return panel;
    }

    public static void main(String[] args) {

        //Setting the window look and feel to pick up the OS theme
            try {
                UIManager.setLookAndFeel(
                        UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignore) {}

        //Window title
            JFrame window = new JFrame("Calculator");

        Calculator calculator = new Calculator();
        Component UI = calculator.createComponents();

        //Setting the window border layout alignment, exit on "X" button, window size and window visibility
            window.getContentPane().add(UI, BorderLayout.CENTER);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(800, 500);
            window.setVisible(true);
            window.setLocationRelativeTo(null);
    }
}