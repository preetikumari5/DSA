// count number of steps

class Solution {
public:
    
    int numberOfSteps(int num) {
        int count = 0;
        while(num>0)
        {
            if(num%2 == 0) 
            {
                num = num/2;
                count++;
            }
            else
            {
                num = num-1;
                count++;
            }
        }
        return count;
    }
};

// using recursion

class Solution {
public:
    int steps(int num,int s=0)
    {
        if(num==0) return s;
        if(num%2==0) return steps(num/2,s+1);
        else return steps(num-1,s+1);
    }
    int numberOfSteps(int num) {
        
        return steps(num);
    }
};