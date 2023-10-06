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


class StrategyQuotes(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
        
            @staticmethod
            def strategy() -> typing.Type['OptionStrategy']:
                return OptionStrategy
        
            @staticmethod
            def open_price() -> typing.Type['Price']:
                return Price
        
            @staticmethod
            def bid_price() -> typing.Type['Price']:
                return Price
        
            @staticmethod
            def ask_price() -> typing.Type['Price']:
                return Price
            volatility = schemas.NumberSchema
        
            @staticmethod
            def greek() -> typing.Type['StrategyQuotesGreek']:
                return StrategyQuotesGreek
            __annotations__ = {
                "strategy": strategy,
                "open_price": open_price,
                "bid_price": bid_price,
                "ask_price": ask_price,
                "volatility": volatility,
                "greek": greek,
            }
        additional_properties = schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["strategy"]) -> 'OptionStrategy': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["open_price"]) -> 'Price': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["bid_price"]) -> 'Price': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["ask_price"]) -> 'Price': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["volatility"]) -> MetaOapg.properties.volatility: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["greek"]) -> 'StrategyQuotesGreek': ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["strategy"], typing_extensions.Literal["open_price"], typing_extensions.Literal["bid_price"], typing_extensions.Literal["ask_price"], typing_extensions.Literal["volatility"], typing_extensions.Literal["greek"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["strategy"]) -> typing.Union['OptionStrategy', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["open_price"]) -> typing.Union['Price', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["bid_price"]) -> typing.Union['Price', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["ask_price"]) -> typing.Union['Price', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["volatility"]) -> typing.Union[MetaOapg.properties.volatility, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["greek"]) -> typing.Union['StrategyQuotesGreek', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["strategy"], typing_extensions.Literal["open_price"], typing_extensions.Literal["bid_price"], typing_extensions.Literal["ask_price"], typing_extensions.Literal["volatility"], typing_extensions.Literal["greek"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        strategy: typing.Union['OptionStrategy', schemas.Unset] = schemas.unset,
        open_price: typing.Union['Price', schemas.Unset] = schemas.unset,
        bid_price: typing.Union['Price', schemas.Unset] = schemas.unset,
        ask_price: typing.Union['Price', schemas.Unset] = schemas.unset,
        volatility: typing.Union[MetaOapg.properties.volatility, decimal.Decimal, int, float, schemas.Unset] = schemas.unset,
        greek: typing.Union['StrategyQuotesGreek', schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'StrategyQuotes':
        return super().__new__(
            cls,
            *args,
            strategy=strategy,
            open_price=open_price,
            bid_price=bid_price,
            ask_price=ask_price,
            volatility=volatility,
            greek=greek,
            _configuration=_configuration,
            **kwargs,
        )

from snaptrade_client.model.currency import Currency
from snaptrade_client.model.exchange import Exchange
from snaptrade_client.model.option_strategy import OptionStrategy
from snaptrade_client.model.option_strategy_legs import OptionStrategyLegs
from snaptrade_client.model.price import Price
from snaptrade_client.model.security_type import SecurityType
from snaptrade_client.model.strategy_quotes_greek import StrategyQuotesGreek
from snaptrade_client.model.universal_symbol import UniversalSymbol
