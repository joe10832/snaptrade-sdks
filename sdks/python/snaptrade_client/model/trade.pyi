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


class Trade(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    A trade object
    """


    class MetaOapg:
        
        class properties:
            id = schemas.UUIDSchema
        
            @staticmethod
            def account() -> typing.Type['Account']:
                return Account
        
            @staticmethod
            def symbol() -> typing.Type['BrokerageSymbol']:
                return BrokerageSymbol
        
            @staticmethod
            def universal_symbol() -> typing.Type['UniversalSymbol']:
                return UniversalSymbol
            
            
            class action(
                schemas.EnumBase,
                schemas.StrSchema
            ):
                
                @schemas.classproperty
                def BUY(cls):
                    return cls("BUY")
                
                @schemas.classproperty
                def SELL(cls):
                    return cls("SELL")
            units = schemas.IntSchema
            price = schemas.NumberSchema
            sequence = schemas.IntSchema
            __annotations__ = {
                "id": id,
                "account": account,
                "symbol": symbol,
                "universal_symbol": universal_symbol,
                "action": action,
                "units": units,
                "price": price,
                "sequence": sequence,
            }
        additional_properties = schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["id"]) -> MetaOapg.properties.id: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["account"]) -> 'Account': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["symbol"]) -> 'BrokerageSymbol': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["universal_symbol"]) -> 'UniversalSymbol': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["action"]) -> MetaOapg.properties.action: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["units"]) -> MetaOapg.properties.units: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["price"]) -> MetaOapg.properties.price: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["sequence"]) -> MetaOapg.properties.sequence: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["id"], typing_extensions.Literal["account"], typing_extensions.Literal["symbol"], typing_extensions.Literal["universal_symbol"], typing_extensions.Literal["action"], typing_extensions.Literal["units"], typing_extensions.Literal["price"], typing_extensions.Literal["sequence"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["id"]) -> typing.Union[MetaOapg.properties.id, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["account"]) -> typing.Union['Account', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["symbol"]) -> typing.Union['BrokerageSymbol', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["universal_symbol"]) -> typing.Union['UniversalSymbol', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["action"]) -> typing.Union[MetaOapg.properties.action, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["units"]) -> typing.Union[MetaOapg.properties.units, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["price"]) -> typing.Union[MetaOapg.properties.price, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["sequence"]) -> typing.Union[MetaOapg.properties.sequence, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["id"], typing_extensions.Literal["account"], typing_extensions.Literal["symbol"], typing_extensions.Literal["universal_symbol"], typing_extensions.Literal["action"], typing_extensions.Literal["units"], typing_extensions.Literal["price"], typing_extensions.Literal["sequence"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        id: typing.Union[MetaOapg.properties.id, str, uuid.UUID, schemas.Unset] = schemas.unset,
        account: typing.Union['Account', schemas.Unset] = schemas.unset,
        symbol: typing.Union['BrokerageSymbol', schemas.Unset] = schemas.unset,
        universal_symbol: typing.Union['UniversalSymbol', schemas.Unset] = schemas.unset,
        action: typing.Union[MetaOapg.properties.action, str, schemas.Unset] = schemas.unset,
        units: typing.Union[MetaOapg.properties.units, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        price: typing.Union[MetaOapg.properties.price, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        sequence: typing.Union[MetaOapg.properties.sequence, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'Trade':
        return super().__new__(
            cls,
            *args,
            id=id,
            account=account,
            symbol=symbol,
            universal_symbol=universal_symbol,
            action=action,
            units=units,
            price=price,
            sequence=sequence,
            _configuration=_configuration,
            **kwargs,
        )

from snaptrade_client.model.account import Account
from snaptrade_client.model.account_balance import AccountBalance
from snaptrade_client.model.account_meta import AccountMeta
from snaptrade_client.model.account_sync_status import AccountSyncStatus
from snaptrade_client.model.brokerage import Brokerage
from snaptrade_client.model.brokerage_authorization import BrokerageAuthorization
from snaptrade_client.model.brokerage_authorization_meta import BrokerageAuthorizationMeta
from snaptrade_client.model.brokerage_exchanges import BrokerageExchanges
from snaptrade_client.model.brokerage_symbol import BrokerageSymbol
from snaptrade_client.model.brokerage_type import BrokerageType
from snaptrade_client.model.cash_restriction import CashRestriction
from snaptrade_client.model.currency import Currency
from snaptrade_client.model.exchange import Exchange
from snaptrade_client.model.options_symbol import OptionsSymbol
from snaptrade_client.model.security_type import SecurityType
from snaptrade_client.model.underlying_symbol import UnderlyingSymbol
from snaptrade_client.model.universal_symbol import UniversalSymbol
from snaptrade_client.model.us_exchange import USExchange
