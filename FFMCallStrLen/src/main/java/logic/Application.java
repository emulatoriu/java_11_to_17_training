package logic;

public class Application {
	public static void main(String[] args) {
		String greet = "Hello programmers";
		try {
			long length = StringService.stringLength(greet);
			System.out.println(length);		
		} catch(Throwable e) {
			throw new RuntimeException("What a pitty");
		}
	}
}
