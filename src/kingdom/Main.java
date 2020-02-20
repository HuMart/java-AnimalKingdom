package kingdom;	

import java.util.*;

public class Main 
{
	public static ArrayList<Animal> filteredAniimals = new ArrayList<Animal>();

	public static void filterAnimals(ArrayList<Animal> animals, CheckAnimal tester)
	{
		filteredAniimals.clear();

		for(Animal a : animals)
		{
			if(tester.test(a))
			{
				filteredAniimals.add(a);
			}
		}
	}

	public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester)
	{
		for(Animal a : animals)
		{
			if(tester.test(a))
			{
				System.out.println(a.toString());
			}
		}
	}

	public static void main(String[] args)
	{
		// mammals
		Mammals rakoon = new Mammals("Rakoon", 1758);
		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("koala", 1816);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		// birds
		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1837);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		// fish

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(rakoon);
		animals.add(panda);
		animals.add(zebra);
		animals.add(koala);
		animals.add(armadillo);
		animals.add(bigfoot);
		animals.add(pigeon);
		animals.add(peacock);
		animals.add(toucan);
		animals.add(parrot);
		animals.add(swan);
		animals.add(salmon);
		animals.add(catfish);
		animals.add(perch);

		System.out.println("*** Animals sorted by year ***");
		animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
		animals.forEach(a -> System.out.println(a.toString()));
		System.out.println();
		System.out.println("*** Animal sorted Alphabetically");
		System.out.println();
		animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animals.forEach(a -> System.out.println(a.toString()));
		System.out.println();
		System.out.println("*** Animals sorted by the way they move ***");
		animals.sort((a1,a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animals.forEach(a -> System.out.println(a.getName() + " " + a.move()));
		System.out.println();
		System.out.println("*** Animals with Lungs ***");
		printAnimals(animals, a -> a.breath() == "breath with lungs");
		System.out.println();
		System.out.println("*** Animals with lungs and named  in 1758 ***");
		printAnimals(animals, a -> (a.breath() == "breath with lungs" && a.getYear() == 1758));
		System.out.println();
	}
}