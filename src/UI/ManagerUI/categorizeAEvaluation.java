package UI.ManagerUI;

import UI.MainFrame;
import UI.Visibility;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class categorizeAEvaluation implements Visibility {

	private JPanel panel;
	private JButton addBtn;
	private JButton cancelBtn;
	/**
	 * Create the application.
	 */
	public categorizeAEvaluation() {
		createComponents();
		createEvents();
	}


	private void createEvents() {
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	private void createComponents() {
		panel = new JPanel();

		addBtn = new JButton("ثبت معیار");
		addBtn.setForeground(new Color(0, 128, 0));

		cancelBtn = new JButton("لغو عملیات");
		cancelBtn.setForeground(new Color(255, 20, 147));

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
		ButtonGroup buttonGroup = new ButtonGroup();
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
		GroupLayout groupLayout = new GroupLayout(panel);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(82)
												.addComponent(addBtn))
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
																.addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
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
														.addComponent(addBtn)
														.addComponent(cancelBtn))
												.addGap(32))
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(43)
												.addComponent(label_3)
												.addContainerGap())))
		);
		panel.setLayout(groupLayout);
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
