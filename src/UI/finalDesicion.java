package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

public class finalDesicion {

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
	private JLabel label_1;
	private JTextPane textPane_2;
	private JLabel label_3;
	private JTextPane textPane_3;
	private JTextArea textArea;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JTextArea textArea_1;
	private JLabel label_7;
	private JTextPane textPane;
	private JButton button;
	private JTextArea textArea_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalDesicion window = new finalDesicion();
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
	public finalDesicion() {
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
		categorizeFrame.setTitle("تایید ارزیابی مجدد");
		categorizeFrame.setBounds(100, 100, 601, 475);
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
		
		JLabel lblNewLabel = new JLabel("نوع معیار");
		
		JRadioButton radioButton = new JRadioButton("کیفی");
		radioButton.setEnabled(false);
		buttonGroup.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("کمی-کیفی");
		radioButton_1.setEnabled(false);
		buttonGroup.add(radioButton_1);
		
		JLabel label = new JLabel("روش کمی ارزیابی");
		
		JLabel label_2 = new JLabel("نحوه تفسیر");
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEnabled(false);
		textPane_1.setText("اگر ساعت ورود زودتر یا مسای ۶ \nو ساعت خروج دیرتر یا مساوی ۵ باشد\n مناسب است");
		textPane_1.setEditable(false);
		
		label_1 = new JLabel("نظر ارزیاب مجدد اول");
		
		textPane_2 = new JTextPane();
		textPane_2.setEnabled(false);
		textPane_2.setEditable(false);
		textPane_2.setText("ارزیابی درست انجام نشده");
		
		label_3 = new JLabel("نظر ارزیاب مجدد دوم");
		
		textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setEnabled(false);
		textPane_3.setText("ارزیابی درست انجام شده\n");
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setText("ساعت ورود و \nخروج ارزیابی به صورت\n بازه ثبت می‌شوند\n");
		
		label_4 = new JLabel("نام معیار");
		
		label_5 = new JLabel("وقت شناسی");
		
		label_6 = new JLabel("نظر نهایی مدیر");
		
		textArea_1 = new JTextArea();
		
		label_7 = new JLabel("نظر ارزیاب مجدد دوم");
		
		textPane = new JTextPane();
		textPane.setText("ارزیابی درست انجام شده");
		textPane.setEnabled(false);
		textPane.setEditable(false);
		
		button = new JButton("ثبت نظر نهایی");
		button.setForeground(new Color(0, 102, 0));
		
		textArea_2 = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(categorizeFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(label, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
												.addGap(18))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
										.addComponent(button))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textArea, 0, 0, Short.MAX_VALUE)
												.addComponent(textPane_2, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
											.addGap(20)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
												.addComponent(radioButton, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
										.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
									.addGap(31)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(rdbtnNewRadioButton)
											.addPreferredGap(ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
											.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(label_5)
											.addPreferredGap(ComponentPlacement.RELATED, 406, Short.MAX_VALUE)))))
							.addGap(86)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textPane_3, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(83)
							.addComponent(btnAdd)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(label_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(label)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_2))
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(31)
									.addComponent(label_1))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textPane)
										.addComponent(textPane_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textPane_2, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))))
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6)
								.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
								.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3)
								.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(btnCancel))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button)))
					.addGap(69)
					.addComponent(btnAdd)
					.addGap(16))
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
