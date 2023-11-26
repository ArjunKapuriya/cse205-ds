class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> lstEven=new ArrayList<>();
        ArrayList<Integer> lstOdd=new ArrayList<>();
        ArrayList<Character> pos=new ArrayList<>();

        String s=""+num;

        for(int i=0;i<s.length();i++){
            if(Character.getNumericValue(s.charAt(i))%2==0){
                lstEven.add(Character.getNumericValue(s.charAt(i)));
                pos.add('e');
            }
            else{
                lstOdd.add(Character.getNumericValue(s.charAt(i)));
                pos.add('o');
            }
        }
        Collections.sort(lstEven,Collections.reverseOrder());
        Collections.sort(lstOdd,Collections.reverseOrder());

        int oi=0,ei=0;
        s="";
        for(int i=0;i<pos.size();i++){
            if(pos.get(i)=='e'){
                s+=lstEven.get(ei++);
            }
            else{
                s+=lstOdd.get(oi++);
            }
        }

        return Integer.valueOf(s);
    }
}