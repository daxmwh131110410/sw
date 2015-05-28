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
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Classtime;
import control.ClasstimeControl;


@Entity
public class Table extends JFrame {

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private static final long serialVersionUID = 2189368863871426671L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
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
	public Table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("修改课程时间");
		btnNewButton.setBounds(5, 5, 158, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Table.this.setVisible(false);
				ChangeTime changeTime = new ChangeTime();
				changeTime.setVisible(true);
			}
		});
		
		JButton button = new JButton("\u4FEE\u6539\u8BFE\u7A0B");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Table.this.setVisible(false);
				ChangeClass changeClass = new ChangeClass();
				changeClass.setVisible(true);
			}
		});
		button.setBounds(199, 5, 127, 23);
		

		Classtime classtime1 = new Classtime();
		Classtime classtime2 = new Classtime();
		Classtime classtime3 = new Classtime();
		Classtime classtime4 = new Classtime();
		classtime1 = ClasstimeControl.getControl().findByOrder(1);
		classtime2 = ClasstimeControl.getControl().findByOrder(2);
		classtime3 = ClasstimeControl.getControl().findByOrder(3);
		classtime4 = ClasstimeControl.getControl().findByOrder(4);
		
		int timeb1 = classtime1.getClassBegin();
		int timee1 = classtime1.getClassEnd();
		int timeb2 = classtime2.getClassBegin();
		int timee2 = classtime2.getClassEnd();
		int timeb3 = classtime3.getClassBegin();
		int timee3 = classtime3.getClassEnd();
		int timeb4 = classtime4.getClassBegin();
		int timee4 = classtime4.getClassEnd();
		
		int timeb1h = timeb1%100;
		int timee1h = timee1%100;
		int timeb2h = timeb2%100;
		int timee2h = timee2%100;
		int timeb3h = timeb3%100;
		int timee3h = timee3%100;
		int timeb4h = timeb4%100;
		int timee4h = timee4%100;
		
		int timeb1m = timeb1 - timeb1h;
		int timee1m = timee1 - timee1h;
		int timeb2m = timeb2 - timeb2h;
		int timee2m = timee2 - timee2h;
		int timeb3m = timeb3 - timeb3h;
		int timee3m = timee3 - timee3h;
		int timeb4m = timeb4 - timeb4h;
		int timee4m = timee4 - timee4h;
		
		String Time11 = timeb1h + "点" + timeb1m + "分";
		String Time12 = timee1h + "点" + timee1m + "分";
		String Time21 = timeb2h + "点" + timeb2m + "分";
		String Time22 = timee2h + "点" + timee2m + "分";
		String Time31 = timeb3h + "点" + timeb3m + "分";
		String Time32 = timee3h + "点" + timee3m + "分";
		String Time41 = timeb4h + "点" + timeb4m + "分";
		String Time42 = timee4h + "点" + timee4m + "分";
		
		
		
		table = new JTable();
		table.setBounds(28, 91, 375, 80);
		//String head[] = {"时间", "星期一", "星期二", "星期三", "星期四", "星期五"};
		//String cla[][] = null;
		//int order=11;
		//ClassnameDAO classnameDAO = null;
		//Classname classname = =ClassnameControl.getControl().;
		
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"上课时间", "下课时间", "\u661F\u671F\u4E00", "\u661F\u671F\u4E8C", "\u661F\u671F\u4E09", "\u661F\u671F\u56DB", "\u661F\u671F\u4E94"},
				{Time11, Time12, null, null, null, null, null},
				{Time21, Time22, null, null, null, null, null},
				{Time31, Time32, null, null, null, null, null},
				{Time41, Time42, null, null, null, null, null},
			},
			new String[] {
				"\u4E0A\u8BFE\u65F6\u95F4", "\u4E0B\u8BFE\u65F6\u95F4", "\u661F\u671F\u4E00", "\u661F\u671F\u4E8C", "\u661F\u671F\u4E09", "\u661F\u671F\u56DB", "\u661F\u671F\u4E94"
			}
		));
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(button);
		contentPane.add(table);
		
		JLabel label = new JLabel("\u8BFE\u7A0B\u8868");
		label.setBounds(186, 38, 75, 30);
		contentPane.add(label);
	}
}
