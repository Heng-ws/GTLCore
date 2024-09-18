package org.gtlcore.gtlcore.api.data.chemical.material.info;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet;
import com.gregtechceu.gtceu.api.item.component.ICustomRenderer;
import com.lowdragmc.lowdraglib.client.renderer.IRenderer;
import lombok.Getter;
import org.gtlcore.gtlcore.client.renderer.item.StereoscopicItemRenderer;
import org.gtlcore.gtlcore.client.renderer.item.WrappedItemRenderer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Getter
public class GTLMaterialIconSet extends com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet {

    private final ICustomRenderer customRenderer;

    public GTLMaterialIconSet(@NotNull String name,
                              @Nullable com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet parentIconset,
                              boolean isRootIconset,
                              ICustomRenderer customRenderer) {
        super(name, parentIconset, isRootIconset);
        this.customRenderer = customRenderer;
    }

    public static final GTLMaterialIconSet CUSTOM_TRANSCENDENT_MENTAL = new GTLMaterialIconSet(
            "transcendent_mental",
            MaterialIconSet.METALLIC,
            false,
            () -> StereoscopicItemRenderer.INSTANCE);

    public static final MaterialIconSet LIMPID = new MaterialIconSet("limpid", null, true);
}
