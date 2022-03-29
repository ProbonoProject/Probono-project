package dev.probono.probono.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.AttributeConverter;

public class Converter implements AttributeConverter<List<Long>, String>{
    private static final String SPLIT_CHAR = ",";

    @Override
    public String convertToDatabaseColumn(List<Long> attribute) {
      return attribute.stream().map(String::valueOf).collect(Collectors.joining(SPLIT_CHAR));
    }
  
    @Override
    public List<Long> convertToEntityAttribute(String dbData) {
      return Arrays.stream(dbData.split(SPLIT_CHAR))
          .map(Long::parseLong)
          .collect(Collectors.toList());
  
    }
}

