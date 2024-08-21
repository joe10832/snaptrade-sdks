/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { AccountBalance } from './account-balance';
import { AccountSyncStatus } from './account-sync-status';

/**
 * A single account at a brokerage.
 * @export
 * @interface Account
 */
export interface Account {
    [key: string]: any;

    /**
     * Unique identifier for the connected brokerage account. This is the UUID used to reference the account in SnapTrade. This ID should not change for as long as the connection stays active. If the connection is deleted and re-added, a new account ID will be generated.
     * @type {string}
     * @memberof Account
     */
    'id'?: string;
    /**
     * Unique identifier for the connection. This is the UUID used to reference the connection in SnapTrade.
     * @type {string}
     * @memberof Account
     */
    'brokerage_authorization'?: string;
    /**
     * Portfolio Group ID. Portfolio Groups have been deprecated. Please contact support if you have a usecase for it.
     * @type {string}
     * @memberof Account
     * @deprecated
     */
    'portfolio_group'?: string;
    /**
     * A display name for the account. Either assigned by the user or by the brokerage itself. For certain brokerages, SnapTrade appends the brokerage name to the account name for clarity.
     * @type {string}
     * @memberof Account
     */
    'name'?: string | null;
    /**
     * The account number assigned by the brokerage. For some brokerages, this field may be masked for security reasons.
     * @type {string}
     * @memberof Account
     */
    'number'?: string;
    /**
     * The name of the brokerage that holds the account.
     * @type {string}
     * @memberof Account
     */
    'institution_name'?: string;
    /**
     * Timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format indicating when the account was created in SnapTrade. This is _not_ the account opening date at the brokerage.
     * @type {string}
     * @memberof Account
     */
    'created_date'?: string;
    /**
     * Additional information about the account, such as account type, status, etc. This information is specific to the brokerage and there\'s no standard format for this data. This field is deprecated and subject to removal in a future version.
     * @type {{ [key: string]: any; }}
     * @memberof Account
     * @deprecated
     */
    'meta'?: { [key: string]: any; };
    /**
     * This field is deprecated.
     * @type {Array<string>}
     * @memberof Account
     * @deprecated
     */
    'cash_restrictions'?: Array<string>;
    /**
     * 
     * @type {AccountSyncStatus}
     * @memberof Account
     */
    'sync_status'?: AccountSyncStatus;
    /**
     * 
     * @type {AccountBalance}
     * @memberof Account
     */
    'balance'?: AccountBalance;
}

