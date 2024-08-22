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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ManualTradeImpact
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ManualTradeImpact {
  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private UUID account;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private UUID currency;

  public static final String SERIALIZED_NAME_REMAINING_CASH = "remaining_cash";
  @SerializedName(SERIALIZED_NAME_REMAINING_CASH)
  private Double remainingCash;

  public static final String SERIALIZED_NAME_ESTIMATED_COMMISSION = "estimated_commission";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_COMMISSION)
  private Double estimatedCommission;

  public static final String SERIALIZED_NAME_FOREX_FEES = "forex_fees";
  @SerializedName(SERIALIZED_NAME_FOREX_FEES)
  private Double forexFees;

  public ManualTradeImpact() {
  }

  public ManualTradeImpact account(UUID account) {
    
    
    
    
    this.account = account;
    return this;
  }

   /**
   * Unique identifier for the connected brokerage account. This is the UUID used to reference the account in SnapTrade.
   * @return account
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "917c8734-8470-4a3e-a18f-57c3f2ee6631", value = "Unique identifier for the connected brokerage account. This is the UUID used to reference the account in SnapTrade.")

  public UUID getAccount() {
    return account;
  }


  public void setAccount(UUID account) {
    
    
    
    this.account = account;
  }


  public ManualTradeImpact currency(UUID currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Unique identifier for the currency. This is the UUID used to reference the currency in SnapTrade.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "87b24961-b51e-4db8-9226-f198f6518a89", value = "Unique identifier for the currency. This is the UUID used to reference the currency in SnapTrade.")

  public UUID getCurrency() {
    return currency;
  }


  public void setCurrency(UUID currency) {
    
    
    
    this.currency = currency;
  }


  public ManualTradeImpact remainingCash(Double remainingCash) {
    
    
    
    
    this.remainingCash = remainingCash;
    return this;
  }

  public ManualTradeImpact remainingCash(Integer remainingCash) {
    
    
    
    
    this.remainingCash = remainingCash.doubleValue();
    return this;
  }

   /**
   * Estimated amount of cash remaining in the account after the trade.
   * @return remainingCash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.11", value = "Estimated amount of cash remaining in the account after the trade.")

  public Double getRemainingCash() {
    return remainingCash;
  }


  public void setRemainingCash(Double remainingCash) {
    
    
    
    this.remainingCash = remainingCash;
  }


  public ManualTradeImpact estimatedCommission(Double estimatedCommission) {
    
    
    
    
    this.estimatedCommission = estimatedCommission;
    return this;
  }

  public ManualTradeImpact estimatedCommission(Integer estimatedCommission) {
    
    
    
    
    this.estimatedCommission = estimatedCommission.doubleValue();
    return this;
  }

   /**
   * Estimated commission for the trade.
   * @return estimatedCommission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.26", value = "Estimated commission for the trade.")

  public Double getEstimatedCommission() {
    return estimatedCommission;
  }


  public void setEstimatedCommission(Double estimatedCommission) {
    
    
    
    this.estimatedCommission = estimatedCommission;
  }


  public ManualTradeImpact forexFees(Double forexFees) {
    
    
    
    
    this.forexFees = forexFees;
    return this;
  }

  public ManualTradeImpact forexFees(Integer forexFees) {
    
    
    
    
    this.forexFees = forexFees.doubleValue();
    return this;
  }

   /**
   * Estimated foreign transaction fees for the trade.
   * @return forexFees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.26", value = "Estimated foreign transaction fees for the trade.")

  public Double getForexFees() {
    return forexFees;
  }


  public void setForexFees(Double forexFees) {
    
    
    
    this.forexFees = forexFees;
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
   * @return the ManualTradeImpact instance itself
   */
  public ManualTradeImpact putAdditionalProperty(String key, Object value) {
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
    ManualTradeImpact manualTradeImpact = (ManualTradeImpact) o;
    return Objects.equals(this.account, manualTradeImpact.account) &&
        Objects.equals(this.currency, manualTradeImpact.currency) &&
        Objects.equals(this.remainingCash, manualTradeImpact.remainingCash) &&
        Objects.equals(this.estimatedCommission, manualTradeImpact.estimatedCommission) &&
        Objects.equals(this.forexFees, manualTradeImpact.forexFees)&&
        Objects.equals(this.additionalProperties, manualTradeImpact.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, currency, remainingCash, estimatedCommission, forexFees, additionalProperties);
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
    sb.append("class ManualTradeImpact {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    remainingCash: ").append(toIndentedString(remainingCash)).append("\n");
    sb.append("    estimatedCommission: ").append(toIndentedString(estimatedCommission)).append("\n");
    sb.append("    forexFees: ").append(toIndentedString(forexFees)).append("\n");
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
    openapiFields.add("account");
    openapiFields.add("currency");
    openapiFields.add("remaining_cash");
    openapiFields.add("estimated_commission");
    openapiFields.add("forex_fees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ManualTradeImpact
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ManualTradeImpact.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManualTradeImpact is not found in the empty JSON string", ManualTradeImpact.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("account") != null && !jsonObj.get("account").isJsonNull()) && !jsonObj.get("account").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManualTradeImpact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManualTradeImpact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManualTradeImpact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManualTradeImpact.class));

       return (TypeAdapter<T>) new TypeAdapter<ManualTradeImpact>() {
           @Override
           public void write(JsonWriter out, ManualTradeImpact value) throws IOException {
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
           public ManualTradeImpact read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ManualTradeImpact instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ManualTradeImpact given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManualTradeImpact
  * @throws IOException if the JSON string is invalid with respect to ManualTradeImpact
  */
  public static ManualTradeImpact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManualTradeImpact.class);
  }

 /**
  * Convert an instance of ManualTradeImpact to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

