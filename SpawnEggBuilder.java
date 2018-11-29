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
	@Deprecated
	SpawnEggBuilder(int amount);
	
	/**
	 * constructor
	 * @param material material
	 * @param amount amount
	 */
	SpawnEggBuilder(Material material, int amount);
	
	/**
	 * @param entity entity type
	 */
	SpawnEggBuilder setSpawnType(EntityType entity);
}
