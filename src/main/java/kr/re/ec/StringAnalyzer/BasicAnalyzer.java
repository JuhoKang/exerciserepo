package kr.re.ec.StringAnalyzer;

import java.util.HashMap;
import java.util.Map;

public class BasicAnalyzer implements Analyzer{

	@Override
	public Map<String, Integer> countWords(String input) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String [] strArray = input.split("/");
		
		for(int i = 0; i < strArray.length; i++ ){
			if(!map.containsKey(strArray[i])){
				map.put(strArray[i], 1);
			} else {
				map.put(strArray[i], map.get(strArray[i]).intValue() + 1);
			}
		}
		
		return map;		
	}

}
