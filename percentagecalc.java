import java.util.*;
package acrticsludge;
public class percentagecalc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("* * * * * * * * * * PERCENTAGE CALCULATOR V0.1-BETA * * * * * * * * * *");
		System.out.println(" ");
		System.out.println("To calculate the percentage of ALL the subjects enter: A");
		System.out.println("To calculate the percentage of a single subjects enter: S");
		//System.out.println("Computers: C\nMaths: M\nII Language: L\nEnglish Literature: E\nEnglish Language: F\nGeography: G\nHistory: H\nPhysics: P\nChemistry: C\nBiology: B");
	    System.out.println(" ");
	    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
	    char FirstInput = sc.next().charAt(0);
	    int ToTMark, SingleMark;
	    switch(FirstInput)
	    {
	    case 'A':
	    	    System.out.println("Enter marks of Computers:");
	    	    int Comp = sc.nextInt();
	    	    System.out.println("Enter marks of Maths:");
	    	    int Math = sc.nextInt();
	    	    System.out.println("Enter marks of II Language:");
	    	    int IILang = sc.nextInt();
	    	    System.out.println("Enter marks of English Literature:");
	    	    int Elit = sc.nextInt();
	    	    System.out.println("Enter marks of English Language:");
	    	    int Elang = sc.nextInt();
	    	    System.out.println("Enter marks of Geography:");
	    	    int Geo = sc.nextInt();
	    	    System.out.println("Enter marks of History:");
	    	    int History = sc.nextInt();
	    	    System.out.println("Enter marks of Physics:");
	    	    int Phy = sc.nextInt();
	    	    System.out.println("Enter marks of Chemistry:");
	    	    int Chem = sc.nextInt();
	    	    System.out.println("Enter marks of Biology:");
	    	    int Bio = sc.nextInt();
	    	    
	    	    ToTMark = (Comp + Math + IILang + Elit + Elang + Geo + History + Phy + Chem + Bio)/820 * 100;
	    	    System.out.println("Percentage of all subjects is: "+ToTMark+"%");
	    }
	}

}
