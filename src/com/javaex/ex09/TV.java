package com.javaex.ex09;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

	public void TV() {
	}

	public void TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}

	public void power(boolean on) {
		this.power = on;
	}

	public void channel(int channel) {
		if (channel <1) {
			this.channel = 1;		
		}else if(channel > 255) {
			this.channel = 255;
		}else {
			this.channel = channel;
		}

	}
	
	public void channel(boolean up) {
		if(up==true) {
			channel(getChannel()+1);
		}else if(up==false) {
			channel(getChannel()-1);
		}else {
		}
	}
	
	public void volume(int volume) {
		if(volume <0) {
			this.volume = 0;
		}else if(volume > 100) {
			this.volume = 100;
		}else {
			this.volume = volume;
		}
	}
	
	public void volum(boolean up) {
		if(up==true) {
			volume(getVolume()+1);
		}else if(up==false) {
			channel(getVolume()-1);
		}else {
			
		}
		
	}

}
