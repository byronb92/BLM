package skills.champs;

import skills.Skill;

public class ChampionFactory 
{	
	public ChampionSkills getChampion(String championName, Skill[] champSkills)
	{
		if (championName.equals("Alistar"))
		{
			return new AlistarSkills(champSkills);
		}
		return null;
	}

}
