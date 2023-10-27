import java.util.Scanner;

class Animal {
	String name;
	int age;
	Animal (String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	void displayDetails ()
	{
		System.out.println ();
		System.out.println ("Animal: "+name);
		System.out.println ("Age: "+age);
	}
}

// herbivore
class Herbivore extends Animal {
	String breed;
	
	Herbivore (String name, int age, String breed)
	{ super(name,age);
	  this.breed = breed; }
	  
	void displayDetails()
	{ super.displayDetails();
	  System.out.println ("Breed: "+breed); } 
}


//carnivore
class Carnivore extends Animal {
	String breed;
	
	Carnivore (String name, int age, String breed)
	{ super(name,age);
	  this.breed = breed; }
	  
	void displayDetails()
	{ super.displayDetails();
	  System.out.println ("Breed: "+breed); } 
}

class problem_7 {
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		System.out.println (" ");
		System.out.println ("Enter Animal Details");
		System.out.println ("---------------------");
		
		
		System.out.println (" ");
		System.out.println ("HERBIVORE");
		System.out.println ("----------");
		System.out.println (" ");
		System.out.print("Enter animal name :- ");
		String hname = s.nextLine();
		System.out.print("Enter animal age :- ");
		int hage = s.nextInt();
		String junk = s.nextLine();
		System.out.print("Enter " + hname + " breed :- ");
		String hbreed = s.nextLine();
		
		Herbivore h = new Herbivore (hname,hage,hbreed);
		
		System.out.println (" ");
		System.out.println ("CARNIVORE: ");
		System.out.println ("----------");
		System.out.println (" ");
		System.out.print("Enter animal name :- ");
		String cname = s.nextLine();
		System.out.print("Enter animal age :- ");
		int cage = s.nextInt();
		String Junk = s.nextLine();
		System.out.print("Enter " + cname + " breed :- ");
		String cbreed = s.nextLine();
		
		Carnivore c = new Carnivore (cname,cage,cbreed);
		System.out.println (" ");
		System.out.println ("HERBIVORE DETAILS: ");
		System.out.println ("------------------");
		h.displayDetails();
		System.out.println();
		
		System.out.println (" ");
		System.out.println ("CARNIVORE DETAILS: ");
		System.out.println ("------------------");
		c.displayDetails();
		System.out.println (" ");
	}
}
