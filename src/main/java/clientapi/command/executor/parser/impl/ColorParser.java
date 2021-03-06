/*
 * Copyright 2018 ImpactDevelopment
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

package clientapi.command.executor.parser.impl;

import clientapi.command.executor.ExecutionContext;
import clientapi.command.executor.parser.ArgumentParser;

import java.awt.*;
import java.lang.reflect.Type;

/**
 * @author Brady
 * @since 2/8/2018 5:25 PM
 */
public final class ColorParser implements ArgumentParser<Color> {

    @Override
    public final Color parse(ExecutionContext context, Type type, String raw) {
        // Remove all non-hexadecimal characters
        raw = raw.replaceAll("([^0-9a-fA-F])", "");

        // If there aren't either 24 or 32 bits, return null
        if (raw.length() != 6 && raw.length() != 8) {
            return null;
        }

        // If there are only 24 bits, set the first 8 (alpha) to equal 255.
        if (raw.length() == 6) {
            raw = "FF" + raw;
        }

        return new Color(Integer.parseInt(raw, 16), true);
    }

    @Override
    public final boolean isTarget(Type type) {
        return type instanceof Class && Color.class.isAssignableFrom((Class) type);
    }
}
