/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { AccountOrderRecordStatus } from './account-order-record-status';
import { OptionsSymbol } from './options-symbol';
import { UniversalSymbol } from './universal-symbol';

/**
 * Describes a single recent order in an account.
 * @export
 * @interface AccountOrderRecord
 */
export interface AccountOrderRecord {
    [key: string]: any;

    /**
     * Order ID returned by brokerage. This is the unique identifier for the order in the brokerage system.
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'brokerage_order_id'?: string;
    /**
     * Indicates the status of an order. SnapTrade does a best effort to map brokerage statuses to statuses in this enum.
     * @type {AccountOrderRecordStatus}
     * @memberof AccountOrderRecord
     */
    'status'?: AccountOrderRecordStatus;
    /**
     * A unique ID for the security within SnapTrade, scoped to the brokerage account that the security belongs to. This is a legacy field and should not be used. Do not rely on this being a stable ID as it can change.
     * @type {string}
     * @memberof AccountOrderRecord
     * @deprecated
     */
    'symbol'?: string;
    /**
     * 
     * @type {UniversalSymbol}
     * @memberof AccountOrderRecord
     */
    'universal_symbol'?: UniversalSymbol;
    /**
     * 
     * @type {OptionsSymbol}
     * @memberof AccountOrderRecord
     */
    'option_symbol'?: OptionsSymbol;
    /**
     * Trade Action potential values include (but are not limited to) - BUY - SELL - BUY_COVER - SELL_SHORT - BUY_OPEN - BUY_CLOSE - SELL_OPEN - SELL_CLOSE
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'action'?: string;
    /**
     * 
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'total_quantity'?: number | null;
    /**
     * Trade Units
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'open_quantity'?: number | null;
    /**
     * Trade Units
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'canceled_quantity'?: number | null;
    /**
     * Trade Units
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'filled_quantity'?: number | null;
    /**
     * Trade Price if limit or stop limit order
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'execution_price'?: number | null;
    /**
     * Trade Price if limit or stop limit order
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'limit_price'?: number | null;
    /**
     * Stop Price. If stop loss or stop limit order, the price to trigger the stop
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'stop_price'?: number | null;
    /**
     * Order Type potential values include (but are not limited to) - Limit - Market - StopLimit - StopLoss
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'order_type'?: string | null;
    /**
     * Trade time in force examples:   * FOK - Fill Or Kill   * Day - Day   * GTC - Good Til Canceled   * GTD - Good Til Date 
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'time_in_force'?: string;
    /**
     * Time
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'time_placed'?: string;
    /**
     * 
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'time_updated'?: string | null;
    /**
     * 
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'time_executed'?: string | null;
    /**
     * Time
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'expiry_date'?: string;
}

