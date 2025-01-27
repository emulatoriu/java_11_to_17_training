package io;

public class AsciiPrinter {
	public void printAsciiText() {		
		String asciiText = """
				(\\,-------------------------'()'--o
				(_    _Hard work pays off %s_    /~" 
				(_)_)                   (_)_)
				""".formatted("Emad");
		System.out.println(asciiText);
	}
}
