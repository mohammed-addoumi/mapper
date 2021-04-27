package ma.cdgk.mapper.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import ma.cdgk.mapper.domain.Declaration;

public interface MappingService {
	
	public void map(Declaration declaration) throws JsonGenerationException, JsonMappingException, IOException;

}
