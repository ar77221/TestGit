package project.learningcoding;

public class SimpleCalc {

    private int x;
    private int y;

    public SimpleCalc(){
        this.x = 0;
        this.y = 0;
    }
    public SimpleCalc(int a, int b){
        this.x = a;
        this.y= b;
    }
    public int Add(){
        return this.x + this.y;
    }
    public int Sub(){
        return this.x - this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int a) {
        this.x = a;
    }

    public int getY() {
        return this.y ;
    }

    public void setY(int b) {
        this.y = b;
    }
}
