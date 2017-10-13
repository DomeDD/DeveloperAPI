class FileBuilder {
	
	/**
	 * constructor
	 * @param path file path
	 * @param file file name
	 */
	FileBuilder(String path, String file);
	
	/**
	 * @param path path
	 * @param value value
	 */
	FileBuilder set(String path, Object value);
	
	FileBuilder save();
	
	/**
	 * @param path path
	 * @param value value
	 */
	FileBuilder addDefault(String path, Object value);
	
	/**
	 * @param keys keyset
	 */
	FileBuilder copyDefaults(boolean copyDefaults);
	
	/**
	 * @return File
	 */
	File getFile();
	
	void reload();
	
	/**
	 * @return true if file exists
	 */
	boolean exists();
	
	/**
	 * @param value value
	 * @return true if file contains value
	 */
	boolean contains(String value);
	
	/**
	 * @param path path
	 * @return object from path
	 */
	Object getObject(String path);
	
	/**
	 * @param path path
	 * @return String from path
	 */
	String getString(String path);
	
	/**
	 * @param path path
	 * @return int from path
	 */
	int getInt(String path);
	
	/**
	 * @param path path
	 * @return double from path
	 */
	double getDouble(String path);
	
	/**
	 * @param path path
	 * @return long from path
	 */
	long getLong(String path);
	
	/**
	 * @param path path
	 * @return boolean from path
	 */
	boolean getBoolean(String path);
	
	/**
	 * @param path path
	 * @return list of Strings from path
	 */
	List<String> getStringList(String path);
	
	/**
	 * @param path path
	 * @return list of booleans from path
	 */
	List<Boolean> getBooleanList(String path);
	
	/**
	 * @param path path
	 * @return list of doubles from path
	 */
	List<Double> getDoubleList(String path);
	
	/**
	 * @param path path
	 * @return list of ints from path
	 */
	List<Integer> getIntegerList(String path);
	
	/**
	 * @param keys keyset
	 * @return set of keyset
	 */
	Set<String> getKeys(boolean keys);
	
	/**
	 * @param section section
	 */
	ConfigurationSection getConfigurationSection(String section);
	
	void delete();
}
