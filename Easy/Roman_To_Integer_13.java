class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++)
        {
            int temp = roman(s.charAt(i));
            if((i+1) < s.length())
            {
                int temp1 = roman(s.charAt(i+1));

                if(temp >= temp1)
                {
                    sum += temp;
                }
                else
                {
                    sum -= temp;
                }
            }
            else
            {
                sum += temp;
            }
        }
        return(sum);
    }
    int roman(char c)
    {
        if(c == 'I')
            return 1;
        else if(c == 'V')
            return 5;
        else if(c == 'X')
            return 10;
        else if(c == 'L')
            return 50;
        else if(c == 'C')
            return 100;
        else if(c == 'D')
            return 500;
        else if(c == 'M')
            return 1000;
        return -1;
    }
}