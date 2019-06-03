class SkullBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	SkullBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param material material
	 * @param amount amount
	 */
	SkullBuilder(Material material, int amount);
	
	/**
	 * @param owner head's owner
	 */
	SkullBuilder setOwner(String owner);
}
