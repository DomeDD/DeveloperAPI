class BannerBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	BannerBuilder(ItemStack itemStack);
	
	/**
	 * @param color color
	 */
	@Deprecated
	BannerBuilder setBaseColor(DyeColor color);
	
	/**
	 * @param color color
	 * @param pattern pattern type
	 */
	BannerBuilder addPattern(DyeColor color, PatternType pattern);
}
