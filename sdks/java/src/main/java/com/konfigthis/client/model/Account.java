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
import com.konfigthis.client.model.AccountBalance;
import com.konfigthis.client.model.AccountSyncStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * A single account at a brokerage.
 */
@ApiModel(description = "A single account at a brokerage.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Account {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_BROKERAGE_AUTHORIZATION = "brokerage_authorization";
  @SerializedName(SERIALIZED_NAME_BROKERAGE_AUTHORIZATION)
  private UUID brokerageAuthorization;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_CREATED_DATE = "created_date";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_SYNC_STATUS = "sync_status";
  @SerializedName(SERIALIZED_NAME_SYNC_STATUS)
  private AccountSyncStatus syncStatus;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private AccountBalance balance;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Map<String, Object> meta = null;

  public static final String SERIALIZED_NAME_PORTFOLIO_GROUP = "portfolio_group";
  @SerializedName(SERIALIZED_NAME_PORTFOLIO_GROUP)
  private UUID portfolioGroup;

  public static final String SERIALIZED_NAME_CASH_RESTRICTIONS = "cash_restrictions";
  @SerializedName(SERIALIZED_NAME_CASH_RESTRICTIONS)
  private List<String> cashRestrictions = null;

  public Account() {
  }

  public Account id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the connected brokerage account. This is the UUID used to reference the account in SnapTrade. This ID should not change for as long as the connection stays active. If the connection is deleted and re-added, a new account ID will be generated.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique identifier for the connected brokerage account. This is the UUID used to reference the account in SnapTrade. This ID should not change for as long as the connection stays active. If the connection is deleted and re-added, a new account ID will be generated.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public Account brokerageAuthorization(UUID brokerageAuthorization) {
    
    
    
    
    this.brokerageAuthorization = brokerageAuthorization;
    return this;
  }

   /**
   * Unique identifier for the connection. This is the UUID used to reference the connection in SnapTrade.
   * @return brokerageAuthorization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "87b24961-b51e-4db8-9226-f198f6518a89", required = true, value = "Unique identifier for the connection. This is the UUID used to reference the connection in SnapTrade.")

  public UUID getBrokerageAuthorization() {
    return brokerageAuthorization;
  }


  public void setBrokerageAuthorization(UUID brokerageAuthorization) {
    
    
    
    this.brokerageAuthorization = brokerageAuthorization;
  }


  public Account name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * A display name for the account. Either assigned by the user or by the brokerage itself. For certain brokerages, SnapTrade appends the brokerage name to the account name for clarity.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Robinhood Individual", required = true, value = "A display name for the account. Either assigned by the user or by the brokerage itself. For certain brokerages, SnapTrade appends the brokerage name to the account name for clarity.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public Account number(String number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * The account number assigned by the brokerage. For some brokerages, this field may be masked for security reasons.
   * @return number
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Q6542138443", required = true, value = "The account number assigned by the brokerage. For some brokerages, this field may be masked for security reasons.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    
    
    
    this.number = number;
  }


  public Account institutionName(String institutionName) {
    
    
    
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The name of the brokerage that holds the account.
   * @return institutionName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Robinhood", required = true, value = "The name of the brokerage that holds the account.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    
    
    
    this.institutionName = institutionName;
  }


  public Account createdDate(OffsetDateTime createdDate) {
    
    
    
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format indicating when the account was created in SnapTrade. This is _not_ the account opening date at the brokerage.
   * @return createdDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2024-07-23T22:50:22.761Z", required = true, value = "Timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format indicating when the account was created in SnapTrade. This is _not_ the account opening date at the brokerage.")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    
    
    
    this.createdDate = createdDate;
  }


  public Account syncStatus(AccountSyncStatus syncStatus) {
    
    
    
    
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * Get syncStatus
   * @return syncStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccountSyncStatus getSyncStatus() {
    return syncStatus;
  }


  public void setSyncStatus(AccountSyncStatus syncStatus) {
    
    
    
    this.syncStatus = syncStatus;
  }


  public Account balance(AccountBalance balance) {
    
    
    
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AccountBalance getBalance() {
    return balance;
  }


  public void setBalance(AccountBalance balance) {
    
    
    
    this.balance = balance;
  }


  public Account meta(Map<String, Object> meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

  public Account putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

   /**
   * Additional information about the account, such as account type, status, etc. This information is specific to the brokerage and there&#39;s no standard format for this data. This field is deprecated and subject to removal in a future version.
   * @return meta
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"type\":\"Margin\",\"status\":\"ACTIVE\",\"institution_name\":\"Robinhood\"}", value = "Additional information about the account, such as account type, status, etc. This information is specific to the brokerage and there's no standard format for this data. This field is deprecated and subject to removal in a future version.")

  public Map<String, Object> getMeta() {
    return meta;
  }


  public void setMeta(Map<String, Object> meta) {
    
    
    
    this.meta = meta;
  }


  public Account portfolioGroup(UUID portfolioGroup) {
    
    
    
    
    this.portfolioGroup = portfolioGroup;
    return this;
  }

   /**
   * Portfolio Group ID. Portfolio Groups have been deprecated. Please contact support if you have a usecase for it.
   * @return portfolioGroup
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2bcd7cc3-e922-4976-bce1-9858296801c3", value = "Portfolio Group ID. Portfolio Groups have been deprecated. Please contact support if you have a usecase for it.")

  public UUID getPortfolioGroup() {
    return portfolioGroup;
  }


  public void setPortfolioGroup(UUID portfolioGroup) {
    
    
    
    this.portfolioGroup = portfolioGroup;
  }


  public Account cashRestrictions(List<String> cashRestrictions) {
    
    
    
    
    this.cashRestrictions = cashRestrictions;
    return this;
  }

  public Account addCashRestrictionsItem(String cashRestrictionsItem) {
    if (this.cashRestrictions == null) {
      this.cashRestrictions = new ArrayList<>();
    }
    this.cashRestrictions.add(cashRestrictionsItem);
    return this;
  }

   /**
   * This field is deprecated.
   * @return cashRestrictions
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[]", value = "This field is deprecated.")

  public List<String> getCashRestrictions() {
    return cashRestrictions;
  }


  public void setCashRestrictions(List<String> cashRestrictions) {
    
    
    
    this.cashRestrictions = cashRestrictions;
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
   * @return the Account instance itself
   */
  public Account putAdditionalProperty(String key, Object value) {
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
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.brokerageAuthorization, account.brokerageAuthorization) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.number, account.number) &&
        Objects.equals(this.institutionName, account.institutionName) &&
        Objects.equals(this.createdDate, account.createdDate) &&
        Objects.equals(this.syncStatus, account.syncStatus) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.meta, account.meta) &&
        Objects.equals(this.portfolioGroup, account.portfolioGroup) &&
        Objects.equals(this.cashRestrictions, account.cashRestrictions)&&
        Objects.equals(this.additionalProperties, account.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, brokerageAuthorization, name, number, institutionName, createdDate, syncStatus, balance, meta, portfolioGroup, cashRestrictions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    brokerageAuthorization: ").append(toIndentedString(brokerageAuthorization)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    portfolioGroup: ").append(toIndentedString(portfolioGroup)).append("\n");
    sb.append("    cashRestrictions: ").append(toIndentedString(cashRestrictions)).append("\n");
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
    openapiFields.add("brokerage_authorization");
    openapiFields.add("name");
    openapiFields.add("number");
    openapiFields.add("institution_name");
    openapiFields.add("created_date");
    openapiFields.add("sync_status");
    openapiFields.add("balance");
    openapiFields.add("meta");
    openapiFields.add("portfolio_group");
    openapiFields.add("cash_restrictions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("brokerage_authorization");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("institution_name");
    openapiRequiredFields.add("created_date");
    openapiRequiredFields.add("sync_status");
    openapiRequiredFields.add("balance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Account
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Account.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Account is not found in the empty JSON string", Account.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Account.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("brokerage_authorization").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brokerage_authorization` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brokerage_authorization").toString()));
      }
      if (!jsonObj.get("name").isJsonNull() && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      if (!jsonObj.get("institution_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution_name").toString()));
      }
      // validate the required field `sync_status`
      AccountSyncStatus.validateJsonObject(jsonObj.getAsJsonObject("sync_status"));
      // validate the required field `balance`
      AccountBalance.validateJsonObject(jsonObj.getAsJsonObject("balance"));
      if ((jsonObj.get("portfolio_group") != null && !jsonObj.get("portfolio_group").isJsonNull()) && !jsonObj.get("portfolio_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `portfolio_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("portfolio_group").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cash_restrictions") != null && !jsonObj.get("cash_restrictions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cash_restrictions` to be an array in the JSON string but got `%s`", jsonObj.get("cash_restrictions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Account.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Account' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Account> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Account.class));

       return (TypeAdapter<T>) new TypeAdapter<Account>() {
           @Override
           public void write(JsonWriter out, Account value) throws IOException {
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
           public Account read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Account instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Account given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Account
  * @throws IOException if the JSON string is invalid with respect to Account
  */
  public static Account fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Account.class);
  }

 /**
  * Convert an instance of Account to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

