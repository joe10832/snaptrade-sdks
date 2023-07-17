/*
 * SnapTrade
 *
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 * Generated by: https://konfigthis.com
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using SnapTrade.Net.Client;
using SnapTrade.Net.Api;
using SnapTrade.Net.Model;
using System.Diagnostics;

namespace SnapTrade.Net.Test.Api
{
    /// <summary>
    ///  Class for testing GettingStarted
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class GettingStartedTests : IDisposable
    {
        private APIStatusApi apiStatusApi;
        private AuthenticationApi authenticationApi;
        private AccountInformationApi accountInformationApi;

        private TransactionsAndReportingApi transactionsAndReportingApi;

        private ReferenceDataApi referenceDataApi;

        private OptionsApi optionsApi;

        private string testUserId;

        private string testUserSecret;

        public GettingStartedTests()
        {
            Configuration configuration = new Configuration();
            string clientId = System.Environment.GetEnvironmentVariable("SNAPTRADE_CLIENT_ID");
            string consumerKey = System.Environment.GetEnvironmentVariable("SNAPTRADE_CONSUMER_KEY");
            this.testUserId = System.Environment.GetEnvironmentVariable("SNAPTRADE_TEST_USER_ID");
            this.testUserSecret = System.Environment.GetEnvironmentVariable("SNAPTRADE_TEST_USER_SECRET");
            configuration.ApiKey.Add("clientId", clientId);
            configuration.ConsumerKey = consumerKey;
            apiStatusApi = new APIStatusApi(configuration);
            authenticationApi = new AuthenticationApi(configuration);
            accountInformationApi = new AccountInformationApi(configuration);
            transactionsAndReportingApi = new TransactionsAndReportingApi(configuration);
            referenceDataApi = new ReferenceDataApi(configuration);
            optionsApi = new OptionsApi(configuration);
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        [Fact]
        public void ApiStatusCheck()
        {
            Status status = apiStatusApi.Check();
            Console.WriteLine(status.ToJson());
            Assert.NotNull(status);
            ApiResponse<Status> response = apiStatusApi.CheckWithHttpInfo();
            Console.WriteLine("Status Code: " + response.StatusCode);
            Console.WriteLine("Response Headers: " + response.Headers);
            Console.WriteLine("Response Data: " + response.Data);
            Console.WriteLine("Response RawContent: " + response.RawContent);
            Assert.NotNull(response);
        }

        [Fact]
        public void GettingStartedTest()
        {
            Status status = apiStatusApi.Check();
            Console.WriteLine(status.ToJson());
            string uuid = Guid.NewGuid().ToString();
            UserIDandSecret userIDandSecret = authenticationApi.RegisterSnapTradeUser(new SnapTradeRegisterUserRequestBody(uuid));
            Console.WriteLine(string.Format("userID: {0}, userSecret: {1}", userIDandSecret.UserId, userIDandSecret.UserSecret));
            var redirectUri = authenticationApi.LoginSnapTradeUser(userIDandSecret.UserId, userIDandSecret.UserSecret).GetLoginRedirectURI().RedirectURI;
            Console.WriteLine(redirectUri);
            var holdings = accountInformationApi.GetAllUserHoldings(userIDandSecret.UserId, userIDandSecret.UserSecret);
            Console.WriteLine(holdings);
            var deleteResponse = authenticationApi.DeleteSnapTradeUser(userIDandSecret.UserId);
            Console.WriteLine(deleteResponse);
        }

        [Fact]
        public void GettingStartedWithEmailUserIdTest()
        {
            Status status = apiStatusApi.Check();
            Console.WriteLine(status.ToJson());
            string uuid = Guid.NewGuid().ToString();
            string userId = $"{uuid}+test2@gmail.com";
            UserIDandSecret userIDandSecret = authenticationApi.RegisterSnapTradeUser(new SnapTradeRegisterUserRequestBody(userId));
            Console.WriteLine(string.Format("userID: {0}, userSecret: {1}", userIDandSecret.UserId, userIDandSecret.UserSecret));
            var redirectUri = authenticationApi.LoginSnapTradeUser(userIDandSecret.UserId, userIDandSecret.UserSecret).GetLoginRedirectURI().RedirectURI;
            Console.WriteLine(redirectUri);
            var holdings = accountInformationApi.GetAllUserHoldings(userIDandSecret.UserId, userIDandSecret.UserSecret);
            Console.WriteLine(holdings);
            var deleteResponse = authenticationApi.DeleteSnapTradeUser(userIDandSecret.UserId);
            Console.WriteLine(deleteResponse);
        }

        [Fact]
        public void GetUserAccountBalance()
        {
            var accounts = accountInformationApi.ListUserAccounts(this.testUserId, this.testUserSecret);
            Console.WriteLine(accounts);
            var response = accountInformationApi.GetUserAccountBalance(this.testUserId, this.testUserSecret, accounts[0].Id);
            Console.WriteLine(response);
        }

        [Fact]
        public void GetAllUserHoldings()
        {
            // List all accounts for the user, plus balances and positions for each account.
            List<AccountHoldings> result = accountInformationApi.GetAllUserHoldings(this.testUserId, this.testUserSecret);
            Console.WriteLine(result);
        }

        [Fact]
        async public void GetUserHoldings()
        {
            var accounts = await accountInformationApi.ListUserAccountsAsync(this.testUserId, this.testUserSecret);
            Console.WriteLine(accounts);
            var response = await accountInformationApi.GetUserHoldingsAsync(accounts[0].Id, this.testUserId, this.testUserSecret);
            Console.WriteLine(response);
        }


        [Fact]
        async public void GetActivitiesAsync()
        {
            var from = DateTime.Now.AddYears(-1);
            var to = DateTime.Now;
            var activities = await transactionsAndReportingApi.GetActivitiesAsync(this.testUserId, this.testUserSecret, from, to);
            Console.WriteLine(activities);
        }

        [Fact(Skip = "Getting 500 error code")]
        public void GetOptionsChain()
        {
            var accounts = accountInformationApi.ListUserAccounts(this.testUserId, this.testUserSecret);
            Console.WriteLine(accounts.ToString());
            var symbols = referenceDataApi.GetSymbols(new SymbolQuery("apple"));
            Console.WriteLine(symbols.ToString());
            var optionsChain = optionsApi.GetOptionsChain(this.testUserId, this.testUserSecret, accounts[0].Id, symbols[0].Id);
            Console.WriteLine(optionsChain);
        }

    }
}
