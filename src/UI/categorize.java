package UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class categorize {

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
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					categorize window = new categorize();
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
	public categorize() {
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
		categorizeFrame.setTitle("تعریف دسته");
		categorizeFrame.setBounds(100, 100, 544, 278);
		categorizeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAdd = new JButton("انتخاب معیار");
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
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(categorizeFrame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 481, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(100)
							.addComponent(btnAdd)
							.addGap(107)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(33, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancel)
						.addComponent(btnAdd))
					.addGap(214))
		);
		
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);
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


