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


/**
 * 
 * @export
 * @interface ModelPortfolio
 */
export interface ModelPortfolio {
    [key: string]: any;

    /**
     * 
     * @type {string}
     * @memberof ModelPortfolio
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof ModelPortfolio
     */
    'name'?: string;
    /**
     * Enum definitions -> [-1: Unassigned, 0: Security Model Portfolio, 1: Asset Class Portfolio]
     * @type {number}
     * @memberof ModelPortfolio
     */
    'model_type'?: ModelPortfolioModelTypeEnum;
}

type ModelPortfolioModelTypeEnum = -1 | 0 | 1


