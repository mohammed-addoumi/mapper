package ma.cdgk.mapper.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ma.cdgk.mapper.domain.Operation;

public class OperationMapper implements RowMapper<Operation>{

	@Override
	public Operation mapRow(ResultSet rs, int rowNum) throws SQLException {
		Operation operation = new Operation();
		operation.setDatePosition(rs.getDate("dateposition").toLocalDate());
		operation.setDevise(rs.getString("devise"));
		operation.setAvoirBilan(rs.getDouble("avoirbilan"));
		operation.setEngagementBilan(rs.getDouble("engagementbilan"));
		operation.setAvoirSpotHorsBilan(rs.getDouble("avoirspothorsbilan"));
		operation.setAvoirTermeHorsBilan(rs.getDouble("avoirtermehorsbilan"));
		operation.setEngagementSpoHorsBilan(rs.getDouble("engagementspohorsbilan"));
		operation.setEngagementTermeHorsBilan(rs.getDouble("engagementtermehorsbilan"));
		operation.setCouverturePositionOptionnelle(rs.getInt("couverturepositionoptionnelle"));
		operation.setEquivalentDelta(rs.getInt("equivalentdelta"));
		operation.setTotalPosition(rs.getDouble("totalposition"));
		operation.setContreValeurPosition(rs.getDouble("contrevaleurposition"));
		operation.setFondPropre(rs.getDouble("fondpropre"));
		return operation;
	}

}
