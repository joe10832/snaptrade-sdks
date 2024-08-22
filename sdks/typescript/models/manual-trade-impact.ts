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
 * @interface ManualTradeImpact
 */
export interface ManualTradeImpact {
    [key: string]: any;

    /**
     * Unique identifier for the connected brokerage account. This is the UUID used to reference the account in SnapTrade.
     * @type {string}
     * @memberof ManualTradeImpact
     */
    'account'?: string;
    /**
     * Unique identifier for the currency. This is the UUID used to reference the currency in SnapTrade.
     * @type {string}
     * @memberof ManualTradeImpact
     */
    'currency'?: string;
    /**
     * Estimated amount of cash remaining in the account after the trade.
     * @type {number}
     * @memberof ManualTradeImpact
     */
    'remaining_cash'?: number | null;
    /**
     * Estimated commission for the trade.
     * @type {number}
     * @memberof ManualTradeImpact
     */
    'estimated_commission'?: number | null;
    /**
     * Estimated foreign transaction fees for the trade.
     * @type {number}
     * @memberof ManualTradeImpact
     */
    'forex_fees'?: number | null;
}

