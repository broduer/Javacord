package de.btobastian.javacord.events.server.emoji;

import de.btobastian.javacord.entities.message.emoji.KnownCustomEmoji;

/**
 * A custom emoji delete event.
 */
public class CustomEmojiDeleteEvent extends CustomEmojiEvent {

    /**
     * Creates a new custom emoji delete event.
     *
     * @param emoji The deleted emoji.
     */
    public CustomEmojiDeleteEvent(KnownCustomEmoji emoji) {
        super(emoji);
    }

}