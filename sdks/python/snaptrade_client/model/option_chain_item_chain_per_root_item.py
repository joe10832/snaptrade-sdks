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


class OptionChainItemChainPerRootItem(
    schemas.DictSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        
        class properties:
            optionRoot = schemas.StrSchema
        
            @staticmethod
            def chainPerStrikePrice() -> typing.Type['OptionChainItemChainPerRootItemChainPerStrikePrice']:
                return OptionChainItemChainPerRootItemChainPerStrikePrice
            multiplier = schemas.Int32Schema
            __annotations__ = {
                "optionRoot": optionRoot,
                "chainPerStrikePrice": chainPerStrikePrice,
                "multiplier": multiplier,
            }
        additional_properties = schemas.AnyTypeSchema
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["optionRoot"]) -> MetaOapg.properties.optionRoot: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["chainPerStrikePrice"]) -> 'OptionChainItemChainPerRootItemChainPerStrikePrice': ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["multiplier"]) -> MetaOapg.properties.multiplier: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> MetaOapg.additional_properties: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["optionRoot"], typing_extensions.Literal["chainPerStrikePrice"], typing_extensions.Literal["multiplier"], str, ]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["optionRoot"]) -> typing.Union[MetaOapg.properties.optionRoot, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["chainPerStrikePrice"]) -> typing.Union['OptionChainItemChainPerRootItemChainPerStrikePrice', schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["multiplier"]) -> typing.Union[MetaOapg.properties.multiplier, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[MetaOapg.additional_properties, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["optionRoot"], typing_extensions.Literal["chainPerStrikePrice"], typing_extensions.Literal["multiplier"], str, ]):
        return super().get_item_oapg(name)

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, ],
        optionRoot: typing.Union[MetaOapg.properties.optionRoot, str, schemas.Unset] = schemas.unset,
        chainPerStrikePrice: typing.Union['OptionChainItemChainPerRootItemChainPerStrikePrice', schemas.Unset] = schemas.unset,
        multiplier: typing.Union[MetaOapg.properties.multiplier, decimal.Decimal, int, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[MetaOapg.additional_properties, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
    ) -> 'OptionChainItemChainPerRootItem':
        return super().__new__(
            cls,
            *args,
            optionRoot=optionRoot,
            chainPerStrikePrice=chainPerStrikePrice,
            multiplier=multiplier,
            _configuration=_configuration,
            **kwargs,
        )

from snaptrade_client.model.option_chain_item_chain_per_root_item_chain_per_strike_price import OptionChainItemChainPerRootItemChainPerStrikePrice
