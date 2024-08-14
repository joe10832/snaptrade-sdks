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
    /// The type of security. For example, \&quot;Common Stock\&quot; or \&quot;ETF\&quot;.
    /// </summary>
    [DataContract(Name = "SecurityType")]
    public partial class SecurityType : IEquatable<SecurityType>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecurityType" /> class.
        /// </summary>
        /// <param name="id">Unique identifier for the security type within SnapTrade. This is the ID used to reference the security type in SnapTrade API calls..</param>
        /// <param name="code">A short code representing the security type. For example, \&quot;cs\&quot; for Common Stock. Here are some common values:   ad - ADR   bnd - Bond   cs - Common Stock   cef - Closed End Fund   et - ETF   oef - Open Ended Fund   ps - Preferred Stock   rt - Right   struct - Structured Product   ut - Unit   wi - When Issued   wt - Warrant .</param>
        /// <param name="description">A human-readable description of the security type. For example, \&quot;Common Stock\&quot; or \&quot;ETF\&quot;..</param>
        /// <param name="isSupported">This field is deprecated and should not be used. Please reach out to SnapTrade support if you have a valid usecase for this..</param>
        public SecurityType(string id = default(string), string code = default(string), string description = default(string), bool isSupported = default(bool)) : base()
        {
            this.Id = id;
            this.Code = code;
            this.Description = description;
            this.IsSupported = isSupported;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Unique identifier for the security type within SnapTrade. This is the ID used to reference the security type in SnapTrade API calls.
        /// </summary>
        /// <value>Unique identifier for the security type within SnapTrade. This is the ID used to reference the security type in SnapTrade API calls.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// A short code representing the security type. For example, \&quot;cs\&quot; for Common Stock. Here are some common values:   ad - ADR   bnd - Bond   cs - Common Stock   cef - Closed End Fund   et - ETF   oef - Open Ended Fund   ps - Preferred Stock   rt - Right   struct - Structured Product   ut - Unit   wi - When Issued   wt - Warrant 
        /// </summary>
        /// <value>A short code representing the security type. For example, \&quot;cs\&quot; for Common Stock. Here are some common values:   ad - ADR   bnd - Bond   cs - Common Stock   cef - Closed End Fund   et - ETF   oef - Open Ended Fund   ps - Preferred Stock   rt - Right   struct - Structured Product   ut - Unit   wi - When Issued   wt - Warrant </value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// A human-readable description of the security type. For example, \&quot;Common Stock\&quot; or \&quot;ETF\&quot;.
        /// </summary>
        /// <value>A human-readable description of the security type. For example, \&quot;Common Stock\&quot; or \&quot;ETF\&quot;.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// This field is deprecated and should not be used. Please reach out to SnapTrade support if you have a valid usecase for this.
        /// </summary>
        /// <value>This field is deprecated and should not be used. Please reach out to SnapTrade support if you have a valid usecase for this.</value>
        [DataMember(Name = "is_supported", EmitDefaultValue = true)]
        [Obsolete]
        public bool IsSupported { get; set; }

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
            sb.Append("class SecurityType {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  IsSupported: ").Append(IsSupported).Append("\n");
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
            return this.Equals(input as SecurityType);
        }

        /// <summary>
        /// Returns true if SecurityType instances are equal
        /// </summary>
        /// <param name="input">Instance of SecurityType to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecurityType input)
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
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && base.Equals(input) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && base.Equals(input) && 
                (
                    this.IsSupported == input.IsSupported ||
                    this.IsSupported.Equals(input.IsSupported)
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsSupported.GetHashCode();
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
