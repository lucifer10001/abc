class Video extends MediaItem{
	private String director;
	private String genre;
	private int year;
	public Video(int runTime, String director, String genre, int year) {
		super(runTime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	
	public void print() {
		System.out.println("Director : "+director);
		System.out.println("Genre : "+genre);
		System.out.println("year : "+year);
		System.out.println("Runtime : "+getRunTime());
		System.out.println("---------------------------------------------------------");
	}
	@Override
	public String toString() {
		return "Video [directior=" + director + ", genre=" + genre + ", year=" + year + ", toString()="
				+ super.toString() + "]";
	}
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		Video otherVideo = (Video) obj;
		return super.equals(otherVideo);
	}
	
	
}