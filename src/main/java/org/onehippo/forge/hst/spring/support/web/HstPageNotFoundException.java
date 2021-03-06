/*
 * Copyright 2015-2015 Hippo B.V. (http://www.onehippo.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onehippo.forge.hst.spring.support.web;

/**
 * Marker runtime exception indicating the current request should be regarded
 * as page-not-found and so the request must be handled by HST page not found sitemap item path
 * configured in HST configuration.
 */
public class HstPageNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new HstPageNotFoundException exception.
     */
    public HstPageNotFoundException() {
        super();
    }

    /**
     * Constructs a new HstPageNotFoundException exception with the given message.
     *
     * @param   message
     *          the exception message
     */
    public HstPageNotFoundException(String message) {
        super(message);
    }

    /**
     * Constructs a new HstPageNotFoundException exception with the nested exception.
     *
     * @param   nested
     *          the nested exception
     */
    public HstPageNotFoundException(Throwable nested) {
        super(nested);
    }

    /**
     * Constructs a new HstPageNotFoundException exception when the container needs to do
     * the following:
     * <ul>
     * <li>throw an exception 
     * <li>include the "nested" exception
     * <li>include a description message
     * </ul>
     *
     * @param   msg
     *          the exception message
     * @param   nested
     *          the nested exception
     */
    public HstPageNotFoundException(String msg, Throwable nested) {
        super(msg, nested);
    }

}
