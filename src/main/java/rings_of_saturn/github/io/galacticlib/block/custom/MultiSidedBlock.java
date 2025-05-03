package rings_of_saturn.github.io.galacticlib.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.ConnectingBlock;
import net.minecraft.block.LichenGrower;
import net.minecraft.block.MultifaceGrowthBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MultiSidedBlock extends MultifaceGrowthBlock {
    public MultiSidedBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends MultifaceGrowthBlock> getCodec() {
        return null;
    }

    @Override
    public LichenGrower getGrower() {
        return null;
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if(state.get(ConnectingBlock.FACING_PROPERTIES.get(player.getFacing()))){
            world.setBlockState(pos, state.with(ConnectingBlock.FACING_PROPERTIES.get(player.getFacing()), false));
            return state.with(ConnectingBlock.FACING_PROPERTIES.get(player.getFacing()), false);
        }
        return state;
    }
}
