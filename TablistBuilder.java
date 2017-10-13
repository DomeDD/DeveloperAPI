class TablistBuilder {
	
	/**
	 * constructor
	 * @param header header
	 * @param footer footer
	 */
	TablistBuilder(String header, String footer);
	
	/**
	 * @param p player
	 */
	TablistBuilder send(Player p);
}
