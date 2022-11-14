class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = 0;
        for(int i =0; i<salary.length; i++){
            if(salary[i] < min){
                min = salary[i];    
            }
            if(salary[i] > max){
                max = salary[i];
            }
        }
        
        double sum = 0;
        for(int i = 0; i<salary.length; i++){
            if (salary[i] == min || salary[i] == max){
                continue;
            }
            sum += salary[i];
        }
        double avg = sum / (salary.length - 2);
        return avg;
    }
}