package com.robloxhackerman.subme.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceAlreadyExistsException extends RuntimeException {

    private String resourceName;
    private String fieldName;
    private String filedValue;

    public ResourceAlreadyExistsException(String resourceName, String fieldName, String filedValue) {
        super(String.format("%s with : '%s : %s' already exists", resourceName, fieldName, filedValue));
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

    public String getFiledValue() {
        return filedValue;
    }

    public void setFiledValue(String filedValue) {
        this.filedValue = filedValue;
    }
}
