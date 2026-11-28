package main;

public class Player {
	private Room location; //Room where player is currently at
	private String aName;
	private String aDescription;
	
	
	public Player(String aName, String aDescription, Room aRoom) {
		this.aName = aName;
		this.aDescription = aDescription;
		this.location = aRoom;
		
	}


	public Room getLocation() {
		return location;
	}


	public void setLocation(Room location) {
		this.location = location;
	}


	public String getaName() {
		return aName;
	}



	public String getaDescription() {
		return aDescription;
	}

	
	

}
