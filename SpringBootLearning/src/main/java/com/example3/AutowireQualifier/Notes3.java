package com.example3.AutowireQualifier;

public class Notes3 {
	
	/*
	 * A Laptop class is created and add @component annotation to get the instance of it.
	 * 
	 * ALien3  is calling Laptop's methods
	 * So, Alien class is dependent on Laptop class
	 * 
	 * Use @autowire annoation to connect Alien.class and Laptop.class in container
	 * the @autowire will search the Laptop.class object created by the spring(@component)  
	 * in the spring container.
	 * 
	 * We can also change the name of the object created by the spring by mentioning the name in 
	 * @component
	 * 
	 * 
	 * By default @autowire will search the Laptop.class object by TYPE 'laptop' 
	 * if nothing has mentioned in @component
	 * The Bean will be be if you mention the 
	 * so we can use @qualifer annotation to call the Spring bean by NAME
	 * check the Alient3, and laptop class
	 * 
	 * 
	 *
	 * */

}
