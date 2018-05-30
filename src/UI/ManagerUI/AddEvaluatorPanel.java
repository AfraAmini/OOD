package UI.ManagerUI;

import UI.MainFrame;
import UI.Visibility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class AddEvaluatorPanel implements Visibility {
    private JPanel panel;
    private JButton addThisEvaluatorBtn;
    private JButton cancelBtn;
    private JTable table;
    protected JButton addNewEvaluatorBtn;

    public AddEvaluatorPanel() {
        createComponents();
        createEvents();
    }

    private void createEvents() {
        addThisEvaluatorBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        addNewEvaluatorBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddNewEvaluatorPanel addNewEvaluatorPanel = new AddNewEvaluatorPanel();
                MainFrame.getInstance().getFrame().setTitle("انتخاب ارزیاب از لیست کارمندان");
                setVisible(false);
                addNewEvaluatorPanel.setVisible(true);
            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    private void createComponents() {
        panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);

        addThisEvaluatorBtn = new JButton("افزودن این ارزیاب به دسته ارزیابی");
        addThisEvaluatorBtn.setForeground(new Color(0, 128, 0));

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(new Color(255, 20, 147));

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

        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(30)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addComponent(addNewEvaluatorBtn, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addThisEvaluatorBtn)
                                                .addGap(8)
                                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(cancelBtn)
                                        .addComponent(addThisEvaluatorBtn)
                                        .addComponent(addNewEvaluatorBtn))
                                .addGap(261))
        );

        table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);

    }
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
