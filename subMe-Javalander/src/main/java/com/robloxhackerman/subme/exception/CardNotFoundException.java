package com.robloxhackerman.subme.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CardNotFoundException extends RuntimeException {

    private String resourceName;
    private String fieldName;
    private Long filedValue;

    public CardNotFoundException(String resourceName, String fieldName, Long filedValue) {
        super(String.format("%s not found with : %s : '%s'", resourceName, fieldName, filedValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.filedValue = filedValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Long getFiledValue() {
        return filedValue;
    }

    public void setFiledValue(Long filedValue) {
        this.filedValue = filedValue;
    }
}
