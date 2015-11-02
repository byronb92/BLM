import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Map;



public class SortChampions {
	

	public void sortAllStats(ArrayList<Champion> championList)
	{
		
	}
	
	public void sortHealth(ArrayList<Champion> championList)
	{
		// Add every champion and its health value into a key/value pair.
		TreeMap<Double,String> healthMap = new TreeMap<Double,String>();
		for (int i = 0; i < championList.size(); i++)
		{
			healthMap.put(championList.get(i).getHP(), championList.get(i).getName());
		}
	
		// Automatically accesses each key in ascending order.
		for(Map.Entry<Double,String> entry : healthMap.entrySet()) {	
			  System.out.println(entry);
		}
	}
	
	public void sortAD(ArrayList<Champion> championList)
	{
		TreeMap<Double,String> adMap = new TreeMap<Double,String>();
		for (int i = 0; i < championList.size(); i++)
		{
			adMap.put(championList.get(i).getAD(), championList.get(i).getName());
		}
		for(Map.Entry<Double,String> entry : adMap.entrySet()) {	
			  System.out.println(entry);
		}
	}
	
	public void sortArmor(ArrayList<Champion> championList)
	{
		TreeMap<Double,String> armorMap = new TreeMap<Double,String>();
		for (int i = 0; i < championList.size(); i++)
		{
			armorMap.put(championList.get(i).getArmor(), championList.get(i).getName());
		}

		for(Map.Entry<Double,String> entry : armorMap.entrySet()) {	
			  System.out.println(entry);
		}
	}
}
