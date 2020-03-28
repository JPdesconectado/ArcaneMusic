package bridge;

public abstract class DeviceAbstract {
	
	protected DeviceInterface device;

	public DeviceAbstract(DeviceInterface d) {
		this.device = d;
	}
	
	public void setVolume(int percent) {
		device.setVolume(percent);
	}
	
	public void setMusic(String title) {
		device.setMusic(title);
	}
	
	public int getVolume() {
		return device.getVolume();
	}
	
	public String getMusic() {
		return device.getMusic();
	}
	
	public abstract void printStatus();
	
}
