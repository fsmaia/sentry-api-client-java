/*
 * API Reference
 * Sentry Public API
 *
 * The version of the OpenAPI document: v0
 * Contact: partners@sentry.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sentry.api.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.sentry.api.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:23:11.909078Z[Etc/UTC]")
@JsonDeserialize(using = ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInnerDeserializer.class)
@JsonSerialize(using = ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInnerSerializer.class)
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner.class.getName());

    public static class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInnerSerializer extends StdSerializer<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner> {
        public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInnerSerializer(Class<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner> t) {
            super(t);
        }

        public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInnerSerializer() {
            this(null);
        }

        @Override
        public void serialize(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInnerDeserializer extends StdDeserializer<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner> {
        public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInnerDeserializer() {
            this(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner.class);
        }

        public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInnerDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize Integer
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Integer.class.equals(Integer.class) || Integer.class.equals(Long.class) || Integer.class.equals(Float.class) || Integer.class.equals(Double.class) || Integer.class.equals(Boolean.class) || Integer.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Integer.class.equals(Integer.class) || Integer.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Integer.class.equals(Float.class) || Integer.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Integer.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Integer.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Integer.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Integer'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Integer'", e);
            }

            // deserialize String
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (String.class.equals(Integer.class) || String.class.equals(Long.class) || String.class.equals(Float.class) || String.class.equals(Double.class) || String.class.equals(Boolean.class) || String.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((String.class.equals(Integer.class) || String.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((String.class.equals(Float.class) || String.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (String.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (String.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(String.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'String'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'String'", e);
            }

            if (match == 1) {
                ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner ret = new ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner() {
        super("oneOf", Boolean.FALSE);
    }

    public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner(Integer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Integer", new GenericType<Integer>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
        JSON.registerDescendants(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Integer, String
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(Integer.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Integer, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * Integer, String
     *
     * @return The actual instance (Integer, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Integer`. If the actual instance is not `Integer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Integer`
     * @throws ClassCastException if the instance is not `Integer`
     */
    public Integer getInteger() throws ClassCastException {
        return (Integer)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

}

