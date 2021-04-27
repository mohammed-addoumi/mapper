package ma.cdgk.mapper.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Declaration {
    private Identifiant identifiant;
    private Contenu contenu;

    
}
