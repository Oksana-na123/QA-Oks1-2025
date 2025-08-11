package org.prog.session9;

import lombok.Data;
import lombok.ToString;import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.ToString;
import lombok.Data;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@ToString
public class PersonDto {
    private String gender;
    private String nat;

    private NameDto name;
    private LocationDto location;


}

