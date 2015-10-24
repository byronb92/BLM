
public class Champion 
{
	String championName;
	int currentLevel;
	
	private double baseHP;
	private double baseAD;
	private double baseArmor;
	private double baseMR;
	private double baseAS;
	
	private double hpPerLevel;
	private double adPerLevel;
	private double armPerLevel;
	private double mrPerLevel;
	private double asPerLevel;
	
	// Runes, masteries, items
	private double bonusHP;
	private double bonusAD;
	private double bonusAP;
	private double bonusArmor;
	private double bonusMR;
	private double bonusAS;
	
	private double hitPoints;
	private double attackDamage;
	private double abilityPower;
	private double armor;
	private double magicResistance;
	private double attackSpeed;
	
	/**
	 * Retrieve base stats from champion database, given by champion base name.
	 * @param championName
	 */
	public Champion(String championName)
	{
		
	}
	
	/**
	 * Set up a champion based on base statistics and perform math based on level.
	 * @param baseHP
	 * @param baseAD
	 * @param baseAS
	 * @param baseArmor
	 * @param baseMR
	 * @param currentLEvel
	 */
	public Champion(double baseHP, double baseAD, double baseAS,
			double baseArmor, double baseMR, int currentLevel)
	{
		
	}
	
	/**
	 * Ensure statistics match the current level of the champion.
	 */
	public void update()
	{
		hitPoints = baseHP + (hpPerLevel * (currentLevel - 1)) + bonusHP;
		attackDamage = baseAD + (adPerLevel * (currentLevel - 1)) + bonusAD;
		abilityPower = bonusAP;
		armor = baseArmor + (armPerLevel * (currentLevel - 1)) + bonusArmor;
		magicResistance = baseMR + (mrPerLevel * (currentLevel - 1)) + bonusMR;
		attackSpeed = baseAS + (asPerLevel * (currentLevel - 1)) + bonusAS;
	}
	
	
	public double getHP() 		{ return hitPoints; }
	public double getAD() 		{ return attackDamage; }
	public double getAP() 		{ return abilityPower; }
	public double getArmor() 	{ return armor; }
	public double getMR() 		{ return magicResistance; }
	public double getAS() 		{ return attackSpeed; }

}
