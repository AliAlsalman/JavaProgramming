import java.util.Date;

public class Book extends Publication {

	private static int bookCounter;
	private String ISBN_10;
	private String ISBN_13;
	private String authorName;

	public Book(String publicationTitle, Date publicationDate, Publisher publisher, String ISBN_10, String ISBN_13, String authorName){
		super(publicationTitle, publicationDate, publisher);
		this.ISBN_10 = ISBN_10;
		this.ISBN_13 = ISBN_13; 
		this.authorName = authorName;
		bookCounter++;
	}
	
	public void setISBN_10(String ISBN_10){
		this.ISBN_10 = ISBN_10;
	}
	
	public String getISBN_10(){
		return this.ISBN_10;
	}
	
	public void setISBN_13(String ISBN_13){
		this.ISBN_13 = ISBN_13;
	}
	
	public String getISBN_13(){
		return this.ISBN_13;
	}
	
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	
	public String getAuthorName(){
		return this.authorName;
	}
	
	public static int getBookCounter(){
		return bookCounter;
	}
	
	@Override
	public void printDetails(){
		System.out.println("\nPrinting Book Details\n---------------------\n"+
						   "Title: "+getPublicationTitle()+"\n"+
						   "Publication Date: "+getPublicationDate()+"\n"+
						   "Publisher ID: "+getPublisher().getPublisherID()+"\n"+
						   "Publisher Name: "+getPublisher().getPublisherName()+"\n"+
						   "ISBN_10: "+getISBN_10()+"\n"+
						   "ISBN_13: "+getISBN_13()+"\n"+
						   "Author: "+getAuthorName()+"\n\n");
	}

}