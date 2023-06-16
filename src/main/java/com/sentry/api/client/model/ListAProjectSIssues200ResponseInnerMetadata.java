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
import com.sentry.api.client.model.ListAProjectSIssues200ResponseInnerMetadataOneOf;
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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:22:58.941842Z[Etc/UTC]")
@JsonDeserialize(using = ListAProjectSIssues200ResponseInnerMetadata.ListAProjectSIssues200ResponseInnerMetadataDeserializer.class)
@JsonSerialize(using = ListAProjectSIssues200ResponseInnerMetadata.ListAProjectSIssues200ResponseInnerMetadataSerializer.class)
public class ListAProjectSIssues200ResponseInnerMetadata extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ListAProjectSIssues200ResponseInnerMetadata.class.getName());

    public static class ListAProjectSIssues200ResponseInnerMetadataSerializer extends StdSerializer<ListAProjectSIssues200ResponseInnerMetadata> {
        public ListAProjectSIssues200ResponseInnerMetadataSerializer(Class<ListAProjectSIssues200ResponseInnerMetadata> t) {
            super(t);
        }

        public ListAProjectSIssues200ResponseInnerMetadataSerializer() {
            this(null);
        }

        @Override
        public void serialize(ListAProjectSIssues200ResponseInnerMetadata value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class ListAProjectSIssues200ResponseInnerMetadataDeserializer extends StdDeserializer<ListAProjectSIssues200ResponseInnerMetadata> {
        public ListAProjectSIssues200ResponseInnerMetadataDeserializer() {
            this(ListAProjectSIssues200ResponseInnerMetadata.class);
        }

        public ListAProjectSIssues200ResponseInnerMetadataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public ListAProjectSIssues200ResponseInnerMetadata deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ListAProjectSIssues200ResponseInnerMetadataOneOf
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Integer.class) || ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Long.class) || ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Float.class) || ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Double.class) || ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Boolean.class) || ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Integer.class) || ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Float.class) || ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ListAProjectSIssues200ResponseInnerMetadataOneOf.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ListAProjectSIssues200ResponseInnerMetadataOneOf.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ListAProjectSIssues200ResponseInnerMetadataOneOf'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ListAProjectSIssues200ResponseInnerMetadataOneOf'", e);
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
                ListAProjectSIssues200ResponseInnerMetadata ret = new ListAProjectSIssues200ResponseInnerMetadata();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for ListAProjectSIssues200ResponseInnerMetadata: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public ListAProjectSIssues200ResponseInnerMetadata getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "ListAProjectSIssues200ResponseInnerMetadata cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<>();

    public ListAProjectSIssues200ResponseInnerMetadata() {
        super("oneOf", Boolean.FALSE);
    }

    public ListAProjectSIssues200ResponseInnerMetadata(ListAProjectSIssues200ResponseInnerMetadataOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ListAProjectSIssues200ResponseInnerMetadata(RetrieveAnEventForAProject200ResponseMetadataOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ListAProjectSIssues200ResponseInnerMetadataOneOf", new GenericType<ListAProjectSIssues200ResponseInnerMetadataOneOf>() {
        });
        schemas.put("RetrieveAnEventForAProject200ResponseMetadataOneOf1", new GenericType<RetrieveAnEventForAProject200ResponseMetadataOneOf1>() {
        });
        JSON.registerDescendants(ListAProjectSIssues200ResponseInnerMetadata.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ListAProjectSIssues200ResponseInnerMetadata.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ListAProjectSIssues200ResponseInnerMetadataOneOf, RetrieveAnEventForAProject200ResponseMetadataOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(ListAProjectSIssues200ResponseInnerMetadataOneOf.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(RetrieveAnEventForAProject200ResponseMetadataOneOf1.class, instance, new HashSet<>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ListAProjectSIssues200ResponseInnerMetadataOneOf, RetrieveAnEventForAProject200ResponseMetadataOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * ListAProjectSIssues200ResponseInnerMetadataOneOf, RetrieveAnEventForAProject200ResponseMetadataOneOf1
     *
     * @return The actual instance (ListAProjectSIssues200ResponseInnerMetadataOneOf, RetrieveAnEventForAProject200ResponseMetadataOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListAProjectSIssues200ResponseInnerMetadataOneOf`. If the actual instance is not `ListAProjectSIssues200ResponseInnerMetadataOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListAProjectSIssues200ResponseInnerMetadataOneOf`
     * @throws ClassCastException if the instance is not `ListAProjectSIssues200ResponseInnerMetadataOneOf`
     */
    public ListAProjectSIssues200ResponseInnerMetadataOneOf getListAProjectSIssues200ResponseInnerMetadataOneOf() throws ClassCastException {
        return (ListAProjectSIssues200ResponseInnerMetadataOneOf)super.getActualInstance();
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

