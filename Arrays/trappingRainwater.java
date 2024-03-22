// //Dsa sheet medium array Q. trapping rain water

class trappingRainwater {

    public static int trappedRainwater(int heights[], int width)
    {
        int n=heights.length;
        int trappedWater=0;
        //cal left max boundary
        int leftMax[]=new int[n];
        leftMax[0]=heights[0];
        for(int i=1;i<n;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1],heights[i]);
        }
        //cal right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(heights[i],rightMax[i+1]);
        }

        //loop
        for(int i=0;i<n;i++)
        {
            //waterLevel=min(left max bound, right max bound)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            //trappedWater=waterLevel-height[i]
            trappedWater=trappedWater+(waterLevel-heights[i])*width;
        }
        return trappedWater;
    }

    public static void main(String args[])
    {
        int width=1;
        int heights[]={5,4,3,2,1};
        //int heights[]={4,2,0,6,3,2,5};
        //int heights[]={0,1,0,2,1,0,1,3,2,1,2,1};
        // int heights[]={1,2,3,4,5,6};
        System.out.println(trappedRainwater(heights,width));
    }
}