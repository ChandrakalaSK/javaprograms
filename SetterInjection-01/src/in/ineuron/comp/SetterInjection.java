package in.ineuron.comp;

import java.util.Date;

public class SetterInjection {

	public static void main(String[] args) {
		WishMessagegenerator generator = new WishMessagegenerator();
		System.out.println("Target object before Setter injection is ::"+generator);
		
		Date date = new Date();
		generator.setDate(date);
		System.out.println("Dependent object is ::"+generator);
		
		System.out.println("Target object after Setter injection ::"+generator);
		
		System.out.println();
		String result =generator.generateMessage("sachin");
		System.out.println(result);

	}

}
