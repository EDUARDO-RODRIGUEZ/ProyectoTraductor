package com.eduardo.app.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mapper {
    public static Logger LOG = Logger.getLogger(Mapper.class.getName());
    public static ObjectMapper mapper = new ObjectMapper();

    public static <T> Optional<T> toObject(String json, TypeReference<T> reference) {
        try {
            return Optional.of(mapper.readValue(json, reference));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    public static Optional<String> toJson(Object object) {
        try {
            return Optional.of(mapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            LOG.log(Level.WARNING, e.getMessage());
        }
        return Optional.empty();
    }

}
