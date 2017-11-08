class VillagerTradeBuilder {
	
	/**
	 * constructor
	 */
	VillagerTradeBuilder();
	
	/**
	 * @param reward experiencereward
	 */
	VillagerTradeBuilder setExperienceReward(boolean reward);
	
	/**
	 * @param maxUses maximal uses
	 */
	VillagerTradeBuilder setMaxUses(int maxUses);
	
	/**
	 * @param uses uses
	 */
	VillagerTradeBuilder setUses(int uses);
	
	/**
	 * @param v villager
	 */
	void clearTrades(Villager v);
	
	/**
	 * @param m merchant
	 */
	void clearTrades(Merchant m);
	
	/**
	 * @param ingredient ingredient
	 * @param result result
	 */
	void addTrade(ItemStack ingredient, ItemStack result);
	
	/**
	 * @param ingredient1 ingredient1
	 * @param ingredient2 ingredient2
	 * @param result result
	 */
	void addTrade(ItemStack ingredient1, ItemStack ingredient2, ItemStack result);
	
	/**
	 * @param v villager
	 */
	void setTrades(Villager v);
	
	/**
	 * @param m merchant
	 */
	void setTrades(Merchant m);
	
	/**
	 * @param v villager
	 */
	@Deprecated
	void clearVillagerTrades(Villager v);

	/**
	 * @param v villager
	 * @param ingredient ingredient
	 * @param result result
	 */
	@Deprecated
	void addTrade(Villager v, ItemStack ingredient, ItemStack result);
	
	/**
	 * @param v villager
	 * @param ingredient1 ingredient1
	 * @param ingredient2 ingredient2
	 * @param result result
	 */
	@Deprecated
	void addTrade(Villager v, ItemStack ingredient1, ItemStack ingredient2, ItemStack result);
}
