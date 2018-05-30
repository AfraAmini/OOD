package UI;

import UI.EmployeeUI.ShowEvaluationResultPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class MainFrame{
    private static MainFrame mainFrame;
    private JPanel panel;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenuItem menuItem;


    private MainFrame(){
        createComponents();
    }
    public static MainFrame getInstance(){
        if(mainFrame == null){
            mainFrame = new MainFrame();
        }
        return mainFrame;
    }
    public JFrame getFrame() {
        return frame;
    }

    private void createEvents(){
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createComponents() {
        panel= new JPanel();
        frame = new JFrame();
        frame.setBounds(100, 100, 577, 465);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        frame.add(panel);

        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        }
    public void setPanel(JPanel jPanel){
        this.panel=jPanel;
    }
    public JPanel getPanel(){
        return panel;
    }
}
