"""
    SnapTrade

    Connect brokerage accounts to your app for live positions and trading  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@snaptrade.com
    Generated by: https://konfigthis.com
"""


import unittest

import snaptrade_client
from snaptrade_client.api.options_api import OptionsApi  # noqa: E501


class TestOptionsApi(unittest.TestCase):
    """OptionsApi unit test stubs"""

    def setUp(self):
        self.api = OptionsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_option_strategy(self):
        """Test case for get_option_strategy

        Creates an option strategy object that will be used to place an option strategy order  # noqa: E501
        """
        pass

    def test_get_options_chain(self):
        """Test case for get_options_chain

        Get the options chain  # noqa: E501
        """
        pass

    def test_get_options_strategy_quote(self):
        """Test case for get_options_strategy_quote

        Get latest market data of option strategy  # noqa: E501
        """
        pass

    def test_list_option_holdings(self):
        """Test case for list_option_holdings

        Get the options holdings in the account  # noqa: E501
        """
        pass

    def test_place_option_strategy(self):
        """Test case for place_option_strategy

        Place an option strategy order on the brokerage  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
