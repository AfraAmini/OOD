package UI.EmployeeUI;

import UI.MainFrame;
import UI.Visibility;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class QuantitativeEvaluation implements Visibility {
	private JPanel panel = new JPanel();
	private JButton addBtn;
	private JButton cancelBtn;

	public QuantitativeEvaluation() {
		createComponent();
		createEvents();
	}

	private void createEvents() {
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				MainFrame.getInstance().getFrame().setTitle("پنل کاربری");
			}
		});
		
	}

	private void createComponent() {
		panel = new JPanel();

		addBtn = new JButton("ثبت ارزیابی");
		addBtn.setForeground(new Color(0, 102, 0));
		
		cancelBtn = new JButton("لغو عملیات");
		cancelBtn.setForeground(UIManager.getColor("Button.select"));
		
		JLabel nameLabel = new JLabel("نام معیار");
		
		JLabel experienceLabel = new JLabel("تجربه");
		
		JLabel quantWayLabel = new JLabel("روش کمی ارزیابی");
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setText("تعداد سال سابقه کار\n");
		
		JLabel quantLabel = new JLabel("ارزیابی کمی");
		
		JTextArea textArea_1 = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(panel);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(quantWayLabel)
							.addGap(18)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(nameLabel)
							.addGap(64)
							.addComponent(experienceLabel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addComponent(addBtn)
									.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
									.addComponent(cancelBtn, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(quantLabel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))))
					.addGap(2147483259)
					.addGap(118))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameLabel)
						.addComponent(experienceLabel, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(26)
							.addComponent(quantWayLabel)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(47)
									.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(65)
									.addComponent(quantLabel))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(cancelBtn)
						.addComponent(addBtn))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		
		String[] columnNames = {"نام معیار",
                " نام کارمند", "نام خانوادگی کارمند"};

		Object[][] data = {
		{"نظم کاری", "افرا",
		"امینی", new Integer(5), new Boolean(false)},
		{"تجربه", "پری‌شاد ",
		"بهنام قادر", new Integer(3), new Boolean(true)},
		
		};
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
