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
import com.konfigthis.client.model.OptionChainInnerChainPerRootInnerChainPerStrikePriceInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * OptionChainInnerChainPerRootInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OptionChainInnerChainPerRootInner {
  public static final String SERIALIZED_NAME_OPTION_ROOT = "optionRoot";
  @SerializedName(SERIALIZED_NAME_OPTION_ROOT)
  private String optionRoot;

  public static final String SERIALIZED_NAME_CHAIN_PER_STRIKE_PRICE = "chainPerStrikePrice";
  @SerializedName(SERIALIZED_NAME_CHAIN_PER_STRIKE_PRICE)
  private List<OptionChainInnerChainPerRootInnerChainPerStrikePriceInner> chainPerStrikePrice = null;

  public static final String SERIALIZED_NAME_MULTIPLIER = "multiplier";
  @SerializedName(SERIALIZED_NAME_MULTIPLIER)
  private Integer multiplier;

  public OptionChainInnerChainPerRootInner() {
  }

  public OptionChainInnerChainPerRootInner optionRoot(String optionRoot) {
    
    
    
    
    this.optionRoot = optionRoot;
    return this;
  }

   /**
   * Get optionRoot
   * @return optionRoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAPL", value = "")

  public String getOptionRoot() {
    return optionRoot;
  }


  public void setOptionRoot(String optionRoot) {
    
    
    
    this.optionRoot = optionRoot;
  }


  public OptionChainInnerChainPerRootInner chainPerStrikePrice(List<OptionChainInnerChainPerRootInnerChainPerStrikePriceInner> chainPerStrikePrice) {
    
    
    
    
    this.chainPerStrikePrice = chainPerStrikePrice;
    return this;
  }

  public OptionChainInnerChainPerRootInner addChainPerStrikePriceItem(OptionChainInnerChainPerRootInnerChainPerStrikePriceInner chainPerStrikePriceItem) {
    if (this.chainPerStrikePrice == null) {
      this.chainPerStrikePrice = new ArrayList<>();
    }
    this.chainPerStrikePrice.add(chainPerStrikePriceItem);
    return this;
  }

   /**
   * Get chainPerStrikePrice
   * @return chainPerStrikePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OptionChainInnerChainPerRootInnerChainPerStrikePriceInner> getChainPerStrikePrice() {
    return chainPerStrikePrice;
  }


  public void setChainPerStrikePrice(List<OptionChainInnerChainPerRootInnerChainPerStrikePriceInner> chainPerStrikePrice) {
    
    
    
    this.chainPerStrikePrice = chainPerStrikePrice;
  }


  public OptionChainInnerChainPerRootInner multiplier(Integer multiplier) {
    
    
    
    
    this.multiplier = multiplier;
    return this;
  }

   /**
   * Get multiplier
   * @return multiplier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public Integer getMultiplier() {
    return multiplier;
  }


  public void setMultiplier(Integer multiplier) {
    
    
    
    this.multiplier = multiplier;
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
   * @return the OptionChainInnerChainPerRootInner instance itself
   */
  public OptionChainInnerChainPerRootInner putAdditionalProperty(String key, Object value) {
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
    OptionChainInnerChainPerRootInner optionChainInnerChainPerRootInner = (OptionChainInnerChainPerRootInner) o;
    return Objects.equals(this.optionRoot, optionChainInnerChainPerRootInner.optionRoot) &&
        Objects.equals(this.chainPerStrikePrice, optionChainInnerChainPerRootInner.chainPerStrikePrice) &&
        Objects.equals(this.multiplier, optionChainInnerChainPerRootInner.multiplier)&&
        Objects.equals(this.additionalProperties, optionChainInnerChainPerRootInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionRoot, chainPerStrikePrice, multiplier, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionChainInnerChainPerRootInner {\n");
    sb.append("    optionRoot: ").append(toIndentedString(optionRoot)).append("\n");
    sb.append("    chainPerStrikePrice: ").append(toIndentedString(chainPerStrikePrice)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
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
    openapiFields.add("optionRoot");
    openapiFields.add("chainPerStrikePrice");
    openapiFields.add("multiplier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OptionChainInnerChainPerRootInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OptionChainInnerChainPerRootInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptionChainInnerChainPerRootInner is not found in the empty JSON string", OptionChainInnerChainPerRootInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("optionRoot") != null && !jsonObj.get("optionRoot").isJsonNull()) && !jsonObj.get("optionRoot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionRoot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionRoot").toString()));
      }
      if (jsonObj.get("chainPerStrikePrice") != null && !jsonObj.get("chainPerStrikePrice").isJsonNull()) {
        JsonArray jsonArraychainPerStrikePrice = jsonObj.getAsJsonArray("chainPerStrikePrice");
        if (jsonArraychainPerStrikePrice != null) {
          // ensure the json data is an array
          if (!jsonObj.get("chainPerStrikePrice").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `chainPerStrikePrice` to be an array in the JSON string but got `%s`", jsonObj.get("chainPerStrikePrice").toString()));
          }

          // validate the optional field `chainPerStrikePrice` (array)
          for (int i = 0; i < jsonArraychainPerStrikePrice.size(); i++) {
            OptionChainInnerChainPerRootInnerChainPerStrikePriceInner.validateJsonObject(jsonArraychainPerStrikePrice.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptionChainInnerChainPerRootInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptionChainInnerChainPerRootInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptionChainInnerChainPerRootInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptionChainInnerChainPerRootInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OptionChainInnerChainPerRootInner>() {
           @Override
           public void write(JsonWriter out, OptionChainInnerChainPerRootInner value) throws IOException {
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
           public OptionChainInnerChainPerRootInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OptionChainInnerChainPerRootInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OptionChainInnerChainPerRootInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptionChainInnerChainPerRootInner
  * @throws IOException if the JSON string is invalid with respect to OptionChainInnerChainPerRootInner
  */
  public static OptionChainInnerChainPerRootInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptionChainInnerChainPerRootInner.class);
  }

 /**
  * Convert an instance of OptionChainInnerChainPerRootInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

