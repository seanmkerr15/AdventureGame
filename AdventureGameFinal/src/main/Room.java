package main;

import java.util.HashMap;
import java.util.Map;

public class Room {
	
	private String name;
	private String description;
	
	public Room(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	public class Map {
	HashMap<String, Room> map = new HashMap<>();
	
	public Map() {
	map.put("Forest", new Room("Forest", "Trees"));
	}
	}
	
	
}