package ma.cdgk.mapper.utils;

import java.time.LocalDate;

import ma.cdgk.mapper.domain.Declaration;
import ma.cdgk.mapper.domain.Identifiant;

public class AlimentationUtil {
	
	public static Declaration createDeclaration(String flux
			                                     ,String compartiment
			                                     ,String typeCompartiment
			                                     ,String etablissementDeclaran
			                                    ) {
		Declaration declaration = new Declaration();
		Identifiant identifiant = new Identifiant();
		identifiant.setFlux(flux);
		identifiant.setEtablissementDeclaran(etablissementDeclaran);
		identifiant.setCompartiment(compartiment);
		identifiant.setTypeCompartiment(typeCompartiment);
		identifiant.setDateDeclaration(LocalDate.now());
		declaration.setIdentifiant(identifiant);
		return declaration;
	}

}
