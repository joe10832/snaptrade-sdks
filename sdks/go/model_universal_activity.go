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

// UniversalActivity A transaction or activity from an institution
type UniversalActivity struct {
	// Unique identifier for the transaction. This is the ID used to reference the transaction in SnapTrade.  Please note that this ID _can_ change if the transaction is deleted and re-added. Under normal circumstances, SnapTrade does not delete transactions. The only time this would happen is if SnapTrade re-fetches and reprocesses the data from the brokerage, which is rare. If you require a stable ID, please let us know and we can work with you to provide one. 
	Id *string `json:"id,omitempty"`
	Account *AccountSimple `json:"account,omitempty"`
	Symbol NullableAccountUniversalActivitySymbol `json:"symbol,omitempty"`
	OptionSymbol NullableAccountUniversalActivityOptionSymbol `json:"option_symbol,omitempty"`
	// The price of the security for the transaction. This is mostly applicable to `BUY`, `SELL`, and `DIVIDEND` transactions.
	Price *float32 `json:"price,omitempty"`
	// The number of units of the security for the transaction. This is mostly applicable to `BUY`, `SELL`, and `DIVIDEND` transactions.
	Units *float32 `json:"units,omitempty"`
	// The amount of the transaction denominated in `currency`. This can be positive or negative. In general, transactions that positively affect the account balance (like sell, deposits, dividends, etc) will have a positive amount, while transactions that negatively affect the account balance (like buy, withdrawals, fees, etc) will have a negative amount.
	Amount NullableFloat32 `json:"amount,omitempty"`
	Currency *AccountUniversalActivityCurrency `json:"currency,omitempty"`
	// A string representing the type of transaction. SnapTrade does a best effort to categorize the brokerage transaction types into a common set of values. Here are some of the most popular values:   - `BUY` - Asset bought.   - `SELL` - Asset sold.   - `DIVIDEND` - Dividend payout.   - `CONTRIBUTION` - Cash contribution.   - `WITHDRAWAL` - Cash withdrawal.   - `REI` - Dividend reinvestment.   - `INTEREST` - Interest deposited into the account.   - `FEE` - Fee withdrawn from the account.   - `OPTIONEXPIRATION` - Option expiration event. `option_symbol` contains the related option contract info.   - `OPTIONASSIGNMENT` - Option assignment event. `option_symbol` contains the related option contract info.   - `OPTIONEXERCISE` - Option exercise event. `option_symbol` contains the related option contract info. 
	Type *string `json:"type,omitempty"`
	// If an option `BUY` or `SELL` transaction, this further specifies the type of action. The possible values are: - BUY_TO_OPEN - BUY_TO_CLOSE - SELL_TO_OPEN - SELL_TO_CLOSE 
	OptionType *string `json:"option_type,omitempty"`
	// A human-readable description of the transaction. This is usually the brokerage's description of the transaction.
	Description *string `json:"description,omitempty"`
	// The recorded time for the transaction. The granularity of this timestamp depends on the brokerage. Some brokerages provide the exact time of the transaction, while others provide only the date. Please check the [integrations page](https://snaptrade.notion.site/66793431ad0b416489eaabaf248d0afb?v=6fab8012ade6441fa0c6d9af9c55ce3a) for the specific brokerage to see the granularity of the timestamps. Note that even though the field is named `trade_date`, it can represent any type of transaction, not just trades.
	TradeDate NullableTime `json:"trade_date,omitempty"`
	// The date on which the transaction is settled.
	SettlementDate *time.Time `json:"settlement_date,omitempty"`
	// Any fee associated with the transaction if provided by the brokerage.
	Fee *float32 `json:"fee,omitempty"`
	// The forex conversion rate involved in the transaction if provided by the brokerage. Used in cases where securities of one currency are purchased in a different currency, and the forex conversion is automatic. In those cases, price, amount and fee will be in the top level currency (activity -> currency)
	FxRate NullableFloat32 `json:"fx_rate,omitempty"`
	// The institution that the transaction is associated with. This is usually the brokerage name.
	Institution *string `json:"institution,omitempty"`
	// Reference ID from brokerage used to identify related transactions. For example if an order comprises of several transactions (buy, fee, fx), they can be grouped if they share the same `external_reference_id`
	ExternalReferenceId NullableString `json:"external_reference_id,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _UniversalActivity UniversalActivity

// NewUniversalActivity instantiates a new UniversalActivity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUniversalActivity() *UniversalActivity {
	this := UniversalActivity{}
	return &this
}

// NewUniversalActivityWithDefaults instantiates a new UniversalActivity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUniversalActivityWithDefaults() *UniversalActivity {
	this := UniversalActivity{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *UniversalActivity) GetId() string {
	if o == nil || isNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetIdOk() (*string, bool) {
	if o == nil || isNil(o.Id) {
    return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *UniversalActivity) HasId() bool {
	if o != nil && !isNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *UniversalActivity) SetId(v string) {
	o.Id = &v
}

// GetAccount returns the Account field value if set, zero value otherwise.
func (o *UniversalActivity) GetAccount() AccountSimple {
	if o == nil || isNil(o.Account) {
		var ret AccountSimple
		return ret
	}
	return *o.Account
}

// GetAccountOk returns a tuple with the Account field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetAccountOk() (*AccountSimple, bool) {
	if o == nil || isNil(o.Account) {
    return nil, false
	}
	return o.Account, true
}

// HasAccount returns a boolean if a field has been set.
func (o *UniversalActivity) HasAccount() bool {
	if o != nil && !isNil(o.Account) {
		return true
	}

	return false
}

// SetAccount gets a reference to the given AccountSimple and assigns it to the Account field.
func (o *UniversalActivity) SetAccount(v AccountSimple) {
	o.Account = &v
}

// GetSymbol returns the Symbol field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniversalActivity) GetSymbol() AccountUniversalActivitySymbol {
	if o == nil || isNil(o.Symbol.Get()) {
		var ret AccountUniversalActivitySymbol
		return ret
	}
	return *o.Symbol.Get()
}

// GetSymbolOk returns a tuple with the Symbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniversalActivity) GetSymbolOk() (*AccountUniversalActivitySymbol, bool) {
	if o == nil {
    return nil, false
	}
	return o.Symbol.Get(), o.Symbol.IsSet()
}

// HasSymbol returns a boolean if a field has been set.
func (o *UniversalActivity) HasSymbol() bool {
	if o != nil && o.Symbol.IsSet() {
		return true
	}

	return false
}

// SetSymbol gets a reference to the given NullableAccountUniversalActivitySymbol and assigns it to the Symbol field.
func (o *UniversalActivity) SetSymbol(v AccountUniversalActivitySymbol) {
	o.Symbol.Set(&v)
}
// SetSymbolNil sets the value for Symbol to be an explicit nil
func (o *UniversalActivity) SetSymbolNil() {
	o.Symbol.Set(nil)
}

// UnsetSymbol ensures that no value is present for Symbol, not even an explicit nil
func (o *UniversalActivity) UnsetSymbol() {
	o.Symbol.Unset()
}

// GetOptionSymbol returns the OptionSymbol field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniversalActivity) GetOptionSymbol() AccountUniversalActivityOptionSymbol {
	if o == nil || isNil(o.OptionSymbol.Get()) {
		var ret AccountUniversalActivityOptionSymbol
		return ret
	}
	return *o.OptionSymbol.Get()
}

// GetOptionSymbolOk returns a tuple with the OptionSymbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniversalActivity) GetOptionSymbolOk() (*AccountUniversalActivityOptionSymbol, bool) {
	if o == nil {
    return nil, false
	}
	return o.OptionSymbol.Get(), o.OptionSymbol.IsSet()
}

// HasOptionSymbol returns a boolean if a field has been set.
func (o *UniversalActivity) HasOptionSymbol() bool {
	if o != nil && o.OptionSymbol.IsSet() {
		return true
	}

	return false
}

// SetOptionSymbol gets a reference to the given NullableAccountUniversalActivityOptionSymbol and assigns it to the OptionSymbol field.
func (o *UniversalActivity) SetOptionSymbol(v AccountUniversalActivityOptionSymbol) {
	o.OptionSymbol.Set(&v)
}
// SetOptionSymbolNil sets the value for OptionSymbol to be an explicit nil
func (o *UniversalActivity) SetOptionSymbolNil() {
	o.OptionSymbol.Set(nil)
}

// UnsetOptionSymbol ensures that no value is present for OptionSymbol, not even an explicit nil
func (o *UniversalActivity) UnsetOptionSymbol() {
	o.OptionSymbol.Unset()
}

// GetPrice returns the Price field value if set, zero value otherwise.
func (o *UniversalActivity) GetPrice() float32 {
	if o == nil || isNil(o.Price) {
		var ret float32
		return ret
	}
	return *o.Price
}

// GetPriceOk returns a tuple with the Price field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetPriceOk() (*float32, bool) {
	if o == nil || isNil(o.Price) {
    return nil, false
	}
	return o.Price, true
}

// HasPrice returns a boolean if a field has been set.
func (o *UniversalActivity) HasPrice() bool {
	if o != nil && !isNil(o.Price) {
		return true
	}

	return false
}

// SetPrice gets a reference to the given float32 and assigns it to the Price field.
func (o *UniversalActivity) SetPrice(v float32) {
	o.Price = &v
}

// GetUnits returns the Units field value if set, zero value otherwise.
func (o *UniversalActivity) GetUnits() float32 {
	if o == nil || isNil(o.Units) {
		var ret float32
		return ret
	}
	return *o.Units
}

// GetUnitsOk returns a tuple with the Units field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetUnitsOk() (*float32, bool) {
	if o == nil || isNil(o.Units) {
    return nil, false
	}
	return o.Units, true
}

// HasUnits returns a boolean if a field has been set.
func (o *UniversalActivity) HasUnits() bool {
	if o != nil && !isNil(o.Units) {
		return true
	}

	return false
}

// SetUnits gets a reference to the given float32 and assigns it to the Units field.
func (o *UniversalActivity) SetUnits(v float32) {
	o.Units = &v
}

// GetAmount returns the Amount field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniversalActivity) GetAmount() float32 {
	if o == nil || isNil(o.Amount.Get()) {
		var ret float32
		return ret
	}
	return *o.Amount.Get()
}

// GetAmountOk returns a tuple with the Amount field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniversalActivity) GetAmountOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return o.Amount.Get(), o.Amount.IsSet()
}

// HasAmount returns a boolean if a field has been set.
func (o *UniversalActivity) HasAmount() bool {
	if o != nil && o.Amount.IsSet() {
		return true
	}

	return false
}

// SetAmount gets a reference to the given NullableFloat32 and assigns it to the Amount field.
func (o *UniversalActivity) SetAmount(v float32) {
	o.Amount.Set(&v)
}
// SetAmountNil sets the value for Amount to be an explicit nil
func (o *UniversalActivity) SetAmountNil() {
	o.Amount.Set(nil)
}

// UnsetAmount ensures that no value is present for Amount, not even an explicit nil
func (o *UniversalActivity) UnsetAmount() {
	o.Amount.Unset()
}

// GetCurrency returns the Currency field value if set, zero value otherwise.
func (o *UniversalActivity) GetCurrency() AccountUniversalActivityCurrency {
	if o == nil || isNil(o.Currency) {
		var ret AccountUniversalActivityCurrency
		return ret
	}
	return *o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetCurrencyOk() (*AccountUniversalActivityCurrency, bool) {
	if o == nil || isNil(o.Currency) {
    return nil, false
	}
	return o.Currency, true
}

// HasCurrency returns a boolean if a field has been set.
func (o *UniversalActivity) HasCurrency() bool {
	if o != nil && !isNil(o.Currency) {
		return true
	}

	return false
}

// SetCurrency gets a reference to the given AccountUniversalActivityCurrency and assigns it to the Currency field.
func (o *UniversalActivity) SetCurrency(v AccountUniversalActivityCurrency) {
	o.Currency = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *UniversalActivity) GetType() string {
	if o == nil || isNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetTypeOk() (*string, bool) {
	if o == nil || isNil(o.Type) {
    return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *UniversalActivity) HasType() bool {
	if o != nil && !isNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *UniversalActivity) SetType(v string) {
	o.Type = &v
}

// GetOptionType returns the OptionType field value if set, zero value otherwise.
func (o *UniversalActivity) GetOptionType() string {
	if o == nil || isNil(o.OptionType) {
		var ret string
		return ret
	}
	return *o.OptionType
}

// GetOptionTypeOk returns a tuple with the OptionType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetOptionTypeOk() (*string, bool) {
	if o == nil || isNil(o.OptionType) {
    return nil, false
	}
	return o.OptionType, true
}

// HasOptionType returns a boolean if a field has been set.
func (o *UniversalActivity) HasOptionType() bool {
	if o != nil && !isNil(o.OptionType) {
		return true
	}

	return false
}

// SetOptionType gets a reference to the given string and assigns it to the OptionType field.
func (o *UniversalActivity) SetOptionType(v string) {
	o.OptionType = &v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *UniversalActivity) GetDescription() string {
	if o == nil || isNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetDescriptionOk() (*string, bool) {
	if o == nil || isNil(o.Description) {
    return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *UniversalActivity) HasDescription() bool {
	if o != nil && !isNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *UniversalActivity) SetDescription(v string) {
	o.Description = &v
}

// GetTradeDate returns the TradeDate field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniversalActivity) GetTradeDate() time.Time {
	if o == nil || isNil(o.TradeDate.Get()) {
		var ret time.Time
		return ret
	}
	return *o.TradeDate.Get()
}

// GetTradeDateOk returns a tuple with the TradeDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniversalActivity) GetTradeDateOk() (*time.Time, bool) {
	if o == nil {
    return nil, false
	}
	return o.TradeDate.Get(), o.TradeDate.IsSet()
}

// HasTradeDate returns a boolean if a field has been set.
func (o *UniversalActivity) HasTradeDate() bool {
	if o != nil && o.TradeDate.IsSet() {
		return true
	}

	return false
}

// SetTradeDate gets a reference to the given NullableTime and assigns it to the TradeDate field.
func (o *UniversalActivity) SetTradeDate(v time.Time) {
	o.TradeDate.Set(&v)
}
// SetTradeDateNil sets the value for TradeDate to be an explicit nil
func (o *UniversalActivity) SetTradeDateNil() {
	o.TradeDate.Set(nil)
}

// UnsetTradeDate ensures that no value is present for TradeDate, not even an explicit nil
func (o *UniversalActivity) UnsetTradeDate() {
	o.TradeDate.Unset()
}

// GetSettlementDate returns the SettlementDate field value if set, zero value otherwise.
func (o *UniversalActivity) GetSettlementDate() time.Time {
	if o == nil || isNil(o.SettlementDate) {
		var ret time.Time
		return ret
	}
	return *o.SettlementDate
}

// GetSettlementDateOk returns a tuple with the SettlementDate field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetSettlementDateOk() (*time.Time, bool) {
	if o == nil || isNil(o.SettlementDate) {
    return nil, false
	}
	return o.SettlementDate, true
}

// HasSettlementDate returns a boolean if a field has been set.
func (o *UniversalActivity) HasSettlementDate() bool {
	if o != nil && !isNil(o.SettlementDate) {
		return true
	}

	return false
}

// SetSettlementDate gets a reference to the given time.Time and assigns it to the SettlementDate field.
func (o *UniversalActivity) SetSettlementDate(v time.Time) {
	o.SettlementDate = &v
}

// GetFee returns the Fee field value if set, zero value otherwise.
func (o *UniversalActivity) GetFee() float32 {
	if o == nil || isNil(o.Fee) {
		var ret float32
		return ret
	}
	return *o.Fee
}

// GetFeeOk returns a tuple with the Fee field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetFeeOk() (*float32, bool) {
	if o == nil || isNil(o.Fee) {
    return nil, false
	}
	return o.Fee, true
}

// HasFee returns a boolean if a field has been set.
func (o *UniversalActivity) HasFee() bool {
	if o != nil && !isNil(o.Fee) {
		return true
	}

	return false
}

// SetFee gets a reference to the given float32 and assigns it to the Fee field.
func (o *UniversalActivity) SetFee(v float32) {
	o.Fee = &v
}

// GetFxRate returns the FxRate field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniversalActivity) GetFxRate() float32 {
	if o == nil || isNil(o.FxRate.Get()) {
		var ret float32
		return ret
	}
	return *o.FxRate.Get()
}

// GetFxRateOk returns a tuple with the FxRate field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniversalActivity) GetFxRateOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return o.FxRate.Get(), o.FxRate.IsSet()
}

// HasFxRate returns a boolean if a field has been set.
func (o *UniversalActivity) HasFxRate() bool {
	if o != nil && o.FxRate.IsSet() {
		return true
	}

	return false
}

// SetFxRate gets a reference to the given NullableFloat32 and assigns it to the FxRate field.
func (o *UniversalActivity) SetFxRate(v float32) {
	o.FxRate.Set(&v)
}
// SetFxRateNil sets the value for FxRate to be an explicit nil
func (o *UniversalActivity) SetFxRateNil() {
	o.FxRate.Set(nil)
}

// UnsetFxRate ensures that no value is present for FxRate, not even an explicit nil
func (o *UniversalActivity) UnsetFxRate() {
	o.FxRate.Unset()
}

// GetInstitution returns the Institution field value if set, zero value otherwise.
func (o *UniversalActivity) GetInstitution() string {
	if o == nil || isNil(o.Institution) {
		var ret string
		return ret
	}
	return *o.Institution
}

// GetInstitutionOk returns a tuple with the Institution field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UniversalActivity) GetInstitutionOk() (*string, bool) {
	if o == nil || isNil(o.Institution) {
    return nil, false
	}
	return o.Institution, true
}

// HasInstitution returns a boolean if a field has been set.
func (o *UniversalActivity) HasInstitution() bool {
	if o != nil && !isNil(o.Institution) {
		return true
	}

	return false
}

// SetInstitution gets a reference to the given string and assigns it to the Institution field.
func (o *UniversalActivity) SetInstitution(v string) {
	o.Institution = &v
}

// GetExternalReferenceId returns the ExternalReferenceId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UniversalActivity) GetExternalReferenceId() string {
	if o == nil || isNil(o.ExternalReferenceId.Get()) {
		var ret string
		return ret
	}
	return *o.ExternalReferenceId.Get()
}

// GetExternalReferenceIdOk returns a tuple with the ExternalReferenceId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UniversalActivity) GetExternalReferenceIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.ExternalReferenceId.Get(), o.ExternalReferenceId.IsSet()
}

// HasExternalReferenceId returns a boolean if a field has been set.
func (o *UniversalActivity) HasExternalReferenceId() bool {
	if o != nil && o.ExternalReferenceId.IsSet() {
		return true
	}

	return false
}

// SetExternalReferenceId gets a reference to the given NullableString and assigns it to the ExternalReferenceId field.
func (o *UniversalActivity) SetExternalReferenceId(v string) {
	o.ExternalReferenceId.Set(&v)
}
// SetExternalReferenceIdNil sets the value for ExternalReferenceId to be an explicit nil
func (o *UniversalActivity) SetExternalReferenceIdNil() {
	o.ExternalReferenceId.Set(nil)
}

// UnsetExternalReferenceId ensures that no value is present for ExternalReferenceId, not even an explicit nil
func (o *UniversalActivity) UnsetExternalReferenceId() {
	o.ExternalReferenceId.Unset()
}

func (o UniversalActivity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.Account) {
		toSerialize["account"] = o.Account
	}
	if o.Symbol.IsSet() {
		toSerialize["symbol"] = o.Symbol.Get()
	}
	if o.OptionSymbol.IsSet() {
		toSerialize["option_symbol"] = o.OptionSymbol.Get()
	}
	if !isNil(o.Price) {
		toSerialize["price"] = o.Price
	}
	if !isNil(o.Units) {
		toSerialize["units"] = o.Units
	}
	if o.Amount.IsSet() {
		toSerialize["amount"] = o.Amount.Get()
	}
	if !isNil(o.Currency) {
		toSerialize["currency"] = o.Currency
	}
	if !isNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !isNil(o.OptionType) {
		toSerialize["option_type"] = o.OptionType
	}
	if !isNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if o.TradeDate.IsSet() {
		toSerialize["trade_date"] = o.TradeDate.Get()
	}
	if !isNil(o.SettlementDate) {
		toSerialize["settlement_date"] = o.SettlementDate
	}
	if !isNil(o.Fee) {
		toSerialize["fee"] = o.Fee
	}
	if o.FxRate.IsSet() {
		toSerialize["fx_rate"] = o.FxRate.Get()
	}
	if !isNil(o.Institution) {
		toSerialize["institution"] = o.Institution
	}
	if o.ExternalReferenceId.IsSet() {
		toSerialize["external_reference_id"] = o.ExternalReferenceId.Get()
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *UniversalActivity) UnmarshalJSON(bytes []byte) (err error) {
	varUniversalActivity := _UniversalActivity{}

	if err = json.Unmarshal(bytes, &varUniversalActivity); err == nil {
		*o = UniversalActivity(varUniversalActivity)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "id")
		delete(additionalProperties, "account")
		delete(additionalProperties, "symbol")
		delete(additionalProperties, "option_symbol")
		delete(additionalProperties, "price")
		delete(additionalProperties, "units")
		delete(additionalProperties, "amount")
		delete(additionalProperties, "currency")
		delete(additionalProperties, "type")
		delete(additionalProperties, "option_type")
		delete(additionalProperties, "description")
		delete(additionalProperties, "trade_date")
		delete(additionalProperties, "settlement_date")
		delete(additionalProperties, "fee")
		delete(additionalProperties, "fx_rate")
		delete(additionalProperties, "institution")
		delete(additionalProperties, "external_reference_id")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableUniversalActivity struct {
	value *UniversalActivity
	isSet bool
}

func (v NullableUniversalActivity) Get() *UniversalActivity {
	return v.value
}

func (v *NullableUniversalActivity) Set(val *UniversalActivity) {
	v.value = val
	v.isSet = true
}

func (v NullableUniversalActivity) IsSet() bool {
	return v.isSet
}

func (v *NullableUniversalActivity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUniversalActivity(val *UniversalActivity) *NullableUniversalActivity {
	return &NullableUniversalActivity{value: val, isSet: true}
}

func (v NullableUniversalActivity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUniversalActivity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


