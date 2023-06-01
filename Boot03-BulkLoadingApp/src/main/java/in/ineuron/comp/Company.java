package in.ineuron.comp;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties( prefix = "org.info")
public class Company implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Value("${org.info.name}")
	private String name;
	private String location;
	private Integer size;
	
	static {
		System.out.println("Company.class file is loading ");
	}


	public Company() {
		System.out.println("Company :: Zero parameter constructor...");
	}
	public void setName(String name) {
		System.out.println("Company.setName()");
		this.name = name;
	}



	public void setLocation(String location) {
		System.out.println("Company.setLocation()");
		this.location = location;
	}



	public void setSize(Integer size) {
		System.out.println("Company.setSize()");
		this.size = size;
	}


	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + ", size=" + size + "]";
	}

}
