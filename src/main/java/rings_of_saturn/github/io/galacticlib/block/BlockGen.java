package rings_of_saturn.github.io.galacticlib.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import rings_of_saturn.github.io.galacticlib.block.custom.MultiSidedBlock;

import static rings_of_saturn.github.io.galacticlib.GalacticLib.MOD_ID;

/**
 * Contains methods for generating blocks
 */
public final class BlockGen {
    public static void createBlockItem(Block block, String name, String MOD_ID){
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static Block createBlock(Block block, String name, String MOD_ID){
        createBlockItem(block, name, MOD_ID);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }

    public static RegistryKey<Block> getBlockKey(String name, String MOD_ID){
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, name));
    }

    public static final Block TEST_BLOCK = createBlock(
            new Block(AbstractBlock.Settings.create()),
            "test_block",
            MOD_ID);
    public static final Block TEST_MULTISIDED_BLOCK = createBlock(
            new MultiSidedBlock(AbstractBlock.Settings.create()),
            "test_multisided_block",
            MOD_ID);

    public static void registerBlocks(){

    }
}
