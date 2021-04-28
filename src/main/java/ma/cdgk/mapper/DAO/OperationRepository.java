package ma.cdgk.mapper.DAO;

import java.util.List;

import ma.cdgk.mapper.domain.Operation;

public interface OperationRepository {
	
	public List<Operation> getOperations();
}
