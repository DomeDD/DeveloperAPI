class BannerBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	BannerBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param amount amount
	 */
	@Deprecated
	BannerBuilder(int amount);
	
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
