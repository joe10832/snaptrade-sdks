# coding: utf-8

"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Generated by: https://konfigthis.com
"""

from snaptrade_client.paths.authorizations_authorization_id.get import DetailBrokerageAuthorization
from snaptrade_client.paths.authorizations.get import ListBrokerageAuthorizations
from snaptrade_client.paths.authorizations_authorization_id.delete import RemoveBrokerageAuthorization


class ConnectionsApi(
    DetailBrokerageAuthorization,
    ListBrokerageAuthorizations,
    RemoveBrokerageAuthorization,
):
    """NOTE: This class is auto generated by Konfig
    Ref: https://konfgithis.com

    Do not edit the class manually.
    """
    pass
