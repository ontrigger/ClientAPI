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

package clientapi.event.defaults.game.core;

/**
 * Event called when a Key is pressed outside of a GUI while in-game.
 * When cancelled, any ClientAPI related KeyEvent Listener won't process
 * the key press.
 *
 * @see ClickEvent
 *
 * @author Brady
 * @since 1/20/2017 12:00 PM
 */
public final class KeyEvent extends InputEvent {

    /**
     * Char representation of the pressed key
     */
    private final char character;

    /**
     * Creates a new instance of KeyEvent.
     *
     * @param key - The key code for the key that was pressed
     */
    public KeyEvent(int key, char character) {
        super(key);
        this.character = character;
    }

    /**
     * @return The char that corresponds to the pressed key
     */
    public final char getCharacter() {
        return this.character;
    }
}
