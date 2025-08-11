package org.prog.session9;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class NameDto {
    private String title;
    private String first;
    private String last;
}
