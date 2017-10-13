class FireworkBuilder {	
	
	/**
	 * constructor
	 * @param loc location
	 * @param color color
	 * @param type firework effect type
	 * @param fadeColor color
	 * @param flicker flickers
	 * @param trail has trail
	 * @param power power
	 */
	FireworkBuilder(Location loc, Type type, Color color, Color fadeColor, boolean flicker, boolean trail, int power);
	
	/**
	 * constructor
	 * @param loc location
	 * @param color color
	 * @param type firework effect type
	 * @param flicker flickers
	 * @param trail has trail
	 * @param power power
	 */
	FireworkBuilder(Location loc, Type type, Color color, boolean flicker, boolean trail, int power);
	
	FireworkBuilder build();
}
