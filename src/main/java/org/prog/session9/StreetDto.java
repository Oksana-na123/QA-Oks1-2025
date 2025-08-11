package org.prog.session9;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@ToString
public class StreetDto {
    private String name;
    private String number;
}
