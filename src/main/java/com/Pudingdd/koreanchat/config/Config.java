package com.Pudingdd.koreanchat.config;

import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
public class Config {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec SPEC;

    public static ModConfigSpec.BooleanValue ENABLED_KOREAN_CHAT;


    private static final ModConfigSpec.BooleanValue ENABLE_KOREAN_CHAT;

    static {

        BUILDER.push("General");

        ENABLE_KOREAN_CHAT =
                BUILDER
                        .comment("Enable Korean Chat")
                        .define("enableKoreanChat", true);

        BUILDER.pop();

        SPEC = BUILDER.build();
    }

}
