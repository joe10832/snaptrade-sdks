/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/


/**
 * 
 * @export
 * @interface OptionsPlaceOptionStrategyRequest
 */
export interface OptionsPlaceOptionStrategyRequest {
    /**
     * 
     * @type {string}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'order_type': OptionsPlaceOptionStrategyRequestOrderTypeEnum;
    /**
     * 
     * @type {string}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'time_in_force': OptionsPlaceOptionStrategyRequestTimeInForceEnum;
    /**
     * Trade Price if limit or stop limit order
     * @type {number}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'price': number | null;
}

type OptionsPlaceOptionStrategyRequestOrderTypeEnum = 'Limit' | 'Market' | 'NetDebit' | 'NetCredit'
type OptionsPlaceOptionStrategyRequestTimeInForceEnum = 'DAY' | 'GTC'


