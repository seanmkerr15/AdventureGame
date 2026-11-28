package main;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameEngine {
	
	public static List<String> wordList(String input) {
		//breaks down words or sentences that contain delimiter and throws away the delimiter
		//Where to split the string 
		String delims = "[ \t,.:;?!\"']+";
		List<String> strList = new ArrayList<>();
		String[] words = input.split(delims);
		
		for (String word : words) {
			strList.add(word);
		}
		return strList;
	}
	
	public static void parseCommand(List<String>wordList) {
		String verb;
		String noun;
		//two lists that contains command (verbs) and objects (nouns)
		List<String> commands = new ArrayList<>(Arrays.asList("take", "drop", "n", "north", "south", "s", "w", "west", "e", "east")); //enter more words
		List<String> objects = new ArrayList<>(Arrays.asList("key")); //enter more words
		
		verb = wordList.get(0);
		if(wordList.size() == 1) {
			if(wordList.get(0).equals("take")||wordList.get(0).equals("drop")) {
				System.out.println(wordList.get(0) + " must be a two word command!");
			}
			else {
				switch (verb) {
				case "n":
				case "north":
					MovePlayer(player.Location.N);
					break;
				case "s":
				case "south":
					MovePlayer(player.Location.S);
					break;
				case "w":
				case "west":
					MovePlayer(Player.Location.S);
					break;
				case "e":
				case "east":
					MovePlayer(Player.Location.S);
					break;
				default:
					System.out.println(verb + " not understood");
				break;
					
				
				}
			}
			
		}
		
		//if it exceeds more than 2 words then it'll display an 'error' message
		if (wordList.size() !=2) {
			System.out.println("Only 2 word commands are allowed!");
		} else {
			//grabs first and then second word
			noun = wordList.get(1);
			//uses contains function to check if these words are familiar
			if(!commands.contains(verb)) {
				System.out.println(verb + " is not a known verb!");
			}
			if (!objects.contains(noun)) {
				System.out.println(noun + " is not a known noun!");
			}
			
		}
	}

	public static String runCommand(String inputStr) {
		List<String> wl;
		String s = "ok";
		//trims and set string to lower case
		String lowStr = inputStr.trim().toLowerCase();
		
		if(!lowStr.equals("q")) {
			//if string is not q then checks other cases
			if(lowStr.equals("")) {
				s = "You must enter a command";
			} else {
				//the code will run if neither of the above are true
				wl = wordList(lowStr);
				//after wordList is ran then it returns strList into parseCommand
				parseCommand(wl);
			}
		}
		return s;
	}
	
	private void MovePlayer(int newpos) {
		if (newpos == -1) {
			System.out.println("There is no exit in that direction");
		}
		else {
			//set new location
		}
	}
	
}//end main
