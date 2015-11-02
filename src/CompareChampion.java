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
	
	public void compareAll()
	{
		
	}
	public String compareHealth()
	{
		if(champA.getHP() > champB.getHP())
		{
			double difference = champA.getHP() - champB.getHP();
			return champA.getName() + "(" + difference + ")";
		}
		else if (champA.getHP() < champB.getHP())
		{
			double difference = champB.getHP() - champA.getHP();
			return champB.getName() + "(" + difference + ")";
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
			return champA.getName() + "(" + difference + ")";
		}
		else if (champA.getAD() < champB.getAD())
		{
			double difference = champB.getAD() - champA.getAD();
			return champB.getName() + "(" + difference + ")";
		}
		return champA.getName() + " and " + 
			champB.getName() + " have the same attack damage.";
	}

	public String compareArmor()
	{
		if(champA.getArmor() > champB.getArmor())
		{
			double difference = champA.getArmor() - champB.getArmor();
			return champA.getName() + "(" + difference + ")";
		}
		else if (champA.getArmor() < champB.getArmor())
		{
			double difference = champB.getArmor() - champA.getArmor();
			return champB.getName() + "(" + difference + ")";
		}
		return champA.getName() + " and " + 
			champB.getName() + " have the same armor.";
	}
	public String compareMR()
	{
		if(champA.getMR() > champB.getMR())
		{
			double difference = champA.getArmor() - champB.getArmor();
			return champA.getName() + "(" + difference + ")";
		}
		else if (champA.getMR() < champB.getMR())
		{
			double difference = champB.getMR() - champA.getMR();
			return champB.getName() + "(" + difference + ")";
		}
		return champA.getName() + " and " + 
			champB.getName() + " have the same magic resistance.";
	}
	public String compareAS(String champOne, String champTwo)
	{
		if(champA.getAS() > champB.getAS())
		{
			double difference = champA.getAS() - champB.getAS();
			return champA.getName() + "(" + difference + ")";
		}
		else if (champA.getAS() < champB.getAS())
		{
			double difference = champB.getAS() - champA.getAS();
			return champB.getName() + "(" + difference + ")";
		}
		return champA.getName() + " and " + 
			champB.getName() + " have the same attack speed.";
	}
	
	// TODO: Compare Ability Power from runes/masteries/items.
	public void compareAP(String champOne, String champTwo)
	{
		
	}
	

}
