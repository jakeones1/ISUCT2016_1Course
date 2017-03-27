import javax.swing.*;

/**
 * Created by Сергей on 27.03.2017.
 */
public class Frame {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(200,200);
        frame.setVisible(true);

    }
}
