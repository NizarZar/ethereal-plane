package com.nizar.etherealplane.item;

import com.nizar.etherealplane.EtherealPlane;
import com.nizar.etherealplane.block.CustomBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CustomTabGroups {


    public static final ItemGroup ETHEREALPLANE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EtherealPlane.MOD_ID, "ethereal_block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.etherealplane"))
                    .icon(() -> new ItemStack(CustomBlocks.ETHEREAL_BLOCK)).entries((displayContext, entries) -> {
                        // add entries
                        entries.add(CustomBlocks.ETHEREAL_BLOCK);
                        entries.add(CustomItems.ETHEREAL_CRYSTAL);
                        entries.add(CustomBlocks.ETHEREAL_LOG);
                        entries.add(CustomBlocks.ETHEREAL_PLANKS);
                    }).build());

    public static void registerItemGroups(){
        EtherealPlane.LOGGER.info("Registering Item groups for " + EtherealPlane.MOD_ID);
    }

}
