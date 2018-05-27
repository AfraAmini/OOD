package UI.EmployeeUI;

import UI.MainFrame;
import UI.ManagerUI.AddUserPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class EmployeeMainFrame extends MainFrame {
    private JMenuItem menuItem_1;
    private JMenuItem menuItem_2;
    private JMenuItem menuItem_3;

    public EmployeeMainFrame(){
        super();
        getFrame().setTitle("پنل کاربری کارمند");
        createComponents();
        createEvents();
    }

    public JFrame getFrame() {
        return super.getFrame();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmployeeMainFrame window = new EmployeeMainFrame();
                    window.getFrame().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void createEvents() {
        menuItem_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowEvaluationResultPanel showEvaluationResultPanel = new ShowEvaluationResultPanel();
                changePanel(showEvaluationResultPanel);
                getFrame().setTitle("مشاهده‌ی ارزیابی‌های انجام شده");
            }
        });
        menuItem_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowEvaluatedEmployees showEvaluatedEmployees = new ShowEvaluatedEmployees();
                changePanel(showEvaluatedEmployees);
                getFrame().setTitle("مشاهده‌ی کارمندان مورد ارزیابی");
            }
        });
    }

    private void createComponents() {
        JFrame frame = getFrame();
        JMenuBar menuBar = frame.getJMenuBar();

        menuItem_1 = new JMenuItem("مشاهده ارزیابی‌های انجام شده");
        menuBar.add(menuItem_1);

        menuItem_2 = new JMenuItem("مشاهده کارمندان مورد ارزیابی");
//        menuItem_2.setEnabled(false); //TODO
        menuBar.add(menuItem_2);

        menuItem_3 = new JMenuItem("ارزیابی کارمندان");
//        menuItem_3.setEnabled(false);
        menuBar.add(menuItem_3);
    }

}
