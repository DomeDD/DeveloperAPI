class ChatMessageBuilder {

	/**
	 * constructor
	 */
	ChatMessageBuilder();
	
	/**
	 * @param p player
	 * @param textpart text
	 * @param clickabletext clickabletext
	 * @param hovertext hovertext
	 * @param runcommand command
	 */
	ChatMessageBuilder sendClickableHoverableMessage(Player p, String textpart, String clickabletext, String hovertext, String runcommand);
	
	/**
	 * @param p player
	 * @param textpart text
	 * @param hoverabletext hoverabletext
	 * @param hovertext hovertext
	 */
	ChatMessageBuilder sendHoverableMessage(Player p, String textpart, String hoverabletext, String hovertext);
	
	/**
	 * @param p player
	 * @param textpart text
	 * @param clickabletext clickabletext
	 * @param runcommand command
	 */
	ChatMessageBuilder sendClickableMessage(Player p, String textpart, String clickabletext, String runcommand);
}
