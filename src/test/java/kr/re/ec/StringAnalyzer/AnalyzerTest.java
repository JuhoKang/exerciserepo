package kr.re.ec.StringAnalyzer;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class AnalyzerTest {
	
	
	//example input "appleapplegrapegrapegrapepineapple"; 단어의 기준은?
	//example input "apple/apple/grape/grape/grape/pineapple"; 다른 구분자? 
	//
	//
	//
	//
	
	@Test
	public void 단어세기_BasicAnalyzer_결과맵으로(){
		Analyzer analyzer = new BasicAnalyzer();
		String input = "apple/apple/grape/grape/grape/pineapple";
		Map<String,Integer> result = analyzer.countWords(input);
		assertEquals(2, result.get("apple").intValue());
		assertEquals(3, result.get("grape").intValue());
		assertEquals(1, result.get("pineapple").intValue());
	}

}
