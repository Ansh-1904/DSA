class shortestPath {

    public static float findShortestPath(String str)
    {
        int x=0;
        int y=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='N')
            {
                y+=1;
            }
            else if(str.charAt(i)=='S')
            {
                y-=1;
            }
            else if(str.charAt(i)=='E')
            {
                x+=1;
            }
            else
            {
                x-=1;
            }
        }
        int X=x*x;
        int Y=y*y;
        return (float) Math.sqrt(X+Y);
    }
    
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(findShortestPath(str));   
    }

}