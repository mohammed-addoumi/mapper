package ma.cdgk.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import ma.cdgk.mapper.DAO.OperationRepository;
import ma.cdgk.mapper.domain.Contenu;
import ma.cdgk.mapper.domain.Declaration;
import ma.cdgk.mapper.domain.Identifiant;
import ma.cdgk.mapper.domain.Operation;
import ma.cdgk.mapper.service.MappingService;
import ma.cdgk.mapper.utils.AlimentationUtil;
import ma.cdgk.mapper.utils.OperationMapper;

@SpringBootTest
class MapperApplicationTests {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MappingService mappingService;
	

	@Test
	void contextLoads() {
	}
	
	@Test
	public void call_count_on_operation_should_return_4() {
		Integer queryForObject = jdbcTemplate.queryForObject("select count(*) from operation", Integer.class);
		assertEquals(4, queryForObject);
	}

	
	@Test
	public void call_select_all_on_operation_should_return_all_elements() {
		List<Operation> operations = jdbcTemplate.query("select * from operation", new OperationMapper());
		for(Operation operation:operations) {
			System.out.println(operation);
		}
		
	}
	
	@Test
	public void should_create_xml_file() throws JsonGenerationException, JsonMappingException, IOException {
		mappingService.map(AlimentationUtil.createDeclaration("1", "01", "01", "01"));
				
	}

}
