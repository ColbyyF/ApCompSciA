public abstract class Dog
{
public abstract int avgBreedWeight();
	
	
	
	
private String name;
// ------------------------------------------------------------
// Constructor -- store name
// ------------------------------------------------------------
public Dog(String name)
{
this.name = name;
}
// ------------------------------------------------------------
// Returns the dog's name
// ------------------------------------------------------------
public String getName()
{
return name;
}
// ------------------------------------------------------------
// Returns a string with the dog's comments
// ------------------------------------------------------------
public String speak()
{
return "woof";
}
}