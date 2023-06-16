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
import com.sentry.api.client.model.ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sentry.api.client.JSON;


/**
 * ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner
 */
@JsonPropertyOrder({
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_FUNCTION,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_ERRORS,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_COL_NO,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_VARS,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_PACKAGE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_ABS_PATH,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_IN_APP,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_LINE_NO,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_MODULE,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_FILENAME,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_PLATFORM,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_INSTRUCTION_ADDR,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_CONTEXT,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_SYMBOL_ADDR,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_TRUST,
  ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.JSON_PROPERTY_SYMBOL
})
@JsonTypeName("Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data_values_inner_stacktrace_frames_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T15:28:33.253050Z[Etc/UTC]")
public class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner {
  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private String errors;

  public static final String JSON_PROPERTY_COL_NO = "colNo";
  private Integer colNo;

  public static final String JSON_PROPERTY_VARS = "vars";
  private Object vars;

  public static final String JSON_PROPERTY_PACKAGE = "package";
  private String _package;

  public static final String JSON_PROPERTY_ABS_PATH = "absPath";
  private String absPath;

  public static final String JSON_PROPERTY_IN_APP = "inApp";
  private Boolean inApp;

  public static final String JSON_PROPERTY_LINE_NO = "lineNo";
  private Integer lineNo;

  public static final String JSON_PROPERTY_MODULE = "module";
  private String module;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private String platform;

  public static final String JSON_PROPERTY_INSTRUCTION_ADDR = "instructionAddr";
  private String instructionAddr;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private List<List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner>> context = new ArrayList<>();

  public static final String JSON_PROPERTY_SYMBOL_ADDR = "symbolAddr";
  private String symbolAddr;

  public static final String JSON_PROPERTY_TRUST = "trust";
  private String trust;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner() { 
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner function(String function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFunction(String function) {
    this.function = function;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner errors(String errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrors(String errors) {
    this.errors = errors;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner colNo(Integer colNo) {
    this.colNo = colNo;
    return this;
  }

   /**
   * Get colNo
   * @return colNo
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COL_NO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getColNo() {
    return colNo;
  }


  @JsonProperty(JSON_PROPERTY_COL_NO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setColNo(Integer colNo) {
    this.colNo = colNo;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner vars(Object vars) {
    this.vars = vars;
    return this;
  }

   /**
   * Get vars
   * @return vars
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getVars() {
    return vars;
  }


  @JsonProperty(JSON_PROPERTY_VARS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVars(Object vars) {
    this.vars = vars;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner _package(String _package) {
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPackage() {
    return _package;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPackage(String _package) {
    this._package = _package;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner absPath(String absPath) {
    this.absPath = absPath;
    return this;
  }

   /**
   * Get absPath
   * @return absPath
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABS_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAbsPath() {
    return absPath;
  }


  @JsonProperty(JSON_PROPERTY_ABS_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAbsPath(String absPath) {
    this.absPath = absPath;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner inApp(Boolean inApp) {
    this.inApp = inApp;
    return this;
  }

   /**
   * Get inApp
   * @return inApp
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IN_APP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getInApp() {
    return inApp;
  }


  @JsonProperty(JSON_PROPERTY_IN_APP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInApp(Boolean inApp) {
    this.inApp = inApp;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner lineNo(Integer lineNo) {
    this.lineNo = lineNo;
    return this;
  }

   /**
   * Get lineNo
   * @return lineNo
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LINE_NO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLineNo() {
    return lineNo;
  }


  @JsonProperty(JSON_PROPERTY_LINE_NO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLineNo(Integer lineNo) {
    this.lineNo = lineNo;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner module(String module) {
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getModule() {
    return module;
  }


  @JsonProperty(JSON_PROPERTY_MODULE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setModule(String module) {
    this.module = module;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilename() {
    return filename;
  }


  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner instructionAddr(String instructionAddr) {
    this.instructionAddr = instructionAddr;
    return this;
  }

   /**
   * Get instructionAddr
   * @return instructionAddr
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSTRUCTION_ADDR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstructionAddr() {
    return instructionAddr;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUCTION_ADDR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstructionAddr(String instructionAddr) {
    this.instructionAddr = instructionAddr;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner context(List<List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner>> context) {
    this.context = context;
    return this;
  }

  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner addContextItem(List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner> contextItem) {
    if (this.context == null) {
      this.context = new ArrayList<>();
    }
    this.context.add(contextItem);
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner>> getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContext(List<List<ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInnerContextInnerInner>> context) {
    this.context = context;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner symbolAddr(String symbolAddr) {
    this.symbolAddr = symbolAddr;
    return this;
  }

   /**
   * Get symbolAddr
   * @return symbolAddr
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYMBOL_ADDR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbolAddr() {
    return symbolAddr;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL_ADDR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbolAddr(String symbolAddr) {
    this.symbolAddr = symbolAddr;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner trust(String trust) {
    this.trust = trust;
    return this;
  }

   /**
   * Get trust
   * @return trust
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRUST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTrust() {
    return trust;
  }


  @JsonProperty(JSON_PROPERTY_TRUST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrust(String trust) {
    this.trust = trust;
  }


  public ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  /**
   * Return true if this Resolve_an_Event_ID_200_response_event_entries_inner_anyOf_3_data_values_inner_stacktrace_frames_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner = (ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner) o;
    return Objects.equals(this.function, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.function) &&
        Objects.equals(this.errors, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.errors) &&
        Objects.equals(this.colNo, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.colNo) &&
        Objects.equals(this.vars, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.vars) &&
        Objects.equals(this._package, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner._package) &&
        Objects.equals(this.absPath, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.absPath) &&
        Objects.equals(this.inApp, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.inApp) &&
        Objects.equals(this.lineNo, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.lineNo) &&
        Objects.equals(this.module, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.module) &&
        Objects.equals(this.filename, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.filename) &&
        Objects.equals(this.platform, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.platform) &&
        Objects.equals(this.instructionAddr, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.instructionAddr) &&
        Objects.equals(this.context, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.context) &&
        Objects.equals(this.symbolAddr, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.symbolAddr) &&
        Objects.equals(this.trust, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.trust) &&
        Objects.equals(this.symbol, resolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(function, errors, colNo, vars, _package, absPath, inApp, lineNo, module, filename, platform, instructionAddr, context, symbolAddr, trust, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResolveAnEventID200ResponseEventEntriesInnerAnyOf3DataValuesInnerStacktraceFramesInner {\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    colNo: ").append(toIndentedString(colNo)).append("\n");
    sb.append("    vars: ").append(toIndentedString(vars)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    absPath: ").append(toIndentedString(absPath)).append("\n");
    sb.append("    inApp: ").append(toIndentedString(inApp)).append("\n");
    sb.append("    lineNo: ").append(toIndentedString(lineNo)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    instructionAddr: ").append(toIndentedString(instructionAddr)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    symbolAddr: ").append(toIndentedString(symbolAddr)).append("\n");
    sb.append("    trust: ").append(toIndentedString(trust)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

