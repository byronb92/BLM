import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class DataParser 
{
	
	/**
	 * Obtains the JSON object containing a champion's base stats.
	 * @param championName
	 * @return a JSON object with the following stats:        
	 * 		hp, hpperlevel,mp,mpperlevel,movespeed,armor,armorperlevel,
     *      spellblock,spellblockperlevel,attackrange,hpregen,hpregenperlevel,
     *      mpregen,mpregenperlevel,crit,critperlevel,attackdamage,
     *      attackdamageperlevel, attackspeedoffset,attackspeedperlevel
     * returns NULL if the specified champion does not exist.
	 */
	public JSONObject getChampionStats(String championName)
	{
		JSONParser parser = new JSONParser();
		try 
		{
			// TODO: This Scanner read needs to be closed. Or does it...?
			String content = new Scanner(new File("" + 
					"lib/dragontail-5.18.1/5.18.1/data/en_US/champion/" + 
					championName + ".json")).useDelimiter("\\Z").next();
			
			Object obj = parser.parse(content);
			JSONObject json = (JSONObject)obj;
			JSONObject dataArray = (JSONObject)json.get("data");
			JSONObject champArray = (JSONObject)dataArray.get(championName);
			JSONObject champStats = (JSONObject)champArray.get("stats");
			return champStats;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (ParseException e) 
		{
			e.printStackTrace();
			System.out.println("Error parsing JSON file.");
			return null;
		}	
	}
	
	public Double getHP(JSONObject championStats) { 
		return (Double)championStats.get("hp");	
	}
	public Double getAD(JSONObject championStats) { 
		return (Double)championStats.get("attackdamage"); 
	}
	public Double getArmor(JSONObject championStats) { 
		return (Double)championStats.get("armor"); 
	}
	public Double getMR(JSONObject championStats) { 
		return (Double)championStats.get("spellblock"); 
	}
	public Double getAS(JSONObject championStats) { 
		return (Double)championStats.get("attackspeedoffset"); 
	}
	
	public Double getHPPerLevel(JSONObject championStats) { 
		return (Double)championStats.get("hpperlevel");	
	}
	public Double getADPerLevel(JSONObject championStats) { 
		return (Double)championStats.get("attackdamageperlevel"); 
	}
	public Double getArmorPerLevel(JSONObject championStats) { 
		return (Double)championStats.get("armorperlevel"); 
	}
	public Double getMRPerLevel(JSONObject championStats) { 
		return (Double)championStats.get("spellblockperlevel"); 
	}
	public Double getASPerLevel(JSONObject championStats) { 
		return (Double)championStats.get("attackspeedperlevel"); 
	}
	// TODO: Consider hp regen in battle scenarios.
	// TODO: Using this to commit.
}




/**
 * data-->spells
 *		cooldown, cost, effect
 */