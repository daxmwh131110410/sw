package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Classname;
import model.Classtime;
import control.ClassnameControl;
import control.ClasstimeControl;

public class Classtable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classtable frame = new Classtable();
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
	public Classtable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("\u4FEE\u6539\u65F6\u95F4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Table.this.setVisible(false);
				ChangeTime changeTime = new ChangeTime();
				changeTime.setVisible(true);
			}
		});
		button.setBounds(24, 10, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u4FEE\u6539\u8BFE\u7A0B");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Table.this.setVisible(false);
				ChangeClass changeClass = new ChangeClass();
				changeClass.setVisible(true);				
			}
		});
		button_1.setBounds(148, 10, 93, 23);
		contentPane.add(button_1);
		
		
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
		
		int timeb1h = timeb1/100;
		int timee1h = timee1/100;
		int timeb2h = timeb2/100;
		int timee2h = timee2/100;
		int timeb3h = timeb3/100;
		int timee3h = timee3/100;
		int timeb4h = timeb4/100;
		int timee4h = timee4/100;
		
		int timeb1m = timeb1 - timeb1h*100;
		int timee1m = timee1 - timee1h*100;
		int timeb2m = timeb2 - timeb2h*100;
		int timee2m = timee2 - timee2h*100;
		int timeb3m = timeb3 - timeb3h*100;
		int timee3m = timee3 - timee3h*100;
		int timeb4m = timeb4 - timeb4h*100;
		int timee4m = timee4 - timee4h*100;
		
		String Time11 = timeb1h + "点" + timeb1m + "分";
		String Time12 = timee1h + "点" + timee1m + "分";
		String Time21 = timeb2h + "点" + timeb2m + "分";
		String Time22 = timee2h + "点" + timee2m + "分";
		String Time31 = timeb3h + "点" + timeb3m + "分";
		String Time32 = timee3h + "点" + timee3m + "分";
		String Time41 = timeb4h + "点" + timeb4m + "分";
		String Time42 = timee4h + "点" + timee4m + "分";
		
		Classname classname11 = new Classname();
		Classname classname12 = new Classname();
		Classname classname13 = new Classname();
		Classname classname14 = new Classname();
		
		Classname classname21 = new Classname();
		Classname classname22 = new Classname();
		Classname classname23 = new Classname();
		Classname classname24 = new Classname();
		
		Classname classname31 = new Classname();
		Classname classname32 = new Classname();
		Classname classname33 = new Classname();
		Classname classname34 = new Classname();
		
		Classname classname41 = new Classname();
		Classname classname42 = new Classname();
		Classname classname43 = new Classname();
		Classname classname44 = new Classname();
		
		Classname classname51 = new Classname();
		Classname classname52 = new Classname();
		Classname classname53 = new Classname();
		Classname classname54 = new Classname();
		
		classname11 = ClassnameControl.getControl().findByOrder(11);
		classname12 = ClassnameControl.getControl().findByOrder(12);
		classname13 = ClassnameControl.getControl().findByOrder(13);
		classname14 = ClassnameControl.getControl().findByOrder(14);
		classname21 = ClassnameControl.getControl().findByOrder(21);
		classname22 = ClassnameControl.getControl().findByOrder(22);
		classname23 = ClassnameControl.getControl().findByOrder(23);
		classname24 = ClassnameControl.getControl().findByOrder(24);
		classname31 = ClassnameControl.getControl().findByOrder(31);
		classname32 = ClassnameControl.getControl().findByOrder(32);
		classname33 = ClassnameControl.getControl().findByOrder(33);
		classname34 = ClassnameControl.getControl().findByOrder(34);
		classname41 = ClassnameControl.getControl().findByOrder(41);
		classname42 = ClassnameControl.getControl().findByOrder(42);
		classname43 = ClassnameControl.getControl().findByOrder(43);
		classname44 = ClassnameControl.getControl().findByOrder(44);
		classname51 = ClassnameControl.getControl().findByOrder(51);
		classname52 = ClassnameControl.getControl().findByOrder(52);
		classname53 = ClassnameControl.getControl().findByOrder(53);
		classname54 = ClassnameControl.getControl().findByOrder(54);
		
		String name11 = classname11.getClassName();
		String name12 = classname12.getClassName();
		String name13 = classname13.getClassName();
		String name14 = classname14.getClassName();
		String name21 = classname21.getClassName();
		String name22 = classname22.getClassName();
		String name23 = classname23.getClassName();
		String name24 = classname24.getClassName();
		String name31 = classname31.getClassName();
		String name32 = classname32.getClassName();
		String name33 = classname33.getClassName();
		String name34 = classname34.getClassName();
		String name41 = classname41.getClassName();
		String name42 = classname42.getClassName();
		String name43 = classname43.getClassName();
		String name44 = classname44.getClassName();
		String name51 = classname51.getClassName();
		String name52 = classname52.getClassName();
		String name53 = classname53.getClassName();
		String name54 = classname54.getClassName();
		
		String room11 = classname11.getClassRoom();
		String room12 = classname12.getClassRoom();
		String room13 = classname13.getClassRoom();
		String room14 = classname14.getClassRoom();
		String room21 = classname21.getClassRoom();
		String room22 = classname22.getClassRoom();
		String room23 = classname23.getClassRoom();
		String room24 = classname24.getClassRoom();
		String room31 = classname31.getClassRoom();
		String room32 = classname32.getClassRoom();
		String room33 = classname33.getClassRoom();
		String room34 = classname34.getClassRoom();
		String room41 = classname41.getClassRoom();
		String room42 = classname42.getClassRoom();
		String room43 = classname43.getClassRoom();
		String room44 = classname44.getClassRoom();
		String room51 = classname51.getClassRoom();
		String room52 = classname52.getClassRoom();
		String room53 = classname53.getClassRoom();
		String room54 = classname54.getClassRoom();
		
		String nr11 = name11 + room11; 
		String nr12 = name12 + room12;
		String nr13 = name13 + room13;
		String nr14 = name14 + room14;
		String nr21 = name21 + room21;
		String nr22 = name22 + room22;
		String nr23 = name23 + room23;
		String nr24 = name24 + room24;
		String nr31 = name31 + room31;
		String nr32 = name32 + room32;
		String nr33 = name33 + room33;
		String nr34 = name34 + room34;
		String nr41 = name41 + room41;
		String nr42 = name42 + room42;
		String nr43 = name43 + room43;
		String nr44 = name44 + room44;
		String nr51 = name51 + room51;
		String nr52 = name52 + room52;
		String nr53 = name53 + room53;
		String nr54 = name54 + room54;
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "\u4E0A\u8BFE\u65F6\u95F4", "\u4E0B\u8BFE\u65F6\u95F4", "\u661F\u671F\u4E00", "\u661F\u671F\u4E8C", "\u661F\u671F\u4E09", "\u661F\u671F\u56DB", "\u661F\u671F\u4E94"},
				{"\u7B2C\u4E00\u8282", Time11, Time12, nr11, nr21, nr31, nr41, nr51},
				{"\u7B2C\u4E8C\u8282", Time21, Time22, nr12, nr22, nr32, nr42, nr52},
				{"\u7B2C\u4E09\u8282", Time31, Time32, nr13, nr23, nr33, nr43, nr53},
				{"\u7B2C\u56DB\u8282", Time41, Time42, nr14, nr24, nr34, nr44, nr54},
			},
			new String[] {
				"New column", "\u4E0A\u8BFE\u65F6\u95F4", "\u4E0B\u8BFE\u65F6\u95F4", "\u7B2C\u4E00\u8282", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(5).setMinWidth(21);
		table.getColumnModel().getColumn(6).setMinWidth(38);
		table.setBounds(10, 74, 654, 85);
		contentPane.add(table);
	}
}
