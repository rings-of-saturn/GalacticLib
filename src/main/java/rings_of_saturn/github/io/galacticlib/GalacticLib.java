package rings_of_saturn.github.io.galacticlib;

import net.fabricmc.api.ModInitializer;

import static rings_of_saturn.github.io.galacticlib.block.BlockGen.registerBlocks;
import static rings_of_saturn.github.io.galacticlib.item.ItemGen.registerItems;
import static rings_of_saturn.github.io.galacticlib.potion.PotionGen.registerPotions;
import static rings_of_saturn.github.io.galacticlib.potion.effect.EffectGen.registerEffects;

public final class GalacticLib implements ModInitializer {

    public static final String MOD_ID = "galacticlib";

    @Override
    public void onInitialize() {
        registerItems();
        registerBlocks();
        registerEffects();
        registerPotions();
    }
}
