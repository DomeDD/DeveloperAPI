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
	 * constructor
	 * @param id id
	 * @param amount amount
	 */
	PotionBuilder(int id, int amount);
	
	/**
	 * constructor
	 * @param id id
	 * @param amount amount
	 * @param subid subid
	 */
	@Deprecated
	PotionBuilder(Material material, int amount, int subid);
	
	/**
	 * constructor
	 * @param id id
	 * @param amount amount
	 * @param subid subid
	 */
	@Deprecated
	PotionBuilder(int id, int amount, int subid);
	
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
