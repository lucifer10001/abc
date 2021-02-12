public class CD extends MediaItem{
	private String artist;
	private String genre;
	public CD(int runTime, String artist, String genre) {
		super(runTime);
		this.artist = artist;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", toString()=" + super.toString() + "]";
	}
	public void print() {
		System.out.println("Artist : "+artist);
		System.out.println("Genre : "+genre);
		System.out.println("Runtime : "+getRunTime());
		System.out.println("---------------------------------------------------------");
	}
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		CD otherCD = (CD) obj;
		return super.equals(otherCD);
	}
	
}