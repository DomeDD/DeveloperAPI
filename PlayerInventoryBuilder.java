class PlayerInventoryBuilder {
	
	/**
	 * constructor
	 * @param player Player
	 */
	PlayerInventoryBuilder(Player player);
  
	/**
	 * @param items map of Integers and ItemStacks
	 */
	PlayerInventoryBuilder setItems(Map<Integer, ItemStack> items);
	
	String tobase64();
	
	/**
	 * @param from String from
	 * @return map of Integers and ItemStacks
	 */
	Map<Integer, ItemStack> frombase64(String from);
}
