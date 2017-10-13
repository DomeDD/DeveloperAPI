class TitleBuilder {

	/**
	 * constructor
	 * @param title title
	 * @param subtitle subtitle
	 */
	TitleBuilder(String title, String subtitle);
	
	/**
	 * @param titleFadeIn title fade in time
	 * @param titleStay title stay time
	 * @param titleFadeOut title fade out time
	 * @param subFadeIn subtitle fade in time
	 * @param subStay subtitle stay time
	 * @param subFadeOut subtitle fade out time
	 */
	TitleBuilder setTimings(int titleFadeIn, int titleStay, int titleFadeOut, int subFadeIn, int subStay, int subFadeOut);
	
	/**
	 * @param p player
	 */
	TitleBuilder send(Player p);
}
