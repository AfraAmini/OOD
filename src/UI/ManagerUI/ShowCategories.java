package UI.ManagerUI;

import UI.MainFrame;
import UI.Visibility;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ShowCategories implements Visibility {

	private JPanel panel;
	private JButton btnAdd;
	private JButton btnCancel;

	/**
	 * Create the application.
	 */
	public ShowCategories() {
		createComponents();
		createEvents();
	}

	private void createEvents() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ShowACategory showACategory = new ShowACategory();
				showACategory.setVisible(true);
			}
		});
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	private void createComponents() {
		panel = new JPanel();
		
		btnAdd = new JButton("انتخاب دسته معیار");
		btnAdd.setForeground(new Color(0, 128, 0));
		
		btnCancel = new JButton("لغو عملیات");
		btnCancel.setForeground(new Color(255, 20, 147));
		
		String[] columnNames = {"دسته ارزیابی",
                "تعداد معیار‌های اختصاص داده شده", "تعداد ارزیاب‌های اختصاص داده شده"};

		Object[][] data = {
		{"کمی", "2",
		"3", new Integer(5), new Boolean(false)},
		{"کیفی", "5",
		"10", new Integer(3), new Boolean(true)},
		{"کمی کیفی", "12",
		"14", new Integer(2), new Boolean(false)},
		};
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(panel);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(30)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 482, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(96)
							.addComponent(btnAdd)
							.addGap(103)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnCancel))
					.addGap(261))
		);
		
		JTable table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);
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
