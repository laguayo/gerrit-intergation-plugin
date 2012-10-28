/*
 *  The MIT License
 *
 *  Copyright 2010 Sony Ericsson Mobile Communications.
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package com.sonyericsson.hudson.plugins.gerrit.gerritevents.ssh;

import java.io.IOException;

/**
 * Base class for "controlled" exceptions in {@link SshConnection}.
 * @author Robert Sandell &lt;robert.sandell@sonyericsson.com&gt;
 */
public class SshException extends IOException {

    /**
     * Standard constructor.
     * @param cause the cause.
     * @see IOException#IOException(java.lang.Throwable)
     */
    public SshException(Throwable cause) {
        super(cause);
    }

    /**
     * Standard constructor.
     * @param message the message.
     * @param cause the cause.
     * @see IOException#IOException(java.lang.String, java.lang.Throwable)
     */
    public SshException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Standard constructor.
     * @param message the message.
     * @see IOException#IOException(java.lang.String)
     */
    public SshException(String message) {
        super(message);
    }

    /**
     * Default constructor.
     */
    public SshException() {
    }
}
