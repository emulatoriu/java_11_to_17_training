import java.util.List;

import data.Song;
import logic.SongService;

public class Application {
	public static void main(String[] args) {
		Song song1 = new Song("Schüttel deinen Speck", "Peter Fox");
		Song song2 = new Song("Cryin", "Aerosmith");
		Song song3 = new Song("Cryin", "Aerosmith");
		List<Song> songs = List.of(song1, song2, song3);
		SongService songService = new SongService();
		double price = songService.getPriceOfAllSongs(songs);
		System.out.println(price);
	}
}
