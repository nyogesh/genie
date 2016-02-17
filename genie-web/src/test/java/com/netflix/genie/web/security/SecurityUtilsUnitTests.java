/*
 *
 *  Copyright 2016 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.genie.web.security;

import com.netflix.genie.test.categories.UnitTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Unit tests for the SecurityUtils utility methods.
 *
 * @author tgianos
 * @since 3.0.0
 */
@Category(UnitTest.class)
public class SecurityUtilsUnitTests {

    /**
     * This should be accessible due to being protected.
     */
    @Test
    public void canConstructUsingProtectedConstructor() {
        Assert.assertNotNull(new SecurityUtils());
    }

//    /**
//     * Test to make sure we can build the proper API security.
//     *
//     * @throws Exception on any error
//     */
//    @Test
//    public void canBuildAPIHttpSecurity() throws Exception {
//        final HttpSecurity http = Mockito.mock(HttpSecurity.class);
//        final X509UserDetailsService x509UserDetailsService = Mockito.mock(X509UserDetailsService.class);
//
//        SecurityUtils.buildAPIHttpSecurity(http, x509UserDetailsService);
//    }
}