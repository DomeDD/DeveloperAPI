class PotionBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	PotionBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param material material
	 * @param amount amount
	 */
	PotionBuilder(Material material, int amount);
	
	/**
	 * @param color color
	 */
	PotionBuilder setColor(Color color);
	
	/**
	 * @param type potion effect type
	 * @param duration effect duration
	 * @param amplifier effect amplifier
	 */
	PotionBuilder addCustomEffect(PotionEffectType type, int duration, int amplifier);
}
