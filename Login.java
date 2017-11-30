package desktopgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JPanel{
	JButton loginButton;
	JTextField username;
	JPasswordField password;
	TextPrompt ut;
	TextPrompt pt;
	private boolean correct;
	

	public Login(){
		correct = false;
		this.setLayout(null);
		loginButton = new JButton("Login");
		username = new JTextField(15);
		password = new JPasswordField(15);
		ut = new TextPrompt("Username", username);
		ut.changeAlpha(0.5f);
		pt = new TextPrompt("Password", password);
		pt.changeAlpha(0.5f);
		this.add(loginButton);
		this.add(username);
		this.add(password);
	}
	
	public void setButtonBounds(int x, int y, int width, int height){
		loginButton.setBounds(x, y, width, height);
	}
	public void setUsernameBounds(int x, int y, int width, int height){
		username.setBounds(x, y, width, height);
	}
	public void setPasswordBounds(int x, int y, int width, int height){
		password.setBounds(x, y, width, height);
	}
	public void setButtonFont(int size){
		loginButton.setFont(new Font("Button", Font.PLAIN, size));
	}
	public void setUsernameFont(int size){
		username.setFont(new Font("Username", Font.PLAIN, size));
		ut.setFont(new Font("Username", Font.PLAIN, size));
	}
	public void setPasswordFont(int size){
		password.setFont(new Font("Password", Font.PLAIN, size));
		pt.setFont(new Font("Password", Font.PLAIN, size));
	}
	
	public boolean correct(){
		return correct;
	}
	
	public void authenticate(JFrame a, JPanel b){
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String puname = username.getText();
				String ppaswd = password.getText();
				if(puname.equals("test") && ppaswd.equals("12345")) {
					correct = true;
					b.setVisible(false);
				} else {

					JOptionPane.showMessageDialog(null,"Wrong Password / Username");
					username.setText("");
					password.setText("");
					username.requestFocus();
				}
			}
		});
	}
}
