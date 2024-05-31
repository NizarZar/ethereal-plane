package com.nizar.etherealplane.block;

import com.nizar.etherealplane.EtherealPlane;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class CustomBlocks {


    public static final Block ETHEREAL_LOG = registerBlock("ethereal_log", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.WOOD)));
    public static final Block ETHEREAL_PLANKS = registerBlock("ethereal_planks", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.WOOD)));
    public static final Block ETHEREAL_BLOCK = registerBlock("ethereal_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.COPPER)));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EtherealPlane.MOD_ID, name), block);
    }
    private static void addBlocksToBlocksTab(FabricItemGroupEntries entries) {
        entries.add(ETHEREAL_BLOCK);
        entries.add(ETHEREAL_LOG);
        entries.add(ETHEREAL_PLANKS);
    }
    // convert from void to Item if needed
    private static void registerBlockItem(String name, Block block){

        Registry.register(Registries.ITEM, new Identifier(EtherealPlane.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        EtherealPlane.LOGGER.info("Registering Mod Blocks for " + EtherealPlane.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(CustomBlocks::addBlocksToBlocksTab);
    }
}
