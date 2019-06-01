package org.springframework.samples.petclinic.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.petclinic.customers.model.Owner;
import org.springframework.samples.petclinic.customers.model.OwnerRepository;

@SpringBootApplication
public class SpringPetclinicCustomersServiceApplication {

	@Autowired
	OwnerRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringPetclinicCustomersServiceApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Hello World");
				Owner owner1 = new Owner();
				owner1.setFirstName("Ashish");
				owner1.setLastName("Waghmare");
				owner1.setAddress("baner");
				owner1.setCity("Pune");
				owner1.setTelephone("2123");
				repo.save(owner1);
				Owner owner2 = new Owner();
				owner2.setFirstName("Student");
				owner2.setLastName("CDAC");
				owner2.setAddress("sproad");
				owner2.setTelephone("2125");
				owner2.setCity("Pune");
				repo.save(owner2);
			}
		};
	}

}
