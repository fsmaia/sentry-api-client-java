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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseMetadataOneOf;
import com.sentry.api.client.model.RetrieveAnEventForAProject200ResponseMetadataOneOf1;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:46:47.521074Z[Etc/UTC]")
@JsonDeserialize(using = RetrieveAnEventForAProject200ResponseMetadata.RetrieveAnEventForAProject200ResponseMetadataDeserializer.class)
@JsonSerialize(using = RetrieveAnEventForAProject200ResponseMetadata.RetrieveAnEventForAProject200ResponseMetadataSerializer.class)
public class RetrieveAnEventForAProject200ResponseMetadata extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RetrieveAnEventForAProject200ResponseMetadata.class.getName());

    public static class RetrieveAnEventForAProject200ResponseMetadataSerializer extends StdSerializer<RetrieveAnEventForAProject200ResponseMetadata> {
        public RetrieveAnEventForAProject200ResponseMetadataSerializer(Class<RetrieveAnEventForAProject200ResponseMetadata> t) {
            super(t);
        }

        public RetrieveAnEventForAProject200ResponseMetadataSerializer() {
            this(null);
        }

        @Override
        public void serialize(RetrieveAnEventForAProject200ResponseMetadata value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class RetrieveAnEventForAProject200ResponseMetadataDeserializer extends StdDeserializer<RetrieveAnEventForAProject200ResponseMetadata> {
        public RetrieveAnEventForAProject200ResponseMetadataDeserializer() {
            this(RetrieveAnEventForAProject200ResponseMetadata.class);
        }

        public RetrieveAnEventForAProject200ResponseMetadataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public RetrieveAnEventForAProject200ResponseMetadata deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize RetrieveAnEventForAProject200ResponseMetadataOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Integer.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Long.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Float.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Double.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Boolean.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Integer.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Float.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RetrieveAnEventForAProject200ResponseMetadataOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RetrieveAnEventForAProject200ResponseMetadataOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RetrieveAnEventForAProject200ResponseMetadataOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RetrieveAnEventForAProject200ResponseMetadataOneOf'", e);
            }

            // deserialize RetrieveAnEventForAProject200ResponseMetadataOneOf1
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Integer.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Long.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Float.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Double.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Boolean.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Integer.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Float.class) || RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RetrieveAnEventForAProject200ResponseMetadataOneOf1.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(RetrieveAnEventForAProject200ResponseMetadataOneOf1.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RetrieveAnEventForAProject200ResponseMetadataOneOf1'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RetrieveAnEventForAProject200ResponseMetadataOneOf1'", e);
            }

            if (match == 1) {
                RetrieveAnEventForAProject200ResponseMetadata ret = new RetrieveAnEventForAProject200ResponseMetadata();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for RetrieveAnEventForAProject200ResponseMetadata: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public RetrieveAnEventForAProject200ResponseMetadata getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "RetrieveAnEventForAProject200ResponseMetadata cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public RetrieveAnEventForAProject200ResponseMetadata() {
        super("oneOf", Boolean.FALSE);
    }

    public RetrieveAnEventForAProject200ResponseMetadata(RetrieveAnEventForAProject200ResponseMetadataOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RetrieveAnEventForAProject200ResponseMetadata(RetrieveAnEventForAProject200ResponseMetadataOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RetrieveAnEventForAProject200ResponseMetadataOneOf", new GenericType<RetrieveAnEventForAProject200ResponseMetadataOneOf>() {
        });
        schemas.put("RetrieveAnEventForAProject200ResponseMetadataOneOf1", new GenericType<RetrieveAnEventForAProject200ResponseMetadataOneOf1>() {
        });
        JSON.registerDescendants(RetrieveAnEventForAProject200ResponseMetadata.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RetrieveAnEventForAProject200ResponseMetadata.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RetrieveAnEventForAProject200ResponseMetadataOneOf, RetrieveAnEventForAProject200ResponseMetadataOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(RetrieveAnEventForAProject200ResponseMetadataOneOf.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RetrieveAnEventForAProject200ResponseMetadataOneOf1.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RetrieveAnEventForAProject200ResponseMetadataOneOf, RetrieveAnEventForAProject200ResponseMetadataOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * RetrieveAnEventForAProject200ResponseMetadataOneOf, RetrieveAnEventForAProject200ResponseMetadataOneOf1
     *
     * @return The actual instance (RetrieveAnEventForAProject200ResponseMetadataOneOf, RetrieveAnEventForAProject200ResponseMetadataOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RetrieveAnEventForAProject200ResponseMetadataOneOf`. If the actual instance is not `RetrieveAnEventForAProject200ResponseMetadataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RetrieveAnEventForAProject200ResponseMetadataOneOf`
     * @throws ClassCastException if the instance is not `RetrieveAnEventForAProject200ResponseMetadataOneOf`
     */
    public RetrieveAnEventForAProject200ResponseMetadataOneOf getRetrieveAnEventForAProject200ResponseMetadataOneOf() throws ClassCastException {
        return (RetrieveAnEventForAProject200ResponseMetadataOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RetrieveAnEventForAProject200ResponseMetadataOneOf1`. If the actual instance is not `RetrieveAnEventForAProject200ResponseMetadataOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RetrieveAnEventForAProject200ResponseMetadataOneOf1`
     * @throws ClassCastException if the instance is not `RetrieveAnEventForAProject200ResponseMetadataOneOf1`
     */
    public RetrieveAnEventForAProject200ResponseMetadataOneOf1 getRetrieveAnEventForAProject200ResponseMetadataOneOf1() throws ClassCastException {
        return (RetrieveAnEventForAProject200ResponseMetadataOneOf1)super.getActualInstance();
    }

}

