import java.util.ArrayList;

public class Publisher {
	private static int publisherCounter;
	private int publisherID;
	private String publisherName;
	private String publisherAddress;
	private String contactName;
	private ArrayList <Publication>publications = new ArrayList<Publication>();
	
	public Publisher(String publisherName, String publisherAddress, String contactName){
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
		this.contactName = contactName;
		publisherCounter++;
		this.publisherID = publisherCounter;	
	}
	
	public void setPublisherName(String publisherName){
		this.publisherName = publisherName;
	}
	
	public String getPublisherName(){
		return this.publisherName;
	}
	
	public void setPublisherAddress(String publisherAddress){
		this.publisherAddress = publisherAddress;
	}
	
	public String getPublisherAddress(){
		return this.publisherAddress;
	}
	
	public void setContactName(String contactName){
		this.contactName = contactName;
	}
	
	public String getContactName(){
		return this.contactName;
	}
	
	public static int getPublisherCounter(){
		return publisherCounter;
	}
	
	public int getPublisherID(){
		return publisherID;
	}
	
	public ArrayList<Publication> getPublications() {
		return publications;
	}
	
	public void addPublication(Publication newPub){
		publications.add(newPub);
	}
	
	public void printPublisherDetails(){
		System.out.println("\n\n\n"+"Publisher Details\n-----------------\n"+
						   "Publisher ID: "+getPublisherID()+"\n"+
						   "Publisher Name: "+getPublisherName()+"\n"+
						   "Address: "+getPublisherAddress()+"\n"+
						   "Contact Person: "+getContactName()+"\n");
	}
	
	public void printAllPublications(){
		System.out.println("All publications for "+getPublisherName());
		int num1 = "All publications for ".length();
		int num2 = getPublisherName().length();
		for(int a=0; a<num1+num2; a++){
			System.out.print('-');
		}
		System.out.println();
		for (int i = 0; i < getPublications().size(); i++)
	    {
	        Publication Pub = getPublications().get(i);
	        System.out.println(Pub.getPublicationTitle());	
	    }
	}
	
}
