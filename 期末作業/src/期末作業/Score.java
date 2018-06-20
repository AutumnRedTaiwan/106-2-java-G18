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
		n -= 800;
	}
	public void escore(){
		n += 800;
	}
	
	public void lifescore(){
		n += 400;
	}
	
	public void life2score(){
		n -= 400;
	}
	
	
}
