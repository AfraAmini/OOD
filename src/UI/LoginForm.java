package UI;

import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class LoginForm implements Visibility{

	private JPanel panel;
	private JTextField IDTextField;
	private JTextField PassTextField;
	private	JButton loginBtn;
	/**
	 * Create the application.
	 */
	public LoginForm() {
		createComponents();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub
	}

	private void createComponents() {
		panel = new JPanel();
		MainFrame.getInstance().getFrame().getJMenuBar().setVisible(false);
		JLabel IDLabel = new JLabel("شماره پرسنلی");
		IDLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel passLabel = new JLabel("رمز عبور");
		passLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		IDTextField = new JTextField();
		IDTextField.setColumns(10);
		
		PassTextField = new JTextField();
		PassTextField.setColumns(10);

		loginBtn = new JButton("وارد شو");
		loginBtn.setForeground(new Color(0, 102, 0));
		GroupLayout groupLayout = new GroupLayout(panel);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(29)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(passLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(PassTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(IDLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(IDTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(122)
							.addComponent(loginBtn)))
					.addContainerGap(54, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(IDLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(IDTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(passLabel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(PassTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
					.addComponent(loginBtn)
					.addGap(36))
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
