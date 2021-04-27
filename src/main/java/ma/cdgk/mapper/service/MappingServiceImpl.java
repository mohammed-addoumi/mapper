package ma.cdgk.mapper.service;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import ma.cdgk.mapper.domain.Declaration;

public class MappingServiceImpl implements MappingService {

	@Override
	public void map(Declaration declaration) throws JsonGenerationException, JsonMappingException, IOException {
		XmlMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH_mm");
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION,true);
        mapper.writeValue(new File("result/test-"+formatter.format(LocalDateTime.now())+".xml"),declaration);

	}

}
