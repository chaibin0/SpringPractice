package com.chaibin.practice.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
@ConfigurationPropertiesBinding
public class LocalDatePropertiesConverter implements Converter<String, LocalDate> {

    @Override
    public LocalDate convert(String value) {
        if (value == null) {
            return null;
        }
        return LocalDate.parse(value);
    }
}
