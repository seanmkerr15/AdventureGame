package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in;
		String input;
		String output;
		
		System.out.println("Welcome to my Adventure Game!\n You are in " + Rooms.ROOM0);
		
		
		
		in = new BufferedReader(new InputStreamReader(System.in));
		do {
			//creates a loop that reads user input
			System.out.print("> ");
			input = in.readLine();
			output = GameEngine.runCommand(input);
			System.out.println(output);
			//quits when q is inputed
		} while (!"q".equals(input));
		
		
	}

}
