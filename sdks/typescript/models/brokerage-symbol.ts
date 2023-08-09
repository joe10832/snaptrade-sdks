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
import { BrokerageAuthorization } from './brokerage-authorization';
// May contain unused imports in some cases
// @ts-ignore
import { BrokerageSymbolOptionSymbol } from './brokerage-symbol-option-symbol';
// May contain unused imports in some cases
// @ts-ignore
import { BrokerageSymbolSymbol } from './brokerage-symbol-symbol';

/**
 * Brokerage symbol
 * @export
 * @interface BrokerageSymbol
 */
export interface BrokerageSymbol {
    [key: string]: any;

    /**
     * 
     * @type {string}
     * @memberof BrokerageSymbol
     */
    'id'?: string;
    /**
     * 
     * @type {BrokerageSymbolSymbol}
     * @memberof BrokerageSymbol
     */
    'symbol'?: BrokerageSymbolSymbol | null;
    /**
     * 
     * @type {BrokerageAuthorization}
     * @memberof BrokerageSymbol
     */
    'brokerage_authorization'?: BrokerageAuthorization;
    /**
     * 
     * @type {string}
     * @memberof BrokerageSymbol
     */
    'description'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof BrokerageSymbol
     */
    'allows_fractional_units'?: boolean | null;
    /**
     * 
     * @type {BrokerageSymbolOptionSymbol}
     * @memberof BrokerageSymbol
     */
    'option_symbol'?: BrokerageSymbolOptionSymbol | null;
}

