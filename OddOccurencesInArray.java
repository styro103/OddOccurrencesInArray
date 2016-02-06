/*
    Odd Occurences in Array Solution
    Run Time O(N)
*/

class Solution 
{
    public int solution(int [] A) 
    {
        if (A.length==1)
            return A[0];
        int oe = 0;
        for (int i=0; i<A.length; i++)
            oe ^= A[i];
        return oe;
    }
}
