class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten = 0;
        int twenty = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                ten++;
                five--;
                if(five<0){
                    return false;
                }
            }
            else{
                twenty++;
                if(ten!=0 && five!=0){
                    ten--;
                    five--;
                }else{
                    five = five - 3;
                }
                 if(five<0||ten<0){
                return false;
            }
            }
           
        }
    return true;
    }
}