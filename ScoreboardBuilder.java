class ScoreboardBuilder {
	
	/**
	 * constructor
	 * @param objective objective name
	 * @param title scoreboard title
	 * @param entrys list of strings for scoreboard scores
	 */
	ScoreboardBuilder(String objective, String title, List<String> entrys);
	
	/**
	 * @return Scoreboard
	 */
	Scoreboard build();
}
