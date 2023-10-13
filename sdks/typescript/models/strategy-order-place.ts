/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/

import { StrategyOrderPlaceOrdersInner } from './strategy-order-place-orders-inner';
import { StrategyOrderPlaceOrdersInnerLegsInner } from './strategy-order-place-orders-inner-legs-inner';

/**
 * The reponse for a correctly placed order
 * @export
 * @interface StrategyOrderPlace
 */
export interface StrategyOrderPlace {
    [key: string]: any;

    /**
     * 
     * @type {number}
     * @memberof StrategyOrderPlace
     */
    'orderId'?: number;
    /**
     * 
     * @type {Array<StrategyOrderPlaceOrdersInner>}
     * @memberof StrategyOrderPlace
     */
    'orders'?: Array<StrategyOrderPlaceOrdersInner>;
}

