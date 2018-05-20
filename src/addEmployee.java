import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class addEmployee {

    private JFrame frmUnitManagerPanel;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JEditorPane dtrpnSdfsdfsdf;
    private JButton btnAdd;
    private JButton btnCancel;
    private JMenuBar menuBar;
    private JMenuItem menuItem;
    private JMenu menu;
    private JMenuItem menuItem_5;
    private JMenuItem menuItem_6;
    private JMenuItem menuItem_7;
    private JMenu menu_1;
    private JMenuItem menuItem_1;
    private JMenuItem menuItem_2;
    private JMenuItem menuItem_4;
    private JMenu menu_2;
    private JMenuItem menuItem_3;
    private JMenuItem menuItem_8;
    private JMenuItem menuItem_9;
    private JLabel label;
    private JTextField textField_4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    addEmployee window = new addEmployee();
                    window.frmUnitManagerPanel.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public addEmployee() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        createComponents();
        createEvents();
    }

    private void createEvents() {
        // TODO Auto-generated method stub

    }

    private void createComponents() {
        frmUnitManagerPanel = new JFrame();
        frmUnitManagerPanel.setTitle("ثبت کارمند جدید");
        frmUnitManagerPanel.setBounds(100, 100, 539, 465);
        frmUnitManagerPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblFirstName = new JLabel("نام");

        textField = new JTextField();
        textField.setColumns(10);

        JLabel lblLastName = new JLabel("نام خانوادگی");

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        JLabel lblIdNumber = new JLabel("شماره پرسنلی");

        textField_2 = new JTextField();
        textField_2.setColumns(10);

        JLabel lblEmail = new JLabel("رایانامه");

        textField_3 = new JTextField();
        textField_3.setColumns(10);

        JLabel lblResponsibilities = new JLabel("شرح وظایف");

        dtrpnSdfsdfsdf = new JEditorPane();

        btnAdd = new JButton("اضافه کن");
        btnAdd.setForeground(new Color(0, 128, 0));
        btnAdd.setBackground(new Color(255, 255, 255));

        btnCancel = new JButton("لغو عملیات");
        btnCancel.setForeground(new Color(255, 20, 147));
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        label = new JLabel("نام بخش");

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        GroupLayout groupLayout = new GroupLayout(frmUnitManagerPanel.getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(16)
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(lblIdNumber, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lblResponsibilities))
                                                                .addComponent(label, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                                                .addGap(1))
                                                        .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 425, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                                                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                                        .addComponent(dtrpnSdfsdfsdf, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                                                        .addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
                                                                .addGap(1))))
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lblFirstName))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                                                        .addGroup(groupLayout.createSequentialGroup()
                                                                .addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                                                                .addGap(1))
                                                        .addComponent(textField, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))))
                                .addGap(14))
                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap(152, Short.MAX_VALUE)
                                .addComponent(btnAdd)
                                .addGap(76)
                                .addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
                                .addGap(146))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addGap(16)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE, false)
                                        .addComponent(lblFirstName)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(22)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblLastName)
                                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblIdNumber)
                                        .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblEmail)
                                        .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(34)
                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label))
                                .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                                        .addGroup(groupLayout.createSequentialGroup()
                                                .addGap(40)
                                                .addComponent(lblResponsibilities)
                                                .addContainerGap())
                                        .addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
                                                .addGap(24)
                                                .addComponent(dtrpnSdfsdfsdf, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                                .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                                                        .addComponent(btnCancel)
                                                        .addComponent(btnAdd))
                                                .addGap(15))))
        );
        frmUnitManagerPanel.getContentPane().setLayout(groupLayout);

        menuBar = new JMenuBar();
        frmUnitManagerPanel.setJMenuBar(menuBar);

        menuItem = new JMenuItem("خروج از سامانه");
        menuBar.add(menuItem);

        menu_1 = new JMenu("ثبت کارمند جدید");
        menuBar.add(menu_1);

        menuItem_1 = new JMenuItem("ثبت مدیر بخش جدید");
        menu_1.add(menuItem_1);

        menuItem_2 = new JMenuItem("ثبت کارمند جدید");
        menu_1.add(menuItem_2);

        menu = new JMenu("اقدامات مربوط به معیارها");
        menuBar.add(menu);

        menuItem_5 = new JMenuItem("افزودن معیار ارزیابی");
        menu.add(menuItem_5);

        menuItem_6 = new JMenuItem("دسته بندی معیارها");
        menu.add(menuItem_6);

        menuItem_7 = new JMenuItem("تعیین روش تشویق و تنبیه");
        menu.add(menuItem_7);

        menuItem_4 = new JMenuItem("افزودن ارزیاب به دسته ارزیابی");
        menu.add(menuItem_4);

        menu_2 = new JMenu("اقدامات مربوط به درستی سنجی");
        menuBar.add(menu_2);

        menuItem_3 = new JMenuItem("مشاهده درخواست‌های ارزیابی مجدد");
        menu_2.add(menuItem_3);

        menuItem_8 = new JMenuItem("انتخاب ارزیاب برای ارزیابی مجدد");
        menu_2.add(menuItem_8);

        menuItem_9 = new JMenuItem("تایید نهایی ارزیابی‌های مجدد");
        menu_2.add(menuItem_9);
    }
}
