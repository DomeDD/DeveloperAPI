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
	SkullBuilder(int amount);
	
	/**
	 * @param owner head's owner
	 */
	SkullBuilder setOwner(String owner);
}
