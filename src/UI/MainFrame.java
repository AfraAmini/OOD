package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JMenuBar menuBar;
    private JMenuItem menuItem;


    public MainFrame (){
        createComponents();
    }

    public JFrame getFrame() {
        return frame;
    }

    public void changePanel(JPanel next){
        frame.getContentPane().remove(panel);
        frame.getContentPane().add(next);
        frame.validate();
        panel = next;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame window = new MainFrame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Container getPanel(){
        return panel;
    }

    private void createComponents() {
        frame = new JFrame();
        frame.setBounds(100, 100, 577, 465);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        frame.add(panel);

        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        menuItem = new JMenuItem("خروج از سامانه");
        menuBar.add(menuItem);
    }
}
