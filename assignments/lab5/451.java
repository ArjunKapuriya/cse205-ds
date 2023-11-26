class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int i=0;
        while(i<s.length())
              {
              if(!m.containsKey(s.charAt(i)))
                 m.put(s.charAt(i),1);
              else
                 m.put(s.charAt(i),m.get(s.charAt(i))+1);
                 i++;
              }
    String s1="";
    List<Character> keys=new ArrayList<>(m.keySet());
    Collections.sort(keys,Comparator.comparing(m::get));
    Collections.reverse(keys);
    for(char c : keys)
       {
       for(i=0;i<m.get(c);i++)
            s1=s1+c;
       }
    return s1;
    }
}