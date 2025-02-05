package rings_of_saturn.github.io.galacticlib.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockGen {
    public static void createBlockItem(Block block, String name, String MOD_ID){
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static Block createBlock(Block block, String name, String MOD_ID){
        createBlockItem(block, name, MOD_ID);
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }
}
