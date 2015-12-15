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
import javax.swing.ImageIcon;

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
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome To The Green Glass Door!");
		lblWelcomeToThe.setBounds(15, 16, 548, 29);
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblWelcomeToThe.setForeground(Color.GREEN);
		contentPane.add(lblWelcomeToThe);
		
		JLabel lblTypeToSee = new JLabel("Type to see what can enter!");
		lblTypeToSee.setForeground(Color.GREEN);
		lblTypeToSee.setBackground(Color.BLACK);
		lblTypeToSee.setBounds(190, 355, 195, 46);
		contentPane.add(lblTypeToSee);
		
		textField = new JTextField();
		textField.setBounds(215, 415, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Michael\\Desktop\\temp\\doorpic.jpg"));
		lblNewLabel.setBounds(0, 0, 578, 728);
		contentPane.add(lblNewLabel);
		
		textField.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				String input = textField.getText();
				
				FrameLogic.FrameLogic(input);
			}//end action event
		});//end action listener
	}//end method
}//end class
