package UI.EmployeeUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by parishad on 5/27/18.
 */
public class ShowEvaluationResultPanel extends JPanel {
    private JTable table;

    public ShowEvaluationResultPanel() {
        super();
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        createComponents(groupLayout);
    }

    private void createComponents(GroupLayout groupLayout) {
        this.setLayout(groupLayout);

        JScrollPane scrollPane = new JScrollPane();

        JButton button = new JButton("اعتراض به ارزیابی انتخابی");
        button.setForeground(new Color(0, 102, 0));

        JButton button_1 = new JButton("لغو عملیات");
        button_1.setForeground(UIManager.getColor("Button.select"));
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addGap(43)
                                .addComponent(button)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                                .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(button_1)
                                        .addComponent(button))
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
}
