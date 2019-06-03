class SpawnEggBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	SpawnEggBuilder(ItemStack itemStack);
	
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
