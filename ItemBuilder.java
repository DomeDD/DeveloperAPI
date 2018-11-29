class ItemBuilder {
	
	/**
	 * constructor
	 */
	ItemBuilder();
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	ItemBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param material material
	 */
	ItemBuilder(Material material);
	
	/**
	 * constructor
	 * @param material material
	 * @param amount amount
	 */
	ItemBuilder(Material material, int amount);
	
	/**
	 * constructor
	 * @param material material
	 * @param amount amount
	 * @param subid subid
	 */
	ItemBuilder(Material material, int amount, int subid);
	
	/**
	 * constructor
	 * @param id id
	 */
	@Deprecated
	ItemBuilder(int id);
	
	/**
	 * constructor
	 * @param id id
	 * @param amount amount
	 */
	@Deprecated
	ItemBuilder(int id, int amount);
	
	/**
	 * constructor
	 * @param id id
	 * @param amount amount
	 * @param subid subid
	 */
	@Deprecated
	ItemBuilder(int id, int amount, int subid);
	
	/**
	 * @param durability durability
	 */
	ItemBuilder setDurability(int durability);
	
	/**
	 * @param name displayname
	 */
	ItemBuilder setDisplayName(String name);
	
	/**
	 * @param enchantment enchantment
	 * @param level enchantment level
	 */
	ItemBuilder addEnchant(Enchantment enchantment, int level);
	
	/**
	 * @param enchantments map of Enchantments and Enchantment Levels
	 */
	ItemBuilder addEnchants(Map<Enchantment, Integer> enchantments);
	
	/**
	 * @param itemflag itemflag
	 */
	ItemBuilder addItemFlag(ItemFlag itemflag);
	
	/**
	 * @param lore list of Strings for lore
	 */
	ItemBuilder setLore(List<String> lore);
	
	/**
	 * @param unbreakable unbreakable
	 */
	ItemBuilder setUnbreakable(boolean unbreakable);
	
	String tobase64();
	
	/**
	 * @param from String from
	 */
	ItemBuilder frombase64(String from);
	
	/**
	 * @return ItemStack
	 */
	ItemStack build();
}
