package game;

import java.io.FileNotFoundException;

public class SoundTest {

	public static void main(String[] args){
		
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println("sample.au is playing...");
		Sound sound = new Sound("YoGiOh.wav");
		sound.loop();
        
        try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//
//		System.out.println(System.getProperty("user.dir"));
//		//System.setProperty("user.dir", System.getProperty("user.dir")+"\\Resources\\");
//        System.out.println("ColdSteel.wav is playing...");
//		Sound.play("resources/audio/ColdSteel.wav");        
	}

}
