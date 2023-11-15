/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"

import { ModelAssetClass } from './model-asset-class';

/**
 * 
 * @export
 * @interface ModelPortfolioAssetClass
 */
export interface ModelPortfolioAssetClass {
    [key: string]: any;

    /**
     * 
     * @type {ModelAssetClass}
     * @memberof ModelPortfolioAssetClass
     */
    'model_asset_class'?: ModelAssetClass;
    /**
     * 
     * @type {number}
     * @memberof ModelPortfolioAssetClass
     */
    'percent'?: number;
}

