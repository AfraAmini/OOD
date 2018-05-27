package UI.ManagerUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by parishad on 5/27/18.
 */
public class AddEvaluationPanel extends JPanel {
    private JEditorPane responsibilitiesEditorPanel;
    private JButton btnAdd;
    private JButton btnCancel;

    public AddEvaluationPanel() {
        super();
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);
        createComponents(groupLayout);
    }

    private void createComponents(GroupLayout groupLayout) {
        this.setLayout(groupLayout);

        JLabel lblResponsibilities = new JLabel("ماهیت معیار");

        responsibilitiesEditorPanel = new JEditorPane();

        btnAdd = new JButton("اضافه کن");
        btnAdd.setForeground(new Color(0, 128, 0));
        btnAdd.setBackground(new Color(255, 255, 255));

        btnCancel = new JButton("لغو عملیات");
        btnCancel.setForeground(new Color(255, 20, 147));
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(114)
                                                .addComponent(btnAdd)
                                                .addGap(107)
                                                .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(23)
                                                .addComponent(lblResponsibilities)
                                                .addGap(47)
                                                .addComponent(responsibilitiesEditorPanel, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(46)
                                                .addComponent(lblResponsibilities))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(26)
                                                .addComponent(responsibilitiesEditorPanel, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                                .addGap(27)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnAdd)
                                                        .addComponent(btnCancel))))
                                .addContainerGap(194, Short.MAX_VALUE))
        );
    }
}
