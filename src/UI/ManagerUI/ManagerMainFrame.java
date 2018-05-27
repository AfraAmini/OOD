package UI.ManagerUI;

import UI.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class ManagerMainFrame extends MainFrame {
    private JMenu menu;
    private JMenuItem menuItem_5;
    private JMenuItem menuItem_6;
    private JMenuItem menuItem_7;
    private JMenu menu_1;
    private JMenuItem menuItem_1;
    private JMenuItem menuItem_2;
    private JMenuItem menuItem_4;
    private JMenu menu_2;
//    private JMenuItem menuItem_3;
//    private JMenuItem menuItem_8;
//    private JMenuItem menuItem_9;

    public ManagerMainFrame(){
        super();
        getFrame().setTitle("پنل کاربری مدیر سامانه");
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
                    ManagerMainFrame window = new ManagerMainFrame();
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
                AddUnitManagerPanel addUnitManagerPanel = new AddUnitManagerPanel();
                changePanel(addUnitManagerPanel);
                getFrame().setTitle("ثبت مدیر بخش جدید");
            }
        });

        menuItem_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddUserPanel addUserPanel = new AddUserPanel();
                changePanel(addUserPanel);
                getFrame().setTitle("ثبت کارمند جدید");
            }
        });
        menuItem_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddEvaluatorPanel addEvaluatorPanel = new AddEvaluatorPanel();
                changePanel(addEvaluatorPanel);
                getFrame().setTitle("ثبت ارزیاب جدید");
            }
        });
        menuItem_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddEvaluationPanel addEvaluationPanel = new AddEvaluationPanel();
                changePanel(addEvaluationPanel);
                getFrame().setTitle("افزودن معیار ارزیابی");
            }
        });
        menuItem_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CategorizePanel categorizePanel = new CategorizePanel();
                changePanel(categorizePanel);
                getFrame().setTitle("دسته‌بندی معیار");
            }
        });
        menuItem_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RewardPunishmentPanel rewardPunishmentPanel = new RewardPunishmentPanel();
                changePanel(rewardPunishmentPanel);
                getFrame().setTitle("تعیین روش تشویق و تنبیه");
            }
        });
    }

    private void createComponents() {
        JFrame frame = getFrame();
        JMenuBar menuBar = frame.getJMenuBar();

        menu_1 = new JMenu("ثبت کارمند جدید");
        menuBar.add(menu_1);

        menuItem_1 = new JMenuItem("ثبت مدیر بخش جدید");
        menu_1.add(menuItem_1);

        menuItem_2 = new JMenuItem("ثبت کارمند جدید");
        menu_1.add(menuItem_2);

        menu = new JMenu("اقدامات مربوط به معیارها");
        menuBar.add(menu);

        menuItem_5 = new JMenuItem("افزودن معیار ارزیابی");
        menu.add(menuItem_5);

        menuItem_6 = new JMenuItem("دسته بندی معیارها");
        menu.add(menuItem_6);

        menuItem_7 = new JMenuItem("تعیین روش تشویق و تنبیه");
        menu.add(menuItem_7);

        menuItem_4 = new JMenuItem("افزودن ارزیاب به دسته ارزیابی");
        menu.add(menuItem_4);

        menu_2 = new JMenu("اقدامات مربوط به درستی سنجی");
        menuBar.add(menu_2);

//        menuItem_3 = new JMenuItem("مشاهده درخواست‌های ارزیابی مجدد");
//        menu_2.add(menuItem_3);
//
//        menuItem_8 = new JMenuItem("انتخاب ارزیاب برای ارزیابی مجدد");
//        menu_2.add(menuItem_8);
//
//        menuItem_9 = new JMenuItem("تایید نهایی ارزیابی‌های مجدد");
//        menu_2.add(menuItem_9);
    }
}
