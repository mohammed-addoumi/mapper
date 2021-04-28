package ma.cdgk.mapper.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import lombok.extern.slf4j.Slf4j;
import ma.cdgk.mapper.service.MappingService;
import ma.cdgk.mapper.utils.AlimentationUtil;

//@Component
@Slf4j
public class MappingRunner implements CommandLineRunner {
	
	
	@Autowired
	private MappingService mappingService;
	

	@Override
	public void run(String... args) throws Exception {
		String flux=null;
		String compartiment = null;
		String typeCompartiment=null;
		String etablissementDeclarant=null;
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("flux = ");
			flux = scanner.nextLine();
			System.out.println("compartiment = ");
			compartiment = scanner.nextLine();
			System.out.println("type de compartiment = ");
			typeCompartiment = scanner.nextLine();
			System.out.println("Etablissement declarant = ");
			etablissementDeclarant = scanner.nextLine();
		}
		
    	mappingService.map(AlimentationUtil.createDeclaration(flux,compartiment, typeCompartiment, etablissementDeclarant));
		log.info("Declaration object got created");
				

	}

}
