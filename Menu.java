package desktopgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JPanel{

	private JTextField textField;
	private JList list;
	private ArrayList<String> fullList;
	private ArrayList<String> searchedList;
	
	public Menu(ArrayList<String> list){
		fullList = list;
		searchedList = list;
		initialize();
	}
	
	public void setListBounds(int x, int y, int width, int height){
		list.setBounds(x, y, width, height);
	}
	public void setListBounds(int x, int y, int width, int height){
		list.setBounds(x, y, width, height);
	}
	public void setListBounds(int x, int y, int width, int height){
		list.setBounds(x, y, width, height);
	}
	public void setListBounds(int x, int y, int width, int height){
		list.setBounds(x, y, width, height);
	}
	
	private void initialize() {


		
		
		textField = new JTextField();
		textField.setBounds(0, 0, 332, 20);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		/**lblSearch.setBounds(0, 0, 51, 14);*/
		this.add(lblSearch);
		
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
		/**list.setBounds(14, 61, 1091, 452);*/
		this.add(list);
		
		JButton searchButton = new JButton("Search\r\n");
		searchButton.addActionListener(new ActionListener() {
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
		/**btnNewCustomer.setBounds(435, 32, 88, 23);*/
		this.add(searchButton);
		
		JButton newCustomerButton = new JButton("New Customer\r\n");
		/**newCustomerButton.setBounds(976, 32, 129, 23);*/
		this.add(newCustomerButton);
	}
}
