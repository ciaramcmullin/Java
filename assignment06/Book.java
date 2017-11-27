// Ciara McMullin
// Intro to Comp Sci
// 03 April 2017
// class created to make a book object with title, author, year published, page count, and genre

public class Book{
	
	// create variables
	
	private static int runCount;
	private String title;
	private String author;
	private int yearPub;
	private int pageCount;
	private String genre;
	
	// constuct book
	
	public Book() {
		runCount++;
	}
	
	// create setters, getters, and methods
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return author;
	}
	
	public void setYearPublished(int yearPub) {
		this.yearPub = yearPub;
	}
	public int getYearPublished(){
		return yearPub;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public int getPageCount(){
		return pageCount;
	}
	
	public void setGenre(String genre){
		this.genre = genre;
	}
	
	public String getGenre(){
		return genre;
	}
	
	static int RunCount(){
		return runCount;
	}
	
	

}
