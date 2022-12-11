
class Animal{
	
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public void Speak() {	
		System.out.println("-> Animal Speaking ... ");		
	} 
} 


class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}
	@Override
	public void Speak() {
		System.out.println("-> " + getName() + " Bird is Singing ");
	}	
}





class Horse extends Animal{

	public Horse(String name) {
		super(name);
	}
	@Override
	public void Speak() {
		System.out.println("-> " + getName() + " Horse is Neighing ");
	}	
}
	
	
	
	
class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	@Override
	public void Speak() {
		System.out.println("-> " + getName() + " Dog is Barking ");
	}		
}



public class Main {

	public static void Spel(Animal animal) {
		animal.Speak();
	} 
	
	
	public static void main(String[] args) {
	
		Animal animal = new Animal("-> Name is ANimal");
		Bird bird = new Bird("Linguistic");
		Dog dog = new Dog("LuisMexiko");
		Horse hors = new Horse("Bold Pilot");
		
		animal.Speak();
		bird.Speak();
		dog.Speak();
		hors.Speak();
		
		System.out.println();
		Animal animal2 = new Dog("FrankMexi");
		animal2.Speak();
		
		System.out.println();
		Spel(new Horse("Boldico"));
		Spel(new Bird("Argantinaa"));
		
		
		
		
		
	}

}
