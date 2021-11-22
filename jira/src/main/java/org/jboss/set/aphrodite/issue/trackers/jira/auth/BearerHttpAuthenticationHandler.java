/*
 * Copyright 2021 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.set.aphrodite.issue.trackers.jira.auth;

import com.atlassian.httpclient.api.Request.Builder;
import com.atlassian.jira.rest.client.api.AuthenticationHandler;

/**
 * @author Chao Wang
 *
 */
public class BearerHttpAuthenticationHandler implements AuthenticationHandler {

    private static final String AUTHORIZATION_HEADER = "Authorization";
    private final String token;

    public BearerHttpAuthenticationHandler(final String token) {
        this.token = token;
    }

    /* (non-Javadoc)
     * @see com.atlassian.jira.rest.client.api.AuthenticationHandler#configure(com.atlassian.httpclient.api.Request.Builder)
     */
    @Override
    public void configure(Builder builder) {
        builder.setHeader(AUTHORIZATION_HEADER, "Bearer " + token);
    }
}
