package week07.prac108;

public class Dictionary extends Book {
    private int definitions;

    //mutator, accessor methods
    public void setDefinitions(int numDefinitions){
        definitions = numDefinitions;
    }
    public int getDefinitions(){
        return definitions;
    }

    //compute method
    public double comeputeRatio(){
        return (double)definitions/super.pages;
    }
}
