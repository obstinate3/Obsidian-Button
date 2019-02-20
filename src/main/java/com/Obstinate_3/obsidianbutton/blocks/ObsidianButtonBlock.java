package com.Obstinate_3.obsidianbutton.blocks;

import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ObsidianButtonBlock extends AbstractButtonBlock {

    public ObsidianButtonBlock(Block.Settings settings) {
        super(false, settings);

        this.setDefaultState(this.getStateFactory().getDefaultState().with(POWERED, false));
    }
    @Override
    protected SoundEvent getClickSound(boolean b) {
        return b ? SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON : SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF;
    }
}
