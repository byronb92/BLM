package champion;
import org.json.simple.JSONObject;
import java.util.ArrayList;

public class ChampionManager 
{
	private JSONObject championStats;
	private ArrayList<Champion> championList;
	
	public ChampionManager()
	{
		championList = new ArrayList<Champion>();
	}
	
	public ArrayList<Champion> getChampions() { return championList; }
	// TODO: Potentially make into HashMap?
	public Champion getChampion(int position) { return championList.get(position); }
	
	/**
	 * Add a champion to the current list of champions we are analyzing.
	 * @param championName
	 */
	public void addChampion(String championName)
	{
		Champion newChampion = new Champion(championName);
		//TODO: If champion has been successfully created, add into the list.
		championList.add(newChampion);
	}
	
	/**
	 * Add a champion to the champion list with a specific level.
	 * @param championName
	 * @param currentLevel
	 */
	public void addChampion(String championName, int currentLevel)
	{
		Champion newChampion = new Champion(championName);
		newChampion.setLevel(currentLevel);
		championList.add(newChampion);	
	}
	
	

	/**
	 * Conveniently add all melee supports to the list of champions to be analyzed.
	 */
	public void addAllMeleeSupports()
	{
		addChampion("Alistar");
		addChampion("Blitzcrank");
		addChampion("Braum");
		addChampion("Leona");
		addChampion("Nautilus");
		addChampion("TahmKench");
		addChampion("Taric");
		
		addChampion("Nunu");
		addChampion("Malphite");
		addChampion("Shen");
		addChampion("Trundle");

		addChampion("Gragas");
		addChampion("Maokai");
		addChampion("Sion");	
	}
	
	public void addAllRangedSupports()
	{
		/**
		 * Bard
		 * Janna
		 * Karma
		 * Lulu
		 * Lux
		 * Morgana
		 * Nami
		 * Sona
		 * Soraka
		 * Thresh
		 * Zilean
		 * Zyra
		 */
		
		/**
		 * Weird:
		 * Anivia
		 * Fiddlesticks
		 * Heimerdinger
		 * Kayle
		 * Orianna
		 * Syndra
		 */
	}
	
	
}
