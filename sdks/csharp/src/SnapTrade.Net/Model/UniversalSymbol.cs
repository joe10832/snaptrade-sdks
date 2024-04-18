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
    /// Universal symbol
    /// </summary>
    [DataContract(Name = "UniversalSymbol")]
    public partial class UniversalSymbol : IEquatable<UniversalSymbol>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniversalSymbol" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UniversalSymbol()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="UniversalSymbol" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="symbol">symbol (required).</param>
        /// <param name="rawSymbol">rawSymbol (required).</param>
        /// <param name="description">description.</param>
        /// <param name="currency">currency (required).</param>
        /// <param name="exchange">exchange.</param>
        /// <param name="type">type (required).</param>
        /// <param name="currencies">currencies (required).</param>
        /// <param name="figiCode">figiCode.</param>
        /// <param name="figiInstrument">figiInstrument.</param>
        public UniversalSymbol(string id = default(string), string symbol = default(string), string rawSymbol = default(string), string description = default(string), Currency currency = default(Currency), Exchange exchange = default(Exchange), SecurityType type = default(SecurityType), List<Currency> currencies = default(List<Currency>), string figiCode = default(string), FigiInstrumentNullable figiInstrument = default(FigiInstrumentNullable)) : base()
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for UniversalSymbol and cannot be null");
            }
            this.Id = id;
            // to ensure "symbol" is required (not null)
            if (symbol == null)
            {
                throw new ArgumentNullException("symbol is a required property for UniversalSymbol and cannot be null");
            }
            this.Symbol = symbol;
            // to ensure "rawSymbol" is required (not null)
            if (rawSymbol == null)
            {
                throw new ArgumentNullException("rawSymbol is a required property for UniversalSymbol and cannot be null");
            }
            this.RawSymbol = rawSymbol;
            // to ensure "currency" is required (not null)
            if (currency == null)
            {
                throw new ArgumentNullException("currency is a required property for UniversalSymbol and cannot be null");
            }
            this.Currency = currency;
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for UniversalSymbol and cannot be null");
            }
            this.Type = type;
            // to ensure "currencies" is required (not null)
            if (currencies == null)
            {
                throw new ArgumentNullException("currencies is a required property for UniversalSymbol and cannot be null");
            }
            this.Currencies = currencies;
            this.Description = description;
            this.Exchange = exchange;
            this.FigiCode = figiCode;
            this.FigiInstrument = figiInstrument;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Symbol
        /// </summary>
        [DataMember(Name = "symbol", IsRequired = true, EmitDefaultValue = true)]
        public string Symbol { get; set; }

        /// <summary>
        /// Gets or Sets RawSymbol
        /// </summary>
        [DataMember(Name = "raw_symbol", IsRequired = true, EmitDefaultValue = true)]
        public string RawSymbol { get; set; }

        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name = "description", EmitDefaultValue = true)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = true)]
        public Currency Currency { get; set; }

        /// <summary>
        /// Gets or Sets Exchange
        /// </summary>
        [DataMember(Name = "exchange", EmitDefaultValue = false)]
        public Exchange Exchange { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public SecurityType Type { get; set; }

        /// <summary>
        /// Gets or Sets Currencies
        /// </summary>
        [DataMember(Name = "currencies", IsRequired = true, EmitDefaultValue = true)]
        public List<Currency> Currencies { get; set; }

        /// <summary>
        /// Gets or Sets FigiCode
        /// </summary>
        [DataMember(Name = "figi_code", EmitDefaultValue = true)]
        public string FigiCode { get; set; }

        /// <summary>
        /// Gets or Sets FigiInstrument
        /// </summary>
        [DataMember(Name = "figi_instrument", EmitDefaultValue = true)]
        public FigiInstrumentNullable FigiInstrument { get; set; }

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
            sb.Append("class UniversalSymbol {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  RawSymbol: ").Append(RawSymbol).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Exchange: ").Append(Exchange).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Currencies: ").Append(Currencies).Append("\n");
            sb.Append("  FigiCode: ").Append(FigiCode).Append("\n");
            sb.Append("  FigiInstrument: ").Append(FigiInstrument).Append("\n");
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
            return this.Equals(input as UniversalSymbol);
        }

        /// <summary>
        /// Returns true if UniversalSymbol instances are equal
        /// </summary>
        /// <param name="input">Instance of UniversalSymbol to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniversalSymbol input)
        {
            if (input == null)
            {
                return false;
            }
            return base.Equals(input) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && base.Equals(input) && 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && base.Equals(input) && 
                (
                    this.RawSymbol == input.RawSymbol ||
                    (this.RawSymbol != null &&
                    this.RawSymbol.Equals(input.RawSymbol))
                ) && base.Equals(input) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && base.Equals(input) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && base.Equals(input) && 
                (
                    this.Exchange == input.Exchange ||
                    (this.Exchange != null &&
                    this.Exchange.Equals(input.Exchange))
                ) && base.Equals(input) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && base.Equals(input) && 
                (
                    this.Currencies == input.Currencies ||
                    this.Currencies != null &&
                    input.Currencies != null &&
                    this.Currencies.SequenceEqual(input.Currencies)
                ) && base.Equals(input) && 
                (
                    this.FigiCode == input.FigiCode ||
                    (this.FigiCode != null &&
                    this.FigiCode.Equals(input.FigiCode))
                ) && base.Equals(input) && 
                (
                    this.FigiInstrument == input.FigiInstrument ||
                    (this.FigiInstrument != null &&
                    this.FigiInstrument.Equals(input.FigiInstrument))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
                }
                if (this.RawSymbol != null)
                {
                    hashCode = (hashCode * 59) + this.RawSymbol.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Exchange != null)
                {
                    hashCode = (hashCode * 59) + this.Exchange.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Currencies != null)
                {
                    hashCode = (hashCode * 59) + this.Currencies.GetHashCode();
                }
                if (this.FigiCode != null)
                {
                    hashCode = (hashCode * 59) + this.FigiCode.GetHashCode();
                }
                if (this.FigiInstrument != null)
                {
                    hashCode = (hashCode * 59) + this.FigiInstrument.GetHashCode();
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
