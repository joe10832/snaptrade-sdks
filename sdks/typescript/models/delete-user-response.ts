/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/


/**
 * Response when delete user is successful
 * @export
 * @interface DeleteUserResponse
 */
export interface DeleteUserResponse {
    [key: string]: any;

    /**
     * Delete status
     * @type {string}
     * @memberof DeleteUserResponse
     */
    'status'?: string;
    /**
     * SnapTrade User ID. Provided by SnapTrade Partner. Can be any string, as long as it\'s unique to a user
     * @type {string}
     * @memberof DeleteUserResponse
     */
    'userId'?: string;
}

