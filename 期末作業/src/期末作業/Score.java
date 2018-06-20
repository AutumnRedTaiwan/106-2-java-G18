package game;

import javax.swing.JOptionPane;

public class Score {
	private int n;
	public Score(int n) {
		this.n = n;
	}
	public int getscore(){
		return n;
	}
	public void descore(){
		n -= 1000;
	}
	public void escore(){
		n += 800;
	}
	
	
}
