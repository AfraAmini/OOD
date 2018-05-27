package UI.ManagerUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class AddEvaluatorPanel extends JPanel{

    private JButton btnAdd;
    private JButton btnCancel;
    private JTable table;
    protected JButton addNewEvaluatorBtn;

    public AddEvaluatorPanel() {
        super();
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        createComponents(groupLayout);
        createEvents();
        createEvents();
    }

    private void createEvents() {
        addNewEvaluatorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddNewEvaluatorPanel addNewEvaluatorPanel = new AddNewEvaluatorPanel();
//                changePanel(addNewEvaluatorPanel);
//                getFrame().setTitle("انتخاب ارزیاب از لیست کارمندان");
            }
        });
    }

    private void createComponents(GroupLayout groupLayout) {
        this.setLayout(groupLayout);

        btnAdd = new JButton("افزودن این ارزیاب به دسته ارزیابی");
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


        String[] columnNames = {"نام ارزیاب",
                "نام خانوادگی ارزیاب", "شماره پرسنلی ارزیاب"};

        Object[][] data = {
                {"افرا", "امینی",
                        "015234", new Integer(5), new Boolean(false)},
                {"پری‌شاد", "بهنام قادر",
                        "015234", new Integer(3), new Boolean(true)},
        };

        JScrollPane scrollPane = new JScrollPane();

        addNewEvaluatorBtn = new JButton("انتخاب ارزیاب از لیست کارمندان");
        addNewEvaluatorBtn.setForeground(new Color(153, 51, 255));
        addNewEvaluatorBtn.setBackground(Color.WHITE);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(30)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(addNewEvaluatorBtn, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAdd)
                                                .addGap(18)
                                                .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(28, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCancel)
                                        .addComponent(btnAdd)
                                        .addComponent(addNewEvaluatorBtn))
                                .addGap(261))
        );

        table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);

    }
}
