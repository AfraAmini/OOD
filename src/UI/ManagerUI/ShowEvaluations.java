package UI.ManagerUI;

import UI.MainFrame;
import UI.Visibility;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class ShowEvaluations implements Visibility {
    private JButton chooseBtn;
    private JButton cancelBtn;
    private JPanel panel;
    /**
     * Create the application.
     */
    public ShowEvaluations() {
        createComponents();
        createEvents();
    }


    private void createEvents() {
        chooseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                RewardPunishmentPanel rewardPunishmentPanel= new RewardPunishmentPanel();
                rewardPunishmentPanel.setVisible(true);
            }
        });
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                MainFrame.getInstance().getFrame().setTitle("پنل کاربری");
            }
        });
    }

    private void createComponents() {
        panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);

        chooseBtn = new JButton("انتخاب معیار");
        chooseBtn.setForeground(new Color(0, 128, 0));

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(new Color(255, 20, 147));


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
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(30)
                                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(100)
                                                .addComponent(chooseBtn)
                                                .addGap(107)
                                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(cancelBtn)
                                        .addComponent(chooseBtn))
                                .addGap(214))
        );

        JTable table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);
    }


    JPanel getPanel(){ return panel;}
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
