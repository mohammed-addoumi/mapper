package ma.cdgk.mapper.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Identifiant {
    private String flux;
    private String compartiment;
    private String typeCompartiment;
    private String etablissementDeclaran;
    private LocalDate dateDeclaration;
    private int nbreEnregistrements;

}
