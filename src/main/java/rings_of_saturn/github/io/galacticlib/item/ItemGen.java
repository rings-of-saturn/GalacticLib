package rings_of_saturn.github.io.galacticlib.item;

import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static rings_of_saturn.github.io.galacticlib.GalacticLib.MOD_ID;


/**
 * Contains methods for generating items
 */
public final class ItemGen {
    public static ArrayList<Item> itemsToDatagen;

    public static Item createItem(String name, String MOD_ID, Item item){
        RegistryKey<Item> registryKey = getItemKey(name, MOD_ID);
        return Registry.register(Registries.ITEM, registryKey.getValue(), item);
    }
    public static RegistryKey<Item> getItemKey(String name, String MOD_ID){
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name));
    }

    public ItemGen() {
    }

    public static Item createDefaultModelItem(String name, String MOD_ID, Item item){
        Item registeredItem = createItem(name, MOD_ID, item);
        if(itemsToDatagen != null)
            itemsToDatagen.add(registeredItem);
        else
            itemsToDatagen = (ArrayList<Item>) List.of(registeredItem);
        return registeredItem;
    }

    public static final Item TEST_ITEM = createItem("test_item", MOD_ID, new Item(new Item.Settings()));

    public static void registerItems(){

    }
}
