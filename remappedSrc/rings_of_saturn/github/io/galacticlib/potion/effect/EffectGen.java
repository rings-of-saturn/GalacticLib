package rings_of_saturn.github.io.galacticlib.potion.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import rings_of_saturn.github.io.galacticlib.potion.example.TestStatusEffect;

import java.awt.*;

import static rings_of_saturn.github.io.galacticlib.GalacticLib.MOD_ID;
/**
 * Contains methods for generating status effects
 */
public final class EffectGen {
    public static final RegistryEntry<StatusEffect> TEST_EFFECT = createEffect("test_effect", MOD_ID, new TestStatusEffect(Color.WHITE.getRGB()));

    public static RegistryEntry<StatusEffect> createEffect(String name, String MOD_ID, StatusEffect statusEffect) {
        RegistryKey<StatusEffect> registryKey = getEffectKey(name, MOD_ID);
        return Registry.registerReference(Registries.STATUS_EFFECT, registryKey.getValue(), statusEffect);
    }

    public static RegistryKey<StatusEffect> getEffectKey(String name, String MOD_ID){
        return RegistryKey.of(RegistryKeys.STATUS_EFFECT, Identifier.of(MOD_ID, name));
    }

    public EffectGen() {

    }

    public static void registerEffects(){

    }
}
