package com.lucasmellof.mystical_missing_items;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/*
 * @author Lucasmellof, Lucas de Mello Freitas created on 16/11/2025
 */
public class MysticalMissingItemsMixinPlugin implements IMixinConfigPlugin {
	private static Boolean enableRebalance = null;

	@Override
	public void onLoad(String mixinPackage) {
		// Try to read the config value early
		enableRebalance = readRebalanceConfig();
	}

	@Override
	public String getRefMapperConfig() {
		return "";
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		// Only apply extended tier mixins if rebalance is enabled
		if (isExtendedTierMixin(mixinClassName)) {
			return enableRebalance != null && enableRebalance;
		}
		// Always apply other mixins (like AccessorDeferredRegister)
		return true;
	}

	private boolean isExtendedTierMixin(String mixinClassName) {
		// Check if this is an extended tier rebalance mixin
		return mixinClassName.contains("MixinModItems") || mixinClassName.contains("MixinModArmorMaterials");
	}

	private boolean readRebalanceConfig() {
		try {
			// Try multiple possible config file locations
			String configFileName = MysticalMissingItems.MOD_ID + "-common.toml";
			Path[] possiblePaths = {
				Paths.get("config", configFileName),  // Production: .minecraft/config/
				Paths.get("run", "config", configFileName),  // Development: run/config/
				Paths.get(System.getProperty("user.home"), ".minecraft", "config", configFileName),  // User home
			};
			
			for (Path configPath : possiblePaths) {
				if (Files.exists(configPath)) {
					String content = Files.readString(configPath);
					// Look for enableRebalance = true/false in the config file
					// Handle both "enableRebalance = true" and "enableRebalance=true" formats
					Pattern pattern = Pattern.compile("enableRebalance\\s*=\\s*(true|false)", Pattern.CASE_INSENSITIVE);
					java.util.regex.Matcher matcher = pattern.matcher(content);
					if (matcher.find()) {
						return Boolean.parseBoolean(matcher.group(1));
					}
					// If file exists but value not found, break to avoid checking other locations
					break;
				}
			}
		} catch (IOException | SecurityException e) {
			// Config file doesn't exist or can't be read, default to true
		}
		
		// Default to true if config can't be read (enables rebalance by default)
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
