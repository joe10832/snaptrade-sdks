# coding: utf-8

"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Created by: https://snaptrade.com/
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal

from snaptrade_client.type.monthly_dividends_dividends import MonthlyDividendsDividends

class RequiredMonthlyDividends(TypedDict):
    pass

class OptionalMonthlyDividends(TypedDict, total=False):
    # Date used to specify timeframe for a reporting call (in YYYY-MM-DD format)
    date: date

    dividends: MonthlyDividendsDividends

class MonthlyDividends(RequiredMonthlyDividends, OptionalMonthlyDividends):
    pass
