package UI.EmployeeUI;
import UI.MainFrame;
import UI.Visibility;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class ShowEvaluation implements Visibility {
    private JButton chooseBtn;
    private JButton btnCancel;
    private JTextField evaluationTextField;
    private JPanel panel;
    /**
     * Create the application.
     */
    public ShowEvaluation() {
        createComponents();
        createEvents();
    }


    private void createEvents() {
        chooseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                QuantitativeEvaluation quantitativeEvaluation = new QuantitativeEvaluation();
                setVisible(false);
                quantitativeEvaluation.setVisible(true);
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    panel.setVisible(false);
                    MainFrame.getInstance().getFrame().setTitle("پنل کاربری");
            }
        });
    }

    private void createComponents() {
        panel = new JPanel();

        chooseBtn = new JButton("انتخاب معیار ارزیابی");
        chooseBtn.setForeground(new Color(0, 128, 0));

        btnCancel = new JButton("لغو عملیات");
        btnCancel.setForeground(new Color(255, 20, 147));

        String[] columnNames = {"ماهیت معیار",
                "", "تعداد ارزیاب‌های اختصاص داده شده"};

        Object[][] data = {
                {"کمی", "2",
                        "3", new Integer(5), new Boolean(false)},
                {"کیفی", "5",
                        "10", new Integer(3), new Boolean(true)},
                {"کمی کیفی", "12",
                        "14", new Integer(2), new Boolean(false)},
        };

        JLabel nameLabel = new JLabel("نام دسته");
        nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));

        evaluationTextField = new JTextField();
        evaluationTextField.setHorizontalAlignment(SwingConstants.CENTER);
        evaluationTextField.setEditable(false);
        evaluationTextField.setEnabled(false);
        evaluationTextField.setText("کیفی");
        evaluationTextField.setColumns(10);

        JLabel categoryLabel = new JLabel("معیار‌های تعریف شده در دسته");
        categoryLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setEnabled(false);
        textArea.setText("نظم کاری\nاهمیت دادن به مسائل کاری\n");

        GroupLayout groupLayout = new GroupLayout(panel);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
                                                .addGap(75)
                                                .addComponent(chooseBtn)
                                                .addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                                .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(34)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(categoryLabel, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nameLabel))
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(evaluationTextField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                                                        .addComponent(textArea, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))))
                                .addGap(143))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap(22, Short.MAX_VALUE)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(nameLabel)
                                        .addComponent(evaluationTextField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(categoryLabel)
                                        .addComponent(textArea, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(chooseBtn)
                                        .addComponent(btnCancel))
                                .addGap(91))
        );
        panel.setLayout(groupLayout);
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
