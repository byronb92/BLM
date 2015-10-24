import org.json.simple.JSONObject;

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
	 * Retrieve base stats from champion JSON files, given by champion base name.
	 * @param championName
	 */
	public Champion(String championName)
	{
		DataParser dataParser = new DataParser();
		JSONObject championStats = dataParser.getChampionStats(championName);
		setBaseStats(dataParser, championStats);
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
	
	public int getLevel()		{ return currentLevel; }
	public double getHP() 		{ return hitPoints; }
	public double getAD() 		{ return attackDamage; }
	public double getAP() 		{ return abilityPower; }
	public double getArmor() 	{ return armor; }
	public double getMR() 		{ return magicResistance; }
	public double getAS() 		{ return attackSpeed; }
	
	
	private void setBaseHP(double hp) { baseHP = hp; }
	private void setBaseAD(double ad) { baseAD = ad; }
	private void setBaseArmor(double armor) { baseArmor = armor; }
	private void setBaseMR(double mr) { baseMR = mr; }
	private void setBaseAS(double as){ baseAS = as; }
	
	private void setBaseHPPerLevel(double hp) { hpPerLevel = hp; }
	private void setBaseADPerLevel(double ad) { adPerLevel = ad; }
	private void setBaseArmorPerLevel(double armor) { armPerLevel = armor; }
	private void setBaseMRPerLevel(double mr) { mrPerLevel = mr; }
	private void setBaseASPerLevel(double as){ asPerLevel = as; }
	
	/**
	 * Method used in constructor to make things more readable.
	 * @param data	DataParser class used to get data for specified champion.
	 * @param championStats JSON Object obtained from champion specific name.
	 */
	private void setBaseStats(DataParser data, JSONObject championStats)
	{
		setBaseHP(data.getHP(championStats).doubleValue());
		setBaseAD(data.getAD(championStats).doubleValue());
		setBaseArmor(data.getArmor(championStats).doubleValue());
		setBaseMR(data.getMR(championStats).doubleValue());
		setBaseAS(data.getAS(championStats).doubleValue());	
		
		setBaseHPPerLevel(data.getHPPerLevel(championStats).doubleValue());
		setBaseADPerLevel(data.getADPerLevel(championStats).doubleValue());
		setBaseArmorPerLevel(data.getArmorPerLevel(championStats).doubleValue());
		setBaseMRPerLevel(data.getMRPerLevel(championStats).doubleValue());
		setBaseASPerLevel(data.getASPerLevel(championStats).doubleValue());
	}
	

}
