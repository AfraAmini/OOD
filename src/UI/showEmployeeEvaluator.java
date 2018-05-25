package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import java.awt.Color;

public class showEmployeeEvaluator {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showEmployeeEvaluator window = new showEmployeeEvaluator();
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
	public showEmployeeEvaluator() {
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
		frame.setTitle("مشاهده کارمندان مورد ارزیابی");
		frame.setBounds(100, 100, 515, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem menuItem = new JMenuItem("خروج از سامانه");
		menuBar.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("مشاهده کارمندان مورد ارزیابی");
		menuBar.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("ارزیابی کارمندان");
		menuBar.add(menuItem_2);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton button = new JButton("انتخاب کارمند");
		button.setForeground(new Color(0, 102, 0));
		
		JButton button_1 = new JButton("لغو عملیات");
		button_1.setForeground(UIManager.getColor("Button.select"));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					.addGap(108))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(102, Short.MAX_VALUE))
		);
		
		String[] columnNames = {"نام معیار",
                " نام کارمند", "نام خانوادگی کارمند"};

		Object[][] data = {
		{"نظم کاری", "افرا",
		"امینی", new Integer(5), new Boolean(false)},
		{"تجربه", "پری‌شاد ",
		"بهنام قادر", new Integer(3), new Boolean(true)},
		
		};
		
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);
		frame.getContentPane().setLayout(groupLayout);
		
	}

}
