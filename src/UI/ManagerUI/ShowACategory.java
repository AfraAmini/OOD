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
import java.awt.Font;

public class ShowACategory implements Visibility {

	private JPanel panel;
	private JButton btnAdd;
	private JButton btnCancel;

	/**
	 * Create the application.
	 */
	public ShowACategory() {
		createComponents();
		createEvents();
	}

	private void createEvents() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddEvaluatorPanel addEvaluatorPanel = new AddEvaluatorPanel();
				addEvaluatorPanel.setVisible(true);
			}
		});

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

	private void createComponents() {
		panel = new JPanel();
		
		btnAdd = new JButton("افزودن ارزیاب به این دسته");
		btnAdd.setForeground(new Color(0, 128, 0));
		
		btnCancel = new JButton("لغو عملیات");
		btnCancel.setForeground(new Color(255, 20, 147));
		
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
		
		JLabel nameLabel = new JLabel("نام دسته");
		nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JTextField typeTextField = new JTextField();
		typeTextField.setHorizontalAlignment(SwingConstants.CENTER);
		typeTextField.setEditable(false);
		typeTextField.setEnabled(false);
		typeTextField.setText("کیفی");
		typeTextField.setColumns(10);
		
		JLabel evaluationInCategoryText = new JLabel("معیار‌های تعریف شده در دسته");
		evaluationInCategoryText.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setText("نظم کاری\nاهمیت دادن به مسائل کاری\n");
		
		JLabel evaluatorsInCategory = new JLabel("ارزیابان منتسب به دسته");
		evaluatorsInCategory.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("افرا امینی\nیگانه علی‌محمدی");
		textArea_1.setEnabled(false);
		textArea_1.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(panel);
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
									.addComponent(evaluatorsInCategory, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(evaluationInCategoryText, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
										.addComponent(nameLabel))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(typeTextField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
										.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))))
					.addGap(143))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(22, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameLabel)
						.addComponent(typeTextField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(evaluationInCategoryText)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(evaluatorsInCategory, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(btnCancel))
					.addGap(91))
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
