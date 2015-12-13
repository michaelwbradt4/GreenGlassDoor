import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JTextField;
import java.awt.Color;

public class DoorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {}
	
	public static void DoorFrame(){
	
	
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoorFrame frame = new DoorFrame();
					frame.setVisible(true);
					frame.setBackground(Color.BLUE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DoorFrame() {
		setBackground(new Color(0, 255, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 600, 800);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GREEN);
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome To The Green Glass Door!");
		lblWelcomeToThe.setBounds(5, 5, 568, 29);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblWelcomeToThe);
		
		JLabel lblTypeToSee = new JLabel("Type to see what can enter!");
		lblTypeToSee.setForeground(Color.BLACK);
		lblTypeToSee.setBackground(Color.BLACK);
		lblTypeToSee.setBounds(5, 34, 195, 689);
		contentPane.add(lblTypeToSee);
		
		textField = new JTextField();
		textField.setBounds(215, 415, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				String input = textField.getText();
				FrameLogic.FrameLogic(input);
			}//end action event
		});//end action listener
	}//end method
}//end class
