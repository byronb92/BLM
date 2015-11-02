import java.util.ArrayList;

//TODO: Do I even need this class with SortChampions?
// This is only a comparison between two champions, not all.

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
	
	public void compareAD(String champOne, String champTwo)
	{
		
	}
	public void compareAP(String champOne, String champTwo)
	{
		
	}
	public void compareArmor(String champOne, String champTwo)
	{
		
	}
	public void compareMR(String champOne, String champTwo)
	{
		
	}
	public void compareAS(String champOne, String champTwo)
	{
		
	}
	

}
