package rings_of_saturn.github.io.galacticlib.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.ConnectingBlock;
import net.minecraft.block.MultifaceBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MultiSidedBlock extends MultifaceBlock {
    public MultiSidedBlock(Settings settings) {
        super(settings);
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
