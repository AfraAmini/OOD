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
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class evaluate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					evaluate window = new evaluate();
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
	public evaluate() {
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
		frame.setTitle("درخواست ارزیابی مجدد");
		frame.setBounds(100, 100, 501, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem menuItem = new JMenuItem("خروج از سامانه");
		menuBar.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("مشاهده ارزیابی‌های انجام شده");
		menuBar.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("درخواست ارزیابی مجدد");
		menuBar.add(menuItem_2);
		
		JButton button = new JButton("درخواست ارزیابی مجدد");
		button.setForeground(new Color(0, 102, 0));
		
		JButton button_1 = new JButton("لغو عملیات");
		button_1.setForeground(UIManager.getColor("Button.select"));
		
		JLabel label = new JLabel("نام معیار");
		
		JLabel label_1 = new JLabel("تجربه");
		
		JLabel label_2 = new JLabel("روش کمی ارزیابی");
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setText("تعداد سال سابقه کار\n");
		
		JLabel label_3 = new JLabel("نتیجه کمی ارزیابی");
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("ده سال\n");
		textArea_1.setEditable(false);
		textArea_1.setEnabled(false);
		
		JLabel label_4 = new JLabel("علت اعتراض");
		
		JTextArea textArea_2 = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label_2)
							.addGap(18)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(64)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(button)
									.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textArea_2, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))))
					.addGap(2147483377))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(label_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(47)
							.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(label_3)))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
							.addComponent(label_4)
							.addGap(58))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(43)
							.addComponent(textArea_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap())
		);
		
		String[] columnNames = {"نام معیار",
                " نام کارمند", "نام خانوادگی کارمند"};

		Object[][] data = {
		{"نظم کاری", "افرا",
		"امینی", new Integer(5), new Boolean(false)},
		{"تجربه", "پری‌شاد ",
		"بهنام قادر", new Integer(3), new Boolean(true)},
		
		};
		frame.getContentPane().setLayout(groupLayout);
		
	}

}
