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
import com.konfigthis.client.model.AccountOrderRecordStatus;
import com.konfigthis.client.model.Action;
import com.konfigthis.client.model.Currency;
import com.konfigthis.client.model.Exchange;
import com.konfigthis.client.model.OptionsSymbol;
import com.konfigthis.client.model.OrderType;
import com.konfigthis.client.model.SecurityType;
import com.konfigthis.client.model.TimeInForce;
import com.konfigthis.client.model.USExchange;
import com.konfigthis.client.model.UnderlyingSymbol;
import com.konfigthis.client.model.UniversalSymbol;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
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
 * Record of order in brokerageaccount
 */
@ApiModel(description = "Record of order in brokerageaccount")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountOrderRecord {
  public static final String SERIALIZED_NAME_BROKERAGE_ORDER_ID = "brokerage_order_id";
  @SerializedName(SERIALIZED_NAME_BROKERAGE_ORDER_ID)
  private String brokerageOrderId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AccountOrderRecordStatus status;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private UUID symbol;

  public static final String SERIALIZED_NAME_UNIVERSAL_SYMBOL = "universal_symbol";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_SYMBOL)
  private UniversalSymbol universalSymbol;

  public static final String SERIALIZED_NAME_OPTION_SYMBOL = "option_symbol";
  @SerializedName(SERIALIZED_NAME_OPTION_SYMBOL)
  private OptionsSymbol optionSymbol;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private Action action;

  public static final String SERIALIZED_NAME_TOTAL_QUANTITY = "total_quantity";
  @SerializedName(SERIALIZED_NAME_TOTAL_QUANTITY)
  private Double totalQuantity;

  public static final String SERIALIZED_NAME_OPEN_QUANTITY = "open_quantity";
  @SerializedName(SERIALIZED_NAME_OPEN_QUANTITY)
  private Double openQuantity;

  public static final String SERIALIZED_NAME_CANCELED_QUANTITY = "canceled_quantity";
  @SerializedName(SERIALIZED_NAME_CANCELED_QUANTITY)
  private Double canceledQuantity;

  public static final String SERIALIZED_NAME_FILLED_QUANTITY = "filled_quantity";
  @SerializedName(SERIALIZED_NAME_FILLED_QUANTITY)
  private Double filledQuantity;

  public static final String SERIALIZED_NAME_EXECUTION_PRICE = "execution_price";
  @SerializedName(SERIALIZED_NAME_EXECUTION_PRICE)
  private Double executionPrice;

  public static final String SERIALIZED_NAME_LIMIT_PRICE = "limit_price";
  @SerializedName(SERIALIZED_NAME_LIMIT_PRICE)
  private Double limitPrice;

  public static final String SERIALIZED_NAME_STOP_PRICE = "stop_price";
  @SerializedName(SERIALIZED_NAME_STOP_PRICE)
  private Double stopPrice;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "order_type";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private OrderType orderType;

  public static final String SERIALIZED_NAME_TIME_IN_FORCE = "time_in_force";
  @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
  private TimeInForce timeInForce;

  public static final String SERIALIZED_NAME_TIME_PLACED = "time_placed";
  @SerializedName(SERIALIZED_NAME_TIME_PLACED)
  private String timePlaced;

  public static final String SERIALIZED_NAME_TIME_UPDATED = "time_updated";
  @SerializedName(SERIALIZED_NAME_TIME_UPDATED)
  private String timeUpdated;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiry_date";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate;

  public AccountOrderRecord() {
  }

  public AccountOrderRecord brokerageOrderId(String brokerageOrderId) {
    
    
    
    
    this.brokerageOrderId = brokerageOrderId;
    return this;
  }

   /**
   * Order id returned by brokerage
   * @return brokerageOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order id returned by brokerage")

  public String getBrokerageOrderId() {
    return brokerageOrderId;
  }


  public void setBrokerageOrderId(String brokerageOrderId) {
    
    
    
    this.brokerageOrderId = brokerageOrderId;
  }


  public AccountOrderRecord status(AccountOrderRecordStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AccountOrderRecordStatus getStatus() {
    return status;
  }


  public void setStatus(AccountOrderRecordStatus status) {
    
    
    
    this.status = status;
  }


  public AccountOrderRecord symbol(UUID symbol) {
    
    
    
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2bcd7cc3-e922-4976-bce1-9858296801c3", value = "")

  public UUID getSymbol() {
    return symbol;
  }


  public void setSymbol(UUID symbol) {
    
    
    
    this.symbol = symbol;
  }


  public AccountOrderRecord universalSymbol(UniversalSymbol universalSymbol) {
    
    
    
    
    this.universalSymbol = universalSymbol;
    return this;
  }

   /**
   * Get universalSymbol
   * @return universalSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UniversalSymbol getUniversalSymbol() {
    return universalSymbol;
  }


  public void setUniversalSymbol(UniversalSymbol universalSymbol) {
    
    
    
    this.universalSymbol = universalSymbol;
  }


  public AccountOrderRecord optionSymbol(OptionsSymbol optionSymbol) {
    
    
    
    
    this.optionSymbol = optionSymbol;
    return this;
  }

   /**
   * Get optionSymbol
   * @return optionSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OptionsSymbol getOptionSymbol() {
    return optionSymbol;
  }


  public void setOptionSymbol(OptionsSymbol optionSymbol) {
    
    
    
    this.optionSymbol = optionSymbol;
  }


  public AccountOrderRecord action(Action action) {
    
    
    
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Action getAction() {
    return action;
  }


  public void setAction(Action action) {
    
    
    
    this.action = action;
  }


  public AccountOrderRecord totalQuantity(Double totalQuantity) {
    
    
    
    
    this.totalQuantity = totalQuantity;
    return this;
  }

  public AccountOrderRecord totalQuantity(Integer totalQuantity) {
    
    
    
    
    this.totalQuantity = totalQuantity.doubleValue();
    return this;
  }

   /**
   * Trade Units
   * @return totalQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trade Units")

  public Double getTotalQuantity() {
    return totalQuantity;
  }


  public void setTotalQuantity(Double totalQuantity) {
    
    
    
    this.totalQuantity = totalQuantity;
  }


  public AccountOrderRecord openQuantity(Double openQuantity) {
    
    
    
    
    this.openQuantity = openQuantity;
    return this;
  }

  public AccountOrderRecord openQuantity(Integer openQuantity) {
    
    
    
    
    this.openQuantity = openQuantity.doubleValue();
    return this;
  }

   /**
   * Trade Units
   * @return openQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trade Units")

  public Double getOpenQuantity() {
    return openQuantity;
  }


  public void setOpenQuantity(Double openQuantity) {
    
    
    
    this.openQuantity = openQuantity;
  }


  public AccountOrderRecord canceledQuantity(Double canceledQuantity) {
    
    
    
    
    this.canceledQuantity = canceledQuantity;
    return this;
  }

  public AccountOrderRecord canceledQuantity(Integer canceledQuantity) {
    
    
    
    
    this.canceledQuantity = canceledQuantity.doubleValue();
    return this;
  }

   /**
   * Trade Units
   * @return canceledQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trade Units")

  public Double getCanceledQuantity() {
    return canceledQuantity;
  }


  public void setCanceledQuantity(Double canceledQuantity) {
    
    
    
    this.canceledQuantity = canceledQuantity;
  }


  public AccountOrderRecord filledQuantity(Double filledQuantity) {
    
    
    
    
    this.filledQuantity = filledQuantity;
    return this;
  }

  public AccountOrderRecord filledQuantity(Integer filledQuantity) {
    
    
    
    
    this.filledQuantity = filledQuantity.doubleValue();
    return this;
  }

   /**
   * Trade Units
   * @return filledQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trade Units")

  public Double getFilledQuantity() {
    return filledQuantity;
  }


  public void setFilledQuantity(Double filledQuantity) {
    
    
    
    this.filledQuantity = filledQuantity;
  }


  public AccountOrderRecord executionPrice(Double executionPrice) {
    
    
    
    
    this.executionPrice = executionPrice;
    return this;
  }

  public AccountOrderRecord executionPrice(Integer executionPrice) {
    
    
    
    
    this.executionPrice = executionPrice.doubleValue();
    return this;
  }

   /**
   * Trade Price if limit or stop limit order
   * @return executionPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31.33", value = "Trade Price if limit or stop limit order")

  public Double getExecutionPrice() {
    return executionPrice;
  }


  public void setExecutionPrice(Double executionPrice) {
    
    
    
    this.executionPrice = executionPrice;
  }


  public AccountOrderRecord limitPrice(Double limitPrice) {
    
    
    
    
    this.limitPrice = limitPrice;
    return this;
  }

  public AccountOrderRecord limitPrice(Integer limitPrice) {
    
    
    
    
    this.limitPrice = limitPrice.doubleValue();
    return this;
  }

   /**
   * Trade Price if limit or stop limit order
   * @return limitPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31.33", value = "Trade Price if limit or stop limit order")

  public Double getLimitPrice() {
    return limitPrice;
  }


  public void setLimitPrice(Double limitPrice) {
    
    
    
    this.limitPrice = limitPrice;
  }


  public AccountOrderRecord stopPrice(Double stopPrice) {
    
    
    
    
    this.stopPrice = stopPrice;
    return this;
  }

  public AccountOrderRecord stopPrice(Integer stopPrice) {
    
    
    
    
    this.stopPrice = stopPrice.doubleValue();
    return this;
  }

   /**
   * Stop Price. If stop loss or stop limit order, the price to trigger the stop
   * @return stopPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31.33", value = "Stop Price. If stop loss or stop limit order, the price to trigger the stop")

  public Double getStopPrice() {
    return stopPrice;
  }


  public void setStopPrice(Double stopPrice) {
    
    
    
    this.stopPrice = stopPrice;
  }


  public AccountOrderRecord orderType(OrderType orderType) {
    
    
    
    
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderType getOrderType() {
    return orderType;
  }


  public void setOrderType(OrderType orderType) {
    
    
    
    this.orderType = orderType;
  }


  public AccountOrderRecord timeInForce(TimeInForce timeInForce) {
    
    
    
    
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TimeInForce getTimeInForce() {
    return timeInForce;
  }


  public void setTimeInForce(TimeInForce timeInForce) {
    
    
    
    this.timeInForce = timeInForce;
  }


  public AccountOrderRecord timePlaced(String timePlaced) {
    
    
    
    
    this.timePlaced = timePlaced;
    return this;
  }

   /**
   * Time
   * @return timePlaced
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-21T20:11:19.217Z", value = "Time")

  public String getTimePlaced() {
    return timePlaced;
  }


  public void setTimePlaced(String timePlaced) {
    
    
    
    this.timePlaced = timePlaced;
  }


  public AccountOrderRecord timeUpdated(String timeUpdated) {
    
    
    
    
    this.timeUpdated = timeUpdated;
    return this;
  }

   /**
   * Time
   * @return timeUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-21T20:11:19.217Z", value = "Time")

  public String getTimeUpdated() {
    return timeUpdated;
  }


  public void setTimeUpdated(String timeUpdated) {
    
    
    
    this.timeUpdated = timeUpdated;
  }


  public AccountOrderRecord expiryDate(String expiryDate) {
    
    
    
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Time
   * @return expiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-01-21T20:11:19.217Z", value = "Time")

  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    
    
    
    this.expiryDate = expiryDate;
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
   * @return the AccountOrderRecord instance itself
   */
  public AccountOrderRecord putAdditionalProperty(String key, Object value) {
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
    AccountOrderRecord accountOrderRecord = (AccountOrderRecord) o;
    return Objects.equals(this.brokerageOrderId, accountOrderRecord.brokerageOrderId) &&
        Objects.equals(this.status, accountOrderRecord.status) &&
        Objects.equals(this.symbol, accountOrderRecord.symbol) &&
        Objects.equals(this.universalSymbol, accountOrderRecord.universalSymbol) &&
        Objects.equals(this.optionSymbol, accountOrderRecord.optionSymbol) &&
        Objects.equals(this.action, accountOrderRecord.action) &&
        Objects.equals(this.totalQuantity, accountOrderRecord.totalQuantity) &&
        Objects.equals(this.openQuantity, accountOrderRecord.openQuantity) &&
        Objects.equals(this.canceledQuantity, accountOrderRecord.canceledQuantity) &&
        Objects.equals(this.filledQuantity, accountOrderRecord.filledQuantity) &&
        Objects.equals(this.executionPrice, accountOrderRecord.executionPrice) &&
        Objects.equals(this.limitPrice, accountOrderRecord.limitPrice) &&
        Objects.equals(this.stopPrice, accountOrderRecord.stopPrice) &&
        Objects.equals(this.orderType, accountOrderRecord.orderType) &&
        Objects.equals(this.timeInForce, accountOrderRecord.timeInForce) &&
        Objects.equals(this.timePlaced, accountOrderRecord.timePlaced) &&
        Objects.equals(this.timeUpdated, accountOrderRecord.timeUpdated) &&
        Objects.equals(this.expiryDate, accountOrderRecord.expiryDate)&&
        Objects.equals(this.additionalProperties, accountOrderRecord.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerageOrderId, status, symbol, universalSymbol, optionSymbol, action, totalQuantity, openQuantity, canceledQuantity, filledQuantity, executionPrice, limitPrice, stopPrice, orderType, timeInForce, timePlaced, timeUpdated, expiryDate, additionalProperties);
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
    sb.append("class AccountOrderRecord {\n");
    sb.append("    brokerageOrderId: ").append(toIndentedString(brokerageOrderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    universalSymbol: ").append(toIndentedString(universalSymbol)).append("\n");
    sb.append("    optionSymbol: ").append(toIndentedString(optionSymbol)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    totalQuantity: ").append(toIndentedString(totalQuantity)).append("\n");
    sb.append("    openQuantity: ").append(toIndentedString(openQuantity)).append("\n");
    sb.append("    canceledQuantity: ").append(toIndentedString(canceledQuantity)).append("\n");
    sb.append("    filledQuantity: ").append(toIndentedString(filledQuantity)).append("\n");
    sb.append("    executionPrice: ").append(toIndentedString(executionPrice)).append("\n");
    sb.append("    limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
    sb.append("    stopPrice: ").append(toIndentedString(stopPrice)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    timePlaced: ").append(toIndentedString(timePlaced)).append("\n");
    sb.append("    timeUpdated: ").append(toIndentedString(timeUpdated)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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
    openapiFields.add("brokerage_order_id");
    openapiFields.add("status");
    openapiFields.add("symbol");
    openapiFields.add("universal_symbol");
    openapiFields.add("option_symbol");
    openapiFields.add("action");
    openapiFields.add("total_quantity");
    openapiFields.add("open_quantity");
    openapiFields.add("canceled_quantity");
    openapiFields.add("filled_quantity");
    openapiFields.add("execution_price");
    openapiFields.add("limit_price");
    openapiFields.add("stop_price");
    openapiFields.add("order_type");
    openapiFields.add("time_in_force");
    openapiFields.add("time_placed");
    openapiFields.add("time_updated");
    openapiFields.add("expiry_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountOrderRecord
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountOrderRecord.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountOrderRecord is not found in the empty JSON string", AccountOrderRecord.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("brokerage_order_id") != null && !jsonObj.get("brokerage_order_id").isJsonNull()) && !jsonObj.get("brokerage_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brokerage_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brokerage_order_id").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
      // validate the optional field `universal_symbol`
      if (jsonObj.get("universal_symbol") != null && !jsonObj.get("universal_symbol").isJsonNull()) {
        UniversalSymbol.validateJsonObject(jsonObj.getAsJsonObject("universal_symbol"));
      }
      // validate the optional field `option_symbol`
      if (jsonObj.get("option_symbol") != null && !jsonObj.get("option_symbol").isJsonNull()) {
        OptionsSymbol.validateJsonObject(jsonObj.getAsJsonObject("option_symbol"));
      }
      if ((jsonObj.get("time_placed") != null && !jsonObj.get("time_placed").isJsonNull()) && !jsonObj.get("time_placed").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_placed` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_placed").toString()));
      }
      if ((jsonObj.get("time_updated") != null && !jsonObj.get("time_updated").isJsonNull()) && !jsonObj.get("time_updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_updated").toString()));
      }
      if ((jsonObj.get("expiry_date") != null && !jsonObj.get("expiry_date").isJsonNull()) && !jsonObj.get("expiry_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiry_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiry_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountOrderRecord.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountOrderRecord' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountOrderRecord> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountOrderRecord.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountOrderRecord>() {
           @Override
           public void write(JsonWriter out, AccountOrderRecord value) throws IOException {
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
           public AccountOrderRecord read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountOrderRecord instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountOrderRecord given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountOrderRecord
  * @throws IOException if the JSON string is invalid with respect to AccountOrderRecord
  */
  public static AccountOrderRecord fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountOrderRecord.class);
  }

 /**
  * Convert an instance of AccountOrderRecord to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

