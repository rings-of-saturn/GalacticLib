package rings_of_saturn.github.io.galacticlib.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import rings_of_saturn.github.io.galacticlib.potion.effect.EffectGen;

import static rings_of_saturn.github.io.galacticlib.client.GalacticLibClient.MOD_ID;

public final class PotionGen {
    public static Potion createPotion(String name, String MOD_ID, Potion potion){
        RegistryKey<Potion> registryKey = getPotionKey(name, MOD_ID);
        return Registry.register(Registries.POTION, registryKey.getValue(), potion);
    }

    public static RegistryKey<Potion> getPotionKey(String name, String MOD_ID){
        return RegistryKey.of(RegistryKeys.POTION, Identifier.of(MOD_ID, name));
    }

    public PotionGen() {
    }

    public static final Potion TEST_POTION = createPotion("test_potion", MOD_ID, new Potion("test", new StatusEffectInstance(EffectGen.TEST_EFFECT, 90*20, 0)));

    public static void registerPotions(){

    }
}
