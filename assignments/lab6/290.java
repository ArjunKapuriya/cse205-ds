import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public boolean wordPattern(String pattern, String s) {

		HashMap<Character, String> hm = new HashMap<>();
		String retrace = "";
		if (pattern.length() != s.split(" ").length) {
			return false;
		} else {
			char[] charArray = pattern.toCharArray();
			String[] strArray = s.split(" ");
			for (int i = 0; i < charArray.length; i++) {
				if(!hm.containsKey(charArray[i]))
				{
				hm.put(charArray[i], strArray[i]);
				}
			}

			char keyForResult = 0;
			for (String st : strArray) {
				for (Entry<Character, String> entry : hm.entrySet()) {
					if (entry.getValue().equals(st)) {
						keyForResult = entry.getKey();
						break;
					} else
					{
						keyForResult=0;
					}

				}
				if(keyForResult !=0) {
				retrace = retrace + keyForResult;
				}

			}
			if (retrace.equals(pattern)) {
				return true;
			} else {
				return false;
			}

		}
	
    }
}