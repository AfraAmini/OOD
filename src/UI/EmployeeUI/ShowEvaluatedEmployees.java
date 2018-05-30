package UI.EmployeeUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class ShowEvaluatedEmployees extends EmployeeMainFrame {
    private JTable table;
    private JPanel panel;
    private JButton cancelBtn;
    private JButton chooseBtn;

    public ShowEvaluatedEmployees() {
        super();
        createComponents();
        createEvents();
    }
    public JPanel getPanel(){
        return panel;
    }
    public void createEvents(){
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
            }
        });

    }
    private void createComponents() {
        panel= new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);

        JScrollPane scrollPane = new JScrollPane();

        chooseBtn = new JButton("انتخاب کارمند");
        chooseBtn.setForeground(new Color(0, 102, 0));

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(UIManager.getColor("Button.select"));

        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(23)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(43)
                                .addComponent(chooseBtn)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addGap(108))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(18)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(chooseBtn)
                                        .addComponent(cancelBtn))
                                .addContainerGap(102, Short.MAX_VALUE))
        );

        String[] columnNames = {"نام معیار",
                " نام کارمند", "نام خانوادگی کارمند"};

        Object[][] data = {
                {"نظم کاری", "افرا",
                        "امینی", new Integer(5), new Boolean(false)},
                {"تجربه", "پری‌شاد ",
                        "بهنام قادر", new Integer(3), new Boolean(true)},

        };

        table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);
    }
}
