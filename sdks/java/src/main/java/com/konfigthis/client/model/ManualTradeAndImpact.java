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
import com.konfigthis.client.model.ManualTrade;
import com.konfigthis.client.model.ManualTradeBalance;
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
 * Manual Trade and Impact object
 */
@ApiModel(description = "Manual Trade and Impact object")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ManualTradeAndImpact {
  public static final String SERIALIZED_NAME_TRADE = "trade";
  @SerializedName(SERIALIZED_NAME_TRADE)
  private ManualTrade trade;

  public static final String SERIALIZED_NAME_TRADE_IMPACTS = "trade_impacts";
  @SerializedName(SERIALIZED_NAME_TRADE_IMPACTS)
  private List<ManualTrade> tradeImpacts = null;

  public static final String SERIALIZED_NAME_COMBINED_REMAINING_BALANCE = "combined_remaining_balance";
  @SerializedName(SERIALIZED_NAME_COMBINED_REMAINING_BALANCE)
  private ManualTradeBalance combinedRemainingBalance;

  public ManualTradeAndImpact() {
  }

  public ManualTradeAndImpact trade(ManualTrade trade) {
    
    
    
    
    this.trade = trade;
    return this;
  }

   /**
   * Get trade
   * @return trade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ManualTrade getTrade() {
    return trade;
  }


  public void setTrade(ManualTrade trade) {
    
    
    
    this.trade = trade;
  }


  public ManualTradeAndImpact tradeImpacts(List<ManualTrade> tradeImpacts) {
    
    
    
    
    this.tradeImpacts = tradeImpacts;
    return this;
  }

  public ManualTradeAndImpact addTradeImpactsItem(ManualTrade tradeImpactsItem) {
    if (this.tradeImpacts == null) {
      this.tradeImpacts = new ArrayList<>();
    }
    this.tradeImpacts.add(tradeImpactsItem);
    return this;
  }

   /**
   * Get tradeImpacts
   * @return tradeImpacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ManualTrade> getTradeImpacts() {
    return tradeImpacts;
  }


  public void setTradeImpacts(List<ManualTrade> tradeImpacts) {
    
    
    
    this.tradeImpacts = tradeImpacts;
  }


  public ManualTradeAndImpact combinedRemainingBalance(ManualTradeBalance combinedRemainingBalance) {
    
    
    
    
    this.combinedRemainingBalance = combinedRemainingBalance;
    return this;
  }

   /**
   * Get combinedRemainingBalance
   * @return combinedRemainingBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ManualTradeBalance getCombinedRemainingBalance() {
    return combinedRemainingBalance;
  }


  public void setCombinedRemainingBalance(ManualTradeBalance combinedRemainingBalance) {
    
    
    
    this.combinedRemainingBalance = combinedRemainingBalance;
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
   * @return the ManualTradeAndImpact instance itself
   */
  public ManualTradeAndImpact putAdditionalProperty(String key, Object value) {
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
    ManualTradeAndImpact manualTradeAndImpact = (ManualTradeAndImpact) o;
    return Objects.equals(this.trade, manualTradeAndImpact.trade) &&
        Objects.equals(this.tradeImpacts, manualTradeAndImpact.tradeImpacts) &&
        Objects.equals(this.combinedRemainingBalance, manualTradeAndImpact.combinedRemainingBalance)&&
        Objects.equals(this.additionalProperties, manualTradeAndImpact.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trade, tradeImpacts, combinedRemainingBalance, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualTradeAndImpact {\n");
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    tradeImpacts: ").append(toIndentedString(tradeImpacts)).append("\n");
    sb.append("    combinedRemainingBalance: ").append(toIndentedString(combinedRemainingBalance)).append("\n");
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
    openapiFields.add("trade");
    openapiFields.add("trade_impacts");
    openapiFields.add("combined_remaining_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ManualTradeAndImpact
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ManualTradeAndImpact.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManualTradeAndImpact is not found in the empty JSON string", ManualTradeAndImpact.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `trade`
      if (jsonObj.get("trade") != null && !jsonObj.get("trade").isJsonNull()) {
        ManualTrade.validateJsonObject(jsonObj.getAsJsonObject("trade"));
      }
      if (jsonObj.get("trade_impacts") != null && !jsonObj.get("trade_impacts").isJsonNull()) {
        JsonArray jsonArraytradeImpacts = jsonObj.getAsJsonArray("trade_impacts");
        if (jsonArraytradeImpacts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("trade_impacts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `trade_impacts` to be an array in the JSON string but got `%s`", jsonObj.get("trade_impacts").toString()));
          }

          // validate the optional field `trade_impacts` (array)
          for (int i = 0; i < jsonArraytradeImpacts.size(); i++) {
            ManualTrade.validateJsonObject(jsonArraytradeImpacts.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `combined_remaining_balance`
      if (jsonObj.get("combined_remaining_balance") != null && !jsonObj.get("combined_remaining_balance").isJsonNull()) {
        ManualTradeBalance.validateJsonObject(jsonObj.getAsJsonObject("combined_remaining_balance"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManualTradeAndImpact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManualTradeAndImpact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManualTradeAndImpact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManualTradeAndImpact.class));

       return (TypeAdapter<T>) new TypeAdapter<ManualTradeAndImpact>() {
           @Override
           public void write(JsonWriter out, ManualTradeAndImpact value) throws IOException {
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
                 else if (entry.getValue() == null) {
                   obj.addProperty(entry.getKey(), (String) null);
                 } else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ManualTradeAndImpact read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ManualTradeAndImpact instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ManualTradeAndImpact given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManualTradeAndImpact
  * @throws IOException if the JSON string is invalid with respect to ManualTradeAndImpact
  */
  public static ManualTradeAndImpact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManualTradeAndImpact.class);
  }

 /**
  * Convert an instance of ManualTradeAndImpact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

