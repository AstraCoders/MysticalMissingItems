package com.lucasmellof.mystical_missing_items;

import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.fml.loading.FMLPaths;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 16/11/2025
 */
public class MysticalMissingItemsMixinPlugin implements IMixinConfigPlugin {
	private static Boolean enableRebalance = null;
	private static boolean hasAgradditions = false;
	private static boolean hasExtendedTier = false;


	@Override
	public void onLoad(String mixinPackage) {
		// Try to read the config value early
		enableRebalance = readRebalanceConfig();
		hasAgradditions = FMLLoader.getCurrent().getLoadingModList().getModFileById("mysticalagradditions") != null;
		hasExtendedTier = FMLLoader.getCurrent().getLoadingModList().getModFileById("mysticalextendedtier") != null;
	}

	@Override
	public String getRefMapperConfig() {
		return "";
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		var mod = mixinClassName.split("\\.")[5];
		System.out.println("[MMI MixinPlugin] Checking mixin for mod: " + mod + " | Mixin class: " + mixinClassName);
		if (mod.equalsIgnoreCase("agradditions") && !hasAgradditions) {
			return false;
		}
		if (mod.equalsIgnoreCase("extended_tier") && !hasExtendedTier) {
			return false;
		}

		if (mod.equals("extended_tier") && enableRebalance != null && !enableRebalance) {
			if (mixinClassName.endsWith("_Rebalance")) {
				System.out.println("[MMI MixinPlugin] Skipping rebalance mixin due to config: " + mixinClassName);
				return false;
			}
		}

		System.out.println("[MMI MixinPlugin] Applying mixin: "+  mixinClassName);
		return true;
	}

	private boolean readRebalanceConfig() {
		try {
			String configFileName = MysticalMissingItems.MOD_ID + "-common.toml";
			Path path = FMLPaths.CONFIGDIR.get().resolve(configFileName);
			if (Files.exists(path)) {
				String content = Files.readString(path);
				// Look for enableRebalance = true/false in the config file
				// Handle both "enableRebalance = true" and "enableRebalance=true" formats
				Pattern pattern = Pattern.compile("enableRebalance\\s*=\\s*(true|false)", Pattern.CASE_INSENSITIVE);
				java.util.regex.Matcher matcher = pattern.matcher(content);
				if (matcher.find()) {
					return Boolean.parseBoolean(matcher.group(1));
				}
			}
		} catch (IOException | SecurityException ignored) {
		}

		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

	}

	@Override
	public List<String> getMixins() {
		return List.of();
	}

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

	}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

	}
}
