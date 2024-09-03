/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { AccountSimple } from './account-simple';
import { UniversalActivityCurrency } from './universal-activity-currency';
import { UniversalActivityOptionSymbol } from './universal-activity-option-symbol';
import { UniversalActivitySymbol } from './universal-activity-symbol';

/**
 * A transaction or activity from an institution
 * @export
 * @interface UniversalActivity
 */
export interface UniversalActivity {
    [key: string]: any;

    /**
     * Unique identifier for the transaction. This is the ID used to reference the transaction in SnapTrade.  Please note that this ID _can_ change if the transaction is deleted and re-added. Under normal circumstances, SnapTrade does not delete transactions. The only time this would happen is if SnapTrade re-fetches and reprocesses the data from the brokerage, which is rare. If you require a stable ID, please let us know and we can work with you to provide one. 
     * @type {string}
     * @memberof UniversalActivity
     */
    'id'?: string;
    /**
     * 
     * @type {AccountSimple}
     * @memberof UniversalActivity
     */
    'account'?: AccountSimple;
    /**
     * 
     * @type {UniversalActivitySymbol}
     * @memberof UniversalActivity
     */
    'symbol'?: UniversalActivitySymbol | null;
    /**
     * 
     * @type {UniversalActivityOptionSymbol}
     * @memberof UniversalActivity
     */
    'option_symbol'?: UniversalActivityOptionSymbol | null;
    /**
     * The price of the security for the transaction. This is mostly applicable to `BUY`, `SELL`, and `DIVIDEND` transactions.
     * @type {number}
     * @memberof UniversalActivity
     */
    'price'?: number;
    /**
     * The number of units of the security for the transaction. This is mostly applicable to `BUY`, `SELL`, and `DIVIDEND` transactions.
     * @type {number}
     * @memberof UniversalActivity
     */
    'units'?: number;
    /**
     * The amount of the transaction denominated in `currency`. This can be positive or negative. In general, transactions that positively affect the account balance (like sell, deposits, dividends, etc) will have a positive amount, while transactions that negatively affect the account balance (like buy, withdrawals, fees, etc) will have a negative amount.
     * @type {number}
     * @memberof UniversalActivity
     */
    'amount'?: number | null;
    /**
     * 
     * @type {UniversalActivityCurrency}
     * @memberof UniversalActivity
     */
    'currency'?: UniversalActivityCurrency;
    /**
     * A string representing the type of transaction. SnapTrade does a best effort to categorize the brokerage transaction types into a common set of values. Here are some of the most popular values:   - BUY   - SELL   - DIVIDEND   - CONTRIBUTION   - WITHDRAWAL   - REI   - INTEREST   - FEE 
     * @type {string}
     * @memberof UniversalActivity
     */
    'type'?: string;
    /**
     * If an option `BUY` or `SELL` transaction, this further specifies the type of action. The possible values are: - BUY_TO_OPEN - BUY_TO_CLOSE - SELL_TO_OPEN - SELL_TO_CLOSE 
     * @type {string}
     * @memberof UniversalActivity
     */
    'option_type'?: string;
    /**
     * A human-readable description of the transaction. This is usually the brokerage\'s description of the transaction.
     * @type {string}
     * @memberof UniversalActivity
     */
    'description'?: string;
    /**
     * The recorded time for the transaction. The granularity of this timestamp depends on the brokerage. Some brokerages provide the exact time of the transaction, while others provide only the date. Please check the [integrations page](https://snaptrade.notion.site/66793431ad0b416489eaabaf248d0afb?v=6fab8012ade6441fa0c6d9af9c55ce3a) for the specific brokerage to see the granularity of the timestamps. Note that even though the field is named `trade_date`, it can represent any type of transaction, not just trades.
     * @type {string}
     * @memberof UniversalActivity
     */
    'trade_date'?: string | null;
    /**
     * The date on which the transaction is settled.
     * @type {string}
     * @memberof UniversalActivity
     */
    'settlement_date'?: string;
    /**
     * Any fee associated with the transaction if provided by the brokerage.
     * @type {number}
     * @memberof UniversalActivity
     */
    'fee'?: number;
    /**
     * The forex conversion rate involved in the transaction if provided by the brokerage. Used in cases where securities of one currency are purchased in a different currency, and the forex conversion is automatic. In those cases, price, amount and fee will be in the top level currency (activity -> currency)
     * @type {number}
     * @memberof UniversalActivity
     */
    'fx_rate'?: number | null;
    /**
     * The institution that the transaction is associated with. This is usually the brokerage name.
     * @type {string}
     * @memberof UniversalActivity
     */
    'institution'?: string;
    /**
     * Reference ID from brokerage used to identify related transactions. For example if an order comprises of several transactions (buy, fee, fx), they can be grouped if they share the same `external_reference_id`
     * @type {string}
     * @memberof UniversalActivity
     */
    'external_reference_id'?: string | null;
}

