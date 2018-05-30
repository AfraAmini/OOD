package UI.EmployeeUI;

import UI.MainFrame;
import UI.LoginForm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class EmployeeMainFrame{
    private JFrame frame;
    private JMenuItem evalationResultMenuItem;
    private JMenuItem evaluatedEmployeesMenuItem;
    private JMenuItem evaluationMenuItem;
    private JMenuItem logoutMenuItem;

    public EmployeeMainFrame(){
        frame=MainFrame.getInstance().getFrame();
        frame.setTitle("پنل کاربری کارمند");;
        createComponents();
        createEvents();
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmployeeMainFrame window = new EmployeeMainFrame();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void createEvents() {
        logoutMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                frame.setTitle("ورود کاربر");
                loginForm.setVisible(true);
            }
        });
        evalationResultMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowEvaluationResultPanel showEvaluationResultPanel = new ShowEvaluationResultPanel();
                frame.setTitle("مشاهده‌ی ارزیابی‌های انجام شده");
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                showEvaluationResultPanel.setVisible(true);
            }
        });
        evaluatedEmployeesMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("مشاهده‌ی کارمندان مورد ارزیابی");
                ShowEvaluatedEmployees showEvaluatedEmployees = new ShowEvaluatedEmployees();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                showEvaluatedEmployees.setVisible(true);
            }
        });

        evaluationMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setTitle("انتخاب کارمند برای ارزیابی");
                ShowEmployees showEmployees = new ShowEmployees();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                showEmployees.setVisible(true);
            }
        });
    }

    private void createComponents() {
        JMenuBar menuBar = frame.getJMenuBar();

        logoutMenuItem = new JMenuItem("خروج از سامانه");
        menuBar.add(logoutMenuItem);

        evalationResultMenuItem = new JMenuItem("مشاهده ارزیابی‌های انجام شده");
        menuBar.add(evalationResultMenuItem);

        evaluatedEmployeesMenuItem = new JMenuItem("مشاهده کارمندان مورد ارزیابی");
//        menuItem_2.setEnabled(false); //TODO
        menuBar.add(evaluatedEmployeesMenuItem);

        evaluationMenuItem = new JMenuItem("ارزیابی کارمندان");
//        menuItem_3.setEnabled(false); //TODO
        menuBar.add(evaluationMenuItem);

    }
    public JFrame getFrame(){return frame;}
}
