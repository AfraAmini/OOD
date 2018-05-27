package UI.ManagerUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class CategorizePanel extends JPanel {
    private JButton btnAdd;
    private JButton btnCancel;
    private JTable table;

    public CategorizePanel() {
        super();
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        createComponents(groupLayout);
    }

    private void createComponents(GroupLayout groupLayout) {
        this.setLayout(groupLayout);

        btnAdd = new JButton("انتخاب معیار");
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


        String[] columnNames = {"ماهیت معیار",
                "دسته ارزیابی",};

        Object[][] data = {
                {"تجربه", "تعریف نشده",
                        "ارتباط انسانی", new Integer(5), new Boolean(false)},
                {"مهارت کار گروهی", "تعریف نشده",
                        "دانش", new Integer(3), new Boolean(true)},
                {"ساعت کاری مناسب", "کمی کیفی",
                        "اخلاق", new Integer(2), new Boolean(false)},
                {"نظم کاری", "کیفی",
                        "Speed reading", new Integer(20), new Boolean(true)},
                {"اهمیت دادن به مسائل کاری", "کیفی",
                        "وقت شناسی", new Integer(10), new Boolean(false)}
        };

        JScrollPane scrollPane = new JScrollPane();
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(30)
                                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(100)
                                                .addComponent(btnAdd)
                                                .addGap(107)
                                                .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCancel)
                                        .addComponent(btnAdd))
                                .addGap(214))
        );

        table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);
    }
}
