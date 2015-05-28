package ui;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Classtime;
import control.ClasstimeControl;


@Entity
public class ChangeTime extends JFrame {

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private static final long serialVersionUID = 5899030396520256733L;
	private JPanel contentPane;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeTime frame = new ChangeTime();
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
	public ChangeTime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button_1 = new JButton("\u786E\u8BA4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String begin = textField.getText();
				String begin1 = textField_1.getText();
				String begin2 = textField_2.getText();
				String begin3 = textField_3.getText();
				String begin4 = textField_4.getText();
				String begin5 = textField_5.getText();
				String begin6 = textField_6.getText();
				String begin7 = textField_7.getText();
				
				int beg = Integer.parseInt(begin);
				int beg1 = Integer.parseInt(begin1);
				int beg2 = Integer.parseInt(begin2);
				int beg3 = Integer.parseInt(begin3);
				int end = Integer.parseInt(begin4);
				int end1 = Integer.parseInt(begin5);
				int end2 = Integer.parseInt(begin6);
				int end3 = Integer.parseInt(begin7);

				if(beg>end||beg1>end1||beg2>end2||beg3>end3){
					JOptionPane.showMessageDialog(null,"下课时间应早于上课时间");
				}
				
				Classtime classtime1 = new Classtime(1,beg,end);
				Classtime classtime2 = new Classtime(2,beg1,end1);
				Classtime classtime3 = new Classtime(3,beg2,end2);
				Classtime classtime4 = new Classtime(4,beg3,end3);
				
				boolean flag1=ClasstimeControl.getControl().update(classtime1);
				boolean flag2=ClasstimeControl.getControl().update(classtime2);
				boolean flag3=ClasstimeControl.getControl().update(classtime3);
				boolean flag4=ClasstimeControl.getControl().update(classtime4);
				if(!flag1||!flag2||!flag3||!flag4){
				//if(!flag1){
					JOptionPane.showMessageDialog(null,"导入失败，请重新输入!");
					return;
					
				}
				else{
					
					JOptionPane.showMessageDialog(null,"时间记录成功！");
				}
				ChangeTime.this.setVisible(false);
				Table table = new Table();
				table.setVisible(true);
			}
		});
		button_1.setBounds(248, 217, 89, 23);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(77, 127, 1, 2);
		
		label = new JLabel("\u7B2C\u4E00\u8282");
		label.setBounds(15, 40, 63, 15);
		
		label_1 = new JLabel("\u7B2C\u4E8C\u8282");
		label_1.setBounds(15, 87, 63, 15);
		
		label_2 = new JLabel("\u7B2C\u4E09\u8282");
		label_2.setBounds(15, 138, 66, 15);
		
		label_3 = new JLabel("\u7B2C\u56DB\u8282");
		label_3.setBounds(15, 189, 63, 15);
		
		label_4 = new JLabel("\u4E0A\u8BFE\u65F6\u95F4");
		label_4.setBounds(118, 15, 58, 15);
		
		label_5 = new JLabel("\u4E0B\u8BFE\u65F6\u95F4");
		label_5.setBounds(248, 15, 79, 15);
		contentPane.setLayout(null);
		contentPane.add(button_1);
		contentPane.add(separator);
		contentPane.add(label_4);
		contentPane.add(label);
		contentPane.add(label_1);
		contentPane.add(label_2);
		contentPane.add(label_3);
		contentPane.add(label_5);
		
		textField = new JTextField();
		textField.setBounds(110, 40, 66, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 84, 66, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 135, 66, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(110, 186, 66, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(248, 40, 66, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(248, 84, 66, 21);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(248, 135, 66, 21);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(248, 186, 66, 21);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
	}
}
