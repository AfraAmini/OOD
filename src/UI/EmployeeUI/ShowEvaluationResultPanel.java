package UI.EmployeeUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class ShowEvaluationResultPanel extends EmployeeMainFrame  {
    private JTable table;
    private JPanel panel;
    private JButton cancelBtn;

    public ShowEvaluationResultPanel() {
        super();
        createComponents();
        createEvents();
    }


    public void createEvents(){
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
            }
        });

    }
    private void createComponents() {
        panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);
        panel.setLayout(groupLayout);
        JScrollPane scrollPane = new JScrollPane();

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(UIManager.getColor("Button.select"));

        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addGap(43)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addGap(108))
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(15)
                                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                                .addGap(14))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(18)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(cancelBtn)
                                        )
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        String[] columnNames = {"ماهیت معیار",
                "دسته ارزیابی", "نتیجه ارزیابی"};

        Object[][] data = {
                {"تجربه", "کمی-کیفی",
                        "نتیجه کیفی: عالی ، نتیجه کمی: ۲۵ سال", new Integer(5), new Boolean(false)},
                {"مهارت کار گروهی", "کیفی",
                        "متوسط", new Integer(3), new Boolean(true)},
                {"ساعت کاری مناسب", "کمی کیفی",
                        "نتیجه کمی: روزی ۶ ساعت، نتیجه کیفی: مطلوب", new Integer(2), new Boolean(false)},
                {"نظم کاری", "کیفی",
                        "مطلوب", new Integer(20), new Boolean(true)},
                {"اهمیت دادن به مسائل کاری", "کیفی",
                        "عالی", new Integer(10), new Boolean(false)}
        };

        table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);
    }

    public JPanel getPanel(){return panel;}
}
