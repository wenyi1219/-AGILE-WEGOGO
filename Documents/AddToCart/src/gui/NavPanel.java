/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NavPanel extends JPanel {
	private JPanel NavPanel;
	private JButton btnStore;
	private JButton btnInventory;
	private JButton btnFinance;
	private JButton btnCheckout;
	private JButton btnLogout;
        private JButton btnHistory;
	private JLabel welcome;

	/**
	 * Create the panel.
	 * @param accountTypeString 
	 */
	public NavPanel(String accountTypeString) {
		NavPanel = new JPanel();

		welcome = new JLabel("");
		NavPanel.add(welcome);
		if(accountTypeString.equals("Admin")){
			createAdminButtons();
		}else{
			createUserButtons();
		}
		
		btnLogout = new JButton("Logout");
		NavPanel.add(btnLogout);
	}

	public void addStoreListener(ActionListener listener) {
		btnStore.addActionListener(listener);
                System.out.println("Hi");
	}
	
	public void addAdminListener(ActionListener listener) {
		btnInventory.addActionListener(listener);
	}
	
	public void addFinanceListener(ActionListener listener) {
		btnFinance.addActionListener(listener);
	}

	public void addCartListener(ActionListener listener) {
		btnCheckout.addActionListener(listener);
	}
        
        public void addHistoryListener(ActionListener listener) {
		btnHistory.addActionListener(listener);
                System.out.println("Hi");
	}

	public void addLogoutListener(ActionListener listener) {
		btnLogout.addActionListener(listener);
	}

	public JPanel getPanel() {
		return NavPanel;
	}

	public void addWelcomeMessage(String string) {
		welcome.setText(string);
		NavPanel.add(welcome);
	}

	public void removeWelcomeMessage(String string) {
		NavPanel.remove(welcome);
	}
	
	public void createAdminButtons(){
		btnInventory = new JButton("Inventory");
		NavPanel.add(btnInventory);
		
		btnFinance = new JButton("Finance");
		NavPanel.add(btnFinance);

		btnStore = new JButton("Store");
		NavPanel.add(btnStore);
		
                btnHistory = new JButton("History");
		NavPanel.add(btnHistory);
		
		btnCheckout = new JButton("Shopping Cart");
		NavPanel.add(btnCheckout);
	}
	
	public void createUserButtons(){
		btnStore = new JButton("Store");
		NavPanel.add(btnStore);

		btnCheckout = new JButton("Shopping Cart");
		NavPanel.add(btnCheckout);
                
                btnHistory = new JButton("History");
		NavPanel.add(btnHistory);
	}
}