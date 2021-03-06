/*
 * Copyright (C) 2016 Authlete, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */
package com.authlete.jaxrs;


import javax.ws.rs.WebApplicationException;


/**
 * A base class for endpoints.
 *
 * @since 1.2
 *
 * @author Takahiko Kawasaki
 */
public class BaseEndpoint
{
    /**
     * Called when the internal request handler raises an exception.
     * The default implementation of this method calls {@code
     * printStackTrace()} of the given exception instance and does
     * nothing else. Override this method as necessary.
     *
     * @param exception
     *         An exception thrown by the internal request handler.
     */
    protected void onError(WebApplicationException exception)
    {
        exception.printStackTrace();
    }
}
