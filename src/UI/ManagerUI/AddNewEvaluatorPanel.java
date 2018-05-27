package UI.ManagerUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class AddNewEvaluatorPanel extends JPanel{
    private JButton btnAdd;
    private JButton btnCancel;
    private JTable table;

    public AddNewEvaluatorPanel() {
        super();
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        createComponents(groupLayout);
    }

    private void createComponents(GroupLayout groupLayout) {
        this.setLayout(groupLayout);

        btnAdd = new JButton("افزودن کارمند به لیست ارزیابان دسته");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnAdd.setForeground(new Color(0, 128, 0));
        btnAdd.setBackground(new Color(255, 255, 255));

        btnCancel = new JButton("لغو عملیات");
        btnCancel.setForeground(new Color(255, 20, 147));
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

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
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(30)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(btnAdd)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(45, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdd)
                                        .addComponent(btnCancel))
                                .addGap(261))
        );

        table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);
    }
}
