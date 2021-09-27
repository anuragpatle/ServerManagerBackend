package io.anurag.server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;

@Data

//To use builder pattern
//@SuperBuilder lets you automatically produce the code required to have your class be instantiable with code such as:
//Person.builder().name("Adam Savage").city("San Francisco").job("Mythbusters").job("Unchained Reaction").build();
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL) // Ignore null fields when serializing a java class
public class Response {
    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus httpStatus;
    protected String reason;
    protected String message;
    protected String developerMessage;
    protected Map<?, ?> data;

}
