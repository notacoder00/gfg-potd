class Solution
{

	public boolean findTriplets(int arr[] , int n)
    {
        

        Arrays.sort(arr);
        for( int i = 0; i < n ; i++)
        {
        int j =i+1;
        int k = n-1;
        while( j<k)
        {
            if(arr[i]+arr[j] +arr[k]>0)
            k--;
            else if(arr[i]+arr[j] +arr[k]<0 )
            j++;

            else 
            return true;

        }

        }
        return false;

    }
}