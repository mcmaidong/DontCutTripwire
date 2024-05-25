package com.example.dontcuttripwire;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.TripWireBlock;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.network.chat.Component;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(DontCutTripwire.MODID)
public class DontCutTripwire {
    public static final String MODID = "dontcuttripwire";

    public DontCutTripwire() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // 初始化设置
    }

    @SubscribeEvent
    public void onPlayerLeftClick(PlayerInteractEvent.LeftClickBlock event) {
        if (event.getLevel().isClientSide()) return; // 仅在服务器端执行

        if (event.getItemStack().getItem() instanceof ShearsItem) {
            BlockState state = event.getLevel().getBlockState(event.getPos());
            if (state.getBlock() instanceof TripWireBlock) {
                event.setCanceled(true); // 取消默认的破坏行为

                // 改变绊线的 disarmed 属性为 true
                event.getLevel().setBlock(event.getPos(), state.setValue(TripWireBlock.DISARMED, true), 3);

                // 在快捷栏上方显示“disarmed true”字样
                event.getEntity().displayClientMessage(Component.literal("disarmed true"), true);
            }
        }
    }
}