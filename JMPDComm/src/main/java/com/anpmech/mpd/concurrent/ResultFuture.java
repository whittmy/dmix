/*
 * Copyright (C) 2004 Felipe Gustavo de Almeida
 * Copyright (C) 2010-2016 The MPDroid Project
 *
 * All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice,this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.anpmech.mpd.concurrent;

import com.anpmech.mpd.connection.CommandResult;

import java.util.concurrent.Future;

/**
 * This class returns a {@link CommandResult} in the future.
 */
public class ResultFuture extends MPDFuture<CommandResult> {

    /**
     * This constructor is used for subclassing this class.
     *
     * @param future The future to be subclassed.
     */
    ResultFuture(final ResultFuture future) {
        super(future);
    }

    /**
     * Creates a {@code FutureTask} that will, upon running, execute the given {@code Callable}.
     *
     * @param future The future to wrap.
     */
    ResultFuture(final Future<?> future) {
        super(future);
    }

    /**
     * This method is used to construct the Future object for this result.
     *
     * @param result The result to create the MPDFuture from.
     * @return A MPDFuture subclass.
     */
    @Override
    CommandResult instantiate(final CommandResult result) {
        return result;
    }
}