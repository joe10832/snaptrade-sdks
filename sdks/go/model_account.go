/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

API version: 1.0.0
Contact: api@snaptrade.com
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package snaptrade

import (
	"encoding/json"
	"time"
)

// Account A single account at a brokerage.
type Account struct {
	// Unique identifier for the connected brokerage account. This is the UUID used to reference the account in SnapTrade. This ID should not change for as long as the connection stays active. If the connection is deleted and re-added, a new account ID will be generated.
	Id string `json:"id"`
	// Unique identifier for the connection. This is the UUID used to reference the connection in SnapTrade.
	BrokerageAuthorization string `json:"brokerage_authorization"`
	// A display name for the account. Either assigned by the user or by the brokerage itself. For certain brokerages, SnapTrade appends the brokerage name to the account name for clarity.
	Name NullableString `json:"name"`
	// The account number assigned by the brokerage. For some brokerages, this field may be masked for security reasons.
	Number string `json:"number"`
	// The name of the brokerage that holds the account.
	InstitutionName string `json:"institution_name"`
	// Timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format indicating when the account was created in SnapTrade. This is _not_ the account opening date at the brokerage.
	CreatedDate time.Time `json:"created_date"`
	SyncStatus AccountSyncStatus `json:"sync_status"`
	Balance AccountBalance `json:"balance"`
	// Additional information about the account, such as account type, status, etc. This information is specific to the brokerage and there's no standard format for this data. This field is deprecated and subject to removal in a future version.
	// Deprecated
	Meta map[string]interface{} `json:"meta,omitempty"`
	// Portfolio Group ID. Portfolio Groups have been deprecated. Please contact support if you have a usecase for it.
	// Deprecated
	PortfolioGroup *string `json:"portfolio_group,omitempty"`
	// This field is deprecated.
	// Deprecated
	CashRestrictions []string `json:"cash_restrictions,omitempty"`
	// The account type as provided by the brokerage
	RawType NullableString `json:"raw_type,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _Account Account

// NewAccount instantiates a new Account object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAccount(id string, brokerageAuthorization string, name NullableString, number string, institutionName string, createdDate time.Time, syncStatus AccountSyncStatus, balance AccountBalance) *Account {
	this := Account{}
	this.Id = id
	this.BrokerageAuthorization = brokerageAuthorization
	this.Name = name
	this.Number = number
	this.InstitutionName = institutionName
	this.CreatedDate = createdDate
	this.SyncStatus = syncStatus
	this.Balance = balance
	return &this
}

// NewAccountWithDefaults instantiates a new Account object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAccountWithDefaults() *Account {
	this := Account{}
	return &this
}

// GetId returns the Id field value
func (o *Account) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Account) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Account) SetId(v string) {
	o.Id = v
}

// GetBrokerageAuthorization returns the BrokerageAuthorization field value
func (o *Account) GetBrokerageAuthorization() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.BrokerageAuthorization
}

// GetBrokerageAuthorizationOk returns a tuple with the BrokerageAuthorization field value
// and a boolean to check if the value has been set.
func (o *Account) GetBrokerageAuthorizationOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.BrokerageAuthorization, true
}

// SetBrokerageAuthorization sets field value
func (o *Account) SetBrokerageAuthorization(v string) {
	o.BrokerageAuthorization = v
}

// GetName returns the Name field value
// If the value is explicit nil, the zero value for string will be returned
func (o *Account) GetName() string {
	if o == nil || o.Name.Get() == nil {
		var ret string
		return ret
	}

	return *o.Name.Get()
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Account) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

// SetName sets field value
func (o *Account) SetName(v string) {
	o.Name.Set(&v)
}

// GetNumber returns the Number field value
func (o *Account) GetNumber() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Number
}

// GetNumberOk returns a tuple with the Number field value
// and a boolean to check if the value has been set.
func (o *Account) GetNumberOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Number, true
}

// SetNumber sets field value
func (o *Account) SetNumber(v string) {
	o.Number = v
}

// GetInstitutionName returns the InstitutionName field value
func (o *Account) GetInstitutionName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.InstitutionName
}

// GetInstitutionNameOk returns a tuple with the InstitutionName field value
// and a boolean to check if the value has been set.
func (o *Account) GetInstitutionNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.InstitutionName, true
}

// SetInstitutionName sets field value
func (o *Account) SetInstitutionName(v string) {
	o.InstitutionName = v
}

// GetCreatedDate returns the CreatedDate field value
func (o *Account) GetCreatedDate() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedDate
}

// GetCreatedDateOk returns a tuple with the CreatedDate field value
// and a boolean to check if the value has been set.
func (o *Account) GetCreatedDateOk() (*time.Time, bool) {
	if o == nil {
    return nil, false
	}
	return &o.CreatedDate, true
}

// SetCreatedDate sets field value
func (o *Account) SetCreatedDate(v time.Time) {
	o.CreatedDate = v
}

// GetSyncStatus returns the SyncStatus field value
func (o *Account) GetSyncStatus() AccountSyncStatus {
	if o == nil {
		var ret AccountSyncStatus
		return ret
	}

	return o.SyncStatus
}

// GetSyncStatusOk returns a tuple with the SyncStatus field value
// and a boolean to check if the value has been set.
func (o *Account) GetSyncStatusOk() (*AccountSyncStatus, bool) {
	if o == nil {
    return nil, false
	}
	return &o.SyncStatus, true
}

// SetSyncStatus sets field value
func (o *Account) SetSyncStatus(v AccountSyncStatus) {
	o.SyncStatus = v
}

// GetBalance returns the Balance field value
func (o *Account) GetBalance() AccountBalance {
	if o == nil {
		var ret AccountBalance
		return ret
	}

	return o.Balance
}

// GetBalanceOk returns a tuple with the Balance field value
// and a boolean to check if the value has been set.
func (o *Account) GetBalanceOk() (*AccountBalance, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Balance, true
}

// SetBalance sets field value
func (o *Account) SetBalance(v AccountBalance) {
	o.Balance = v
}

// GetMeta returns the Meta field value if set, zero value otherwise.
// Deprecated
func (o *Account) GetMeta() map[string]interface{} {
	if o == nil || isNil(o.Meta) {
		var ret map[string]interface{}
		return ret
	}
	return o.Meta
}

// GetMetaOk returns a tuple with the Meta field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *Account) GetMetaOk() (map[string]interface{}, bool) {
	if o == nil || isNil(o.Meta) {
    return map[string]interface{}{}, false
	}
	return o.Meta, true
}

// HasMeta returns a boolean if a field has been set.
func (o *Account) HasMeta() bool {
	if o != nil && !isNil(o.Meta) {
		return true
	}

	return false
}

// SetMeta gets a reference to the given map[string]interface{} and assigns it to the Meta field.
// Deprecated
func (o *Account) SetMeta(v map[string]interface{}) {
	o.Meta = v
}

// GetPortfolioGroup returns the PortfolioGroup field value if set, zero value otherwise.
// Deprecated
func (o *Account) GetPortfolioGroup() string {
	if o == nil || isNil(o.PortfolioGroup) {
		var ret string
		return ret
	}
	return *o.PortfolioGroup
}

// GetPortfolioGroupOk returns a tuple with the PortfolioGroup field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *Account) GetPortfolioGroupOk() (*string, bool) {
	if o == nil || isNil(o.PortfolioGroup) {
    return nil, false
	}
	return o.PortfolioGroup, true
}

// HasPortfolioGroup returns a boolean if a field has been set.
func (o *Account) HasPortfolioGroup() bool {
	if o != nil && !isNil(o.PortfolioGroup) {
		return true
	}

	return false
}

// SetPortfolioGroup gets a reference to the given string and assigns it to the PortfolioGroup field.
// Deprecated
func (o *Account) SetPortfolioGroup(v string) {
	o.PortfolioGroup = &v
}

// GetCashRestrictions returns the CashRestrictions field value if set, zero value otherwise.
// Deprecated
func (o *Account) GetCashRestrictions() []string {
	if o == nil || isNil(o.CashRestrictions) {
		var ret []string
		return ret
	}
	return o.CashRestrictions
}

// GetCashRestrictionsOk returns a tuple with the CashRestrictions field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *Account) GetCashRestrictionsOk() ([]string, bool) {
	if o == nil || isNil(o.CashRestrictions) {
    return nil, false
	}
	return o.CashRestrictions, true
}

// HasCashRestrictions returns a boolean if a field has been set.
func (o *Account) HasCashRestrictions() bool {
	if o != nil && !isNil(o.CashRestrictions) {
		return true
	}

	return false
}

// SetCashRestrictions gets a reference to the given []string and assigns it to the CashRestrictions field.
// Deprecated
func (o *Account) SetCashRestrictions(v []string) {
	o.CashRestrictions = v
}

// GetRawType returns the RawType field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *Account) GetRawType() string {
	if o == nil || isNil(o.RawType.Get()) {
		var ret string
		return ret
	}
	return *o.RawType.Get()
}

// GetRawTypeOk returns a tuple with the RawType field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *Account) GetRawTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.RawType.Get(), o.RawType.IsSet()
}

// HasRawType returns a boolean if a field has been set.
func (o *Account) HasRawType() bool {
	if o != nil && o.RawType.IsSet() {
		return true
	}

	return false
}

// SetRawType gets a reference to the given NullableString and assigns it to the RawType field.
func (o *Account) SetRawType(v string) {
	o.RawType.Set(&v)
}
// SetRawTypeNil sets the value for RawType to be an explicit nil
func (o *Account) SetRawTypeNil() {
	o.RawType.Set(nil)
}

// UnsetRawType ensures that no value is present for RawType, not even an explicit nil
func (o *Account) UnsetRawType() {
	o.RawType.Unset()
}

func (o Account) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["brokerage_authorization"] = o.BrokerageAuthorization
	}
	if true {
		toSerialize["name"] = o.Name.Get()
	}
	if true {
		toSerialize["number"] = o.Number
	}
	if true {
		toSerialize["institution_name"] = o.InstitutionName
	}
	if true {
		toSerialize["created_date"] = o.CreatedDate
	}
	if true {
		toSerialize["sync_status"] = o.SyncStatus
	}
	if true {
		toSerialize["balance"] = o.Balance
	}
	if !isNil(o.Meta) {
		toSerialize["meta"] = o.Meta
	}
	if !isNil(o.PortfolioGroup) {
		toSerialize["portfolio_group"] = o.PortfolioGroup
	}
	if !isNil(o.CashRestrictions) {
		toSerialize["cash_restrictions"] = o.CashRestrictions
	}
	if o.RawType.IsSet() {
		toSerialize["raw_type"] = o.RawType.Get()
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *Account) UnmarshalJSON(bytes []byte) (err error) {
	varAccount := _Account{}

	if err = json.Unmarshal(bytes, &varAccount); err == nil {
		*o = Account(varAccount)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "id")
		delete(additionalProperties, "brokerage_authorization")
		delete(additionalProperties, "name")
		delete(additionalProperties, "number")
		delete(additionalProperties, "institution_name")
		delete(additionalProperties, "created_date")
		delete(additionalProperties, "sync_status")
		delete(additionalProperties, "balance")
		delete(additionalProperties, "meta")
		delete(additionalProperties, "portfolio_group")
		delete(additionalProperties, "cash_restrictions")
		delete(additionalProperties, "raw_type")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableAccount struct {
	value *Account
	isSet bool
}

func (v NullableAccount) Get() *Account {
	return v.value
}

func (v *NullableAccount) Set(val *Account) {
	v.value = val
	v.isSet = true
}

func (v NullableAccount) IsSet() bool {
	return v.isSet
}

func (v *NullableAccount) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAccount(val *Account) *NullableAccount {
	return &NullableAccount{value: val, isSet: true}
}

func (v NullableAccount) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAccount) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


