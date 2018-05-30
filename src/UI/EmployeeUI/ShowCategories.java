package UI.EmployeeUI;
import UI.MainFrame;
import UI.Visibility;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ShowCategories implements Visibility {

    private JPanel panel;
    private JButton chooseBtn;
    private JButton cancelBtn;


    /**
     * Create the application.
     */
    public ShowCategories() {
        super();
        createComponents();
        createEvents();
    }


    private void createEvents() {
        chooseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ShowEvaluation showEvaluation = new ShowEvaluation();
                MainFrame.getInstance().getFrame().setTitle("انتخاب معیار ارزیابی");
                setVisible(false);
                showEvaluation.setVisible(true);
            }
        });
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                MainFrame.getInstance().getFrame().setTitle("پنل کاربری");
            }
        });

    }

    private void createComponents() {
        panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);

        chooseBtn = new JButton("انتخاب دسته معیار");
        chooseBtn.setForeground(new Color(0, 102, 0));

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(new Color(255, 20, 147));


        String[] columnNames = {"دسته ارزیابی",
                "تعداد معیار‌های اختصاص داده شده", "تعداد ارزیاب‌های اختصاص داده شده"};

        Object[][] data = {
                {"کمی", "2",
                        "3", new Integer(5), new Boolean(false)},
                {"کیفی", "5",
                        "10", new Integer(3), new Boolean(true)},
                {"کمی کیفی", "12",
                        "14", new Integer(2), new Boolean(false)},
        };

        JScrollPane scrollPane = new JScrollPane();
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(30)
                                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(96)
                                                .addComponent(chooseBtn)
                                                .addGap(103)
                                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(chooseBtn)
                                        .addComponent(cancelBtn))
                                .addGap(261))
        );

        JTable table = new JTable(data, columnNames);
        scrollPane.setViewportView(table);
    }
    public JPanel getPanel(){return panel;}

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
