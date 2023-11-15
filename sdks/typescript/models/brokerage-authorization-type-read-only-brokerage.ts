/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"


/**
 * 
 * @export
 * @interface BrokerageAuthorizationTypeReadOnlyBrokerage
 */
export interface BrokerageAuthorizationTypeReadOnlyBrokerage {
    [key: string]: any;

    /**
     * 
     * @type {string}
     * @memberof BrokerageAuthorizationTypeReadOnlyBrokerage
     */
    'id'?: string;
    /**
     * Name of Brokerage
     * @type {string}
     * @memberof BrokerageAuthorizationTypeReadOnlyBrokerage
     */
    'name'?: string;
    /**
     * Slug of Brokerage. It is usually the name of the brokerage in capital letters
     * @type {string}
     * @memberof BrokerageAuthorizationTypeReadOnlyBrokerage
     */
    'slug'?: string;
}

