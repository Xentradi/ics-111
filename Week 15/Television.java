public class Television {
	// Instance variables
	private boolean isOn = false;
	private int volume = 0;
	private int channel = 1;

	/**
	 * Construct a new Television
	 */
	public Television() {
		// empty constructor
	} 

	public Television(boolean isOn, int volume, int channel) {
		this.setPower(isOn);
		this.setVolume(volume);
		this.setChannel(channel);
	} 

	// get methods

	// return power status
	public boolean isOn() {
		return this.isOn;
	}

	// return current volume
	public int getVolume() {
		return this.volume;
	}

	// return current channel
	public int getChannel() {
		return this.channel;
	}


	// set methods
	
	/**
	 * Change isOn to status
	 * @param status true/false current power status of the television
	 */
	public void setPower(boolean status) {
		this.isOn = status;
	}

	/**
	 * Change the volume of the television
	 * @param newVolume  the new volume
	 */
	public void setVolume(int newVolume) {
		if(newVolume < 0) newVolume = 0;
		this.volume = newVolume;
	}

	/**
	 * Change the current channel of the television
	 * @param newChannel the desired channel
	 */
	public void setChannel(int newChannel) {
		if(newChannel < 1) newChannel = 1;
		this.channel = newChannel;
	}

	// toggle the power states
	public void powerToggle() {
		if(this.isOn == false) {
			this.setPower(true);
		} else {
			this.setPower(false);
		}
	}

	// increase current channel by 1
	public void channelUp() {
		this.setChannel(this.getChannel()+1);
	}

	// decrease current channel by 1
	public void channelDown() {
		this.setChannel(this.getChannel()-1);
	}

	// increase volume by 1
	public void volumeUp() {
		this.setVolume(this.volume+1);
	}

	// decrease volume by 1
	public void volumeDown() {
		this.setVolume(this.volume-1);
	}

}