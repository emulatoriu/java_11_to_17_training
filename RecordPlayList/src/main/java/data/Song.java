package data;

import java.util.Objects;

public record Song(String title, String interpreter) {
}
/*public class Song {
	private final String title;
	private final String interpreter;
	
	public Song(String title, String interpreter) {
		super();
		this.title = title;
		this.interpreter = interpreter;
	}

	public String getTitle() {
		return title;
	}

	public String getInterpreter() {
		return interpreter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(interpreter, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return Objects.equals(interpreter, other.interpreter) && Objects.equals(title, other.title);
	}
}*/
