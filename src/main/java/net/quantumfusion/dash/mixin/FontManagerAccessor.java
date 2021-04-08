package net.quantumfusion.dash.mixin;

import net.minecraft.client.font.FontManager;
import net.minecraft.client.font.FontStorage;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(FontManager.class)

public interface FontManagerAccessor {

	@Accessor("textureManager")
	TextureManager getTextureManager();

	@Accessor("fontStorages")
	Map<Identifier, FontStorage> getFontStorages();
}
