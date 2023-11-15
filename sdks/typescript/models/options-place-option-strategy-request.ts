/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { OrderType } from './order-type';
import { TimeInForce } from './time-in-force';

/**
 * 
 * @export
 * @interface OptionsPlaceOptionStrategyRequest
 */
export interface OptionsPlaceOptionStrategyRequest {
    /**
     * 
     * @type {OrderType}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'order_type': OrderType;
    /**
     * 
     * @type {TimeInForce}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'time_in_force': TimeInForce;
    /**
     * Trade Price if limit or stop limit order
     * @type {number}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'price'?: number | null;
}

