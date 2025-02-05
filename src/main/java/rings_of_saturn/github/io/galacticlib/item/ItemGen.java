package rings_of_saturn.github.io.galacticlib.item;

import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import rings_of_saturn.github.io.galacticlib.client.GalacticLibClient;

import java.util.ArrayList;
import java.util.List;

public class ItemGen {
    public static ArrayList<Item> itemsToDatagen;

    public static Item createItem(String name, Item item, String MOD_ID){
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }

    public static Item createDefaultModelItem(String name, Item item, String MOD_ID){
        Item registeredItem = Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
        if(itemsToDatagen != null)
            itemsToDatagen.add(registeredItem);
        else
            itemsToDatagen = (ArrayList<Item>) List.of(registeredItem);
        return registeredItem;
    }

    public static final Item TEST_ITEM = createDefaultModelItem("test_item", new Item(new Item.Settings()), GalacticLibClient.MOD_ID);
}
