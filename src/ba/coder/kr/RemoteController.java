package ba.coder.kr;

public class RemoteController {
	private RButton power;
	private RButton volumeUP;
	private RButton volumeDown;
	private RButton channelUP;
	private RButton channelDown;
	
	public void on_off() {}
	public void volumeChange() {}
	public void channelChange() {}
	
	public RButton getPower() {
		return power;
	}
	public void setPower(RButton power) {
		this.power = power;
	}
	public RButton getVolumeUP() {
		return volumeUP;
	}
	public void setVolumeUP(RButton volumeUP) {
		this.volumeUP = volumeUP;
	}
	public RButton getVolumeDown() {
		return volumeDown;
	}
	public void setVolumeDown(RButton volumeDown) {
		this.volumeDown = volumeDown;
	}
	public RButton getChannelUP() {
		return channelUP;
	}
	public void setChannelUP(RButton channelUP) {
		this.channelUP = channelUP;
	}
	public RButton getChannelDown() {
		return channelDown;
	}
	public void setChannelDown(RButton channelDown) {
		this.channelDown = channelDown;
	}
	
	@Override
	public String toString() {
		return "";
	}
}
