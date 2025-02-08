package rings_of_saturn.github.io.galacticlib.item;

import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import rings_of_saturn.github.io.galacticlib.client.GalacticLibClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains methods for generating items
 */
public final class ItemGen {
    public static ArrayList<Item> itemsToDatagen;

    public static Item createItem(String name, Item item, String MOD_ID){
        return Registry.register(Registries.ITEM, RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name)).getValue(), item);
    }
    public static RegistryKey<Item> getItemKey(String name, String MOD_ID){
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, name));
    }

    public ItemGen() {
    }

    public static Item createDefaultModelItem(String name, Item item, String MOD_ID){
        Item registeredItem = createItem(name, item, MOD_ID);
        if(itemsToDatagen != null)
            itemsToDatagen.add(registeredItem);
        else
            itemsToDatagen = (ArrayList<Item>) List.of(registeredItem);
        return registeredItem;
    }

    public static final Item TEST_ITEM = createDefaultModelItem("test_item", new Item(new Item.Settings()), GalacticLibClient.MOD_ID);
}
