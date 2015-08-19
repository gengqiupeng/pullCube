package main;

import ui.MainFrame;

public class App {

	public static void main(String[] args) {
		
		MainFrame m = new MainFrame();
		m.MainFrame1(datas);
		m.targetInit();
		m.wolfInit(1,1);
		m.sheepInit(312,236,312,336,412,336);
		m.treeInit();
		m.backgroundInit();
		m.setMainFrameUI();
	}
	
	MainFrame m =new MainFrame();
	public void re(int i,MainFrame ma){
		switch(i){
		case 2:
			ma.setVisible(false);
			m.MainFrame1(datas2);
			m.targetInit();
			m.wolfInit(10,1);
			m.sheepInit(312,236,312,336,612,386);
			m.treeInit();
			m.backgroundInit();
			m.setMainFrameUI();
			break;
		case 3:
			ma.setVisible(false);
			m.MainFrame1(datas1);
			m.targetInit();
			m.wolfInit(2,3);
			m.sheepInit(312,236,312,336,712,150);
			m.treeInit();
			m.backgroundInit();
			m.setMainFrameUI();
			break;
		case 4:
			ma.setVisible(false);
			m.MainFrame1(datas3);
			m.targetInit();
			m.wolfInit(1,1);
			m.sheepInit(312,236,312,336,412,336);
			m.treeInit();
			m.backgroundInit();
			m.setMainFrameUI();
			break;
/*		case 4:
			ma.setVisible(false);
			m.MainFrame1(datas2);
			m.targetInit();
			m.wolfInit(1,1);
			m.sheepInit(312,236,312,336,412,336);
			m.treeInit();
			m.backgroundInit();
			m.setMainFrameUI();
			break;*/
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
			{1,1,1,0,1,0,0,0,0,0,0,1,1,0,0,1},
			{1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,1,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,1,1,1,1,1,1,0,0,1},
			{1,1,0,1,0,0,0,0,1,0,0,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	static int[][] datas1 = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1},
			{1,0,1,0,0,0,0,1,0,0,1,1,0,0,0,1},
			{1,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,1,1,1,1,1,1,0,0,1},
			{1,0,0,1,0,0,0,0,0,1,1,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	static int[][] datas2 = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,1,1,0,0,0,0,0,0,0,1,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,1,1,1,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,0,1,1,1,1,1,1,0,0,1},
			{1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	static int[][] datas3 = {
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,1},
			{1,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1},
			{1,1,0,0,0,0,0,0,0,1,0,0,0,1,0,1},
			{1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,1},
			{1,0,0,0,1,0,0,0,0,1,0,0,0,1,0,1},
			{1,0,0,0,1,0,0,0,0,1,0,0,0,1,0,1},
			{1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};

}
