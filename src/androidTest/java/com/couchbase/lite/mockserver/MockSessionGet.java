/**
 * Copyright (c) 2015 Couchbase, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.couchbase.lite.mockserver;

import com.squareup.okhttp.mockwebserver.MockResponse;

public class MockSessionGet {

    public MockResponse generateMockResponse() {
        MockResponse mockResponse = new MockResponse();
        String jsonBody = "{\n" +
                "   \"authentication_handlers\":[\n" +
                "      \"default\",\n" +
                "      \"cookie\"\n" +
                "   ],\n" +
                "   \"ok\":true,\n" +
                "   \"userCtx\":{\n" +
                "      \"channels\":{\n" +
                "         \"*\":1\n" +
                "      },\n" +
                "      \"name\":null\n" +
                "   }\n" +
                "}";
        mockResponse.setBody(jsonBody);
        MockHelper.set200OKJson(mockResponse);
        return mockResponse;
    }

}
