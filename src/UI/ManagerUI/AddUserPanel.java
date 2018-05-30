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
public class AddUserPanel implements Visibility {
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JTextField IDNumberTextField;
    private JTextField emailTextField;
    private JEditorPane responsibilitiesEditorPane;
    private JButton addBtn;
    private JButton cancelBtn;
    private JLabel unitLabel;
    private JTextField unitTextField;
    private JPanel panel;

    public AddUserPanel() {
        super();
        createComponents();
    }

    private void createComponents() {
        panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);

        JLabel firstNameLabel = new JLabel("نام");

        firstNameTextField = new JTextField();
        firstNameTextField.setColumns(10);

        JLabel lastNameLabel = new JLabel("نام خانوادگی");

        lastNameTextField = new JTextField();
        lastNameTextField.setColumns(10);

        JLabel IDNumberLabel = new JLabel("شماره پرسنلی");

        IDNumberTextField = new JTextField();
        IDNumberTextField.setColumns(10);

        JLabel emailLabel = new JLabel("رایانامه");

        emailTextField = new JTextField();
        emailTextField.setColumns(10);

        JLabel responsibilitiesLabel = new JLabel("شرح وظایف");

        responsibilitiesEditorPane = new JEditorPane();

        addBtn = new JButton("اضافه کن");
        addBtn.setForeground(new Color(0, 128, 0));

        cancelBtn = new JButton("لغو عملیات");
        cancelBtn.setForeground(new Color(255, 20, 147));
        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        unitLabel = new JLabel("نام بخش");

        unitTextField = new JTextField();
        unitTextField.setColumns(10);
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(16)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(IDNumberLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(emailLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(responsibilitiesLabel))
                                                                .addComponent(unitLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(IDNumberTextField, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                                                .addGap(1))
                                                        .addComponent(unitTextField, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(responsibilitiesEditorPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                                                        .addComponent(emailTextField, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                                                                .addGap(1))))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lastNameLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(firstNameLabel))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(lastNameTextField, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                                                .addGap(1))
                                                        .addComponent(firstNameTextField, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))))
                                .addGap(14))
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(152, Short.MAX_VALUE)
                                .addComponent(addBtn)
                                .addGap(76)
                                .addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addGap(146))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(16)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE, false)
                                        .addComponent(firstNameLabel)
                                        .addComponent(firstNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(22)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lastNameLabel)
                                        .addComponent(lastNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(IDNumberLabel)
                                        .addComponent(IDNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailLabel)
                                        .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(34)
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(unitTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(unitLabel))
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(40)
                                                .addComponent(responsibilitiesLabel)
                                                .addContainerGap())
                                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                                .addGap(24)
                                                .addComponent(responsibilitiesEditorPane, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cancelBtn)
                                                        .addComponent(addBtn))
                                                .addGap(15))))
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
