package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class showACategory {

	private JFrame catFrame;
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
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showACategory window = new showACategory();
					window.catFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public showACategory() {
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
		catFrame = new JFrame();
		catFrame.setTitle("مشخصات یک دسته ارزیابی");
		catFrame.setBounds(100, 100, 525, 319);
		catFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAdd = new JButton("افزودن ارزیاب به این دسته");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAdd.setForeground(new Color(0, 128, 0));
		btnAdd.setBackground(new Color(255, 255, 255));
		
		btnCancel = new JButton("لغو عملیات");
		btnCancel.setForeground(new Color(255, 20, 147));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
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
		
		label = new JLabel("نام دسته");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setText("کیفی");
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("معیار‌های تعریف شده در دسته");
		label_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setText("نظم کاری\nاهمیت دادن به مسائل کاری\n");
		
		JLabel label_2 = new JLabel("ارزیابان منتسب به دسته");
		label_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("افرا امینی\nیگانه علی‌محمدی");
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(catFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(75)
							.addComponent(btnAdd)
							.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
										.addComponent(label))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
										.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))))
					.addGap(143))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnCancel))
					.addGap(91))
		);
		catFrame.getContentPane().setLayout(groupLayout);
		
		menuBar = new JMenuBar();
		catFrame.setJMenuBar(menuBar);
		
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
