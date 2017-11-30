package desktopgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PacketLay {

	private JFrame frame;
	private JTextField textField;
	private JList list;
	private ArrayList<String> fullList;
	private ArrayList<String> searchedList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacketLay window = new PacketLay();
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
	public PacketLay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1131, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		searchedList = new ArrayList<String>();
		fullList = new ArrayList<String>();
		fullList.add("Jodi Lin");
		fullList.add("Jodes Todes");
		fullList.add("Rhodes Todes");
		searchedList.addAll(fullList);
		
		
		textField = new JTextField();
		textField.setBounds(85, 33, 332, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(21, 36, 51, 14);
		frame.getContentPane().add(lblSearch);
		
		list = new JList();
		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		list.setModel(new AbstractListModel() {
			Object[] values = searchedList.toArray();
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(14, 61, 1091, 452);
		frame.getContentPane().add(list);
		
		JButton btnNewCustomer = new JButton("Search\r\n");
		btnNewCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField.getText();
				searchedList = new ArrayList<String>();
				for (String e : fullList){
					if (e.contains(text)){
						searchedList.add(e);
					}
				}
				list.setModel(new AbstractListModel() {
					Object[] values = searchedList.toArray();
					public int getSize() {
						return values.length;
					}
					public Object getElementAt(int index) {
						return values[index];
					}
				});
			}
		});
		btnNewCustomer.setBounds(435, 32, 88, 23);
		frame.getContentPane().add(btnNewCustomer);
		
		JButton btnNewButton = new JButton("New Customer\r\n");
		btnNewButton.setBounds(976, 32, 129, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
