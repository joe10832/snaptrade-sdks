# coding: utf-8

"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Created by: https://snaptrade.com/
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from snaptrade_client import schemas  # noqa: F401


class AccountHoldingsAccount(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Account Holdings with Account ID
    """


    class MetaOapg:
        
        class properties:
        
            @staticmethod
            def account() -> typing.Type['SnapTradeHoldingsAccountAccountId']:
                return SnapTradeHoldingsAccountAccountId
        
            @staticmethod
            def balances() -> typing.Type['AccountHoldingsAccountBalances']:
                return AccountHoldingsAccountBalances
        
            @staticmethod
            def positions() -> typing.Type['AccountHoldingsAccountPositions']:
                return AccountHoldingsAccountPositions
        
            @staticmethod
            def orders() -> typing.Type['AccountHoldingsAccountOrders']:
                return AccountHoldingsAccountOrders
        
            @staticmethod
            def total_value() -> typing.Type['SnapTradeHoldingsTotalValue']:
                return SnapTradeHoldingsTotalValue
            __annotations__ = {
                "account": account,
                "balances": balances,
                "positions": positions,
                "orders": orders,
                "total_value": total_value,
            }
        additional_properties = schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account"]) -> 'SnapTradeHoldingsAccountAccountId': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["balances"]) -> 'AccountHoldingsAccountBalances': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["positions"]) -> 'AccountHoldingsAccountPositions': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["orders"]) -> 'AccountHoldingsAccountOrders': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["total_value"]) -> 'SnapTradeHoldingsTotalValue': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["account"], typing_extensions.Literal["balances"], typing_extensions.Literal["positions"], typing_extensions.Literal["orders"], typing_extensions.Literal["total_value"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account"]) -> typing.Union['SnapTradeHoldingsAccountAccountId', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["balances"]) -> typing.Union['AccountHoldingsAccountBalances', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["positions"]) -> typing.Union['AccountHoldingsAccountPositions', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["orders"]) -> typing.Union['AccountHoldingsAccountOrders', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["total_value"]) -> typing.Union['SnapTradeHoldingsTotalValue', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["account"], typing_extensions.Literal["balances"], typing_extensions.Literal["positions"], typing_extensions.Literal["orders"], typing_extensions.Literal["total_value"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        account: typing.Union['SnapTradeHoldingsAccountAccountId', schemas.Unset] = schemas.unset,
        balances: typing.Union['AccountHoldingsAccountBalances', schemas.Unset] = schemas.unset,
        positions: typing.Union['AccountHoldingsAccountPositions', schemas.Unset] = schemas.unset,
        orders: typing.Union['AccountHoldingsAccountOrders', schemas.Unset] = schemas.unset,
        total_value: typing.Union['SnapTradeHoldingsTotalValue', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'AccountHoldingsAccount':
        return super().__new__(
            cls,
            *args,
            account=account,
            balances=balances,
            positions=positions,
            orders=orders,
            total_value=total_value,
            _configuration=_configuration,
            **kwargs,
        )

from snaptrade_client.model.account_holdings_account_balances import AccountHoldingsAccountBalances
from snaptrade_client.model.account_holdings_account_orders import AccountHoldingsAccountOrders
from snaptrade_client.model.account_holdings_account_positions import AccountHoldingsAccountPositions
from snaptrade_client.model.snap_trade_holdings_account_account_id import SnapTradeHoldingsAccountAccountId
from snaptrade_client.model.snap_trade_holdings_total_value import SnapTradeHoldingsTotalValue
