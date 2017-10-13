class EntityBuilder {
	
	/**
	 * constructor
	 * @param entity entity tpye
	 * @param loc location
	 */
	EntityBuilder(EntityType entity, Location loc);
	
	/**
	 * constructor
	 * @param entity entity tpye
	 * @param world world
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	EntityBuilder(EntityType entity, World world, double x, double y, double z);
	
	/**
	 * constructor
	 * @param entity entity tpye
	 * @param world world name
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	EntityBuilder(EntityType entity, String world, double x, double y, double z);
	
	/**
	 * @param name custom name
	 */
	EntityBuilder setCustomName(String name);
	
	/**
	 * @param visible nametag visible
	 */
	EntityBuilder setCustomNameVisible(boolean visible);
	
	/**
	 * @param entity entity
	 */
	EntityBuilder setPassenger(Entity entity);
	
	/**
	 * @param age entity age
	 */
	EntityBuilder setAge(EntityAge age);
	
	enum EntityAge BABY, ADULT;
	
	/**
	 * @return Entity
	 */
	Entity spawn();
}
