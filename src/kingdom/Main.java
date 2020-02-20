package kingdom;	

public class Main 
{
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
	}
}