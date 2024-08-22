/*
 * SnapTrade
 *
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = SnapTrade.Net.Client.OpenAPIDateConverter;

namespace SnapTrade.Net.Model
{
    /// <summary>
    /// Estimated remaining balance of the account after the trade is executed.
    /// </summary>
    [DataContract(Name = "ManualTradeBalance")]
    public partial class ManualTradeBalance : IEquatable<ManualTradeBalance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ManualTradeBalance" /> class.
        /// </summary>
        /// <param name="account">account.</param>
        /// <param name="currency">currency.</param>
        /// <param name="cash">Estimated amount of cash remaining in the account after the trade. At the moment this is the same as &#x60;remaining_cash&#x60; under &#x60;trade_impacts&#x60;..</param>
        public ManualTradeBalance(AccountSimple account = default(AccountSimple), Currency currency = default(Currency), double? cash = default(double?)) : base()
        {
            this.Account = account;
            this.Currency = currency;
            this.Cash = cash;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Account
        /// </summary>
        [DataMember(Name = "account", EmitDefaultValue = false)]
        public AccountSimple Account { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public Currency Currency { get; set; }

        /// <summary>
        /// Estimated amount of cash remaining in the account after the trade. At the moment this is the same as &#x60;remaining_cash&#x60; under &#x60;trade_impacts&#x60;.
        /// </summary>
        /// <value>Estimated amount of cash remaining in the account after the trade. At the moment this is the same as &#x60;remaining_cash&#x60; under &#x60;trade_impacts&#x60;.</value>
        [DataMember(Name = "cash", EmitDefaultValue = true)]
        public double? Cash { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ManualTradeBalance {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Cash: ").Append(Cash).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ManualTradeBalance);
        }

        /// <summary>
        /// Returns true if ManualTradeBalance instances are equal
        /// </summary>
        /// <param name="input">Instance of ManualTradeBalance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ManualTradeBalance input)
        {
            if (input == null)
            {
                return false;
            }
            return base.Equals(input) && 
                (
                    this.Account == input.Account ||
                    (this.Account != null &&
                    this.Account.Equals(input.Account))
                ) && base.Equals(input) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && base.Equals(input) && 
                (
                    this.Cash == input.Cash ||
                    (this.Cash != null &&
                    this.Cash.Equals(input.Cash))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = base.GetHashCode();
                if (this.Account != null)
                {
                    hashCode = (hashCode * 59) + this.Account.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Cash != null)
                {
                    hashCode = (hashCode * 59) + this.Cash.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
