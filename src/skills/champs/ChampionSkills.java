package skills.champs;
import skills.Skill;


public abstract class ChampionSkills 
{
	Skill[] champSkills;
	protected int currentQLevel = 0;
	protected int currentWLevel = 0;
	protected int currentELevel = 0;
	protected int currentRLevel = 0;
	

	
	// TODO: May be unnecssary. This is created in the SkillParser class.
	public ChampionSkills()
	{
		champSkills = new Skill[5];		// Q, W, E, R, Passive
	}
	
	public ChampionSkills(Skill[] champSkills)
	{
		this.champSkills = champSkills;
	}
	
	public int getQLevel()	 { return currentQLevel; }
	public int getWLevel()	 { return currentWLevel; }
	public int getELevel()	 { return currentELevel; }
	public int getRLevel()	 { return currentRLevel; }
	
	public Skill getSpellQ() { return champSkills[0]; }
	public Skill getSpellW() { return champSkills[1]; }
	public Skill getSpellE() { return champSkills[2]; }
	public Skill getSpellR() { return champSkills[3]; }
	//TODO: Get passive spell.
	
	
	public abstract String[] skillOrder();
	public abstract void editSpellQ();
	public abstract void editSpellW();
	public abstract void editSpellE();	
	public abstract void editSpellR();
	public abstract void editSpellPassive();
	
	// TODO: Ensure skill order has been initiated.
	public void updateSkilLevels(int currentLevel)
	{
		currentQLevel = 0;
		currentWLevel = 0;
		currentELevel = 0;
		currentRLevel = 0;
		for (int i = 0; i < currentLevel; i++)
		{
			if 		(skillOrder()[i].equals("Q")) 	{ currentQLevel++; }
			else if (skillOrder()[i].equals("W")) 	{ currentWLevel++; }
			else if (skillOrder()[i].equals("E")) 	{ currentELevel++; }
			else									{ currentRLevel++; }
		}
	}

}
