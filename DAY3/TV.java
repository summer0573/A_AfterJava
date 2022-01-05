package class3;

public class TV {
	private String color;
	private int size;
	private String producer;
	private int channel, volume;
	
	public void setColor(String color) {
		this.color= color;
	}
	
	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void powerOn() {
		System.out.println(producer+" TV ������ ������.");
	}
	
	public void powerOff() {
		System.out.println(producer+" TV ������ ������.");
	}
	
	public void upChannerl() {
		channel++;
		System.out.println("���� ä����" + channel + "��");
	}
	
	public void downChannerl() {
		channel--;
		System.out.println("���� ä����" + channel + "��");
	}

	public void upvolume() {
		volume++;
		System.out.println("���� ������" + volume);
	}
	
	public void downvolume() {
		volume--;
		System.out.println("���� ������" + volume);
	}
	
	@Override
	public String toString() {
		return "TV [color=" + color + ", size=" + size + ", producer=" + producer + ", channel=" + channel + ", volume="
				+ volume + "]";
	}
	
}
