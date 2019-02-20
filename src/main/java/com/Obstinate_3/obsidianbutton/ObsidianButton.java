package com.Obstinate_3.obsidianbutton;

import net.fabricmc.api.ModInitializer;

public class ObsidianButton implements ModInitializer {

    public ObsBlocks blocks;
    public ObsItems items;

    @Override
    public void onInitialize() {
        this.blocks = new ObsBlocks(this);
        this.items = new ObsItems(this);
    }
}
