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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf1;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf2;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3;
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3Data;
import java.io.IOException;
import java.io.Serializable;

import jakarta.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.sentry.api.client.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T10:13:02.301928Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInner extends AbstractOpenApiSchema, Serializable {
    private static final Logger log = Logger.getLogger(ResolveAnEventID200ResponseEventEntriesInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ResolveAnEventID200ResponseEventEntriesInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ResolveAnEventID200ResponseEventEntriesInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOf> adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventEntriesInnerAnyOf.class));
            final TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOf1> adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf1 = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventEntriesInnerAnyOf1.class));
            final TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOf2> adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf2 = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.class));
            final TypeAdapter<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3> adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf3 = gson.getDelegateAdapter(this, TypeToken.get(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3.class));

            return (TypeAdapter<T>) new TypeAdapter<ResolveAnEventID200ResponseEventEntriesInner>() {
                @Override
                public void write(JsonWriter out, ResolveAnEventID200ResponseEventEntriesInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ResolveAnEventID200ResponseEventEntriesInnerAnyOf`
                    if (value.getActualInstance() instanceof ResolveAnEventID200ResponseEventEntriesInnerAnyOf) {
                        JsonObject obj = adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf.toJsonTree((ResolveAnEventID200ResponseEventEntriesInnerAnyOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ResolveAnEventID200ResponseEventEntriesInnerAnyOf1`
                    if (value.getActualInstance() instanceof ResolveAnEventID200ResponseEventEntriesInnerAnyOf1) {
                        JsonObject obj = adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf1.toJsonTree((ResolveAnEventID200ResponseEventEntriesInnerAnyOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ResolveAnEventID200ResponseEventEntriesInnerAnyOf2`
                    if (value.getActualInstance() instanceof ResolveAnEventID200ResponseEventEntriesInnerAnyOf2) {
                        JsonObject obj = adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf2.toJsonTree((ResolveAnEventID200ResponseEventEntriesInnerAnyOf2)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ResolveAnEventID200ResponseEventEntriesInnerAnyOf3`
                    if (value.getActualInstance() instanceof ResolveAnEventID200ResponseEventEntriesInnerAnyOf3) {
                        JsonObject obj = adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf3.toJsonTree((ResolveAnEventID200ResponseEventEntriesInnerAnyOf3)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: ResolveAnEventID200ResponseEventEntriesInnerAnyOf, ResolveAnEventID200ResponseEventEntriesInnerAnyOf1, ResolveAnEventID200ResponseEventEntriesInnerAnyOf2, ResolveAnEventID200ResponseEventEntriesInnerAnyOf3");
                }

                @Override
                public ResolveAnEventID200ResponseEventEntriesInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize ResolveAnEventID200ResponseEventEntriesInnerAnyOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ResolveAnEventID200ResponseEventEntriesInnerAnyOf.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf'");
                        ResolveAnEventID200ResponseEventEntriesInner ret = new ResolveAnEventID200ResponseEventEntriesInner();
                        ret.setActualInstance(adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf'", e);
                    }

                    // deserialize ResolveAnEventID200ResponseEventEntriesInnerAnyOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ResolveAnEventID200ResponseEventEntriesInnerAnyOf1.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf1'");
                        ResolveAnEventID200ResponseEventEntriesInner ret = new ResolveAnEventID200ResponseEventEntriesInner();
                        ret.setActualInstance(adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf1.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf1'", e);
                    }

                    // deserialize ResolveAnEventID200ResponseEventEntriesInnerAnyOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf2'");
                        ResolveAnEventID200ResponseEventEntriesInner ret = new ResolveAnEventID200ResponseEventEntriesInner();
                        ret.setActualInstance(adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf2.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf2'", e);
                    }

                    // deserialize ResolveAnEventID200ResponseEventEntriesInnerAnyOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ResolveAnEventID200ResponseEventEntriesInnerAnyOf3.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf3'");
                        ResolveAnEventID200ResponseEventEntriesInner ret = new ResolveAnEventID200ResponseEventEntriesInner();
                        ret.setActualInstance(adapterResolveAnEventID200ResponseEventEntriesInnerAnyOf3.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ResolveAnEventID200ResponseEventEntriesInnerAnyOf3'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for ResolveAnEventID200ResponseEventEntriesInner: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ResolveAnEventID200ResponseEventEntriesInner() {
        super("anyOf", Boolean.FALSE);
    }

    public ResolveAnEventID200ResponseEventEntriesInner(ResolveAnEventID200ResponseEventEntriesInnerAnyOf o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ResolveAnEventID200ResponseEventEntriesInner(ResolveAnEventID200ResponseEventEntriesInnerAnyOf1 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ResolveAnEventID200ResponseEventEntriesInner(ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ResolveAnEventID200ResponseEventEntriesInner(ResolveAnEventID200ResponseEventEntriesInnerAnyOf3 o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ResolveAnEventID200ResponseEventEntriesInnerAnyOf", new GenericType<ResolveAnEventID200ResponseEventEntriesInnerAnyOf>() {
        });
        schemas.put("ResolveAnEventID200ResponseEventEntriesInnerAnyOf1", new GenericType<ResolveAnEventID200ResponseEventEntriesInnerAnyOf1>() {
        });
        schemas.put("ResolveAnEventID200ResponseEventEntriesInnerAnyOf2", new GenericType<ResolveAnEventID200ResponseEventEntriesInnerAnyOf2>() {
        });
        schemas.put("ResolveAnEventID200ResponseEventEntriesInnerAnyOf3", new GenericType<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ResolveAnEventID200ResponseEventEntriesInner.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * ResolveAnEventID200ResponseEventEntriesInnerAnyOf, ResolveAnEventID200ResponseEventEntriesInnerAnyOf1, ResolveAnEventID200ResponseEventEntriesInnerAnyOf2, ResolveAnEventID200ResponseEventEntriesInnerAnyOf3
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ResolveAnEventID200ResponseEventEntriesInnerAnyOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ResolveAnEventID200ResponseEventEntriesInnerAnyOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ResolveAnEventID200ResponseEventEntriesInnerAnyOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ResolveAnEventID200ResponseEventEntriesInnerAnyOf3) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ResolveAnEventID200ResponseEventEntriesInnerAnyOf, ResolveAnEventID200ResponseEventEntriesInnerAnyOf1, ResolveAnEventID200ResponseEventEntriesInnerAnyOf2, ResolveAnEventID200ResponseEventEntriesInnerAnyOf3");
    }

    /**
     * Get the actual instance, which can be the following:
     * ResolveAnEventID200ResponseEventEntriesInnerAnyOf, ResolveAnEventID200ResponseEventEntriesInnerAnyOf1, ResolveAnEventID200ResponseEventEntriesInnerAnyOf2, ResolveAnEventID200ResponseEventEntriesInnerAnyOf3
     *
     * @return The actual instance (ResolveAnEventID200ResponseEventEntriesInnerAnyOf, ResolveAnEventID200ResponseEventEntriesInnerAnyOf1, ResolveAnEventID200ResponseEventEntriesInnerAnyOf2, ResolveAnEventID200ResponseEventEntriesInnerAnyOf3)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ResolveAnEventID200ResponseEventEntriesInnerAnyOf`. If the actual instance is not `ResolveAnEventID200ResponseEventEntriesInnerAnyOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ResolveAnEventID200ResponseEventEntriesInnerAnyOf`
     * @throws ClassCastException if the instance is not `ResolveAnEventID200ResponseEventEntriesInnerAnyOf`
     */
    public ResolveAnEventID200ResponseEventEntriesInnerAnyOf getResolveAnEventID200ResponseEventEntriesInnerAnyOf() throws ClassCastException {
        return (ResolveAnEventID200ResponseEventEntriesInnerAnyOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ResolveAnEventID200ResponseEventEntriesInnerAnyOf1`. If the actual instance is not `ResolveAnEventID200ResponseEventEntriesInnerAnyOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ResolveAnEventID200ResponseEventEntriesInnerAnyOf1`
     * @throws ClassCastException if the instance is not `ResolveAnEventID200ResponseEventEntriesInnerAnyOf1`
     */
    public ResolveAnEventID200ResponseEventEntriesInnerAnyOf1 getResolveAnEventID200ResponseEventEntriesInnerAnyOf1() throws ClassCastException {
        return (ResolveAnEventID200ResponseEventEntriesInnerAnyOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ResolveAnEventID200ResponseEventEntriesInnerAnyOf2`. If the actual instance is not `ResolveAnEventID200ResponseEventEntriesInnerAnyOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ResolveAnEventID200ResponseEventEntriesInnerAnyOf2`
     * @throws ClassCastException if the instance is not `ResolveAnEventID200ResponseEventEntriesInnerAnyOf2`
     */
    public ResolveAnEventID200ResponseEventEntriesInnerAnyOf2 getResolveAnEventID200ResponseEventEntriesInnerAnyOf2() throws ClassCastException {
        return (ResolveAnEventID200ResponseEventEntriesInnerAnyOf2)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ResolveAnEventID200ResponseEventEntriesInnerAnyOf3`. If the actual instance is not `ResolveAnEventID200ResponseEventEntriesInnerAnyOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ResolveAnEventID200ResponseEventEntriesInnerAnyOf3`
     * @throws ClassCastException if the instance is not `ResolveAnEventID200ResponseEventEntriesInnerAnyOf3`
     */
    public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3 getResolveAnEventID200ResponseEventEntriesInnerAnyOf3() throws ClassCastException {
        return (ResolveAnEventID200ResponseEventEntriesInnerAnyOf3)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResolveAnEventID200ResponseEventEntriesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with ResolveAnEventID200ResponseEventEntriesInnerAnyOf
    try {
      ResolveAnEventID200ResponseEventEntriesInnerAnyOf.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ResolveAnEventID200ResponseEventEntriesInnerAnyOf1
    try {
      ResolveAnEventID200ResponseEventEntriesInnerAnyOf1.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ResolveAnEventID200ResponseEventEntriesInnerAnyOf2
    try {
      ResolveAnEventID200ResponseEventEntriesInnerAnyOf2.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ResolveAnEventID200ResponseEventEntriesInnerAnyOf3
    try {
      ResolveAnEventID200ResponseEventEntriesInnerAnyOf3.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for ResolveAnEventID200ResponseEventEntriesInner with anyOf schemas: ResolveAnEventID200ResponseEventEntriesInnerAnyOf, ResolveAnEventID200ResponseEventEntriesInnerAnyOf1, ResolveAnEventID200ResponseEventEntriesInnerAnyOf2, ResolveAnEventID200ResponseEventEntriesInnerAnyOf3. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ResolveAnEventID200ResponseEventEntriesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResolveAnEventID200ResponseEventEntriesInner
  * @throws IOException if the JSON string is invalid with respect to ResolveAnEventID200ResponseEventEntriesInner
  */
  public static ResolveAnEventID200ResponseEventEntriesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResolveAnEventID200ResponseEventEntriesInner.class);
  }

 /**
  * Convert an instance of ResolveAnEventID200ResponseEventEntriesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

