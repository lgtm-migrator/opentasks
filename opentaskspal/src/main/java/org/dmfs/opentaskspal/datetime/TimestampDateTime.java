/*
 * Copyright 2018 dmfs GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dmfs.opentaskspal.datetime;

import org.dmfs.jems.optional.decorators.Mapped;
import org.dmfs.optional.Optional;
import org.dmfs.optional.decorators.DelegatingOptional;
import org.dmfs.rfc5545.DateTime;


/**
 * @author Gabor Keszthelyi
 */
public final class TimestampDateTime extends DelegatingOptional<DateTime>
{
    public TimestampDateTime(Optional<Long> timestamp)
    {
        // TODO UTC or local timezone? (For completed, created)
        super(new Mapped<>(DateTime::new, timestamp));
    }
}