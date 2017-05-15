import java.util.Date;

public abstract class Publication {
		
	private static int publicationCounter;
	private String publicationTitle;
	private Date publicationDate;
	private Publisher publisher;
		
	public Publication(String publicationTitle, Date publicationDate, Publisher publisher){
		this.publicationTitle = publicationTitle;
		this.publicationDate = publicationDate;
		this.publisher = publisher;
		publicationCounter++;	
	}

	public void setPublicationTitle(String publicationTitle){
		this.publicationTitle = publicationTitle;
	}
	
	public String getPublicationTitle(){
		return this.publicationTitle;
	}
	
	public void setPublicationDate(Date publicationDate){
		this.publicationDate = publicationDate;
	}
		
	public Date getPublicationDate(){
		return this.publicationDate;
	}
	
	public void setPublisher(Publisher publisher){
		this.publisher = publisher;
	}
	
	public Publisher getPublisher(){
		return this.publisher;
	}
	
	public static int getPublicationCounter(){
		return publicationCounter;
	}
			
	public abstract void printDetails();
	
}
