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
public class RewardPunishmentPanel implements Visibility {
    private JPanel panel;
    private JButton addBtn;
    private JButton cancelBtn;

    public RewardPunishmentPanel(){
        createComponents();
        createEvents();
    }

    private void createEvents() {
    }

    private void createComponents() {
        panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);

        addBtn = new JButton("ثبت روش‌ها");
        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        addBtn.setForeground(new Color(0, 128, 0));

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(new Color(255, 20, 147));
        cancelBtn.addActionListener(new ActionListener() {
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

        JLabel label = new JLabel("روش تشویق");

        JLabel label_2 = new JLabel("روش تنبیه");

        JTextPane textPane = new JTextPane();

        JTextPane textPane_1 = new JTextPane();
        textPane_1.setEditable(false);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(27)
                                .addComponent(label, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPane, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                .addGap(26)
                                .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(149, Short.MAX_VALUE)
                                .addComponent(addBtn)
                                .addGap(122)
                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addGap(137))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(30)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textPane_1, GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.LEADING, groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(textPane, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                                .addComponent(label_2))
                                        .addComponent(label, GroupLayout.Alignment.LEADING))
                                .addGap(33)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelBtn)
                                        .addComponent(addBtn))
                                .addContainerGap(150, Short.MAX_VALUE))
        );
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
