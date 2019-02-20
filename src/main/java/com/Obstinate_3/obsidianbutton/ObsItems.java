package com.Obstinate_3.obsidianbutton;


import com.Obstinate_3.obsidianbutton.item.DescriptiveBlockItem;
import com.Obstinate_3.obsidianbutton.util.ModInfo;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class ObsItems {

    public static Item obsidianButton;

    public static ItemGroup creatiiveTab = FabricItemGroupBuilder.build(new Identifier(ModInfo.MOD_ID + ":obsidian_button"), new Supplier<ItemStack>() {
        @Override
        public ItemStack get() {
            return new ItemStack(obsidianButton);
        }
    });

    private final Item.Settings defaultSettings = new Item.Settings().itemGroup(creatiiveTab);

    ObsItems(ObsidianButton mod) {
        obsidianButton = this.register("obsidian_button", mod.blocks.obsidianButton, this.defaultSettings);
    }

    private Item register(String id, Item item) {
        return Registry.ITEM.register(new Identifier(ModInfo.MOD_ID, id), item);
    }

    private Item register(String id, Block block, Settings settings) {
        return this.register(id, new DescriptiveBlockItem(block, settings));
    }
}
