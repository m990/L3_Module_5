package data_structures;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComedyCentral implements KeyListener  {
	ArrayList<String> jokes = new ArrayList<>();
	ArrayList<String> puchLineL = new ArrayList<>();
	Random r = new Random();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel joke = new JLabel();
	JLabel punchLine = new JLabel();
	public static void main(String[] args) {
		ComedyCentral cc = new ComedyCentral();
		cc.jokes.add("How many Edison's does it take to screw in a lightbulb?");
		cc.puchLineL.add("None. He didn't invent it.");
		cc.jokes.add("What does a photon say when he is asked at a hotel if he needs help with his luggage?");
		cc.puchLineL.add("No thanks. I'm traveling light.");
		cc.jokes.add("Why are these these jokes so bad?");
		cc.puchLineL.add("All the good ones Argon.");
		cc.frame.setSize(100, 300);
		cc.frame.setVisible(true);
		cc.panel.add(cc.joke);
		cc.panel.add(cc.punchLine);
		cc.joke.setText("Press the space key for a joke!");
		cc.frame.add(cc.panel);
		cc.frame.addKeyListener(cc);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			System.out.println("space hit");
			int num = r.nextInt(3);
			joke.setText(jokes.get(num));
			punchLine.setText(puchLineL.get(num));
		}
	}
}
