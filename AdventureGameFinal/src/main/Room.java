package main;

import java.util.HashMap;
import java.util.Map;

public class Room {
	
	private String name;
	private String description;
	public int n, s, w, e;
	
	public Room(String name, String description, int n, int s, int w, int e) {
		this.name = name;
		this.description = description;
		this.n = n;
		this.s = s;
		this.w = w;
		this.e = e;
	}
	
	public String getDescription() {
		return description;
	}
	public class Map {
	HashMap<String, Room> map = new HashMap<>();
	
	public Map() {
	map.put("Room1", new Room("Room1", "A Room1", -1, 2, -1, 1));
	map.put("Room2", new Room("Room2", "A Room2", -1, -1, 0, -1));
	map.put("Room3", new Room("Room3", "A Room3", 0, -1, -1, 3));
	map.put("Room4", new Room("Room4", "A Room4", -1, -1, 2, -1));
	
	}
	}
	
	
}