package kingdom;

public class Fish extends Animal
{
	// constructor
	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	// methods

	@Override
	public String move()
	{
		return "swim";
	}

	@Override
	public String breath()
	{
		return "breath with gills";
	}

	@Override
	public String reproduce()
	{
		return "gives birth to eggs";
	}

	@Override
	public String toString()
	{
		return "Fish { "+
			   "name= '" + name + '\'' +
			   "yearDiscovered= " + yearDiscovered + '}';
	}
}