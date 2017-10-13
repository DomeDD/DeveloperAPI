class TippedArrowBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	TippedArrowBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param amount amount
	 */
	TippedArrowBuilder(int amount);
	
	/**
	 * @param color color
	 */
	TippedArrowBuilder setColor(Color color);
	
	/**
	 * @param type potion effect type
	 * @param duration effect duration
	 * @param amplifier effect amplifier
	 */
	TippedArrowBuilder addCustomEffect(PotionEffectType type, int duration, int amplifier);
}
