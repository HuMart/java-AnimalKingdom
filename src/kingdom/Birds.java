package kingdom;

public class Birds extends Animal
{
	// constructor
	public Birds(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	// methods

	@Override
	public String move()
	{
		return "fly";
	}

	@Override
	public String breath()
	{
		return "breath with lungs";
	}

	@Override
	public String reproduce()
	{
		return "gives birth eggs";
	}

	@Override
	public String toString()
	{
		return "Birds { "+
			   "name= '" + name + '\'' +
			   "yearDiscovered= " + yearDiscovered + '}';
	}
}