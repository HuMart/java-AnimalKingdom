package kingdom;

public abstract class Animal
{
	// fields
	protected static int maxNumber = 0;
	protected int number;
	protected String name;
	protected int yearDiscovered;

	// constructor
	public Animal(String name, int yearDiscovered)
	{
		maxNumber++;
		this.number = maxNumber;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	// default methods
	public String eat()
	{
		return(name + "eats");
	}

	// getter and setters;

	public int getNumber()
	{
		return number;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getYear()
	{
		return yearDiscovered;
	}

	public void setYear(int yearDiscovered)
	{
		this.yearDiscovered = yearDiscovered;
	}

	// abstract methods

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();
}