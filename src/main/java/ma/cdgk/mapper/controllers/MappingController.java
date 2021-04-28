package ma.cdgk.mapper.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import ma.cdgk.mapper.service.MappingService;
import ma.cdgk.mapper.utils.AlimentationUtil;

@RestController
@RequestMapping("/api/v1")
public class MappingController {

	
	@Autowired
	private MappingService mappingService;
	
	
	@RequestMapping("map")
	public String map(@RequestParam String flux
			        ,@RequestParam String compartiment
			        ,@RequestParam String typeCompartiment
			        ,@RequestParam String etablissementDeclarant) throws JsonGenerationException, JsonMappingException, IOException {
		mappingService.map(AlimentationUtil.createDeclaration(flux, compartiment, typeCompartiment, etablissementDeclarant));
		return "the xml file is ready";
	}

}
