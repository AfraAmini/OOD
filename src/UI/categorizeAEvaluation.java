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
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;

public class categorizeAEvaluation {

	private JFrame categorizeFrame;
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
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					categorizeAEvaluation window = new categorizeAEvaluation();
					window.categorizeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public categorizeAEvaluation() {
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
		categorizeFrame = new JFrame();
		categorizeFrame.getContentPane().setEnabled(false);
		categorizeFrame.setTitle("تعریف ارزیابی");
		categorizeFrame.setBounds(100, 100, 543, 375);
		categorizeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAdd = new JButton("ثبت معیار");
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("کمی");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel = new JLabel("معیار ارزیابی");
		
		JRadioButton radioButton = new JRadioButton("کیفی");
		buttonGroup.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("کمی-کیفی");
		buttonGroup.add(radioButton_1);
		
		JLabel label = new JLabel("روش کمی ارزیابی");
		
		JLabel label_1 = new JLabel("روش کیفی ارزیابی");
		label_1.setEnabled(false);
		
		JLabel label_2 = new JLabel("نحوه تفسیر");
		
		JLabel label_3 = new JLabel("نحوه تفسیر");
		label_3.setEnabled(false);
		
		JTextPane textPane = new JTextPane();
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		
		JTextPane textPane_2 = new JTextPane();
		
		JTextPane textPane_3 = new JTextPane();
		GroupLayout groupLayout = new GroupLayout(categorizeFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(82)
							.addComponent(btnAdd))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(49)
									.addComponent(rdbtnNewRadioButton))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
										.addComponent(label, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
										.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))))))
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(96)
									.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
										.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(39)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(label_2))
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(22)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(23)
									.addComponent(label_1))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(textPane_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAdd)
								.addComponent(btnCancel))
							.addGap(32))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addComponent(label_3)
							.addContainerGap())))
		);
		categorizeFrame.getContentPane().setLayout(groupLayout);
		
		menuBar = new JMenuBar();
		categorizeFrame.setJMenuBar(menuBar);
		
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
