package test;


interface ChhocoRun{
	void playSong();
	void playVideo();
	void openFile();
}

class WinChhocoRun implements ChhocoRun{

	@Override
	public void playSong() {
		// TODO Auto-generated method stub
		System.out.println("song play on windows.");
		
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		
	}
	
}

class LinuxChhoRun implements ChhocoRun{

	@Override
	public void playSong() {
		// TODO Auto-generated method stub
		System.out.println("song play on Linux");
		
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openFile() {
		// TODO Auto-generated method stub
		
	}
	
}

public class LearningInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
