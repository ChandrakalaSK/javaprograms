package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Company;

@SpringBootApplication
public class Boot03BulkLoadingAppApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Boot03BulkLoadingAppApplication.class, args);
		
		Company company = context.getBean(Company.class);
		System.out.println(company);
		
		((ConfigurableApplicationContext) context).close();
	}

}
