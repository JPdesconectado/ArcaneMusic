package bridge;

public class AppControl implements AppControlInterface {
	protected DeviceInterface device;
	
	
	public AppControl() {
		
	}
	
	public AppControl(DeviceInterface device) {
		this.device = device;
	}
	
	
	public void volumeUp() {
		device.setVolume(device.getVolume() + 5);
	}

	public void volumeDown() {
		device.setVolume(device.getVolume() - 5);
		
	}

	public void chanceMusic(String title) {
		device.setMusic(title);
		
	}

}
