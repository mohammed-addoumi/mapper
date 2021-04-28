package ma.cdgk.mapper.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import ma.cdgk.mapper.DAO.OperationRepository;
import ma.cdgk.mapper.domain.Contenu;
import ma.cdgk.mapper.domain.Declaration;

@Service
public class MappingServiceImpl implements MappingService {
	
	@Autowired
	private OperationRepository operationRepository;

	@Override
	public void map(Declaration declaration) throws JsonGenerationException, JsonMappingException, IOException {
		XmlMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH_mm_ss");
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION,true);
        mapper.writeValue(new File("result/test-"+formatter.format(LocalDateTime.now())+".xml"),alimDeclaration(declaration));

	}
	
	
	public Contenu alimContenu() {
		Contenu contenu = new Contenu();
		contenu.setOperations(operationRepository.getOperations());
		
		return contenu;
	}
	
	
	public Declaration alimDeclaration(Declaration declaration) {
		declaration.setContenu(alimContenu());
        declaration.getIdentifiant().setNbreEnregistrements(
        		                   declaration.getContenu().getOperations().size());
		return declaration;
	}
	

}
