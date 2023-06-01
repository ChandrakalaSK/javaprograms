package in.ineuron.annot;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	@Override
	public void process() 
	{
		
		System.out.println("World best CPU");
	}

}
