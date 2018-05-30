package UI.ManagerUI;

import UI.LoginForm;
import UI.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class ManagerMainFrame {
    private JFrame frame;
    private JMenu evaluationMenu;
    private JMenuItem logoutMenuItem;
    private JMenuItem addEvaluationMenuItem;
    private JMenuItem categorizeMenuItem;
    private JMenuItem setPunishmentRewardMenuItem;
    private JMenu addEmployeeMenu;
    private JMenuItem addUnitManagerMenuItem;
    private JMenuItem addEmployeeMenuItem;
    private JMenuItem addEvaluatorToEvaluationMenuItem;

    public ManagerMainFrame(){
        frame=MainFrame.getInstance().getFrame();
        frame.setTitle("پنل کاربری مدیر سامانه");
        createComponents();
        createEvents();
    }

    public JFrame getFrame() {
        return frame;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ManagerMainFrame window = new ManagerMainFrame();
                    MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                    window.getFrame().setVisible(true);
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
        addUnitManagerMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddUnitManagerPanel addUnitManagerPanel = new AddUnitManagerPanel();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                addUnitManagerPanel.setVisible(true);
                getFrame().setTitle("ثبت مدیر بخش جدید");
            }
        });

        addEmployeeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddUserPanel addUserPanel = new AddUserPanel();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                addUserPanel.setVisible(true);
                getFrame().setTitle("ثبت کارمند جدید");
            }
        });
        addEvaluatorToEvaluationMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowCategories addEvaluatorPanel = new ShowCategories();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                addEvaluatorPanel.setVisible(true);
                getFrame().setTitle("انتخاب دسته ارزیابی");
            }
        });
        addEvaluationMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddEvaluationPanel addEvaluationPanel = new AddEvaluationPanel();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                addEvaluationPanel.setVisible(true);
                getFrame().setTitle("افزودن معیار ارزیابی");
            }
        });
        categorizeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategorizePanel categorizePanel = new CategorizePanel();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                categorizePanel.setVisible(true);
                getFrame().setTitle("دسته‌بندی معیار");
            }
        });
        setPunishmentRewardMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowEvaluations showEvaluations = new ShowEvaluations();
                MainFrame.getInstance().getFrame().getContentPane().remove(MainFrame.getInstance().getPanel());
                showEvaluations.setVisible(true);
                getFrame().setTitle("تعیین روش تشویق و تنبیه");
            }
        });
    }

    private void createComponents() {
        JFrame frame = getFrame();
        JMenuBar menuBar = frame.getJMenuBar();

        logoutMenuItem = new JMenuItem("خروج از سامانه");
        menuBar.add(logoutMenuItem);

        addEmployeeMenu = new JMenu("ثبت کارمند جدید");
        menuBar.add(addEmployeeMenu);

        addUnitManagerMenuItem = new JMenuItem("ثبت مدیر بخش جدید");
        addEmployeeMenu.add(addUnitManagerMenuItem);

        addEmployeeMenuItem = new JMenuItem("ثبت کارمند جدید");
        addEmployeeMenu.add(addEmployeeMenuItem);

        evaluationMenu = new JMenu("اقدامات مربوط به معیارها");
        menuBar.add(evaluationMenu);

        addEvaluationMenuItem = new JMenuItem("افزودن معیار ارزیابی");
        evaluationMenu.add(addEvaluationMenuItem);

        categorizeMenuItem = new JMenuItem("دسته بندی معیارها");
        evaluationMenu.add(categorizeMenuItem);

        setPunishmentRewardMenuItem = new JMenuItem("تعیین روش تشویق و تنبیه");
        evaluationMenu.add(setPunishmentRewardMenuItem);

        addEvaluatorToEvaluationMenuItem = new JMenuItem("افزودن ارزیاب به دسته ارزیابی");
        evaluationMenu.add(addEvaluatorToEvaluationMenuItem);
    }

}
