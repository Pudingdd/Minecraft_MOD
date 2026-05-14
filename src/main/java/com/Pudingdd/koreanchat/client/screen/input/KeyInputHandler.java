package com.Pudingdd.koreanchat.client.screen.input;

import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.client.KeyMapping;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
public class KeyInputHandler {
    public static final String KEY_CATEGORY =
            "key.category.koreanchat";
    public static final String KEY_OPEN_CHAT =
            "key.chat.open_chat";
    public static final KeyMapping OPEN_CHAT_KEY =
            new KeyMapping(
                    KEY_OPEN_CHAT,
                    InputConstants.Type.KEYSYM,
                    InputConstants.KEY_P,
                    KEY_CATEGORY
            );
}
