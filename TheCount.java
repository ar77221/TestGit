package project.learningcoding;

public class TheCount {
    private static int count= 0;


    public TheCount(){
        count++;
    }
    public static int getCount()
    {
        return count;
    }
}
