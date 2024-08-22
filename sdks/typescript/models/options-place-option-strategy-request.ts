/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { OrderTypeStrict } from './order-type-strict';
import { TimeInForceStrict } from './time-in-force-strict';

/**
 * 
 * @export
 * @interface OptionsPlaceOptionStrategyRequest
 */
export interface OptionsPlaceOptionStrategyRequest {
    /**
     * The type of order to place.  - For `Limit` and `StopLimit` orders, the `price` field is required. - For `Stop` and `StopLimit` orders, the `stop` field is required. 
     * @type {OrderTypeStrict}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'order_type': OrderTypeStrict;
    /**
     * The Time in Force type for the order. This field indicates how long the order will remain active before it is executed or expires. Here are the supported values:   - `Day` - Day. The order is valid only for the trading day on which it is placed.   - `GTC` - Good Til Canceled. The order is valid until it is executed or canceled.   - `FOK` - Fill Or Kill. The order must be executed in its entirety immediately or be canceled completely. 
     * @type {TimeInForceStrict}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'time_in_force': TimeInForceStrict;
    /**
     * Trade Price if limit or stop limit order
     * @type {number}
     * @memberof OptionsPlaceOptionStrategyRequest
     */
    'price'?: number | null;
}

