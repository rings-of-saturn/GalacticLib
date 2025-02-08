package rings_of_saturn.github.io.galacticlib;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;

import static rings_of_saturn.github.io.galacticlib.item.ItemGen.itemsToDatagen;
import static rings_of_saturn.github.io.galacticlib.item.ItemGen.registerItems;

public final class GalacticLib implements ModInitializer {

    @Override
    public void onInitialize() {
        /*for (Item itemToDatagen : itemsToDatagen) {

        }*/
        registerItems();
    }
}
