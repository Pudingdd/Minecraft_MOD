package com.Pudingdd.koreanchat;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(KoreanChatMod.MODID)
public class KoreanChatMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "koreanchat";

    public KoreanChatMod() {
        System.out.println("Korean Chat Mod Loaded");
    }
}
