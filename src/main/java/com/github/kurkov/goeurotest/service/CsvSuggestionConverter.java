package com.github.kurkov.goeurotest.service;

import com.github.kurkov.goeurotest.domain.Suggestion;
import com.github.kurkov.goeurotest.dto.CsvSuggestionDto;
import lombok.NonNull;
import org.springframework.stereotype.Component;

/**
 * @author Aleksey Kurkov. Created on 29.06.2017
 */
@Component
public class CsvSuggestionConverter {

    public CsvSuggestionDto toCsvSuggestionDto(@NonNull Suggestion input) {
        CsvSuggestionDto dto = new CsvSuggestionDto();
        dto.setId(input.getId());
        dto.setName(input.getName());
        dto.setType(input.getType());
        dto.setLatitude(input.getGeoPosition().getLatitude());
        dto.setLongitude(input.getGeoPosition().getLongitude());

        return dto;
    }
}
