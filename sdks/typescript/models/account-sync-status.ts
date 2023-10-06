/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/

import { TransactionsStatus } from './transactions-status';

/**
 * Status of account
 * @export
 * @interface AccountSyncStatus
 */
export interface AccountSyncStatus {
    /**
     * 
     * @type {TransactionsStatus}
     * @memberof AccountSyncStatus
     */
    'transactions'?: TransactionsStatus;
}

