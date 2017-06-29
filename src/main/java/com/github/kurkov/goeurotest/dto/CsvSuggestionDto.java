package com.github.kurkov.goeurotest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Aleksey Kurkov. Created on 29.06.2017
 */
@Data
public class CsvSuggestionDto {
    @JsonProperty("_id")
    private long id;
    private String name;
    private String type;
    private double latitude;
    private double longitude;
}
