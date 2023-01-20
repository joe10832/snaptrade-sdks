/*
 * SnapTrade
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.OptionStrategyLegsInner;
import com.konfigthis.client.model.UniversalSymbol;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * OptionStrategy
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OptionStrategy {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_UNDERLYING_SYMBOL_ID = "underlying_symbol_id";
  @SerializedName(SERIALIZED_NAME_UNDERLYING_SYMBOL_ID)
  private UniversalSymbol underlyingSymbolId;

  public static final String SERIALIZED_NAME_STRATEGY_TYPE = "strategy_type";
  @SerializedName(SERIALIZED_NAME_STRATEGY_TYPE)
  private String strategyType;

  public static final String SERIALIZED_NAME_NUMBER_OF_LEGS = "number_of_legs";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_LEGS)
  private BigDecimal numberOfLegs;

  public static final String SERIALIZED_NAME_LEGS = "legs";
  @SerializedName(SERIALIZED_NAME_LEGS)
  private List<OptionStrategyLegsInner> legs = null;

  public OptionStrategy() {
  }

  public OptionStrategy id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2bcd7cc3-e922-4976-bce1-9858296801c3", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public OptionStrategy underlyingSymbolId(UniversalSymbol underlyingSymbolId) {
    
    this.underlyingSymbolId = underlyingSymbolId;
    return this;
  }

   /**
   * Get underlyingSymbolId
   * @return underlyingSymbolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UniversalSymbol getUnderlyingSymbolId() {
    return underlyingSymbolId;
  }


  public void setUnderlyingSymbolId(UniversalSymbol underlyingSymbolId) {
    this.underlyingSymbolId = underlyingSymbolId;
  }


  public OptionStrategy strategyType(String strategyType) {
    
    this.strategyType = strategyType;
    return this;
  }

   /**
   * Get strategyType
   * @return strategyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BUTTERFLY", value = "")

  public String getStrategyType() {
    return strategyType;
  }


  public void setStrategyType(String strategyType) {
    this.strategyType = strategyType;
  }


  public OptionStrategy numberOfLegs(BigDecimal numberOfLegs) {
    
    this.numberOfLegs = numberOfLegs;
    return this;
  }

   /**
   * Get numberOfLegs
   * @return numberOfLegs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public BigDecimal getNumberOfLegs() {
    return numberOfLegs;
  }


  public void setNumberOfLegs(BigDecimal numberOfLegs) {
    this.numberOfLegs = numberOfLegs;
  }


  public OptionStrategy legs(List<OptionStrategyLegsInner> legs) {
    
    this.legs = legs;
    return this;
  }

  public OptionStrategy addLegsItem(OptionStrategyLegsInner legsItem) {
    if (this.legs == null) {
      this.legs = new ArrayList<>();
    }
    this.legs.add(legsItem);
    return this;
  }

   /**
   * Get legs
   * @return legs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OptionStrategyLegsInner> getLegs() {
    return legs;
  }


  public void setLegs(List<OptionStrategyLegsInner> legs) {
    this.legs = legs;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the OptionStrategy instance itself
   */
  public OptionStrategy putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionStrategy optionStrategy = (OptionStrategy) o;
    return Objects.equals(this.id, optionStrategy.id) &&
        Objects.equals(this.underlyingSymbolId, optionStrategy.underlyingSymbolId) &&
        Objects.equals(this.strategyType, optionStrategy.strategyType) &&
        Objects.equals(this.numberOfLegs, optionStrategy.numberOfLegs) &&
        Objects.equals(this.legs, optionStrategy.legs)&&
        Objects.equals(this.additionalProperties, optionStrategy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, underlyingSymbolId, strategyType, numberOfLegs, legs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionStrategy {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    underlyingSymbolId: ").append(toIndentedString(underlyingSymbolId)).append("\n");
    sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
    sb.append("    numberOfLegs: ").append(toIndentedString(numberOfLegs)).append("\n");
    sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("underlying_symbol_id");
    openapiFields.add("strategy_type");
    openapiFields.add("number_of_legs");
    openapiFields.add("legs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OptionStrategy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OptionStrategy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptionStrategy is not found in the empty JSON string", OptionStrategy.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `underlying_symbol_id`
      if (jsonObj.get("underlying_symbol_id") != null && !jsonObj.get("underlying_symbol_id").isJsonNull()) {
        UniversalSymbol.validateJsonObject(jsonObj.getAsJsonObject("underlying_symbol_id"));
      }
      if ((jsonObj.get("strategy_type") != null && !jsonObj.get("strategy_type").isJsonNull()) && !jsonObj.get("strategy_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strategy_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strategy_type").toString()));
      }
      if (jsonObj.get("legs") != null && !jsonObj.get("legs").isJsonNull()) {
        JsonArray jsonArraylegs = jsonObj.getAsJsonArray("legs");
        if (jsonArraylegs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("legs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `legs` to be an array in the JSON string but got `%s`", jsonObj.get("legs").toString()));
          }

          // validate the optional field `legs` (array)
          for (int i = 0; i < jsonArraylegs.size(); i++) {
            OptionStrategyLegsInner.validateJsonObject(jsonArraylegs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptionStrategy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptionStrategy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptionStrategy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptionStrategy.class));

       return (TypeAdapter<T>) new TypeAdapter<OptionStrategy>() {
           @Override
           public void write(JsonWriter out, OptionStrategy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public OptionStrategy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OptionStrategy instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OptionStrategy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptionStrategy
  * @throws IOException if the JSON string is invalid with respect to OptionStrategy
  */
  public static OptionStrategy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptionStrategy.class);
  }

 /**
  * Convert an instance of OptionStrategy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

