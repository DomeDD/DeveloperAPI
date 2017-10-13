class InventoryBuilder {
	
	/**
	 * constructor
	 * @param owner inventory holder
	 * @param size inventory size
	 */
	InventoryBuilder(InventoryHolder owner, int size);
	
	/**
	 * constructor
	 * @param owner inventory holder
	 * @param type inventory type
	 */
	InventoryBuilder(InventoryHolder owner, InventoryType type);
	
	/**
	 * constructor
	 * @param owner inventory holder
	 * @param size inventory size
	 * @param title inventory title
	 */
	InventoryBuilder(InventoryHolder owner, int size, String title);
	
	/**
	 * constructor
	 * @param owner inventory holder
	 * @param type inventory type
	 * @param title inventory title
	 */
	InventoryBuilder(InventoryHolder owner, InventoryType type, String title);
	
	/**
	 * @param slot slot id
	 * @param itemstack itemstack
	 */
	InventoryBuilder setItem(int slot, ItemStack itemstack);
	
	/**
	 * @param itemstack itemstack
	 */
	InventoryBuilder addItem(ItemStack itemstack);
	
	/**
	 * @return Inventory
	 */
	Inventory create()
}
