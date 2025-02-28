package java_book;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ex77 {
	private Frame frame;
	private Button button1, button2, button3;
	
	public Ex77() {
		frame = new Frame("FlowLayout example");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
	}
	
	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex77 flow = new Ex77();
		flow.startFrame();
	}
}
