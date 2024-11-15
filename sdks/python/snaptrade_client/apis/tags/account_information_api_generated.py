# coding: utf-8
"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Created by: https://snaptrade.com/
"""

from snaptrade_client.paths.holdings.get import GetAllUserHoldings
from snaptrade_client.paths.accounts_account_id_balances.get import GetUserAccountBalance
from snaptrade_client.paths.accounts_account_id.get import GetUserAccountDetails
from snaptrade_client.paths.accounts_account_id_orders.get import GetUserAccountOrders
from snaptrade_client.paths.accounts_account_id_positions.get import GetUserAccountPositions
from snaptrade_client.paths.accounts_account_id_recent_orders.get import GetUserAccountRecentOrders
from snaptrade_client.paths.accounts_account_id_return_rates.get import GetUserAccountReturnRates
from snaptrade_client.paths.accounts_account_id_holdings.get import GetUserHoldings
from snaptrade_client.paths.accounts.get import ListUserAccounts
from snaptrade_client.paths.accounts_account_id.put import UpdateUserAccount


class AccountInformationApiGenerated(
    GetAllUserHoldings,
    GetUserAccountBalance,
    GetUserAccountDetails,
    GetUserAccountOrders,
    GetUserAccountPositions,
    GetUserAccountRecentOrders,
    GetUserAccountReturnRates,
    GetUserHoldings,
    ListUserAccounts,
    UpdateUserAccount,
):
    """NOTE:
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    pass
