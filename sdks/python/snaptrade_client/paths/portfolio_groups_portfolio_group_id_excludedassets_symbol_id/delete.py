# coding: utf-8

"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Generated by: https://konfigthis.com
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
import json

from snaptrade_client import api_client, exceptions
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

from . import path

# Path params
PortfolioGroupIdSchema = schemas.UUIDSchema
SymbolIdSchema = schemas.UUIDSchema
RequestRequiredPathParams = typing_extensions.TypedDict(
    'RequestRequiredPathParams',
    {
        'portfolioGroupId': typing.Union[PortfolioGroupIdSchema, str, uuid.UUID, ],
        'symbolId': typing.Union[SymbolIdSchema, str, uuid.UUID, ],
    }
)
RequestOptionalPathParams = typing_extensions.TypedDict(
    'RequestOptionalPathParams',
    {
    },
    total=False
)


class RequestPathParams(RequestRequiredPathParams, RequestOptionalPathParams):
    pass


request_path_portfolio_group_id = api_client.PathParameter(
    name="portfolioGroupId",
    style=api_client.ParameterStyle.SIMPLE,
    schema=PortfolioGroupIdSchema,
    required=True,
)
request_path_symbol_id = api_client.PathParameter(
    name="symbolId",
    style=api_client.ParameterStyle.SIMPLE,
    schema=SymbolIdSchema,
    required=True,
)
_auth = [
    'PartnerClientId',
    'PartnerSignature',
    'PartnerTimestamp',
]


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: schemas.Unset = schemas.unset


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
)
_status_code_to_response = {
    '200': _response_for_200,
}


class BaseApi(api_client.Api):
    @typing.overload
    def _delete_excluded_asset_oapg(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
    ]: ...

    @typing.overload
    def _delete_excluded_asset_oapg(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def _delete_excluded_asset_oapg(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def _delete_excluded_asset_oapg(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = True,
    ):
        """
        Unexclude an asset from a portfolio group
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs_oapg(RequestPathParams, path_params)
        used_path = path.value

        _path_params = {}
        for parameter in (
            request_path_portfolio_group_id,
            request_path_symbol_id,
        ):
            parameter_data = path_params.get(parameter.name, schemas.unset)
            if parameter_data is schemas.unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)

        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)
        # TODO add cookie handling

        response = self.api_client.call_api(
            resource_path=used_path,
            method='delete'.upper(),
            auth_settings=_auth,
            stream=stream,
            timeout=timeout,
        )

        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = response_for_status.deserialize(
                                                   response,
                                                   self.api_client.configuration,
                                                   skip_deserialization=skip_deserialization
                                               )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserialization(
                body=json.loads(response.http_response.data) if is_json else response.http_response.data,
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )

        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)

        return api_response


class DeleteExcludedAsset(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    @typing.overload
    def delete_excluded_asset(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
    ]: ...

    @typing.overload
    def delete_excluded_asset(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def delete_excluded_asset(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def delete_excluded_asset(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = True,
    ):
        return self._delete_excluded_asset_oapg(
            path_params=path_params,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


class ApiFordelete(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    @typing.overload
    def delete(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: typing_extensions.Literal[False] = ...,
    ) -> typing.Union[
        ApiResponseFor200,
    ]: ...

    @typing.overload
    def delete(
        self,
        skip_deserialization: typing_extensions.Literal[True],
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
    ) -> api_client.ApiResponseWithoutDeserialization: ...

    @typing.overload
    def delete(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = ...,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]: ...

    def delete(
        self,
        path_params: RequestPathParams = frozendict.frozendict(),
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = True,
    ):
        return self._delete_excluded_asset_oapg(
            path_params=path_params,
            stream=stream,
            timeout=timeout,
            skip_deserialization=skip_deserialization
        )


