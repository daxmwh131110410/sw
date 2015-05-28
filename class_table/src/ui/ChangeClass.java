package ui;
import java.awt.EventQueue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import control.ClassnameControl;
import model.Classname;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@Entity
public class ChangeClass extends JFrame {

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private static final long serialVersionUID = 6986036767596176541L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeClass frame = new ChangeClass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChangeClass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("\u786E\u8BA4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String classorder = textField.getText();
				int classOrder = Integer.parseInt(classorder);
				String className = textField_1.getText();
				String classRoom = textField_2.getText();
				
				Classname classname = new Classname(classOrder,className,classRoom);
				
				boolean flag1=ClassnameControl.getControl().update(classname);
				
				if(!flag1){
					JOptionPane.showMessageDialog(null,"导入失败，请重新输入!");
				    return;
				}
			    else{
			    	JOptionPane.showMessageDialog(null,"课程记录成功！");
			    }
				ChangeClass.this.setVisible(false);
				Table table = new Table();
				table.setVisible(true);
			 }
		});
		button.setBounds(249, 184, 81, 23);
		contentPane.setLayout(null);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(155, 21, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u65E5\u671F\u53CA\u8282\u6570");
		label.setBounds(21, 24, 149, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5982\uFF1A\u661F\u671F\u4E00\u7B2C\u4E09\u8282  13");
		label_1.setBounds(266, 21, 141, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8BF7\u8F93\u5165\u8BFE\u7A0B\u540D");
		label_2.setBounds(45, 71, 102, 15);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(155, 68, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 125, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u8BF7\u8F93\u5165\u6559\u5BA4");
		label_3.setBounds(59, 128, 100, 15);
		contentPane.add(label_3);
	}
}
