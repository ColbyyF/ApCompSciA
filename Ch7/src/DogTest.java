
// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
public static void main(String[] args)
{


Yorkshire dog2 = new Yorkshire("Adolf");
Labrador dog3 = new Labrador("Benito", "Itallian");

System.out.println(dog3.getName() + " says " + dog3.speak());
System.out.println(dog3.avgBreedWeight());
System.out.println(dog2.avgBreedWeight());




}

}	