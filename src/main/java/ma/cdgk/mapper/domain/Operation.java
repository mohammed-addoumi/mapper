package ma.cdgk.mapper.domain;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Operation {

	@JsonFormat(pattern = "ddMMyyyy")
    private LocalDate datePosition;
    private String devise;
    private double avoirBilan;
    private double engagementBilan;
    private double avoirSpotHorsBilan;
    private double avoirTermeHorsBilan;
    private double engagementSpoHorsBilan;
    private double engagementTermeHorsBilan;
    private int couverturePositionOptionnelle;
    private int equivalentDelta;
    private double totalPosition;
    private double contreValeurPosition;
    private double fondPropre;



}
