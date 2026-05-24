package net.minecraft.client.resources.model.sprite;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.renderer.v1.sprite.FabricMaterialBaker;
import net.minecraft.client.resources.model.ModelDebugName;

@Environment(EnvType.CLIENT)
public interface MaterialBaker extends FabricMaterialBaker {
	Material.Baked get(Material material, ModelDebugName name);

	Material.Baked reportMissingReference(String reference, ModelDebugName name);

	default Material.Baked resolveSlot(final TextureSlots slots, final String id, final ModelDebugName name) {
		Material resolvedMaterial = slots.getMaterial(id);
		return resolvedMaterial != null ? this.get(resolvedMaterial, name) : this.reportMissingReference(id, name);
	}
}
