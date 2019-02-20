package com.Obstinate_3.obsidianbutton;

import com.Obstinate_3.obsidianbutton.blocks.ObsidianButtonBlock;
import com.Obstinate_3.obsidianbutton.util.ModInfo;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ObsBlocks {

    public final Block obsidianButton;

    ObsBlocks(ObsidianButton mod) {
        this.obsidianButton = this.register("obsidian_button", new ObsidianButtonBlock(FabricBlockSettings.of(Material.STONE).strength(50.0F,1200.0F).noCollision().build()));
    }

    private Block register(String id, Block block) {
        return Registry.BLOCK.register(new Identifier(ModInfo.MOD_ID, id), block);
    }


}
