package teach;

public class Artist extends Man{
	
	String bestSong;
	
	public Artist(String name, String age, String bestSong) {
		super(name, age);
		this.bestSong = bestSong;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist m = new Artist("Arijit Singh","27","Tum hi ho"); 
		System.out.println(m.getName());
	}

	public String getBestSong() {
		return bestSong;
	}

	public void setBestSong(String bestSong) {
		this.bestSong = bestSong;
	}

}
