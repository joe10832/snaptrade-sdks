/* tslint:disable */
/* eslint-disable */
/**
 * SnapTrade
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * https://konfigthis.com
 * Do not edit the class manually.
 */


/**
 * Status of account transaction sync
 * @export
 * @interface TransactionsStatus
 */
export interface TransactionsStatus {
    /**
     * 
     * @type {boolean}
     * @memberof TransactionsStatus
     */
    'initial_sync_completed'?: boolean;
    /**
     * Date in YYYY-MM-DD format or null
     * @type {string}
     * @memberof TransactionsStatus
     */
    'last_successful_sync'?: string | null;
}

