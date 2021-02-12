class JournalPaper extends WrittenItem{
	private int pubYear;
	
	public JournalPaper(int idNum, String str, int n, String author, int y){
		super(idNum, str, n,author);
		pubYear=y;
	}
	public String toString(){
		return super.toString()+" Year published: "+ pubYear;
	}
	public int getIdNum(){
		return super.getIdNum();
	}
	public String title(){
		return super.getTitle();
	}
	public int numCopies(){
		return super.getNumCopies();
	}
	public String getAuthor(){
		return super.getAuthor();
	}
	public int yearPub(){
		return pubYear;
	}
	public void print(){
		super.print();
		System.out.println("Year published: "+ pubYear);
	}
	public void checkIn(){
		super.checkIn();
	}
	public void checkOut(){
		super.checkOut();
	}
	public void addItem(){
		super.addItem();
	}
	public boolean equals(Object obj){
		if(obj == null)
			return false;
		JournalPaper otherBook = (JournalPaper) obj;
		return super.equals(otherBook);
	}
}