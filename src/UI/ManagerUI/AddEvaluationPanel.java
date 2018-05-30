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
public class AddEvaluationPanel implements Visibility{
    private JPanel panel;
    private JEditorPane responsibilitiesEditorPanel;
    private JButton addBtn;
    private JButton cancelBtn;

    public AddEvaluationPanel(){
        super();
        createComponents();
        createEvents();
    }
    private void createEvents(){
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
        panel.setLayout(groupLayout);

        JLabel lblResponsibilities = new JLabel("ماهیت معیار");

        responsibilitiesEditorPanel = new JEditorPane();

        addBtn = new JButton("اضافه کن");
        addBtn.setForeground(new Color(0, 128, 0));

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(new Color(255, 20, 147));

        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(114)
                                                .addComponent(addBtn)
                                                .addGap(107)
                                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
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
                                                        .addComponent(addBtn)
                                                        .addComponent(cancelBtn))))
                                .addContainerGap(194, Short.MAX_VALUE))
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
