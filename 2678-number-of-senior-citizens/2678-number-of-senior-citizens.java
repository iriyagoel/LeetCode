class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
            int ageTens = Character.getNumericValue(details[i].charAt(11));
            int ageOnes = Character.getNumericValue(details[i].charAt(12));
            int age = ageTens * 10 + ageOnes;
            if(age>60){
                 c++;
            }
        }
        return c;
}
}