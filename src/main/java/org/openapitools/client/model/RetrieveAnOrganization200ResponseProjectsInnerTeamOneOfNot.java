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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import java.io.Serializable;

import javax.ws.rs.core.GenericType;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-15T09:39:48.475487Z[Etc/UTC]")
public class RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot extends AbstractOpenApiSchema, Serializable {
    private static final Logger log = Logger.getLogger(RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BigDecimal> adapterBigDecimal = gson.getDelegateAdapter(this, TypeToken.get(BigDecimal.class));
            final TypeAdapter<Boolean> adapterBoolean = gson.getDelegateAdapter(this, TypeToken.get(Boolean.class));
            final TypeAdapter<List&lt;Object&gt;> adapterList&lt;Object&gt; = gson.getDelegateAdapter(this, TypeToken.get(List&lt;Object&gt;.class));
            final TypeAdapter<Object> adapterObject = gson.getDelegateAdapter(this, TypeToken.get(Object.class));
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            return (TypeAdapter<T>) new TypeAdapter<RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot>() {
                @Override
                public void write(JsonWriter out, RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BigDecimal`
                    if (value.getActualInstance() instanceof BigDecimal) {
                        JsonObject obj = adapterBigDecimal.toJsonTree((BigDecimal)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `Boolean`
                    if (value.getActualInstance() instanceof Boolean) {
                        JsonObject obj = adapterBoolean.toJsonTree((Boolean)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `List&lt;Object&gt;`
                    if (value.getActualInstance() instanceof List&lt;Object&gt;) {
                        JsonObject obj = adapterList&lt;Object&gt;.toJsonTree((List&lt;Object&gt;)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `Object`
                    if (value.getActualInstance() instanceof Object) {
                        JsonObject obj = adapterObject.toJsonTree((Object)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonObject obj = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: BigDecimal, Boolean, List<Object>, Object, String");
                }

                @Override
                public RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize BigDecimal
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BigDecimal.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'BigDecimal'");
                        RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot ret = new RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot();
                        ret.setActualInstance(adapterBigDecimal.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'BigDecimal'", e);
                    }

                    // deserialize Boolean
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Boolean.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'Boolean'");
                        RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot ret = new RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot();
                        ret.setActualInstance(adapterBoolean.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'Boolean'", e);
                    }

                    // deserialize List<Object>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        List&lt;Object&gt;.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'List<Object>'");
                        RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot ret = new RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot();
                        ret.setActualInstance(adapterList&lt;Object&gt;.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'List<Object>'", e);
                    }

                    // deserialize Object
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Object.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'Object'");
                        RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot ret = new RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot();
                        ret.setActualInstance(adapterObject.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'Object'", e);
                    }

                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        String.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'String'");
                        RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot ret = new RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot();
                        ret.setActualInstance(adapterString.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot() {
        super("anyOf", Boolean.FALSE);
    }

    public RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot(BigDecimal o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot(Boolean o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot(List<Object> o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot(String o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BigDecimal", new GenericType<BigDecimal>() {
        });
        schemas.put("Boolean", new GenericType<Boolean>() {
        });
        schemas.put("List<Object>", new GenericType<List<Object>>() {
        });
        schemas.put("Object", new GenericType<Object>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * BigDecimal, Boolean, List<Object>, Object, String
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BigDecimal) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Boolean) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<Object>) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Object) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BigDecimal, Boolean, List<Object>, Object, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * BigDecimal, Boolean, List<Object>, Object, String
     *
     * @return The actual instance (BigDecimal, Boolean, List<Object>, Object, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BigDecimal`. If the actual instance is not `BigDecimal`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BigDecimal`
     * @throws ClassCastException if the instance is not `BigDecimal`
     */
    public BigDecimal getBigDecimal() throws ClassCastException {
        return (BigDecimal)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Boolean`. If the actual instance is not `Boolean`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Boolean`
     * @throws ClassCastException if the instance is not `Boolean`
     */
    public Boolean getBoolean() throws ClassCastException {
        return (Boolean)super.getActualInstance();
    }

    /**
     * Get the actual instance of `List<Object>`. If the actual instance is not `List<Object>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<Object>`
     * @throws ClassCastException if the instance is not `List<Object>`
     */
    public List<Object> getList<Object>() throws ClassCastException {
        return (List<Object>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Object`. If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object)super.getActualInstance();
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


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with BigDecimal
    try {
      BigDecimal.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with Boolean
    try {
      Boolean.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with List<Object>
    try {
      List<Object>.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with Object
    try {
      Object.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with String
    try {
      String.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot with anyOf schemas: BigDecimal, Boolean, List<Object>, Object, String. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot
  * @throws IOException if the JSON string is invalid with respect to RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot
  */
  public static RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot.class);
  }

 /**
  * Convert an instance of RetrieveAnOrganization200ResponseProjectsInnerTeamOneOfNot to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

