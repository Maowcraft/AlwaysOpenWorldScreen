package maowcraft.alwaysopenworldscreen.mixin;

import net.minecraft.client.gui.screen.world.WorldListWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.List;

@Mixin(WorldListWidget.class)
public class MixinWorldListWidget {
    @Redirect(method = "filter", at = @At(value = "INVOKE", target = "Ljava/util/List;isEmpty()Z"))
    private boolean neverEmptyHack(List list) {
        return false;
    }
}
