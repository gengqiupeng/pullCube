package ui;

import java.awt.Container;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import main.App;

public class Success extends JFrame{
	int i =1;
	public Success(){}
	public Success(App frame) {
		super();
		// TODO Auto-generated constructor stub
		Icon icon = new ImageIcon("dialog.png");
		JLabel lab_dialog = new JLabel(icon);
		Container con = getContentPane();
		con.add(lab_dialog);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(400,300,180,150);
		
	}

/*	void cheng(int[][] datas) {
		// TODO Auto-generated method stub
		if(datas[4][14]==4&&datas[5][14]==4&&datas[6][14]==4){
			//System.out.println("成功了");
			//new Success(new App(2)).setVisible(true);
		//	int selection = JOptionPane.showConfirmDialog(null, "Message","Title",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
			
			Object[] possibleValues = { "First", "Second", "Third" };
			Object selectedValue = JOptionPane.showInputDialog(null, 
			"请选择关卡", "关卡选择",
			JOptionPane.INFORMATION_MESSAGE, null,
			possibleValues, possibleValues[0]);
			if(selectedValue.equals("First")){
				
			}

			
			
			JPanel panel = new JPanel();
			JButton ok = new JButton("OK");
			ok.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent event) {
					// TODO Auto-generated method stub
					//setVisible(false);
					System.out.println("点击了按钮");
				}
				
			});
			panel.add(ok);
			add(panel);
			setSize(250,150);
		}
		}
	}
	*/
	
	
	void cheng(int[][] datas ,MainFrame m) {
		// TODO Auto-generated method stub
		if(datas[4][14]==4&&datas[5][14]==4&&datas[6][14]==4){
		i++;
			System.out.println(i);
			switch(i){
			case 2:
				m.setVisible(false);
				m.targetInit();
				m.wolfInit(2,3);
				m.sheepInit(712,236,712,286,412,336);
				m.treeInit();
				m.backgroundInit();
				m.setMainFrameUI();
				//guan1();
				break;
			case 3:
				m.setVisible(false);		
				m.targetInit();
				m.wolfInit(2,3);
				m.sheepInit(712,236,712,286,412,336);
				m.treeInit();
				m.backgroundInit();
				m.setMainFrameUI();
				break;
			case 4:
				m.setVisible(false);
				m.targetInit();
				m.wolfInit(2,3);
				m.sheepInit(712,236,712,286,412,336);
				m.treeInit();
				m.backgroundInit();
				m.setMainFrameUI();
				break;
			}
			}
		}
	
	
	/*public static void guan1(){
		MainFrame m =new MainFrame(datas);
		m.targetInit();
		m.wolfInit(1,1);
		m.sheepInit(312,236,312,336,412,336);
		m.treeInit();
		m.backgroundInit();
		m.setMainFrameUI();
	}
	
	public static void guan2(){
		MainFrame m =new MainFrame(datas);
		m.targetInit();
		m.wolfInit(2,3);
		m.sheepInit(712,236,712,286,412,336);
		m.treeInit();
		m.backgroundInit();
		m.setMainFrameUI();
	}
	
	public static void guan3(){
		MainFrame m =new MainFrame(datas);
		m.targetInit();
		m.wolfInit(10,1);
		m.sheepInit(312,236,312,336,412,336);
		m.treeInit();
		m.backgroundInit();
		m.setMainFrameUI();
	}
	*/
	static int[][] datas = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,1,1,1,1,1,1,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	static int[][] datas1 = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,1,1,1,1,1,1,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	static int[][] datas2 = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,1,1,1,1,1,1,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};

	
	
	
}
