package champion;
import org.json.simple.JSONObject;
import skills.champs.ChampionSkills;

public class Champion 
{
	private String championName;
	private ChampionSkills champSkills;
	private int currentLevel;
	
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
		ChampionStats championParser = new ChampionStats();
		JSONObject championStats = championParser.getChampionStats(championName);
		setChampionName(championName);
		setBaseStats(championParser, championStats);
	}
	
	
	
	/**
	 * Ensure statistics match the current level of the champion.
	 * This is called anytime the level of a champion is modified.
	 */
	private void update()
	{
		hitPoints = baseHP + (hpPerLevel * (currentLevel - 1)) + bonusHP;
		attackDamage = baseAD + (adPerLevel * (currentLevel - 1)) + bonusAD;
		abilityPower = bonusAP;
		armor = baseArmor + (armPerLevel * (currentLevel - 1)) + bonusArmor;
		magicResistance = baseMR + (mrPerLevel * (currentLevel - 1)) + bonusMR;
		attackSpeed = baseAS * (1 + bonusAS) * (1 + (asPerLevel * (currentLevel - 1)) / 100);	
	}
	
	public int getLevel()		{ return currentLevel; }
	public String getName() 	{ return championName; }
	public double getHP() 		{ return hitPoints; }
	public double getAD() 		{ return attackDamage; }
	public double getAP() 		{ return abilityPower; }
	public double getArmor() 	{ return armor; }
	public double getMR() 		{ return magicResistance; }
	public double getAS() 		{ return attackSpeed; }
	public ChampionSkills getChampionSkills()
	{
		return champSkills;
	}
	
	public void setLevel(int level) { 
		currentLevel = level; 
		if (champSkills != null)
		{
			champSkills.updateSkilLevels(level);
		}
		update();
	}
	
	private void setChampionName(String championName) {
		this.championName = championName;
	
	}
	

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
	public void setChampionSkills(ChampionSkills champSkills)
	{
		this.champSkills = champSkills;
	}
	
	/**
	 * Method used in constructor to make things more readable.
	 * @param data	DataParser class used to get data for specified champion.
	 * @param championStats JSON Object obtained from champion specific name.
	 */
	private void setBaseStats(ChampionStats data, JSONObject championStats)
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
		setLevel(1);
	}
	

	

}
