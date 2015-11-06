package skills;
import champion.Champion;
import skills.champs.ChampionSkills;
import skills.champs.ChampionFactory;

/**
 * Manager class that facilitates the logic of creating skills for a champion.
 * 1. Use the SkillParser to obtain the champion data from the correct JSON file.
 * 2. Create specific champion object based on championName and object
 * 		return by the SkillParser getChampionSkills.
 * 3. Attach this skills object to the correct ChampionObject.
 * @author byronb92
 *
 */
public class SkillsManager 
{
	SkillParser skillParser;
	
	public SkillsManager()
	{
		skillParser = new SkillParser();
	}
	
	/**
	 * Given a champion name, use the skills parser to obtain the 
	 * given champion's skills.
	 * 
	 * Then create an instance of the correct champion given the name of the champ.
	 * 
	 * @param champ The champion's skills that you want to attach.s
	 */
	public void attachSkillsToChampion(Champion champ)
	{
		Skill[] skills = skillParser.getChampionSkills(champ.getName());
		ChampionFactory champFactory = new ChampionFactory();
		ChampionSkills champSkills = champFactory.getChampion(champ.getName(), skills);
		champSkills.updateSkilLevels(champ.getLevel());
		champ.setChampionSkills(champSkills);
	}
}
