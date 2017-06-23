/*
 * Copyright 2017 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ivianuu.rxnearby;

import android.support.annotation.IntDef;
import android.support.annotation.NonNull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Manuel Wrage (IVIanuu)
 */
public class ConnectionEvent {

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({REQUEST_ACCEPTED, REQUEST_REJECTED})
    public @interface EventType {}

    public static final int REQUEST_ACCEPTED = 0;
    public static final int REQUEST_REJECTED = 1;

    @EventType
    private int type;
    private Endpoint endpoint;

    public ConnectionEvent(@EventType int type, @NonNull Endpoint endpoint) {
        this.type = type;
        this.endpoint = endpoint;
    }

    @EventType
    public int getType() {
        return type;
    }

    @NonNull
    public Endpoint getEndpoint() {
        return endpoint;
    }
}