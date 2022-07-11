package com.chainsys.springproject.beans;

public class Starter {
	public String name;
}
class Chicken extends Starter{
	public Chicken(){
		name="HoneyChicken";
	}
}
class Soup extends Starter{
	public Soup() {
		name="sweetcorn";
	}
}
class Vegroll extends Starter{
	public Vegroll() {
		name="Cabbageroll";
	}
}