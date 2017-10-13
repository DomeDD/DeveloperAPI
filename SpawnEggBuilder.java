class SpawnEggBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	SpawnEggBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param amount amount
	 */
	SpawnEggBuilder(int amount);
	
	/**
	 * @param entity entity type
	 */
	SpawnEggBuilder setSpawnType(EntityType entity);
}
