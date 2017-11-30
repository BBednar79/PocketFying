package desktopgui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PacketLayer extends JFrame {
	public static void main(String[]args){
		PacketLayer yes = new PacketLayer();
		yes.start();
		yes.menu();
		
	}
	

	private Canvas canvas;
	private Login loginScreen;
	
	private Keyboard keyboard;
	private Mouse mouse;
	
	private Color appBackground = Color.WHITE;
	private Color appBorder = Color.LIGHT_GRAY;
	private float appBorderScale = 0.8f;
	private Font appFont = new Font("Courier New", Font.PLAIN, 14);
	private Color appFontColor = Color.BLACK;
	private String appTitle = "Packet Layer";
	private int appWidth = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth() * .6);
	private int appHeight = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight() * .8);
	private int appX = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*.2);
	private int appY = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight() * .1);
	
	public PacketLayer(){

	}
	
	public void start(){
		this.setBackground(Color.WHITE);
		setSize(appWidth,appHeight);
		setLocation(appX, appY);
		this.setLayout(null);
		this.setTitle(this.appTitle);
	}
	
	public void login(){
		Login loginScreen = new Login();
		loginScreen.setBounds(0, 0, this.getWidth(), this.getHeight());
		loginScreen.setButtonBounds((int)(this.getWidth()*.3), (int)(this.getHeight()*.55), (int)(this.getWidth()*.4), (int)(this.getHeight()*.1));
		loginScreen.setUsernameBounds((int)(this.getWidth()*.2), (int)(this.getHeight()*.35), (int)(this.getWidth()*.6), (int)(this.getHeight()*.05));
		loginScreen.setPasswordBounds((int)(this.getWidth()*.2), (int)(this.getHeight()*.45), (int)(this.getWidth()*.6), (int)(this.getHeight()*.05));
		loginScreen.setButtonFont(26);
		loginScreen.setUsernameFont(26);
		loginScreen.setPasswordFont(26);
		this.getContentPane().add(loginScreen);
		loginScreen.authenticate(this, loginScreen);
		this.setVisible(true);
		loginScreen.setVisible(true);
		
	}
	
	public void menu(){
		ArrayList<String> mock = new ArrayList<String>();
		mock.add("Jodi Lin");
		mock.add("Jodes Toads");
		mock.add("Leeroy Jenkins");
		mock.add("Leeroy Jodins");
		Menu menu = new Menu(mock);
		menu.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.getContentPane().add(menu);
		menu.setVisible(true);
		this.setVisible(true);
	}

	public void updateApp(){
		loginScreen.setBounds(0, 0, this.getWidth(), this.getHeight());
		loginScreen.setButtonBounds((int)(this.getWidth()*.3), (int)(this.getHeight()*.55), (int)(this.getWidth()*.4), (int)(this.getHeight()*.1));
		loginScreen.setUsernameBounds((int)(this.getWidth()*.2), (int)(this.getHeight()*.35), (int)(this.getWidth()*.6), (int)(this.getHeight()*.05));
		loginScreen.setPasswordBounds((int)(this.getWidth()*.2), (int)(this.getHeight()*.45), (int)(this.getWidth()*.6), (int)(this.getHeight()*.05));
	}
	
	public Login getLoginScreen(){
		return loginScreen;
	}
	/**public MenuScreen getMenuScreen(){
		
	}*/
	
	public void paint(Graphics g){
		super.paint(g);
	}
}
