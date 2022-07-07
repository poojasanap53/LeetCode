class Solution {
public:
    vector<string> fizzBuzz(int n) {
        
        // declared a vector string 
        vector<string> answer;
        
        //using for loop to loop through the numbers 
        for(int i =1; i <= n; i++){
            
            if(i%3==0 && i%5==0){
                //using pushback to directly store in vectore to save space of creating a temporary string
                answer.push_back("FizzBuzz");
            }
            else if(i%5==0){
                answer.push_back("Buzz");
            } 
            else if(i%3==0){
                answer.push_back("Fizz");
            }
            else{
                answer.push_back(to_string(i));
            }
        }
        
        //returning the vector string
        return answer;
    }
    
};