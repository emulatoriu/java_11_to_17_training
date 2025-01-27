package data;

public record Person(String firstName, String lastName) {
	@Override
	public String toString() {
		return "%s, %s".formatted(firstName, lastName);
	}
}
