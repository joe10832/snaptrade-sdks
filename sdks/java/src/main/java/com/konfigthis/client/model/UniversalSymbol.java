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
import com.konfigthis.client.model.Currency;
import com.konfigthis.client.model.FigiInstrumentNullable;
import com.konfigthis.client.model.SecurityType;
import com.konfigthis.client.model.UniversalSymbolCurrency;
import com.konfigthis.client.model.UniversalSymbolExchange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * Uniquely describes a single security + exchange combination across all brokerages.
 */
@ApiModel(description = "Uniquely describes a single security + exchange combination across all brokerages.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UniversalSymbol {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_RAW_SYMBOL = "raw_symbol";
  @SerializedName(SERIALIZED_NAME_RAW_SYMBOL)
  private String rawSymbol;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private UniversalSymbolCurrency currency;

  public static final String SERIALIZED_NAME_EXCHANGE = "exchange";
  @SerializedName(SERIALIZED_NAME_EXCHANGE)
  private UniversalSymbolExchange exchange;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private SecurityType type;

  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private List<Currency> currencies = new ArrayList<>();

  public static final String SERIALIZED_NAME_FIGI_CODE = "figi_code";
  @SerializedName(SERIALIZED_NAME_FIGI_CODE)
  private String figiCode;

  public static final String SERIALIZED_NAME_FIGI_INSTRUMENT = "figi_instrument";
  @SerializedName(SERIALIZED_NAME_FIGI_INSTRUMENT)
  private FigiInstrumentNullable figiInstrument;

  public UniversalSymbol() {
  }

  public UniversalSymbol id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the symbol within SnapTrade. This is the ID used to reference the symbol in SnapTrade API calls.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2bcd7cc3-e922-4976-bce1-9858296801c3", required = true, value = "Unique identifier for the symbol within SnapTrade. This is the ID used to reference the symbol in SnapTrade API calls.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public UniversalSymbol symbol(String symbol) {
    
    
    
    
    this.symbol = symbol;
    return this;
  }

   /**
   * The security&#39;s trading ticker symbol. For example \&quot;AAPL\&quot; for Apple Inc. We largely follow the [Yahoo Finance ticker format](https://help.yahoo.com/kb/SLN2310.html)(click on \&quot;Yahoo Finance Market Coverage and Data Delays\&quot;). For example, for securities traded on the Toronto Stock Exchange, the symbol has a &#39;.TO&#39; suffix. For securities traded on NASDAQ or NYSE, the symbol does not have a suffix.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "VAB.TO", required = true, value = "The security's trading ticker symbol. For example \"AAPL\" for Apple Inc. We largely follow the [Yahoo Finance ticker format](https://help.yahoo.com/kb/SLN2310.html)(click on \"Yahoo Finance Market Coverage and Data Delays\"). For example, for securities traded on the Toronto Stock Exchange, the symbol has a '.TO' suffix. For securities traded on NASDAQ or NYSE, the symbol does not have a suffix.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    
    
    
    this.symbol = symbol;
  }


  public UniversalSymbol rawSymbol(String rawSymbol) {
    
    
    
    
    this.rawSymbol = rawSymbol;
    return this;
  }

   /**
   * The raw symbol is &#x60;symbol&#x60; with the exchange suffix removed. For example, if &#x60;symbol&#x60; is \&quot;VAB.TO\&quot;, then &#x60;raw_symbol&#x60; is \&quot;VAB\&quot;.
   * @return rawSymbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "VAB", required = true, value = "The raw symbol is `symbol` with the exchange suffix removed. For example, if `symbol` is \"VAB.TO\", then `raw_symbol` is \"VAB\".")

  public String getRawSymbol() {
    return rawSymbol;
  }


  public void setRawSymbol(String rawSymbol) {
    
    
    
    this.rawSymbol = rawSymbol;
  }


  public UniversalSymbol description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the security. This is usually the company name or ETF name.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "VANGUARD CDN AGGREGATE BOND INDEX ETF", value = "A human-readable description of the security. This is usually the company name or ETF name.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public UniversalSymbol currency(UniversalSymbolCurrency currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UniversalSymbolCurrency getCurrency() {
    return currency;
  }


  public void setCurrency(UniversalSymbolCurrency currency) {
    
    
    
    this.currency = currency;
  }


  public UniversalSymbol exchange(UniversalSymbolExchange exchange) {
    
    
    
    
    this.exchange = exchange;
    return this;
  }

   /**
   * Get exchange
   * @return exchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UniversalSymbolExchange getExchange() {
    return exchange;
  }


  public void setExchange(UniversalSymbolExchange exchange) {
    
    
    
    this.exchange = exchange;
  }


  public UniversalSymbol type(SecurityType type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SecurityType getType() {
    return type;
  }


  public void setType(SecurityType type) {
    
    
    
    this.type = type;
  }


  public UniversalSymbol currencies(List<Currency> currencies) {
    
    
    
    
    this.currencies = currencies;
    return this;
  }

  public UniversalSymbol addCurrenciesItem(Currency currenciesItem) {
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * This field is deprecated and should not be used. Please reach out to SnapTrade support if you have a valid usecase for this.
   * @return currencies
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "This field is deprecated and should not be used. Please reach out to SnapTrade support if you have a valid usecase for this.")

  public List<Currency> getCurrencies() {
    return currencies;
  }


  public void setCurrencies(List<Currency> currencies) {
    
    
    
    this.currencies = currencies;
  }


  public UniversalSymbol figiCode(String figiCode) {
    
    
    
    
    this.figiCode = figiCode;
    return this;
  }

   /**
   * This identifier is unique per security per trading venue. See section 1.4.1 of the [FIGI Standard](https://www.openfigi.com/assets/local/figi-allocation-rules.pdf) for more information. This value should be the same as the &#x60;figi_code&#x60; in the &#x60;figi_instrument&#x60; child property.
   * @return figiCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BBG000B9XRY4", value = "This identifier is unique per security per trading venue. See section 1.4.1 of the [FIGI Standard](https://www.openfigi.com/assets/local/figi-allocation-rules.pdf) for more information. This value should be the same as the `figi_code` in the `figi_instrument` child property.")

  public String getFigiCode() {
    return figiCode;
  }


  public void setFigiCode(String figiCode) {
    
    
    
    this.figiCode = figiCode;
  }


  public UniversalSymbol figiInstrument(FigiInstrumentNullable figiInstrument) {
    
    
    
    
    this.figiInstrument = figiInstrument;
    return this;
  }

   /**
   * Get figiInstrument
   * @return figiInstrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FigiInstrumentNullable getFigiInstrument() {
    return figiInstrument;
  }


  public void setFigiInstrument(FigiInstrumentNullable figiInstrument) {
    
    
    
    this.figiInstrument = figiInstrument;
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
   * @return the UniversalSymbol instance itself
   */
  public UniversalSymbol putAdditionalProperty(String key, Object value) {
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
    UniversalSymbol universalSymbol = (UniversalSymbol) o;
    return Objects.equals(this.id, universalSymbol.id) &&
        Objects.equals(this.symbol, universalSymbol.symbol) &&
        Objects.equals(this.rawSymbol, universalSymbol.rawSymbol) &&
        Objects.equals(this.description, universalSymbol.description) &&
        Objects.equals(this.currency, universalSymbol.currency) &&
        Objects.equals(this.exchange, universalSymbol.exchange) &&
        Objects.equals(this.type, universalSymbol.type) &&
        Objects.equals(this.currencies, universalSymbol.currencies) &&
        Objects.equals(this.figiCode, universalSymbol.figiCode) &&
        Objects.equals(this.figiInstrument, universalSymbol.figiInstrument)&&
        Objects.equals(this.additionalProperties, universalSymbol.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, symbol, rawSymbol, description, currency, exchange, type, currencies, figiCode, figiInstrument, additionalProperties);
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
    sb.append("class UniversalSymbol {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    rawSymbol: ").append(toIndentedString(rawSymbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    figiCode: ").append(toIndentedString(figiCode)).append("\n");
    sb.append("    figiInstrument: ").append(toIndentedString(figiInstrument)).append("\n");
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
    openapiFields.add("symbol");
    openapiFields.add("raw_symbol");
    openapiFields.add("description");
    openapiFields.add("currency");
    openapiFields.add("exchange");
    openapiFields.add("type");
    openapiFields.add("currencies");
    openapiFields.add("figi_code");
    openapiFields.add("figi_instrument");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("symbol");
    openapiRequiredFields.add("raw_symbol");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("currencies");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UniversalSymbol
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UniversalSymbol.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UniversalSymbol is not found in the empty JSON string", UniversalSymbol.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UniversalSymbol.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      if (!jsonObj.get("raw_symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `raw_symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("raw_symbol").toString()));
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `currency`
      UniversalSymbolCurrency.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      // validate the optional field `exchange`
      if (jsonObj.get("exchange") != null && !jsonObj.get("exchange").isJsonNull()) {
        UniversalSymbolExchange.validateJsonObject(jsonObj.getAsJsonObject("exchange"));
      }
      // validate the required field `type`
      SecurityType.validateJsonObject(jsonObj.getAsJsonObject("type"));
      // ensure the json data is an array
      if (!jsonObj.get("currencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencies` to be an array in the JSON string but got `%s`", jsonObj.get("currencies").toString()));
      }

      JsonArray jsonArraycurrencies = jsonObj.getAsJsonArray("currencies");
      // validate the required field `currencies` (array)
      for (int i = 0; i < jsonArraycurrencies.size(); i++) {
        Currency.validateJsonObject(jsonArraycurrencies.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("figi_code").isJsonNull() && (jsonObj.get("figi_code") != null && !jsonObj.get("figi_code").isJsonNull()) && !jsonObj.get("figi_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `figi_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("figi_code").toString()));
      }
      // validate the optional field `figi_instrument`
      if (jsonObj.get("figi_instrument") != null && !jsonObj.get("figi_instrument").isJsonNull()) {
        FigiInstrumentNullable.validateJsonObject(jsonObj.getAsJsonObject("figi_instrument"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UniversalSymbol.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UniversalSymbol' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UniversalSymbol> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UniversalSymbol.class));

       return (TypeAdapter<T>) new TypeAdapter<UniversalSymbol>() {
           @Override
           public void write(JsonWriter out, UniversalSymbol value) throws IOException {
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
           public UniversalSymbol read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UniversalSymbol instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UniversalSymbol given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UniversalSymbol
  * @throws IOException if the JSON string is invalid with respect to UniversalSymbol
  */
  public static UniversalSymbol fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UniversalSymbol.class);
  }

 /**
  * Convert an instance of UniversalSymbol to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

