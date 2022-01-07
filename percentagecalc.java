import java.util.*;
package acrticsludge;
public class percentagecalc {
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    System.out.println("* * * * * * * * * * PERCENTAGE CALCULATOR V0.2-BETA * * * * * * * * * *");
	    System.out.println(" ");
	    System.out.println("To calculate the percentage of ALL the subjects enter: A");
	    System.out.println("To calculate the percentage of a single subjects enter: S");
	    System.out.println(" ");
	    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
	    char FirstInput = sc.next().charAt(0);
	    double ToTMark, SingleMark, markcomp, markmath, markiilang, markenglit, markenglang, markgeo, markhist, markphy, markchem, markbio;
	    switch(FirstInput)
	    {
	    case 'a':
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
	    	    int His = sc.nextInt();
	    	    System.out.println("Enter marks of Physics:");
	    	    int Phy = sc.nextInt();
	    	    System.out.println("Enter marks of Chemistry:");
	    	    int Chem = sc.nextInt();
	    	    System.out.println("Enter marks of Biology:");
	    	    int Bio = sc.nextInt();
	    	    
	    	    ToTMark = (Comp + Math + IILang + Elit + Elang + Geo + His + Phy + Chem + Bio)/820.0 * 100;
	    	    System.out.println("Percentage of all subjects is: "+ToTMark+"%");
	    	    break;
	    case 's':	    
	    case 'S':
	    	System.out.println("Enter the following for: \nComputers: C\nMaths: M\nII Language: L\nEnglish Literature: E\nEnglish Language: F\nGeography: G\nHistory: H\nPhysics: P\nChemistry: I\nBiology: B");
	    	char SecondInput = sc.next().charAt(0);
	    	
	    	switch(SecondInput)
	    	{
	    	case 'C':
	    		System.out.println("Enter marks for computers:");
	    		int Computer = sc.nextInt();
	    		markcomp = (Computer/100.0) * 100;
	    		System.out.println("Your percentage is: "+markcomp+"%");
	    	    break;
	    	case 'M':
	    		System.out.println("Enter marks of Maths:");
	    	    int Maths = sc.nextInt();
	    	    markmath = (Maths/80.0) * 100;
	    	    System.out.println("Your percentage is: "+markmath+"%");
	    	    break;
	    		
	    	case 'L':
	    		System.out.println("Enter marks of II Language:");
	    	    int IILanguage = sc.nextInt();
	    	    markiilang = (IILanguage/80.0) * 100;
	    	    System.out.println("Your percentage is: "+markiilang+"%");
	    	    break;
	    		
	    	case 'E':
	    		System.out.println("Enter marks of English Literature:");
	    	    int Eliterature = sc.nextInt();
	    	    markenglit = (Eliterature/80.0) * 100;
	    	    System.out.println("Your percentage is: "+markenglit+"%");
	    		break;
	    	case 'F':
	    		System.out.println("Enter marks of English Language:");
	    	    int Elanguage = sc.nextInt();
	    	    markenglang = (Elanguage/80.0) * 100;
	    	    System.out.println("Your percentage is: "+markenglang+"%");
	    		break;
	    	case 'G':
	    		System.out.println("Enter marks of Geography:");
	    	    int Geography = sc.nextInt();
	    	    markgeo = (Geography/80.0) * 100;
	    	    System.out.println("Your percentage is: "+markgeo+"%");
	    		break;
	    	case 'H':
	    		System.out.println("Enter marks of History:");
		    	int History = sc.nextInt();
		    	markhist = (History/80.0) * 100;
		    	System.out.println("Your percentage is: "+markhist+"%");
	    		break;
	    	case 'P':
	    		System.out.println("Enter marks of Physics:");
	    	    int Physics = sc.nextInt();
	    	    markphy = (Physics/80.0) * 100;
	    	    System.out.println("Your percentage is: "+markphy+"%");
	    		break;
	    	case 'I':
	    		System.out.println("Enter marks of Chemistry:");
	    	    int Chemistry = sc.nextInt();
	    	    markchem = (Chemistry/80.0) * 100;
	    	    System.out.println("Your percentage is: "+markchem+"%");
	    		break;
	    	case 'B':
	    		System.out.println("Enter marks of Biology:");
	    	    int Biology = sc.nextInt();
	    	    markbio = (Biology/80.0) * 100;
	    	    System.out.println("Your percentage is: "+markbio+"%");
	    		break;
	    	default: System.out.println("* * * * * INVALID INPUT * * * * *");
	    	}
	    	break;
	    	default: System.out.println("* * * * * INVALID INPUT * * * * *");
	    }
	}

}
