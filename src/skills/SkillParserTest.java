package skills;

import junit.framework.TestCase;

public class SkillParserTest extends TestCase {
	
	SkillParser skillparser;

	protected void setUp() throws Exception {
		super.setUp();
		skillparser = new SkillParser();
	}
	
	public void testAlistarSkills()
	{
		skillparser.getChampionSkills("Alistar");
	}
//	public void testGetAllMeleeSupportLabels()
//	{
//		skillparser.getChampionSkills("Alistar");
//		skillparser.getChampionSkills("Blitzcrank");
//		skillparser.getChampionSkills("Braum");
//		skillparser.getChampionSkills("Leona");
//		skillparser.getChampionSkills("Nautilus");
//		skillparser.getChampionSkills("TahmKench");
//		skillparser.getChampionSkills("Taric");
//		
//		System.out.println("Unorthodox Supports");
//		skillparser.getChampionSkills("Nunu");
//		skillparser.getChampionSkills("Malphite");
//		skillparser.getChampionSkills("Shen");
//		skillparser.getChampionSkills("Trundle");
//
//		skillparser.getChampionSkills("Gragas");
//		skillparser.getChampionSkills("Maokai");
//		skillparser.getChampionSkills("Sion");
//		//skillparser.printUniqueLabels();
//		//skillparser.printAllLabels();
//	}
}
