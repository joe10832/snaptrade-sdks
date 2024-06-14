# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from snaptrade_client.apis.path_to_api import path_to_api

import enum


class PathValues(str, enum.Enum):
    _ = "/"
    SNAP_TRADE_REGISTER_USER = "/snapTrade/registerUser"
    SNAP_TRADE_LOGIN = "/snapTrade/login"
    SNAP_TRADE_LIST_USERS = "/snapTrade/listUsers"
    SNAP_TRADE_DELETE_USER = "/snapTrade/deleteUser"
    SNAP_TRADE_ENCRYPTED_JWT = "/snapTrade/encryptedJWT"
    SNAP_TRADE_RESET_USER_SECRET = "/snapTrade/resetUserSecret"
    AUTHORIZATIONS = "/authorizations"
    AUTHORIZATIONS_AUTHORIZATION_ID = "/authorizations/{authorizationId}"
    AUTHORIZATIONS_AUTHORIZATION_ID_REFRESH = "/authorizations/{authorizationId}/refresh"
    SESSION_EVENTS = "/sessionEvents"
    ACCOUNTS = "/accounts"
    HOLDINGS = "/holdings"
    ACCOUNTS_ACCOUNT_ID_HOLDINGS = "/accounts/{accountId}/holdings"
    ACCOUNTS_ACCOUNT_ID = "/accounts/{accountId}"
    ACCOUNTS_ACCOUNT_ID_BALANCES = "/accounts/{accountId}/balances"
    ACCOUNTS_ACCOUNT_ID_POSITIONS = "/accounts/{accountId}/positions"
    ACCOUNTS_ACCOUNT_ID_ORDERS = "/accounts/{accountId}/orders"
    ACCOUNTS_ACCOUNT_ID_QUOTES = "/accounts/{accountId}/quotes"
    TRADE_IMPACT = "/trade/impact"
    TRADE_TRADE_ID = "/trade/{tradeId}"
    TRADE_PLACE = "/trade/place"
    ACCOUNTS_ACCOUNT_ID_ORDERS_CANCEL = "/accounts/{accountId}/orders/cancel"
    SNAP_TRADE_PARTNERS = "/snapTrade/partners"
    ACCOUNTS_ACCOUNT_ID_SYMBOLS = "/accounts/{accountId}/symbols"
    ACCOUNTS_ACCOUNT_ID_OPTIONS = "/accounts/{accountId}/options"
    ACCOUNTS_ACCOUNT_ID_OPTIONS_CHAIN = "/accounts/{accountId}/optionsChain"
    ACCOUNTS_ACCOUNT_ID_OPTION_STRATEGY = "/accounts/{accountId}/optionStrategy"
    ACCOUNTS_ACCOUNT_ID_OPTION_STRATEGY_OPTION_STRATEGY_ID = "/accounts/{accountId}/optionStrategy/{optionStrategyId}"
    ACCOUNTS_ACCOUNT_ID_OPTION_STRATEGY_OPTION_STRATEGY_ID_EXECUTE = "/accounts/{accountId}/optionStrategy/{optionStrategyId}/execute"
    BROKERAGES = "/brokerages"
    BROKERAGE_AUTHORIZATION_TYPES = "/brokerageAuthorizationTypes"
    CURRENCIES = "/currencies"
    CURRENCIES_RATES = "/currencies/rates"
    CURRENCIES_RATES_CURRENCY_PAIR = "/currencies/rates/{currencyPair}"
    EXCHANGES = "/exchanges"
    SECURITY_TYPES = "/securityTypes"
    SYMBOLS = "/symbols"
    SYMBOLS_QUERY = "/symbols/{query}"
    ACTIVITIES = "/activities"
    PERFORMANCE_CUSTOM = "/performance/custom"
