/**
 * 
 * @author camron franklin
 * 
 *The purpose of this class is to model a television
 *Camron Franklin, 9/29/2020
 *
 */
public class Television {
	// brand/manufacturer name
	private final String MANUFACTURER;
	// Screen size
	private final int SCREEN_SIZE;
	// Power status (if the TV is on or off)
	private boolean powerOn;
	// The channel the TV is turned to
	private int channel;
	// Volume of the TV
	private int volume;
	
	//constructor
	public Television (String brand, int size) {
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	/**
	 * 
	 * @param station the channel you wish to change to
	 */
	void setChannel (int station) {
		channel = station;
	}
	/**
	 * switches power on or off
	 */
	public void power() {
		powerOn = !powerOn;
	}
	/**
	 * increase volume field by 1
	 */
	public void increaseVolume() {
		volume += 1;
	}
	/**
	 * decrease volume field by 1
	 */
	public void decreaseVolume() {
		volume -= 1;
	}
	/** returns the current channel
	 * @return the channel
	 */
	public int getChannel () {
		return channel;
	}
	/**
	 * returns the current volume
	 * @return current volume
	 */
	public int getVolume () {
		return volume;
	}
	
	/**
	 * returns the name of the manufacturer
	 * @return name of manufacturer
	 */
	public String getManufacturer () {
		return MANUFACTURER;
	}
	
	/**
	 * returns screen size
	 * @return television screen size
	 */
	public int getScreenSize () {
		return SCREEN_SIZE;
	}
}
