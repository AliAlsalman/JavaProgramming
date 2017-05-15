import java.util.Date;

public class ASSIGNMENTHELPER {
	
	public static void main( String[] args){
		
		Publisher PublisherOne = new Publisher("Cengage Learning", "10650 Toebben Drive Independence, KY 41051", "Josef Blumenfeld");
		Publisher PublisherTwo = new Publisher("Pearson", "80 Strand, London, WC2R 0RL, UK", "Brendan O’Grady");
		Publisher PublisherThree = new Publisher("Hodder Education", "338 Euston Road, London, NW1 3BH, United Kingdom", "Galore Park");
		Publisher PublisherFour = new Publisher("Oxford University Press", "Great Clarendon Street, Oxford OX2 6DP, UK", "Andy Redman");
		
		
		
		Book PublisherOneBookOne = new Book("Essentials of Operations Management", new Date(2002-1900,5-1,27,2,8,33), PublisherOne, "1844800520", "9781844800520", "Ray Wild");
		PublisherOne.addPublication(PublisherOneBookOne);
		
		Book PublisherOneBookTwo = new Book("The Organizational Behaviour Casebook", new Date(1996-1900,10-1,26,17,59,17), PublisherOne, "0415118514", "9780415118514", "Alan B. Thomas");
		PublisherOne.addPublication(PublisherOneBookTwo);
		
		
		Book PublisherTwoBookOne = new Book("Android How to Program", new Date(2013-1900,1-1,9,8,13,6), PublisherTwo, "0273776886", "9780273776888", "Paul, Harvey and Abbery");
		PublisherTwo.addPublication(PublisherTwoBookOne);
		
		Book PublisherTwoBookTwo = new Book("Java How to Program", new Date(2012-1900,11-1,17,12,2,59), PublisherTwo, "0273759760", "9780273759768", "Paul and Harvey Deitel");
		PublisherTwo.addPublication(PublisherTwoBookTwo);
		
		
		Journal PublisherThreeJournalOne = new Journal("International House Journal", new Date(2010-1900,1-1,3,10,5,44), PublisherThree, 948272,
				"Understanding second language acquisition", "Margaret Horrigan", 2, 29);
		PublisherThree.addPublication(PublisherThreeJournalOne);
		
		Journal PublisherThreeJournalTwo = new Journal("Journal of Oncology Pharmacy Practice", new Date(2013-1900,7-1,27,3,3,30), PublisherThree, 183189,
				"Physico-chemical stability of eribulin mesylate containing concentrate and ready-to-administer solutions", "Kirsten Spindeldreier", 1, 1);
		PublisherThree.addPublication(PublisherThreeJournalTwo);
		
		
		Journal PublisherFourJournalOne = new Journal("The Chinese Journal of Comparative Law", new Date(2014-1900,4-1,28,13,13,49), PublisherFour, 367388,
				"China and Foreign Direct Investment: Does Distance Lend Enchantment to the View?", "Leon E. Trakman", 2, 1);
		PublisherFour.addPublication(PublisherFourJournalOne);
		
		Journal PublisherFourJournalTwo = new Journal("Pediatric Psychology", new Date(2013-1900,5-1,20,7,5,11), PublisherFour, 7801773,
				"Sequential Analysis of Mothers’ and Fathers’ Reassurance and Children’s Postoperative Distress", "Sarah Martin", 29, 4);
		PublisherFour.addPublication(PublisherFourJournalTwo);
		
		
		Publication[] pubs = new Publication[ 8 ];
		pubs[ 0 ] = PublisherOneBookOne;
		pubs[ 1 ] = PublisherOneBookTwo;
		pubs[ 2 ] = PublisherTwoBookOne;
		pubs[ 3 ] = PublisherTwoBookTwo;
		pubs[ 4 ] = PublisherThreeJournalOne;
		pubs[ 5 ] = PublisherThreeJournalTwo;
		pubs[ 6 ] = PublisherFourJournalOne;
		pubs[ 7 ] = PublisherFourJournalTwo;
		
		for ( Publication pub : pubs )
			pub.printDetails();
		
		PublisherOne.printPublisherDetails();
		PublisherOne.printAllPublications();
		
		PublisherTwo.printPublisherDetails();
		PublisherTwo.printAllPublications();
		
		PublisherThree.printPublisherDetails();
		PublisherThree.printAllPublications();
		
		PublisherFour.printPublisherDetails();
		PublisherFour.printAllPublications();
		
	}

}
