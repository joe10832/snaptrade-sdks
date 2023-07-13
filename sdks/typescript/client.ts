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

import { AxiosRequestConfig } from "axios";
import {
  AccountInformationApi,
  ApiStatusApi,
  AuthenticationApi,
  ConnectionsApi,
  ErrorLogsApi,
  OptionsApi,
  ReferenceDataApi,
  TradingApi,
  TransactionsAndReportingApi,
} from "./api";
import { Configuration, ConfigurationParameters } from "./configuration";
import { SnaptradeCustom } from "./client-custom";

export class Snaptrade extends SnaptradeCustom {
  readonly accountInformation: AccountInformationApi;
  readonly apiStatus: ApiStatusApi;
  readonly authentication: AuthenticationApi;
  readonly connections: ConnectionsApi;
  readonly errorLogs: ErrorLogsApi;
  readonly options: OptionsApi;
  readonly referenceData: ReferenceDataApi;
  readonly trading: TradingApi;
  readonly transactionsAndReporting: TransactionsAndReportingApi;

  constructor(configurationParameters: ConfigurationParameters) {
    super(configurationParameters);
    const configuration = new Configuration(configurationParameters);
    this.accountInformation = new AccountInformationApi(configuration);
    this.apiStatus = new ApiStatusApi(configuration);
    this.authentication = new AuthenticationApi(configuration);
    this.connections = new ConnectionsApi(configuration);
    this.errorLogs = new ErrorLogsApi(configuration);
    this.options = new OptionsApi(configuration);
    this.referenceData = new ReferenceDataApi(configuration);
    this.trading = new TradingApi(configuration);
    this.transactionsAndReporting = new TransactionsAndReportingApi(configuration);
  }

}
