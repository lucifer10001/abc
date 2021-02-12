abstract class WrittenItem extends Item{
	private String author;
	public WrittenItem(int idNum, String str, int n, String author2) {
		// TODO Auto-generated constructor stub
		super(idNum,str,n);
		setAuthor(author2);
		
	}
	void setAuthor(String str){
		author = str;
	}
	String getAuthor(){
		return author;
	}
	public int getidNum(){
		return super.getIdNum();
	}
	public String getTitle(){
		return super.getTitle();
	}
	public int getNumCopies(){
		return super.getNumCopies();
	}
	public void print(){
		System.out.println("Title: " +getTitle());
		System.out.println("ID: " +getIdNum());
		System.out.println("Number of copies: " +getNumCopies());
		System.out.println("Author Name: "+getAuthor());
		System.out.println("---------------------------------------------------------");
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
		WrittenItem otherWrittenItem = (WrittenItem) obj;
		return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
	}
}
