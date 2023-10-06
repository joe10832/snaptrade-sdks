/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/

import { Currency } from './currency';
import { Exchange } from './exchange';
import { SecurityType } from './security-type';
import { UniversalSymbol } from './universal-symbol';

/**
 * 
 * @export
 * @interface ModelAssetClassTarget
 */
export interface ModelAssetClassTarget {
    [key: string]: any;

    /**
     * 
     * @type {UniversalSymbol}
     * @memberof ModelAssetClassTarget
     */
    'symbol'?: UniversalSymbol;
}

