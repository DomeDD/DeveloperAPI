class HologramBuilder {
	
	/**
	 * constructor
	 * @param name name
	 * @param loc location
	 */
	HologramBuilder(String name, Location loc);
	
	/**
	 * constructor
	 * @param name name
	 * @param world world
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	HologramBuilder(String name, World world, double x, double y, double z);
	
	/**
	 * constructor
	 * @param name name
	 * @param world world name
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	HologramBuilder(String name, String world, double x, double y, double z);
	
	/**
	 * @param line line id
	 * @param text text
	 */
	HologramBuilder setLine(int line, String text);
	
	/**
	 * @param lines list of Strings for hologram lines
	 */
	HologramBuilder addLines(List<String> lines);
	
	/**
	 * @param text text
	 */
	HologramBuilder addLine(String text);
	
	/**
	 * @param line line
	 */
	HologramBuilder removeLine(String line);
	
	HologramBuilder spawn();
	
	/**
	 * @param loc location
	 */
	void remove(Location loc);
	
	/**
	 * @param path file path
	 * @param file file name
	 */
	void saveInFile(String path, String file);
	
	/**
	 * @param path file path
	 * @param file file name
	 */
	void removeFromFile(String path, String file);
}
