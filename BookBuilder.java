class BookBuilder extends ItemBuilder {
	
	/**
	 * constructor
	 * @param itemStack itemstack
	 */
	BookBuilder(ItemStack itemStack);
	
	/**
	 * constructor
	 * @param amount amount
	 */
	BookBuilder(int amount);
	
	/**
	 * @param name author's name
	 */
	BookBuilder setAuthor(String name);
  
  	/**
	 * @param content page content
	 */
	BookBuilder addPage(String content);
  
 	/**
	 * @param contents list of page contents
	 */
	BookBuilder addPages(List<String> contents);
  
	/**
	 * @return amount of pages
	 */
	BookBuilder getPageCount();
}
