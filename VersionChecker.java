class VersionChecker {

	/**
	 * @return BukkitVersion
	 */
	BukkitVersion getBukkitVersion();
	
	enum BukkitVersion {
		v1_8_R1, v1_8_R2, v1_8_R3, v1_9_R1, v1_9_R2, v1_10_R1, v1_11_R1, v1_12_R1; 
	}
}