
public class DemoApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		Animal dolphin1 = new Dolphin("Flipper", 3, 25, "mammal");
		System.out.println(dolphin1.name);
		System.out.println(dolphin1.getLimbs());
		System.out.println(dolphin1.getAge());
		System.out.println(dolphin1.getType());
		
		dolphin1.eat();
		dolphin1.sleep();
		dolphin1.swim();
		



}
