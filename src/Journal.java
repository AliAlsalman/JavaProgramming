import java.util.Date;

public class Journal extends Publication{
	
	private static int journalCounter;
	private int journalID;
	private int articleID;
	private String articleTitle;
	private String authorName;
	private int volume;
	private int edition;
	
	public Journal(String publicationTitle, Date publicationDate, Publisher publisher, int articleID, String articleTitle, String authorName, int volume, int edition){
		super(publicationTitle, publicationDate, publisher);
		this.articleID = articleID;
		this.articleTitle = articleTitle;
		this.authorName = authorName;
		this.volume = volume;
		this.edition = edition;
		journalCounter++;
		this.journalID = journalCounter;
	}
	
	public void setJournalID(int journalID){
		this.journalID = journalID;
	}
	
	public int getJournalID(){
		return this.journalID;
	}
	
	public void setArticleID(int articleID){
		this.articleID = articleID;
	}
	
	public int getArticleID(){
		return this.articleID;
	}
	
	public void setArticleTitle(String articleTitle){
		this.articleTitle = articleTitle;
	}
	
	public String getArticleTitle(){
		return this.articleTitle;
	}
	
	public void setAuthorName(String authorName){
		this.authorName = authorName;
	}
	
	public String getAuthorName(){
		return this.authorName;
	}
	
	public void setVolume(int volume){
		this.volume = volume;
	}
	
	public int getVolume(){
		return this.volume;
	}
	
	public void setEdition(int edition){
		this.edition = edition;
	}
	
	public int getEdition(){
		return this.edition;
	}
	
	public static int getJournalCounter(){
		return journalCounter;
	}
	
	@Override
	public void printDetails(){
		System.out.println("\nPrinting Journal Details\n------------------------\n"+
						   "Title: "+getPublicationTitle()+"\n"+
						   "Publication Date: "+getPublicationDate()+"\n"+
						   "Publisher ID: "+getPublisher().getPublisherID()+"\n"+
						   "Publisher Name: "+getPublisher().getPublisherName()+"\n"+
						   "JournalID: "+getJournalID()+"\n"+
						   "Article ID: "+getArticleID()+"\n"+
						   "Article Title: "+getArticleTitle()+"\n"+
						   "Volume: "+getVolume()+"\n"+
						   "Edition: "+getEdition()+"\n"+
						   "Author: "+getAuthorName()+"\n\n");
	}
	
}
