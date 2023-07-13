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
 * Do not edit the class manually.
 */

// May contain unused imports in some cases
// @ts-ignore
import { Currency } from './currency';
// May contain unused imports in some cases
// @ts-ignore
import { Exchange } from './exchange';
// May contain unused imports in some cases
// @ts-ignore
import { SecurityType } from './security-type';

/**
 * Symbol
 * @export
 * @interface Symbol
 */
export interface Symbol {
    [key: string]: any;

    /**
     * 
     * @type {string}
     * @memberof Symbol
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof Symbol
     */
    'symbol'?: string;
    /**
     * 
     * @type {string}
     * @memberof Symbol
     */
    'raw_symbol'?: string;
    /**
     * 
     * @type {string}
     * @memberof Symbol
     */
    'name'?: string;
    /**
     * 
     * @type {Currency}
     * @memberof Symbol
     */
    'currency'?: Currency;
    /**
     * 
     * @type {Exchange}
     * @memberof Symbol
     */
    'exchange'?: Exchange;
    /**
     * 
     * @type {SecurityType}
     * @memberof Symbol
     */
    'type'?: SecurityType;
}

