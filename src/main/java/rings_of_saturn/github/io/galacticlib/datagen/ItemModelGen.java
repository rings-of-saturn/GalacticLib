package rings_of_saturn.github.io.galacticlib.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.item.Item;

import static rings_of_saturn.github.io.galacticlib.item.ItemGen.itemsToDatagen;


public class ItemModelGen extends FabricModelProvider {
    public ItemModelGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        for (Item item : itemsToDatagen) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}
