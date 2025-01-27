package logic;

import java.util.Scanner;

public class UserInputService {
	private final Scanner scanner;
	
	public UserInputService(Scanner scanner) {		
		this.scanner = scanner;
	}

	public String getUserInput() {
		String userInput = scanner.nextLine();
		return userInput;
	}
}
