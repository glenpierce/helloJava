/**
 * Created by glenp on 9/5/2017.
 */
public class Animal {

	public Animal(){
		this("default animal");
		System.out.println("Animal Constructed");
	}

	public Animal(String name){
		System.out.println("name:" + name);
	}
}
