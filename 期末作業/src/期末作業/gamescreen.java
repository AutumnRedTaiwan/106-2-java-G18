package 期末作業;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class gamescreen {
	static	String Filename;
	static	BufferedImage image;
	static	JFrame jf;
	static int n1=4000;
	static int n2=4000;
	
	static int a,b,c,d,e;
    static int aa,bb,cc,dd,ee;
    
	static int batt1,batt2, gamet=0;
    
	static int[] card = {aa,bb,cc,dd,ee};

	public void screen(){
	Filename="gamescreen.png";
    try
    {
            image=ImageIO.read(new File(Filename));
    }
    catch(Exception e)
    {
            javax.swing.JOptionPane.showMessageDialog(null, "載入圖檔錯誤: "+Filename);
            image=null;
    }
    /**
     * 建立視窗
     */
    jf = new JFrame("");
    
    Random rand = new Random();
    
    
    a = rand.nextInt()%10+1;
    if(a<0)	a = 10 - a;
    else if(a==0) a += 1;
    b = rand.nextInt()%10+1;
    if(b<0)	b = 10 - b;
    else if(b==0) b += 1;
    c = rand.nextInt()%10+1;
    if(c<0)	c = 10 - c;
    else if(c==0) c += 1;
    d = rand.nextInt()%10+1;
    if(d<0)	d = 10 - d;
    else if(d==0) d += 1;
    e = rand.nextInt()%10+1;
    if(e<0)	e = 10 - e;
    else if(e==0) e += 1;
    
    aa = rand.nextInt()%10+2;
    if(aa<0)	aa = 0 - aa;
    else if(aa==0) aa += 1;
    bb = rand.nextInt()%10+2;
    if(bb<0)	bb = 0 - bb;
    else if(bb==0) bb += 1;
    cc = rand.nextInt()%10+2;
    if(cc<0)	cc = 0 - cc;
    else if(cc==0) cc += 1;
    dd = rand.nextInt()%10+2;
    if(dd<0)	dd = 0 - dd;
    else if(dd==0) dd += 1;
    ee = rand.nextInt()%10+2;
    if(ee<0)	ee = 0 - ee;
    else if(ee==0) ee += 1;
    
    JButton b1 = new JButton("卡牌");
    b1.setForeground(Color.WHITE);
    b1.setBackground(Color.BLACK);
    b1.setBounds(74, 67, 60, 85);
    jf.add(b1);
    b1.setEnabled(false);
    
    JButton b2 = new JButton("卡牌");
    b2.setForeground(Color.WHITE);
    b2.setBackground(Color.BLACK);
    b2.setBounds(164, 67, 60, 85);
    jf.add(b2);
    b2.setEnabled(false);
    
    JButton b3 = new JButton("卡牌");
    b3.setForeground(Color.WHITE);
    b3.setBackground(Color.BLACK);
    b3.setBounds(254, 67, 60, 85);
    jf.add(b3);
    b3.setEnabled(false);
    
    JButton b4 = new JButton("卡牌");
    b4.setForeground(Color.WHITE);
    b4.setBackground(Color.BLACK);
    b4.setBounds(344, 67, 60, 85);
    jf.add(b4);
    b4.setEnabled(false);
    
    JButton b5 = new JButton("卡牌");
    b5.setForeground(Color.WHITE);
    b5.setBackground(Color.BLACK);
    b5.setBounds(434, 67, 60, 85);
    jf.add(b5);
    b5.setEnabled(false);
    
    Score sc2 = new Score(n2);
    Score sc1 = new Score(n1);
    
    JLabel player2=new JLabel("生命值		"+ sc2.getscore()+ "/4000");
    player2.setBounds(524,67,150,40);
    jf.add(player2);
    
    JButton b11 = new JButton("特殊");
    b11.setForeground(Color.BLACK);
    b11.setBackground(Color.WHITE);
    b11.setBounds(704, 67, 60, 85);
    jf.add(b11);
  
    JButton b6 = new JButton(""+a);
    b6.setForeground(Color.WHITE);
    b6.setBackground(Color.BLACK);
    b6.setBounds(309, 295, 60, 85);
    jf.add(b6);
    
    JButton b7 = new JButton(""+b);
    b7.setForeground(Color.WHITE);
    b7.setBackground(Color.BLACK);
    b7.setBounds(399, 295, 60, 85);
    jf.add(b7);
    
    JButton b8 = new JButton(""+c);
    b8.setForeground(Color.WHITE);
    b8.setBackground(Color.BLACK);
    b8.setBounds(489, 295, 60, 85);
    jf.add(b8);
    
    JButton b9 = new JButton(""+d);
    b9.setForeground(Color.WHITE);
    b9.setBackground(Color.BLACK);
    b9.setBounds(579, 295, 60, 85);
    jf.add(b9);
    
    JButton b10 = new JButton(""+e);
    b10.setForeground(Color.WHITE);
    b10.setBackground(Color.BLACK);
    b10.setBounds(669, 295, 60, 85);
    jf.add(b10);
    
    JLabel player1=new JLabel("生命值		"+sc1.getscore()+"/4000");
    player1.setBounds(129,295,150,40);
    jf.add(player1);
    
    JButton b12 = new JButton("特殊");
    b12.setForeground(Color.BLACK);
    b12.setBackground(Color.WHITE);
    b12.setBounds(37, 295, 60, 85);
    jf.add(b12);
    
    JButton battle1 = new JButton("決");
    battle1.setForeground(Color.BLACK);
    battle1.setBackground(Color.WHITE);
    battle1.setBounds(303, 180, 60, 85);
    jf.add(battle1);
    battle1.setEnabled(false);
    
    JButton battle2 = new JButton("鬥");
    battle2.setForeground(Color.BLACK);
    battle2.setBackground(Color.WHITE);
    battle2.setBounds(429, 180, 60, 85);
    jf.add(battle2);
    battle2.setEnabled(false);
    
    b6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	gamet += 1;
        	
        	MP3 mp3 = new MP3("Resource/katana1.mp3");
            mp3.play();
        	
        	battle1.setText(""+a);
        	batt1 = a;
        	b6.setText("空");
        	b6.setEnabled(false);
        	
        	int x=rand.nextInt()%5;
        	
        	while(x<0){
            	x = rand.nextInt()%5;
            	}
        	
        	System.out.println(x);
        	
        	if(card[x]>=0){
        		if(x==0){
        			battle2.setText(""+aa);
        			batt2 = aa;
        			b1.setText("空");
        		}else if(x==1){
        			battle2.setText(""+bb);
        			batt2 = bb;
        			b2.setText("空");
        		}else if(x==2){
        			battle2.setText(""+cc);
        			batt2 = cc;
        			b3.setText("空");
        		}else if(x==3){
        			battle2.setText(""+dd);
        			batt2 = dd;
        			b4.setText("空");
        		}else if(x==4){
        			battle2.setText(""+ee);
        			batt2 = ee;
        			b5.setText("空");
        		}
        		card[x]=-1;
        	}
        	
        	Thread t1 = new MyThread();
            t1.start();
        	
            System.out.println("1."+aa+"2."+bb+"3."+cc+"4."+dd+"5."+ee+"0."+batt2);
            
            if(batt1 > batt2){
            	JOptionPane.showMessageDialog(jf,"Player1贏了加800點生命值,Player2扣1000點生命值");
            	sc1.escore();
            	sc2.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else if(batt1 < batt2){
            	JOptionPane.showMessageDialog(jf,"Player2贏了加800點生命值,Player1扣1000點生命值");
            	sc2.escore();
            	sc1.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else{
            	JOptionPane.showMessageDialog(jf,"平手");
            }
            
            
            battle1.setText("決");
            battle2.setText("鬥");
        	
            if(sc1.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(sc2.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()>sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()<sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()==sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,雙方平手");
        		System.exit(0);
        	}
        }
    });
    
    b7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	gamet += 1;
        	
        	MP3 mp3 = new MP3("Resource/katana1.mp3");
            mp3.play();
        	
        	battle1.setText(""+a);
        	batt1 = a;
        	b7.setText("空");
        	b7.setEnabled(false);
        	
        	int x2=rand.nextInt()%5;
        	
        	while(x2<0){
            	x2 = rand.nextInt()%5;
            	}
        	
        	System.out.println(x2);
        	
        	if(card[x2]>=0){
        		if(x2==0){
        			battle2.setText(""+aa);
        			batt2 = aa;
        			b1.setText("空");
        		}else if(x2==1){
        			battle2.setText(""+bb);
        			batt2 = bb;
        			b2.setText("空");
        		}else if(x2==2){
        			battle2.setText(""+cc);
        			batt2 = cc;
        			b3.setText("空");
        		}else if(x2==3){
        			battle2.setText(""+dd);
        			batt2 = dd;
        			b4.setText("空");
        		}else if(x2==4){
        			battle2.setText(""+ee);
        			batt2 = ee;
        			b5.setText("空");
        		}
        		card[x2]=-1;
        	}
        	
        	Thread t1 = new MyThread();
            t1.start();
        	
            System.out.println("1."+aa+"2."+bb+"3."+cc+"4."+dd+"5."+ee+"0."+batt2);
            
            if(batt1 > batt2){
            	JOptionPane.showMessageDialog(jf,"Player1贏了加800點生命值,Player2扣1000點生命值");
            	sc1.escore();
            	sc2.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else if(batt1 < batt2){
            	JOptionPane.showMessageDialog(jf,"Player2贏了加800點生命值,Player1扣1000點生命值");
            	sc2.escore();
            	sc1.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else{
            	JOptionPane.showMessageDialog(jf,"平手");
            }
            
            
            battle1.setText("決");
            battle2.setText("鬥");
        	
            if(sc1.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(sc2.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()>sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()<sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()==sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,雙方平手");
        		System.exit(0);
        	}
        }
    });
    
    
    b8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	gamet += 1;
        	
        	MP3 mp3 = new MP3("Resource/katana1.mp3");
            mp3.play();
        	
        	battle1.setText(""+a);
        	batt1 = a;
        	b8.setText("空");
        	b8.setEnabled(false);
        	
        	int x3=rand.nextInt()%5;
        	
        	while(x3<0){
            	x3 = rand.nextInt()%5;
            	}
        	
        	System.out.println(x3);
        	
        	if(card[x3]>=0){
        		if(x3==0){
        			battle2.setText(""+aa);
        			batt2 = aa;
        			b1.setText("空");
        		}else if(x3==1){
        			battle2.setText(""+bb);
        			batt2 = bb;
        			b2.setText("空");
        		}else if(x3==2){
        			battle2.setText(""+cc);
        			batt2 = cc;
        			b3.setText("空");
        		}else if(x3==3){
        			battle2.setText(""+dd);
        			batt2 = dd;
        			b4.setText("空");
        		}else if(x3==4){
        			battle2.setText(""+ee);
        			batt2 = ee;
        			b5.setText("空");
        		}
        		card[x3]=-1;
        	}
        	
        	Thread t1 = new MyThread();
            t1.start();
        	
            System.out.println("1."+aa+"2."+bb+"3."+cc+"4."+dd+"5."+ee+"0."+batt2);
            
            if(batt1 > batt2){
            	JOptionPane.showMessageDialog(jf,"Player1贏了加800點生命值,Player2扣1000點生命值");
            	sc1.escore();
            	sc2.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else if(batt1 < batt2){
            	JOptionPane.showMessageDialog(jf,"Player2贏了加800點生命值,Player1扣1000點生命值");
            	sc2.escore();
            	sc1.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else{
            	JOptionPane.showMessageDialog(jf,"平手");
            }
            
            battle1.setText("決");
            battle2.setText("鬥");
        	
            if(sc1.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(sc2.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()>sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()<sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()==sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,雙方平手");
        		System.exit(0);
        	}
        }
    });
    
    b9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	gamet += 1;
        	
        	MP3 mp3 = new MP3("Resource/katana1.mp3");
            mp3.play();
        	
        	battle1.setText(""+a);
        	batt1 = a;
        	b9.setText("空");
        	b9.setEnabled(false);
        	
        	int x4=rand.nextInt()%5;
        	
        	while(x4<0){
            	x4 = rand.nextInt()%5;
            	}
        	
        	System.out.println(x4);
        	
        	if(card[x4]>=0){
        		if(x4==0){
        			battle2.setText(""+aa);
        			batt2 = aa;
        			b1.setText("空");
        		}else if(x4==1){
        			battle2.setText(""+bb);
        			batt2 = bb;
        			b2.setText("空");
        		}else if(x4==2){
        			battle2.setText(""+cc);
        			batt2 = cc;
        			b3.setText("空");
        		}else if(x4==3){
        			battle2.setText(""+dd);
        			batt2 = dd;
        			b4.setText("空");
        		}else if(x4==4){
        			battle2.setText(""+ee);
        			batt2 = ee;
        			b5.setText("空");
        		}
        		card[x4]=-1;
        	}
        	
        	Thread t1 = new MyThread();
            t1.start();
        	
            System.out.println("1."+aa+"2."+bb+"3."+cc+"4."+dd+"5."+ee+"0."+batt2);
            
            if(batt1 > batt2){
            	JOptionPane.showMessageDialog(jf,"Player1贏了加800點生命值,Player2扣1000點生命值");
            	sc1.escore();
            	sc2.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else if(batt1 < batt2){
            	JOptionPane.showMessageDialog(jf,"Player2贏了加800點生命值,Player1扣1000點生命值");
            	sc2.escore();
            	sc1.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else{
            	JOptionPane.showMessageDialog(jf,"平手");
            }
            
            battle1.setText("決");
            battle2.setText("鬥");
        	
            if(sc1.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(sc2.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()>sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()<sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()==sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,雙方平手");
        		System.exit(0);
        	}
        }
    });
    
    b10.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	gamet += 1;
        	
        	MP3 mp3 = new MP3("Resource/katana1.mp3");
            mp3.play();
        	
        	battle1.setText(""+a);
        	batt1 = a;
        	b10.setText("空");
        	b10.setEnabled(false);
        	
        	int x5=rand.nextInt()%5;
        	
        	while(x5<0){
            	x5 = rand.nextInt()%5;
            	}
        	
        	System.out.println(x5);
        	
        	if(card[x5]>=0){
        		if(x5==0){
        			battle2.setText(""+aa);
        			batt2 = aa;
        			b1.setText("空");
        		}else if(x5==1){
        			battle2.setText(""+bb);
        			batt2 = bb;
        			b2.setText("空");
        		}else if(x5==2){
        			battle2.setText(""+cc);
        			batt2 = cc;
        			b3.setText("空");
        		}else if(x5==3){
        			battle2.setText(""+dd);
        			batt2 = dd;
        			b4.setText("空");
        		}else if(x5==4){
        			battle2.setText(""+ee);
        			batt2 = ee;
        			b5.setText("空");
        		}
        		card[x5]=-1;
        	}
        	
        	Thread t1 = new MyThread();
            t1.start();
        	
            System.out.println("1."+aa+"2."+bb+"3."+cc+"4."+dd+"5."+ee+"0."+batt2);
            
            if(batt1 > batt2){
            	JOptionPane.showMessageDialog(jf,"Player1贏了加800點生命值,Player2扣1000點生命值");
            	sc1.escore();
            	sc2.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else if(batt1 < batt2){
            	JOptionPane.showMessageDialog(jf,"Player2贏了加800點生命值,Player1扣1000點生命值");
            	sc2.escore();
            	sc1.descore();
            	player1.setText("生命值		"+ sc1.getscore()+ "/4000");
            	player2.setText("生命值		"+ sc2.getscore()+ "/4000");
            }else{
            	JOptionPane.showMessageDialog(jf,"平手");
            }
            
            battle1.setText("決");
            battle2.setText("鬥");
        	
        	if(sc1.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(sc2.getscore()<=0){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()>sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player1贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()<sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,Player2贏了");
        		System.exit(0);
        	}else if(gamet == 5&&sc1.getscore()==sc2.getscore()){
        		JOptionPane.showMessageDialog(jf,"遊戲結束,雙方平手");
        		System.exit(0);
        	}
        }
    });
    
    
    
    /**
     * 設定背景
     */
    JScrollPane scrollPane = new JScrollPane(new JLabel(new ImageIcon(image)));
    /**
     * 設定視窗大小
     */
    jf.getContentPane().add(scrollPane);
    jf.pack();
    jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    jf.setTitle("遊戲開始");
    jf.setLocationRelativeTo(null);
    jf.setVisible(true);  
}

}

class MyThread extends Thread {
    public void run(){
        try {
            sleep(20000);
            
        } catch(InterruptedException e){

        }
    }
}
