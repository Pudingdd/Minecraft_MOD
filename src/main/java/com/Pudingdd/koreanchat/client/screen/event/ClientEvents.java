package com.Pudingdd.koreanchat.client.screen.event;

import com.Pudingdd.koreanchat.client.screen.input.KeyInputHandler;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;
@EventBusSubscriber
public class ClientEvents {
    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {

        while(KeyInputHandler.OPEN_CHAT_KEY.consumeClick()){
            System.out.println("P pressed");
        }
    }
}
