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
import com.konfigthis.client.model.Brokerage;
import com.konfigthis.client.model.BrokerageAuthorization;
import com.konfigthis.client.model.BrokerageSymbol;
import com.konfigthis.client.model.BrokerageSymbolOptionSymbol;
import com.konfigthis.client.model.BrokerageSymbolSymbol;
import com.konfigthis.client.model.BrokerageType;
import com.konfigthis.client.model.OptionsPositionCurrency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Option Holdings
 */
@ApiModel(description = "Option Holdings")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OptionsPosition {
  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private BrokerageSymbol symbol;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_UNITS = "units";
  @SerializedName(SERIALIZED_NAME_UNITS)
  private Double units;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private OptionsPositionCurrency currency;

  public static final String SERIALIZED_NAME_AVERAGE_PURCHASE_PRICE = "average_purchase_price";
  @SerializedName(SERIALIZED_NAME_AVERAGE_PURCHASE_PRICE)
  private Double averagePurchasePrice;

  public OptionsPosition() {
  }

  public OptionsPosition symbol(BrokerageSymbol symbol) {
    
    
    
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BrokerageSymbol getSymbol() {
    return symbol;
  }


  public void setSymbol(BrokerageSymbol symbol) {
    
    
    
    this.symbol = symbol;
  }


  public OptionsPosition price(Double price) {
    
    
    
    
    this.price = price;
    return this;
  }

  public OptionsPosition price(Integer price) {
    
    
    
    
    this.price = price.doubleValue();
    return this;
  }

   /**
   * Trade Price if limit or stop limit order
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31.33", value = "Trade Price if limit or stop limit order")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    
    
    
    this.price = price;
  }


  public OptionsPosition units(Double units) {
    
    
    
    
    this.units = units;
    return this;
  }

  public OptionsPosition units(Integer units) {
    
    
    
    
    this.units = units.doubleValue();
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")

  public Double getUnits() {
    return units;
  }


  public void setUnits(Double units) {
    
    
    
    this.units = units;
  }


  public OptionsPosition currency(OptionsPositionCurrency currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OptionsPositionCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(OptionsPositionCurrency currency) {
    
    
    
    this.currency = currency;
  }


  public OptionsPosition averagePurchasePrice(Double averagePurchasePrice) {
    
    
    
    
    this.averagePurchasePrice = averagePurchasePrice;
    return this;
  }

  public OptionsPosition averagePurchasePrice(Integer averagePurchasePrice) {
    
    
    
    
    this.averagePurchasePrice = averagePurchasePrice.doubleValue();
    return this;
  }

   /**
   * Average purchase price for this position
   * @return averagePurchasePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "108.3353", value = "Average purchase price for this position")

  public Double getAveragePurchasePrice() {
    return averagePurchasePrice;
  }


  public void setAveragePurchasePrice(Double averagePurchasePrice) {
    
    
    
    this.averagePurchasePrice = averagePurchasePrice;
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
   * @return the OptionsPosition instance itself
   */
  public OptionsPosition putAdditionalProperty(String key, Object value) {
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
    OptionsPosition optionsPosition = (OptionsPosition) o;
    return Objects.equals(this.symbol, optionsPosition.symbol) &&
        Objects.equals(this.price, optionsPosition.price) &&
        Objects.equals(this.units, optionsPosition.units) &&
        Objects.equals(this.currency, optionsPosition.currency) &&
        Objects.equals(this.averagePurchasePrice, optionsPosition.averagePurchasePrice)&&
        Objects.equals(this.additionalProperties, optionsPosition.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, price, units, currency, averagePurchasePrice, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsPosition {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    averagePurchasePrice: ").append(toIndentedString(averagePurchasePrice)).append("\n");
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
    openapiFields.add("symbol");
    openapiFields.add("price");
    openapiFields.add("units");
    openapiFields.add("currency");
    openapiFields.add("average_purchase_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OptionsPosition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OptionsPosition.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptionsPosition is not found in the empty JSON string", OptionsPosition.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `symbol`
      if (jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) {
        BrokerageSymbol.validateJsonObject(jsonObj.getAsJsonObject("symbol"));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        OptionsPositionCurrency.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptionsPosition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptionsPosition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptionsPosition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptionsPosition.class));

       return (TypeAdapter<T>) new TypeAdapter<OptionsPosition>() {
           @Override
           public void write(JsonWriter out, OptionsPosition value) throws IOException {
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
           public OptionsPosition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OptionsPosition instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OptionsPosition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptionsPosition
  * @throws IOException if the JSON string is invalid with respect to OptionsPosition
  */
  public static OptionsPosition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptionsPosition.class);
  }

 /**
  * Convert an instance of OptionsPosition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

