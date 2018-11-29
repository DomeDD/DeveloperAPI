class SkullBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	SkullBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param amount amount
	 */
	@Deprecated
	SkullBuilder(int amount);
	
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
