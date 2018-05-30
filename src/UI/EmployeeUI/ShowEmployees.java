package UI.EmployeeUI;

import UI.MainFrame;
import UI.Visibility;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ShowEmployees implements Visibility {
    private JPanel panel;
    private JButton chooseBtn;
    private JButton cancelBtn;

    /**
     * Create the application.
     */
    public ShowEmployees() {
        createComponents();
        createEvents();
    }

    public void createEvents() {
        chooseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShowCategories showCategories = new ShowCategories();
                MainFrame.getInstance().getFrame().setTitle("مشاهده‌ی ارزیابی‌های انجام شده");
                setVisible(false);
                showCategories.setVisible(true);
            }
        });
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
            }
        });
    }

    private void createComponents() {
        panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);

        chooseBtn = new JButton("انتخاب کارمند برای ارزیابی");
        chooseBtn.setForeground(new Color(0, 128, 0));

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(new Color(255, 20, 147));

        String[] columnNames = {"نام کارمند",
                " نام خانوادگی کارمند", "شماره پرسنلی کارمند"};

        Object[][] data = {
                {"افرا", "امینی",
                        "015234", new Integer(5), new Boolean(false)},
                {"پری‌شاد", "بهنام قادر",
                        "015523", new Integer(3), new Boolean(true)},

                {"یگانه", "علی‌محمدی",
                        "11258", new Integer(3), new Boolean(true)},
        };

        JScrollPane scrollPane = new JScrollPane();
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(30)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(chooseBtn)
                                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(45, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(chooseBtn)
                                        .addComponent(cancelBtn))
                                .addGap(261))
        );

        JTable table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);
        panel.setLayout(groupLayout);
    }

    public JPanel getPanel(){return panel;}

    @Override
    public void setVisible(Boolean visible) {
        if(visible){
            MainFrame.getInstance().getFrame().getContentPane().add(panel);
            MainFrame.getInstance().getFrame().validate();
            MainFrame.getInstance().setPanel(panel);
        }else{
            MainFrame.getInstance().getFrame().getContentPane().remove(panel);
        }
    }
}
