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
)

// OptionBrokerageSymbol Uniquely describes a security for the option position within an account. The distinction between this and the `option_symbol` child property is that this object is specific to a position within an account, while the `option_symbol` child property is universal across all brokerage accounts. The caller should rely on the `option_symbol` child property for most use cases.
type OptionBrokerageSymbol struct {
	// A unique ID for the security within SnapTrade, scoped to the brokerage account that the security belongs to. This is a legacy field and should not be used. Do not rely on this being a stable ID as it can change.
	// Deprecated
	Id *string `json:"id,omitempty"`
	// This field is deprecated and the caller should use the `option_symbol` child property's `description` instead.
	// Deprecated
	Description *string `json:"description,omitempty"`
	OptionSymbol *OptionsSymbol `json:"option_symbol,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _OptionBrokerageSymbol OptionBrokerageSymbol

// NewOptionBrokerageSymbol instantiates a new OptionBrokerageSymbol object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOptionBrokerageSymbol() *OptionBrokerageSymbol {
	this := OptionBrokerageSymbol{}
	return &this
}

// NewOptionBrokerageSymbolWithDefaults instantiates a new OptionBrokerageSymbol object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOptionBrokerageSymbolWithDefaults() *OptionBrokerageSymbol {
	this := OptionBrokerageSymbol{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
// Deprecated
func (o *OptionBrokerageSymbol) GetId() string {
	if o == nil || isNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *OptionBrokerageSymbol) GetIdOk() (*string, bool) {
	if o == nil || isNil(o.Id) {
    return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *OptionBrokerageSymbol) HasId() bool {
	if o != nil && !isNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
// Deprecated
func (o *OptionBrokerageSymbol) SetId(v string) {
	o.Id = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
// Deprecated
func (o *OptionBrokerageSymbol) GetDescription() string {
	if o == nil || isNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *OptionBrokerageSymbol) GetDescriptionOk() (*string, bool) {
	if o == nil || isNil(o.Description) {
    return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *OptionBrokerageSymbol) HasDescription() bool {
	if o != nil && !isNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
// Deprecated
func (o *OptionBrokerageSymbol) SetDescription(v string) {
	o.Description = &v
}

// GetOptionSymbol returns the OptionSymbol field value if set, zero value otherwise.
func (o *OptionBrokerageSymbol) GetOptionSymbol() OptionsSymbol {
	if o == nil || isNil(o.OptionSymbol) {
		var ret OptionsSymbol
		return ret
	}
	return *o.OptionSymbol
}

// GetOptionSymbolOk returns a tuple with the OptionSymbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OptionBrokerageSymbol) GetOptionSymbolOk() (*OptionsSymbol, bool) {
	if o == nil || isNil(o.OptionSymbol) {
    return nil, false
	}
	return o.OptionSymbol, true
}

// HasOptionSymbol returns a boolean if a field has been set.
func (o *OptionBrokerageSymbol) HasOptionSymbol() bool {
	if o != nil && !isNil(o.OptionSymbol) {
		return true
	}

	return false
}

// SetOptionSymbol gets a reference to the given OptionsSymbol and assigns it to the OptionSymbol field.
func (o *OptionBrokerageSymbol) SetOptionSymbol(v OptionsSymbol) {
	o.OptionSymbol = &v
}

func (o OptionBrokerageSymbol) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !isNil(o.OptionSymbol) {
		toSerialize["option_symbol"] = o.OptionSymbol
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *OptionBrokerageSymbol) UnmarshalJSON(bytes []byte) (err error) {
	varOptionBrokerageSymbol := _OptionBrokerageSymbol{}

	if err = json.Unmarshal(bytes, &varOptionBrokerageSymbol); err == nil {
		*o = OptionBrokerageSymbol(varOptionBrokerageSymbol)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "id")
		delete(additionalProperties, "description")
		delete(additionalProperties, "option_symbol")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableOptionBrokerageSymbol struct {
	value *OptionBrokerageSymbol
	isSet bool
}

func (v NullableOptionBrokerageSymbol) Get() *OptionBrokerageSymbol {
	return v.value
}

func (v *NullableOptionBrokerageSymbol) Set(val *OptionBrokerageSymbol) {
	v.value = val
	v.isSet = true
}

func (v NullableOptionBrokerageSymbol) IsSet() bool {
	return v.isSet
}

func (v *NullableOptionBrokerageSymbol) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOptionBrokerageSymbol(val *OptionBrokerageSymbol) *NullableOptionBrokerageSymbol {
	return &NullableOptionBrokerageSymbol{value: val, isSet: true}
}

func (v NullableOptionBrokerageSymbol) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOptionBrokerageSymbol) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


