package in.ineuron.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("apple")
public class Apple {
	
	@Autowired
	@Qualifier("snapDragon")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config()
	{
		System.out.println("6.7 display ,color rose gold,Storage 1T");
		cpu.process();
	}

}
