/* Deck of cards and Array of Objects */
import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class DeckDemo
{
	public static void main (String args[])  throws IOException
	{
		System.out.println("Menu:");

		System.out.println("1.Print a Deck");
		System.out.println("2.Sort a Deck");
		System.out.println("3.Find a Card");
		System.out.println("4.Deal Cards");
		System.out.println("5.Garbage Collection");
		
		int option ;
		char choice ;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Card myDeck[] = Card.createDeck();
		do
		{
			System.out.println("Choose one: ");
			option = Integer.parseInt( br.readLine() );
			
			switch(option)
			{	
				case 1:
				  System.out.println();
				  displayFullForm();
				  Card.printDeck(myDeck);
				  break;
				
				case 2:
				  Card myDeck2[] = Card.createCustomizedDeck();
				  System.out.println("Deck (unsorted):");
				  Card.printCustomizedDeck(myDeck2);
				  Card.sortCards(myDeck2,0,myDeck2.length - 1 ); 
				  System.out.println("Deck (sorted): ");
				  Card.printCustomizedDeck(myDeck2);
				  
				  break;
				
				case 3:
				  Card myDeck3[] = Card.createCustomizedDeck();
				  System.out.println("Input suit and rank of card you want to search:");
				  String str = br.readLine();
				 StringTokenizer st = new StringTokenizer( str , " " );
			     String suit = st.nextToken();
			     String rank = st.nextToken();
			     suit = suit.trim();
			     rank = rank.trim();
				 
				  
				  Card x = new Card (Integer.parseInt(suit),Integer.parseInt(rank));
				  
				  Card result = Card.findCard(myDeck3,x);
				  
				  if(result==null)  System.out.println("Card with suit " + suit + " and rank " + rank + " is not found!");
				  
				  else  
				  { 
			        System.out.println();
			        displayFullForm();  
                    System.out.print("Card found  :  "); 					
					Card.printCard.printCardDetails(x);
					System.out.println();
				  }
				  break;
				 
				case 4:	
				  System.out.println();
                  displayFullForm();				
				  Card.dealCards(myDeck);
				  break;
			
				case 5 :
				   System.gc();
				   break;
				
				default:
				   System.out.println("Invalid Option");
			}
			System.out.println();
			System.out.print("Do you want to continue (y/n)?");
			choice = (char) br.read();
			br.skip(2);
			
	}while(choice=='y' || choice=='Y');
  }
  
  static void displayFullForm()
  {
	  System.out.println("S : Spade");
	  System.out.println("H : Hearts");
	  System.out.println("D : Diamonds");
	  System.out.println("C : Clubs");
	  System.out.println();
  }
}

class Card 
{
	private int suit ;
	private int rank ;
	
	Card()
	{
		this(999,999);
	}
	
	Card(Card obj)
	{
		this(obj.suit,obj.rank);
	}
	
	Card(int suit, int rank)
	{
		this.suit = suit ;
		this.rank = rank ;
	}
	
	static Card[] createDeck()
	{
		int i, j , k ;
		k = 0 ;
		
		Card Deck[] = new Card[52];        //allocates memory for storing 52 card objects
		
		for(i = 0 ; i < 4 ; i++)
			for(j=1 ; j <= 13 ; j++)
               Deck[k++] = new Card(i+1,j);    //creates Card objects and assigns them to array of Cards i.e. Deck
        
        return Deck ;		
	}
	
	static Card[] createCustomizedDeck()  throws IOException
	{
		int n ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many cards do you want?");
		n = sc.nextInt();
		
		Card userDeck[] = new Card[n];
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int i ;
		for(i = 0 ; i < n ; i++)
		{
			
			System.out.println("Enter suit and rank of card: ");
			String str = br.readLine();
			
			StringTokenizer st = new StringTokenizer( str , " " );
			String suit = st.nextToken();
			String rank = st.nextToken();
			suit = suit.trim();
			rank = rank.trim();
			
			userDeck[i] = new Card(Integer.parseInt(suit),Integer.parseInt(rank));
		}
		
		return userDeck;
	}
	
	static class printCard
	{
		static private String suits[]= {"","S","H","D","C"};
		
		static void printSuit(int suit)
		{
			System.out.print(suits[suit]+" ");
		}
		static void printRank( int rank)
		{
			System.out.print(rank+" ");
		}
		static void  printCardDetails(Card C)
		{
			System.out.println();
			System.out.print("Card of suit ");
			Card.printCard.printSuit(C.suit);
			System.out.print(" and rank ");
			Card.printCard.printRank(C.rank);			
		}
	}
	
	static void  printDeck(Card deck[])
	{
		int i , lC = 0 ;
		   while(lC <4)
		   {
			   int copyi = i = 13*lC;
			   
			    System.out.println();
			    System.out.print("Suit: ");
				
			     for( ; i < 13*(lC+1); i++) 
				 {					 
			      Card.printCard.printSuit(deck[i].suit);
				  if(deck[i].rank >= 9) System.out.print(" ");	
				 }

				i = copyi ;
				System.out.println();
				System.out.print("Rank: ");
				
		          for( ; i < 13*(lC+1); i++) 
					  Card.printCard.printRank(deck[i].rank);
		
				System.out.println();
				System.out.print("-------------------------------------------------------------------------");
			    lC++;	
		  }
	}

    boolean sameCard(Card C1)
	{
		if(suit == C1.suit && rank == C1.rank)
			return true ;
		else
			return false;
	}

    int compareCard(Card C)
	{
		if(this.sameCard(C))
			return 0 ;
		
		else if (suit > C.suit || (suit==C.suit) && (rank > C.rank))        //lesser than
			return -1 ;
		
		else 
			 return 1;                                                      //greater than
	}	
    
    static void sortCards(Card Deck[],int l, int r)
	{
	  	//SortDeckOfCards.sortCards(Deck,l,r);
	  	for(int i=0;i<Deck.length-1;i++){
	  		for(int j=0;j<Deck.length-i-1;j++)
	  		{
	  			if(Deck[j].compareCard(Deck[j+1])== 1)
	  			{
	  				Card temp=new Card();
	  				temp=Deck[j];
	  				Deck[j]=Deck[j+1];
	  				Deck[j+1]=temp;
	  			}
	  		}
	  	}
	}
	
	
	
	static Card findCard(Card Deck[], Card C)
	{
		sortCards(Deck,0,Deck.length-1);
		
		if(SearchCard.search(Deck,C))
			return C ; 
		
		else
			return null;
	}
	
	static void dealCards(Card Deck[])
	{
	   	int i ;
		int randomindx[] = new int[5];
	    for(i = 0 ; i < 5 ; i++)
		{
			Random rand = new Random();
			randomindx[i] = rand.nextInt(52);			
		}
	  	System.out.print("Suit: ");
		for(i=0; i < 5 ; i++)
		{
		   if(Deck[i].rank >= 9) System.out.print(" ");
	       Card.printCard.printSuit(Deck[randomindx[i]].suit);
		}
	   
	   System.out.println();
	   
	   System.out.print("Rank: ");
	   for(i=0; i < 5 ; i++)
		   Card.printCard.printRank(Deck[randomindx[i]].rank);
	   System.out.println();
	}
	
	static void printCustomizedDeck(Card Deck[])
	{
		System.out.println();
		int i;
		
	  	System.out.print("Suit: ");
		for(i=0; i < Deck.length ; i++)
		{
		   if(Deck[i].rank >= 9) System.out.print(" ");
	       Card.printCard.printSuit(Deck[i].suit);
		}
	   
	   System.out.println();
	   
	   System.out.print("Rank: ");
	   for(i=0; i < Deck.length ; i++)
		   Card.printCard.printRank(Deck[i].rank);
	   System.out.println();
	
	}
	
	protected void finalize()
	{
		System.out.println("Garbage collection module");
	}
}

class SortDeckOfCards
{
	static void sortCards(Card Deck[] , int l, int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			sortCards(Deck,l,mid);
			sortCards(Deck,mid+1,r);
			mergeArray(Deck,l,mid,r);
		}
	}
	
	static void mergeArray(Card Deck[], int l, int mid, int r)
	{
		int n1 = mid - l + 1 ;
		int n2 = r - mid;
		
		Card L[] = new Card[n1+1];
		Card R[] = new Card[n2+1];
		
		int i , j ;
		
		for(i=0 ; i < n1 ; i++)
			L[i] = new Card(Deck[l+i]);
		
		for(j=0 ; j < n2 ; j++)
			R[j] = new Card(Deck[mid+j+1]);
		
		L[n1] = new Card();
		R[n2] = new Card();
		
		i = j = 0 ;
		
		int k ;
		for(k = l ; k <= r ; k++)
		{
			if(L[i].compareCard(R[j])== 1)
			  Deck[k] = L[i++];
		    else 
			  Deck[k] = R[j++];
		}
	}
}

class SearchCard
{
	static boolean  search(Card Deck[], Card C )
	{
		int LB = 0 ;
		int UB = Deck.length - 1 ;
		
		
		while(LB<=UB)
		{
			int mid = (LB+UB)/2;
			if(Deck[mid].sameCard(C))
				return true ;
			
			else if(Deck[mid].compareCard(C) == -1)
				UB = mid - 1;
			
			else
				LB = mid +  1;
		}
		return false;
	}
}


	
	