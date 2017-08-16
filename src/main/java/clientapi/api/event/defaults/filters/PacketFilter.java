/*
 * Copyright 2017 ZeroMemes
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

package clientapi.api.event.defaults.filters;

import clientapi.api.event.defaults.game.network.PacketEvent;
import net.minecraft.network.Packet;

import java.util.function.Predicate;

/**
 * Basic filter for packets
 *
 * @author Brady
 * @since 3/2/2017 12:00 PM
 */
public final class PacketFilter<T extends PacketEvent> implements Predicate<T> {

    /**
     * Packets allowed by this filter
     */
    private final Class<? extends Packet<?>>[] packets;

    @SafeVarargs
    public PacketFilter(Class<? extends Packet<?>>... packets) {
        this.packets = packets;
    }

    @Override
    public boolean test(T packetEvent) {
        for (Class<? extends Packet<?>> packet : packets)
            if (packet.isAssignableFrom(packetEvent.getPacket().getClass()))
                return true;

        return false;
    }
}