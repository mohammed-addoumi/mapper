package ma.cdgk.mapper.configuration;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import lombok.extern.slf4j.Slf4j;
import ma.cdgk.mapper.service.MappingService;
import ma.cdgk.mapper.utils.AlimentationUtil;

@Configuration
@EnableScheduling
@Slf4j
public class ExecutionConfig {
	
	@Autowired
	private MappingService mappingService;

    @Scheduled(cron = "0 */1 * * * ?")
    public void scheduleTransformJob() throws JsonGenerationException, JsonMappingException, IOException  {
    	
		mappingService.map(AlimentationUtil.createDeclaration("1", "01", "01", "01"));
		log.info("Declaration object got mapped");
    }
}
