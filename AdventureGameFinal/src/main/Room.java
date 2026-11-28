package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Room {
	
	private Player player;
	
	private String name;
	private String description;
	public Rooms n, s, w, e;
	Room room0;
	Room room1;
	Room room2;
	Room room3;
	
	public Room(String name, String description, Rooms n, Rooms s, Rooms w, Rooms e) {
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
		room0 = new Room("Room1", "A Room1", Rooms.NOEXIT, Rooms.ROOM2, Rooms.NOEXIT, Rooms.ROOM1); //????? ARRAY???
		room1 = new Room("Room2", "A Room2", Rooms.NOEXIT, Rooms.NOEXIT, Rooms.ROOM0, Rooms.NOEXIT);
		room2 = new Room("Room3", "A Room3", Rooms.ROOM0, Rooms.NOEXIT, Rooms.NOEXIT, Rooms.ROOM3);
		room3 =new Room("Room4", "A Room4", Rooms.NOEXIT, Rooms.NOEXIT, Rooms.ROOM2, Rooms.NOEXIT);
		
		map.put(Rooms.ROOM0, room0); //FIX MEE
		//CONTINUE
		
	
	for (Entry<String, Room> m : map.entrySet()) {
		System.out.println(m.getKey() + " : " + m.getValue().getDescription());
	}
	
	player = new Player("You", "The Player", room0);
	}
	
	public Player getPlayer() {
		return player;
	}

	}
	
	 
	
}