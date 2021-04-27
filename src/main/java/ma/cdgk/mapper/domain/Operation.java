package ma.cdgk.mapper.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Operation {

    private String datePosition;
    private String devise;
    private String avoirBilan;
    private String engagementBilan;
    private String avoirSpotHorsBilan;
    private String avoirTermeHorsBilan;
    private String engagementSpoHorsBilan;
    private String engagementTermeHorsBilan;
    private String couverturePositionOptionnelle;
    private String equivalentDelta;
    private String totalPosition;
    private String contreValeurPosition;
    private String fondPropre;



}
