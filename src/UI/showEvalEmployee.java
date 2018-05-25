package UI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class showEvalEmployee {

	private JFrame frame;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showEvalEmployee window = new showEvalEmployee();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public showEvalEmployee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		createComponent();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub
		
	}

	private void createComponent() {
		frame = new JFrame();
		frame.setTitle("مشاهده ارزیابی‌های انجام شده");
		frame.setBounds(100, 100, 702, 248);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem menuItem = new JMenuItem("خروج از سامانه");
		menuBar.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("مشاهده ارزیابی‌های انجام شده");
		menuBar.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("درخواست ارزیابی مجدد");
		menuBar.add(menuItem_2);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton button = new JButton("اعتراض به ارزیابی انتخابی");
		button.setForeground(new Color(0, 102, 0));
		
		JButton button_1 = new JButton("لغو عملیات");
		button_1.setForeground(UIManager.getColor("Button.select"));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(108))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
					.addGap(14))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1)
						.addComponent(button))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		
		String[] columnNames = {"ماهیت معیار",
                "دسته ارزیابی", "نتیجه ارزیابی"};

		Object[][] data = {
		{"تجربه", "کمی-کیفی",
		"نتیجه کیفی: عالی ، نتیجه کمی: ۲۵ سال", new Integer(5), new Boolean(false)},
		{"مهارت کار گروهی", "کیفی",
		"متوسط", new Integer(3), new Boolean(true)},
		{"ساعت کاری مناسب", "کمی کیفی",
		"نتیجه کمی: روزی ۶ ساعت، نتیجه کیفی: مطلوب", new Integer(2), new Boolean(false)},
		{"نظم کاری", "کیفی",
		"مطلوب", new Integer(20), new Boolean(true)},
		{"اهمیت دادن به مسائل کاری", "کیفی",
		"عالی", new Integer(10), new Boolean(false)}
		};
		
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
