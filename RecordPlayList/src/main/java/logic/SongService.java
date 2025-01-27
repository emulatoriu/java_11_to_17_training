package logic;

import java.util.List;

import data.Song;

public class SongService {
	public double getPriceOfAllSongs(List<Song> songs, int pricePerSong) {
		return getUniqueSongsCount(songs) * pricePerSong;
	}
	public double getPriceOfAllSongs(List<Song> songs) {
		return getUniqueSongsCount(songs);
	}

	private long getUniqueSongsCount(List<Song> songs) {
		return songs.stream()
				.distinct()
				.count();
	}
}
