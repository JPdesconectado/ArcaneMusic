package bridge;

public class DeviceMobile implements DeviceInterface{
	private int percent = 20;
	private String title = "First Music";
	
	public void setVolume(int percent) {
		if(percent > 100) {
			this.percent = 100;
		}else {
			if (percent < 0) {
				this.percent = 0;
			}else {
				this.percent = percent;
			}
		}
	}

	public int getVolume() {
		return percent;
	}

	public void setMusic(String title) {
		this.title = title;
	}

	public String getMusic() {
		return title;
	}

	public void printStatus() {
		System.out.println("----------------------------------");
		System.out.println("|| Você está no Celular ||");
		System.out.println("|| Volume: " + percent + "%");
		System.out.println("|| Reproduzindo: " + title + " ||");
		System.out.println("----------------------------------");
	}


}
