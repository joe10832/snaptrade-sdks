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
// uncomment below to import models
//using SnapTrade.Net.Model;

namespace SnapTrade.Net.Test.Api
{
    /// <summary>
    ///  Class for testing TransactionsAndReportingApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class TransactionsAndReportingApiTests : IDisposable
    {
        private TransactionsAndReportingApi instance;

        public TransactionsAndReportingApiTests()
        {
            instance = new TransactionsAndReportingApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of TransactionsAndReportingApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' TransactionsAndReportingApi
            //Assert.IsType<TransactionsAndReportingApi>(instance);
        }

        /// <summary>
        /// Test GetActivities
        /// </summary>
        [Fact]
        public void GetActivitiesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string userId = null;
            //string userSecret = null;
            //DateTime? startDate = null;
            //DateTime? endDate = null;
            //string accounts = null;
            //string brokerageAuthorizations = null;
            //var response = instance.GetActivities(userId, userSecret, startDate, endDate, accounts, brokerageAuthorizations);
            //Assert.IsType<List<UniversalActivity>>(response);
        }

        /// <summary>
        /// Test GetReportingCustomRange
        /// </summary>
        [Fact]
        public void GetReportingCustomRangeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //DateTime startDate = null;
            //DateTime endDate = null;
            //string userId = null;
            //string userSecret = null;
            //string accounts = null;
            //bool? detailed = null;
            //string frequency = null;
            //var response = instance.GetReportingCustomRange(startDate, endDate, userId, userSecret, accounts, detailed, frequency);
            //Assert.IsType<PerformanceCustom>(response);
        }
    }
}
