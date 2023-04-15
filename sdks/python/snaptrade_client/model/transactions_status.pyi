# coding: utf-8

"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Generated by: https://konfigthis.com
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


class TransactionsStatus(
    schemas.AnyTypeSchema,
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)

    Status of account transaction sync
    """


    class MetaOapg:
        
        class properties:
            initial_sync_completed = schemas.BoolSchema
            
            
            class last_successful_sync(
                schemas.DateBase,
                schemas.StrBase,
                schemas.NoneBase,
                schemas.Schema,
                schemas.NoneStrMixin
            ):
            
            
                class MetaOapg:
                    format = 'date'
            
            
                def __new__(
                    cls,
                    *args: typing.Union[None, str, date, ],
                    _configuration: typing.Optional[schemas.Configuration] = None,
                ) -> 'last_successful_sync':
                    return super().__new__(
                        cls,
                        *args,
                        _configuration=_configuration,
                    )
            __annotations__ = {
                "initial_sync_completed": initial_sync_completed,
                "last_successful_sync": last_successful_sync,
            }

    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["initial_sync_completed"]) -> MetaOapg.properties.initial_sync_completed: ...
    
    @typing.overload
    def __getitem__(self, name: typing_extensions.Literal["last_successful_sync"]) -> MetaOapg.properties.last_successful_sync: ...
    
    @typing.overload
    def __getitem__(self, name: str) -> schemas.UnsetAnyTypeSchema: ...
    
    def __getitem__(self, name: typing.Union[typing_extensions.Literal["initial_sync_completed", "last_successful_sync", ], str]):
        # dict_instance[name] accessor
        return super().__getitem__(name)
    
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["initial_sync_completed"]) -> typing.Union[MetaOapg.properties.initial_sync_completed, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: typing_extensions.Literal["last_successful_sync"]) -> typing.Union[MetaOapg.properties.last_successful_sync, schemas.Unset]: ...
    
    @typing.overload
    def get_item_oapg(self, name: str) -> typing.Union[schemas.UnsetAnyTypeSchema, schemas.Unset]: ...
    
    def get_item_oapg(self, name: typing.Union[typing_extensions.Literal["initial_sync_completed", "last_successful_sync", ], str]):
        return super().get_item_oapg(name)
    

    def __new__(
        cls,
        *args: typing.Union[dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader, ],
        initial_sync_completed: typing.Union[MetaOapg.properties.initial_sync_completed, bool, schemas.Unset] = schemas.unset,
        last_successful_sync: typing.Union[MetaOapg.properties.last_successful_sync, None, str, date, schemas.Unset] = schemas.unset,
        _configuration: typing.Optional[schemas.Configuration] = None,
        **kwargs: typing.Union[schemas.AnyTypeSchema, dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, None, list, tuple, bytes],
    ) -> 'TransactionsStatus':
        return super().__new__(
            cls,
            *args,
            initial_sync_completed=initial_sync_completed,
            last_successful_sync=last_successful_sync,
            _configuration=_configuration,
            **kwargs,
        )
