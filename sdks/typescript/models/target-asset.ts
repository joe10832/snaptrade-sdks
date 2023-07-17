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
import { UniversalSymbol } from './universal-symbol';

/**
 * Target percentage of a certain asset
 * @export
 * @interface TargetAsset
 */
export interface TargetAsset {
    [key: string]: any;

    /**
     * 
     * @type {string}
     * @memberof TargetAsset
     */
    'id'?: string;
    /**
     * 
     * @type {UniversalSymbol}
     * @memberof TargetAsset
     */
    'symbol'?: UniversalSymbol;
    /**
     * 
     * @type {number}
     * @memberof TargetAsset
     */
    'percent'?: number;
    /**
     * 
     * @type {boolean}
     * @memberof TargetAsset
     */
    'is_supported'?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof TargetAsset
     */
    'is_excluded'?: boolean;
    /**
     * 
     * @type {{ [key: string]: any; }}
     * @memberof TargetAsset
     */
    'meta'?: { [key: string]: any; } | null;
}

