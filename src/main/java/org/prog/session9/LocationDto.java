package org.prog.session9;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class LocationDto {

    private String city;
    private StreetDto street;
    private String state;
    private String number;

}
