package skills;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import skills.champs.ChampionSkills;

public class SkillParser 
{
	// TODO: Debugging variable, remove later.
	public HashMap<String,String> uniqueLabels;
	public ArrayList<String> allLabels;
	


	public Skill[] getChampionSkills(String championName)
	{
		JSONParser parser = new JSONParser();
		try 
		{
			// TODO: This Scanner read needs to be closed. Or does it...?
			// TODO: Make sure verison is always right.
			String content = new Scanner(new File("" + 
					"lib/dragontail-5.18.1/5.18.1/data/en_US/champion/" + 
					championName + ".json")).useDelimiter("\\Z").next();
			
			Object obj = parser.parse(content);
			JSONObject json = (JSONObject)obj;
			JSONObject dataArray = (JSONObject)json.get("data");
			JSONObject champArray = (JSONObject)dataArray.get(championName);
			JSONArray champSpells = (JSONArray)champArray.get("spells");
			
			
			Skill[] champSkillArray = new Skill[4];
			champSkillArray[0] = spellQ(champSpells, championName);
			champSkillArray[1] = spellW(champSpells, championName);
			champSkillArray[2] = spellE(champSpells, championName);
			champSkillArray[3] = spellR(champSpells, championName);

			return champSkillArray;
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
	
	// TODO: Adjust variable names to match with each spell.
	private Skill spellQ(JSONArray champSpells, String championName)
	{
		JSONObject champQ = (JSONObject)champSpells.get(0);
		String skillid = (String)champQ.get("id");
		String skillname = (String)champQ.get("name");
		JSONArray cost = (JSONArray)champQ.get("cost");
		JSONArray cooldown = (JSONArray)champQ.get("cooldown");
		JSONArray effect = (JSONArray)champQ.get("effect");	
		Skill champQSkill = new Skill(skillid, skillname, cost.toArray(), 
				cooldown.toArray(), effect.toArray());
		return champQSkill;
	}
	
	private Skill spellW(JSONArray champSpells, String championName)
	{
		JSONObject champQ = (JSONObject)champSpells.get(1);
		String skillid = (String)champQ.get("id");
		String skillname = (String)champQ.get("name");
		JSONArray cost = (JSONArray)champQ.get("cost");
		JSONArray cooldown = (JSONArray)champQ.get("cooldown");
		JSONArray effect = (JSONArray)champQ.get("effect");	
		Skill champQSkill = new Skill(skillid, skillname, cost.toArray(), 
				cooldown.toArray(), effect.toArray());
		return champQSkill;
	}
	
	private Skill spellE(JSONArray champSpells, String championName)
	{
		JSONObject champQ = (JSONObject)champSpells.get(2);
		String skillid = (String)champQ.get("id");
		String skillname = (String)champQ.get("name");
		JSONArray cost = (JSONArray)champQ.get("cost");
		JSONArray cooldown = (JSONArray)champQ.get("cooldown");
		JSONArray effect = (JSONArray)champQ.get("effect");	
		Skill champQSkill = new Skill(skillid, skillname, cost.toArray(), 
				cooldown.toArray(), effect.toArray());
		return champQSkill;
	}
	
	private Skill spellR(JSONArray champSpells, String championName)
	{
		JSONObject champQ = (JSONObject)champSpells.get(3);
		String skillid = (String)champQ.get("id");
		String skillname = (String)champQ.get("name");
		JSONArray cost = (JSONArray)champQ.get("cost");
		JSONArray cooldown = (JSONArray)champQ.get("cooldown");
		JSONArray effect = (JSONArray)champQ.get("effect");	
		Skill champQSkill = new Skill(skillid, skillname, cost.toArray(), 
				cooldown.toArray(), effect.toArray());
		return champQSkill;
	}
	
	
	
	
	
	// TODO: Debugging constructor. Remove later.
	public SkillParser()
	{
		uniqueLabels = new HashMap<String,String>();
		allLabels = new ArrayList<String>();
	}
	
	// TODO: Debugging methods, Remove later.
	public void printUniqueLabels()
	{
		System.out.println(uniqueLabels.toString());
	}
	
	public void printAllLabels()
	{
		System.out.println(allLabels.toString());
	}
	
	
	/**
	 * Extract all labels to attempt to create algorithm organizing all spells.
	 * @param champSpells
	 * @param championName
	 */
	private void skillLabels(JSONArray champSpells, String championName)
	{
		
		System.out.println(championName + " Skills");
		JSONObject champQ = (JSONObject)champSpells.get(0);
		String skillid = (String)champQ.get("id");
		String skillname = (String)champQ.get("name");
		JSONObject leveltip = (JSONObject)champQ.get("leveltip");
		JSONArray labelArray = (JSONArray)leveltip.get("label");
		System.out.println(skillid + ": " + skillname + " Labels");
		for (int i = 0; i < labelArray.size(); i++)
		{
			uniqueLabels.put((String)labelArray.get(i), "");
			allLabels.add((String)labelArray.get(i));
			System.out.println(labelArray.get(i));
		}
		System.out.println("--------------------");
		
		JSONObject champW = (JSONObject)champSpells.get(1);
		String skillidW = (String)champW.get("id");
		String skillnameW = (String)champW.get("name");
		JSONObject leveltipW = (JSONObject)champW.get("leveltip");
		JSONArray labelArrayW = (JSONArray)leveltipW.get("label");
		System.out.println(skillidW + ": " + skillnameW + " Labels");
		for (int i = 0; i < labelArrayW.size(); i++)
		{
			uniqueLabels.put((String)labelArrayW.get(i), "");
			allLabels.add((String)labelArrayW.get(i));
			System.out.println(labelArrayW.get(i));
		}
		System.out.println("--------------------");
		
		JSONObject champE = (JSONObject)champSpells.get(2);
		String skillidE = (String)champE.get("id");
		String skillnameE = (String)champE.get("name");
		JSONObject leveltipE = (JSONObject)champE.get("leveltip");
		JSONArray labelArrayE = (JSONArray)leveltipE.get("label");
		System.out.println(skillidE + ": " + skillnameE + " Labels");
		for (int i = 0; i < labelArrayE.size(); i++)
		{
			uniqueLabels.put((String)labelArrayE.get(i), "");
			allLabels.add((String)labelArrayE.get(i));
			System.out.println(labelArrayE.get(i));
		}
		System.out.println("--------------------");
		
		JSONObject champR = (JSONObject)champSpells.get(3);
		String skillidR = (String)champR.get("id");
		String skillnameR = (String)champR.get("name");
		JSONObject leveltipR = (JSONObject)champR.get("leveltip");
		JSONArray labelArrayR = (JSONArray)leveltipR.get("label");
		System.out.println(skillidR + ": " + skillnameR + " Labels");
		for (int i = 0; i < labelArrayR.size(); i++)
		{
			uniqueLabels.put((String)labelArrayR.get(i), "");
			allLabels.add((String)labelArrayR.get(i));
			System.out.println(labelArrayR.get(i));
		}
		System.out.println("--------------------");
		System.out.println("");
		System.out.println("");
	}
	
}
