/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/

import { Account } from './account';
import { AccountSyncStatus } from './account-sync-status';
import { CashRestriction } from './cash-restriction';
import { Currency } from './currency';

/**
 * Balance
 * @export
 * @interface ManualTradeBalance
 */
export interface ManualTradeBalance {
    [key: string]: any;

    /**
     * 
     * @type {Account}
     * @memberof ManualTradeBalance
     */
    'account'?: Account;
    /**
     * 
     * @type {Currency}
     * @memberof ManualTradeBalance
     */
    'currency'?: Currency;
    /**
     * Cash
     * @type {number}
     * @memberof ManualTradeBalance
     */
    'cash'?: number | null;
}

