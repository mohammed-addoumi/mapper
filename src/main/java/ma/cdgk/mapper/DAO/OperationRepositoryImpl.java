package ma.cdgk.mapper.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ma.cdgk.mapper.domain.Operation;
import ma.cdgk.mapper.utils.OperationMapper;

@Repository
public class OperationRepositoryImpl implements OperationRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Operation> getOperations() {
		return jdbcTemplate.query("select * from operation", new OperationMapper());
	}

}
