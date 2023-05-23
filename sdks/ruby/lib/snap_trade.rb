=begin
#SnapTrade

#Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

=end

require 'forwardable'

# Common files
require 'snap_trade/api_client'
require 'snap_trade/api_error'
require 'snap_trade/version'
require 'snap_trade/configuration'

# Models
require 'snap_trade/models/account'
require 'snap_trade/models/account_holdings'
require 'snap_trade/models/account_holdings_account'
require 'snap_trade/models/account_order_record'
require 'snap_trade/models/account_order_record_status'
require 'snap_trade/models/account_simple'
require 'snap_trade/models/account_sync_status'
require 'snap_trade/models/action'
require 'snap_trade/models/auth_type'
require 'snap_trade/models/authentication_login_snap_trade_user200_response'
require 'snap_trade/models/balance'
require 'snap_trade/models/brokerage'
require 'snap_trade/models/brokerage_authorization'
require 'snap_trade/models/brokerage_authorization_type'
require 'snap_trade/models/brokerage_authorization_type_read_only'
require 'snap_trade/models/brokerage_authorization_type_read_only_brokerage'
require 'snap_trade/models/brokerage_authorization_type_read_only_type'
require 'snap_trade/models/brokerage_authorization_type_type'
require 'snap_trade/models/brokerage_symbol'
require 'snap_trade/models/brokerage_type'
require 'snap_trade/models/calculated_trade'
require 'snap_trade/models/cash_restriction'
require 'snap_trade/models/connection_type'
require 'snap_trade/models/connections_session_events200_response_inner'
require 'snap_trade/models/currency'
require 'snap_trade/models/delete_user_response'
require 'snap_trade/models/dividend_at_date'
require 'snap_trade/models/encrypted_response'
require 'snap_trade/models/encrypted_response_encrypted_message_data'
require 'snap_trade/models/exchange'
require 'snap_trade/models/exchange_rate_pairs'
require 'snap_trade/models/excluded_asset'
require 'snap_trade/models/jwt'
require 'snap_trade/models/login_redirect_uri'
require 'snap_trade/models/manual_trade'
require 'snap_trade/models/manual_trade_and_impact'
require 'snap_trade/models/manual_trade_balance'
require 'snap_trade/models/manual_trade_form'
require 'snap_trade/models/manual_trade_symbol'
require 'snap_trade/models/model400_failed_request_response'
require 'snap_trade/models/model401_failed_request_response'
require 'snap_trade/models/model403_failed_request_response'
require 'snap_trade/models/model404_failed_request_response'
require 'snap_trade/models/model_asset_class'
require 'snap_trade/models/model_asset_class_details'
require 'snap_trade/models/model_asset_class_target'
require 'snap_trade/models/model_portfolio'
require 'snap_trade/models/model_portfolio_asset_class'
require 'snap_trade/models/model_portfolio_details'
require 'snap_trade/models/model_portfolio_security'
require 'snap_trade/models/model_type'
require 'snap_trade/models/monthly_dividends'
require 'snap_trade/models/net_contributions'
require 'snap_trade/models/net_dividend'
require 'snap_trade/models/option_chain_inner'
require 'snap_trade/models/option_chain_inner_chain_per_root_inner'
require 'snap_trade/models/option_chain_inner_chain_per_root_inner_chain_per_strike_price_inner'
require 'snap_trade/models/option_leg'
require 'snap_trade/models/option_leg_action'
require 'snap_trade/models/option_strategy'
require 'snap_trade/models/option_strategy_legs_inner'
require 'snap_trade/models/options_get_option_strategy_request'
require 'snap_trade/models/options_holdings'
require 'snap_trade/models/options_place_option_strategy_request'
require 'snap_trade/models/options_position'
require 'snap_trade/models/options_symbol'
require 'snap_trade/models/order_strategy_execute_body_order_type'
require 'snap_trade/models/order_strategy_execute_body_time_in_force'
require 'snap_trade/models/order_type'
require 'snap_trade/models/partner_data'
require 'snap_trade/models/past_value'
require 'snap_trade/models/performance_custom'
require 'snap_trade/models/portfolio_group'
require 'snap_trade/models/portfolio_group_info'
require 'snap_trade/models/portfolio_group_position'
require 'snap_trade/models/portfolio_group_settings'
require 'snap_trade/models/position'
require 'snap_trade/models/position_symbol'
require 'snap_trade/models/redirect_tokenand_pin'
require 'snap_trade/models/security_type'
require 'snap_trade/models/session_event'
require 'snap_trade/models/session_event_type'
require 'snap_trade/models/snap_trade_api_disclaimer_accept_status'
require 'snap_trade/models/snap_trade_holdings_account'
require 'snap_trade/models/snap_trade_holdings_account_account_id'
require 'snap_trade/models/snap_trade_holdings_total_value'
require 'snap_trade/models/snap_trade_login_user_request_body'
require 'snap_trade/models/snap_trade_register_user_request_body'
require 'snap_trade/models/state'
require 'snap_trade/models/status'
require 'snap_trade/models/strategy_impact'
require 'snap_trade/models/strategy_impact_legs_inner'
require 'snap_trade/models/strategy_order_place'
require 'snap_trade/models/strategy_order_place_orders_inner'
require 'snap_trade/models/strategy_order_place_orders_inner_legs_inner'
require 'snap_trade/models/strategy_order_record'
require 'snap_trade/models/strategy_order_record_order_type'
require 'snap_trade/models/strategy_order_record_status'
require 'snap_trade/models/strategy_order_record_time_in_force'
require 'snap_trade/models/strategy_quotes'
require 'snap_trade/models/strategy_quotes_greek'
require 'snap_trade/models/strategy_type'
require 'snap_trade/models/sub_period_return_rate'
require 'snap_trade/models/symbol'
require 'snap_trade/models/symbol_query'
require 'snap_trade/models/symbols_quotes'
require 'snap_trade/models/target_asset'
require 'snap_trade/models/time_in_force'
require 'snap_trade/models/trade'
require 'snap_trade/models/trade_action'
require 'snap_trade/models/trade_execution_status'
require 'snap_trade/models/trade_execution_status_action'
require 'snap_trade/models/trade_impact'
require 'snap_trade/models/trading_cancel_user_account_order_request'
require 'snap_trade/models/trading_place_oco_order_request'
require 'snap_trade/models/transactions_status'
require 'snap_trade/models/type'
require 'snap_trade/models/us_exchange'
require 'snap_trade/models/underlying_symbol'
require 'snap_trade/models/universal_activity'
require 'snap_trade/models/universal_symbol'
require 'snap_trade/models/universal_symbol_ticker'
require 'snap_trade/models/user_error_log'
require 'snap_trade/models/user_i_dand_secret'
require 'snap_trade/models/user_settings'

# APIs
require 'snap_trade/api/account_information_api'
require 'snap_trade/api/api_status_api'
require 'snap_trade/api/authentication_api'
require 'snap_trade/api/connections_api'
require 'snap_trade/api/error_logs_api'
require 'snap_trade/api/options_api'
require 'snap_trade/api/portfolio_management_api'
require 'snap_trade/api/reference_data_api'
require 'snap_trade/api/trading_api'
require 'snap_trade/api/transactions_and_reporting_api'

module SnapTrade
  @config = Configuration.default
  SENTINEL = Object.new
  class << self
    extend Forwardable

    def is_sentinel(value)
      value == SENTINEL
    end

    def_delegators :@config, :client_id, :client_id= # api key
    def_delegators :@config, :signature, :signature= # api key
    def_delegators :@config, :timestamp, :timestamp= # api key
    def_delegators :@config, :consumer_key, :consumer_key= # client state from konfig.yaml

    # Customize default settings for the SDK using block.
    #   SnapTrade.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end

  class Client
    attr_accessor :account_information
    attr_accessor :api_status
    attr_accessor :authentication
    attr_accessor :connections
    attr_accessor :error_logs
    attr_accessor :options
    attr_accessor :portfolio_management
    attr_accessor :reference_data
    attr_accessor :trading
    attr_accessor :transactions_and_reporting

    def initialize(config = Configuration.default)
      @api_client = ApiClient::new(config)
      @account_information = SnapTrade::AccountInformationApi.new(@api_client)
      @api_status = SnapTrade::APIStatusApi.new(@api_client)
      @authentication = SnapTrade::AuthenticationApi.new(@api_client)
      @connections = SnapTrade::ConnectionsApi.new(@api_client)
      @error_logs = SnapTrade::ErrorLogsApi.new(@api_client)
      @options = SnapTrade::OptionsApi.new(@api_client)
      @portfolio_management = SnapTrade::PortfolioManagementApi.new(@api_client)
      @reference_data = SnapTrade::ReferenceDataApi.new(@api_client)
      @trading = SnapTrade::TradingApi.new(@api_client)
      @transactions_and_reporting = SnapTrade::TransactionsAndReportingApi.new(@api_client)
    end
  end
end
