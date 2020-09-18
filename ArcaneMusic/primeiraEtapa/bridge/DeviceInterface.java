package bridge;

public interface DeviceInterface {
	
	void setVolume(int percent);
	
	int getVolume();
	
	void setMusic(String title);
	
	String getMusic();
	
	void printStatus();

}
