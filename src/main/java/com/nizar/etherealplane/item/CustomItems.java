package com.nizar.etherealplane.item;

import com.nizar.etherealplane.EtherealPlane;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomItems {

    public static final Item ETHEREAL_CRYSTAL = registerItem("ethereal_crystal", new Item(new Item.Settings()));

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries){
        entries.add(ETHEREAL_CRYSTAL);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EtherealPlane.MOD_ID, name), item);
    }

    public static void registerItemsList(){
        EtherealPlane.LOGGER.info("Registering mod items for: " + EtherealPlane.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(CustomItems::addItemsToIngredientTab);

    }
}
