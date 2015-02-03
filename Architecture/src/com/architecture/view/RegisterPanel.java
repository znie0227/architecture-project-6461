package com.architecture.view;

import java.awt.Color;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class RegisterPanel extends JPanel {
	public RegisterPanel() {
		JPanel p1 = new JPanel();
		// p1.setLayout(new BorderLayout());// Register Panel
		JButton R0 = new JButton("R0");
		JButton R1 = new JButton("R1");
		JButton R2 = new JButton("R2");
		JButton R3 = new JButton("R3");
		JButton X1 = new JButton("X1");
		JButton X2 = new JButton("X2");
		JButton X3 = new JButton("X3");
		JButton MAR = new JButton("MAR");
		JButton MBR = new JButton("MBR");

		// components in P1
		p1.setSize(300, 250);
		p1.setBorder(BorderFactory.createTitledBorder("Register"));

		R0.setSize(60, 25);
		R0.setLocation(10, 50);

		R1.setLocation(105, 50);
		R1.setSize(60, 25);

		R2.setSize(60, 25);
		R2.setLocation(200, 50);

		R3.setSize(60, 25);
		R3.setLocation(10, 90);

		X1.setSize(60, 25);
		X1.setLocation(105, 90);

		X2.setSize(60, 25);
		X2.setLocation(200, 90);

		X3.setSize(60, 25);
		X3.setLocation(10, 130);

		MAR.setSize(60, 25);
		MAR.setLocation(105, 130);

		MBR.setSize(60, 25);
		MBR.setLocation(165, 130);

		Label l1 = new Label("java"); // 内容根据编程改，这里只是做个例子
		l1.setLocation(10, 15);
		l1.setSize(50, 25);
		JTextArea display1 = new JTextArea();// show content of register
		display1.setSize(75, 20);
		display1.setLocation(65, 20);
		display1.setEditable(false);
		display1.setText("display1");
		display1.setBackground(Color.blue);
		JTextArea display2 = new JTextArea();
		display2.setSize(75, 20);
		display2.setLocation(160, 20);
		display2.setEditable(false);
		display2.setText("display2");
		display1.setBackground(Color.RED);

		p1.add(l1);
		p1.add(display1);
		p1.add(display2);

		p1.add(R0);
		p1.add(R1);
		p1.add(R2);
		p1.add(R3);
		p1.add(X1);
		p1.add(X2);
		p1.add(X3);
		p1.add(MAR);
		p1.add(MBR);
		
		this.validate();
	}
}
