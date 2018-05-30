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
    public ShowEvaluatedEmployees() {
        super();
//        createComponents();

    }
    public JPanel getPanel(){
        return panel;
    }
    public void cancel(){

    }
    private void createComponents() {
        panel= new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);

        JScrollPane scrollPane = new JScrollPane();

        JButton button = new JButton("انتخاب کارمند");
        button.setForeground(new Color(0, 102, 0));

        JButton button_1 = new JButton("لغو عملیات");
        button_1.setForeground(UIManager.getColor("Button.select"));
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(23)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(43)
                                .addComponent(button)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addGap(108))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(18)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(button)
                                        .addComponent(button_1))
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
//    @Override
    public void setVisible(boolean visible){
        createComponents();
//        System.out.println(panel.getLayout());
        super.getFrame().getContentPane().add(panel);
        super.getFrame().getContentPane().validate();
    }
}
