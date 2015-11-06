package champion;
import java.util.ArrayList;



/**
 * Set up comparisons between two champions.
 * TODO: Compare base statistics and display champion with higher stat in seperate colors.
 * @author byronb92
 *
 */
public class CompareChampion {
	Champion champA;
	Champion champB;
	
	public CompareChampion(Champion champA, Champion champB)
	{
		this.champA = champA;
		this.champB = champB;
	}
	
	/**
	 * Print out a message containing comparisons for each champion's stats.
	 * @return
	 */
	public String compareAll()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(compareHealth());
		sb.append(System.getProperty("line.separator"));
		sb.append(compareAD());
		sb.append(System.getProperty("line.separator"));
		sb.append(compareArmor());
		sb.append(System.getProperty("line.separator"));
		sb.append(compareMR());
		sb.append(System.getProperty("line.separator"));
		sb.append(compareAS());
		System.out.println(sb.toString());
		return sb.toString();
	}
	public String compareHealth()
	{
		if(champA.getHP() > champB.getHP())
		{
			double difference = champA.getHP() - champB.getHP();
			return "Health: " + champA.getName() + "(" + difference + ")";
		}
		else if (champA.getHP() < champB.getHP())
		{
			double difference = champB.getHP() - champA.getHP();
			return "Health: " + champB.getName() + "(" + difference + ")";
		}
		// Both champions have equal health.
		return champA.getName() + " and " + 
			champB.getName() + " have the same health.";
	}
	
	public String compareAD()
	{
		if(champA.getAD() > champB.getAD())
		{
			double difference = champA.getAD() - champB.getAD();
			return "AD: " + champA.getName() + "(" + difference + ")";
		}
		else if (champA.getAD() < champB.getAD())
		{
			double difference = champB.getAD() - champA.getAD();
			return "AD: " + champB.getName() + "(" + difference + ")";
		}
		return champA.getName() + " and " + 
			champB.getName() + " have the same attack damage.";
	}

	public String compareArmor()
	{
		if(champA.getArmor() > champB.getArmor())
		{
			double difference = champA.getArmor() - champB.getArmor();
			return "Armor: " + champA.getName() + "(" + difference + ")";
		}
		else if (champA.getArmor() < champB.getArmor())
		{
			double difference = champB.getArmor() - champA.getArmor();
			return "Armor: " + champB.getName() + "(" + difference + ")";
		}
		return champA.getName() + " and " + 
			champB.getName() + " have the same armor.";
	}
	public String compareMR()
	{
		if(champA.getMR() > champB.getMR())
		{
			double difference = champA.getArmor() - champB.getArmor();
			return "MR: " + champA.getName() + "(" + difference + ")";
		}
		else if (champA.getMR() < champB.getMR())
		{
			double difference = champB.getMR() - champA.getMR();
			return "MR: " + champB.getName() + "(" + difference + ")";
		}
		return champA.getName() + " and " + 
			champB.getName() + " have the same magic resistance.";
	}
	public String compareAS()
	{
		if(champA.getAS() > champB.getAS())
		{
			double difference = champA.getAS() - champB.getAS();
			return "Attack Speed: " + champA.getName() + "(" + difference + ")";
		}
		else if (champA.getAS() < champB.getAS())
		{
			double difference = champB.getAS() - champA.getAS();
			return "Attack Speed: " + champB.getName() + "(" + difference + ")";
		}
		return champA.getName() + " and " + 
			champB.getName() + " have the same attack speed.";
	}
	
	// TODO: Compare Ability Power from runes/masteries/items.
	public void compareAP(String champOne, String champTwo)
	{
		
	}
	

}
