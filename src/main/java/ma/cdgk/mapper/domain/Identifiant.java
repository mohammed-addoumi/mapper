package ma.cdgk.mapper.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

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
    @JsonFormat(pattern = "ddMMyyyy")
    private LocalDate dateDeclaration;
    private int nbreEnregistrements;

}
