/* tslint:disable */
/* eslint-disable */
/**
 * SnapTrade
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


/**
 * Data required to register a user via SnapTrade Partner
 * @export
 * @interface SnapTradeRegisterUserRequestBody
 */
export interface SnapTradeRegisterUserRequestBody {
    /**
     * SnapTrade User ID. Provided by SnapTrade Partner. Can be any string, as long as it\'s unique to a user
     * @type {string}
     * @memberof SnapTradeRegisterUserRequestBody
     */
    'userId'?: string;
    /**
     * Open SSH RSA public key
     * @type {string}
     * @memberof SnapTradeRegisterUserRequestBody
     */
    'rsaPublicKey'?: string;
}

