class LeatherArmorBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	LeatherArmorBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param material material
	 * @param amount amount
	 */
	LeatherArmorBuilder(Material material, int amount);
	
	/**
	 * constructor
	 * @param id id
	 * @param amount amount
	 */
	LeatherArmorBuilder(int id, int amount);
	
	/**
	 * @param color color
	 */
	LeatherArmorBuilder setColor(Color color);
	
	/**
	 * @param red rgb red
	 * @param green rgb green
	 * @param blue rgb blue
	 */
	LeatherArmorBuilder setColor(int red, int green, int blue);
	
	LeatherArmorBuilder setRandomColor();
}
