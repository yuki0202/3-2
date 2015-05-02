package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				j = i;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb).toLowerCase();
	}
	
	static String capitalize(String s) {
		if(s.length()==0){ return "";}
		else{
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
		}
	}
	
	static String uncapitalize(String s) {
		if(s.length()==0){return "";}
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}