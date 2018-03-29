
public class Artist {
	int id;
	String artist;
	String album;
	
	public Artist(int id, String artist, String album) {
		this.id = id;
		this.artist = artist;
		this.album = album;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
}
