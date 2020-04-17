package com.revature.beans;
//Packages are just very fancy folders. Namespace


/*
 * Naming Conventions
 * Classes and Project: Pascal casing, Capitalized the first letter of Each Word. For example, ProjectMayhem
 * Methods and variable: Camel casing, for example: firstSecondThird
 * Packages: lowercase and delimited by periods
 * Constants: ALL_CAPS_LOLZ typically delimited by underscores
 * 
 */
public class Human {
	
	/*
	 * Members of a class - couples of forms
	 * Instance variables - property of a specific object (Human's name)
	 * Static variables - property of the class shared by all of it's instances
	 * Instance methods - behavior related to a specific object
	 * Static methods - behavior relative to entire class
	 * Constructor - instantiates the class using the keyword "new"  
	 * 
	 * Code Blocs - {things between}
	 */
		///Instance code block
	{System.out.println("I am in an instance code block");}
	
	//Static code block
	static {System.out.println("I'm in a static code block");}
		
	// no args constructor
	public Human() {
		System.out.println("I' in the no args constructor");
	}
	
	
	  public Human(String name, int age, int weight) {  
		  //super(); 
		  this.name=name;
		  this.age = age;
		  this.weight = weight;
		  System.out.println("I'm in the constructor with fields ");
		  
	  }
	 
	public static String homePlanet = "Earth";
	private String name;
	private int age;
	private int weight;
	
	public static String getHomePlanet() {
		return homePlanet;
	}


	public static void setHomePlanet(String homePlanet) {
		Human.homePlanet = homePlanet;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;	
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getWeight() {
		return weight; 
	}
	// example of shadowing!
	public void setWeight(int weight) {
		this.weight = weight; // weight is method scope, this.wieght is the instance scope
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", weight=" + weight + ", homePlanet= " +homePlanet+" ]";
	}
	
	

}
