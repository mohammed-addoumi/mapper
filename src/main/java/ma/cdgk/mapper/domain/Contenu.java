package ma.cdgk.mapper.domain;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contenu {

	@JacksonXmlProperty(localName = "operation")
	@JacksonXmlElementWrapper(useWrapping = false)
    private List<Operation> operations;

   
}
