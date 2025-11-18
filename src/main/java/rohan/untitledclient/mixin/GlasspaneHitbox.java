package rohan.untitledclient.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalConnectingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(HorizontalConnectingBlock.class)
public class GlasspaneHitbox{
    @Inject(method = "getOutlineShape", at = @At("RETURN"), cancellable = true)
    public void injectMethod(BlockState state, BlockView world, BlockPos pos, ShapeContext context,CallbackInfoReturnable<VoxelShape> cir) {
        cir.setReturnValue(VoxelShapes.fullCube());
    }
 }
