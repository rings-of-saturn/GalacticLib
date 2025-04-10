package rings_of_saturn.github.io.galacticlib.potion.example;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public final class TestStatusEffect extends StatusEffect {
    public TestStatusEffect(int color) {
        super(StatusEffectCategory.NEUTRAL, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
