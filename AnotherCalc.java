package project.learningcoding;

public class AnotherCalc extends SimpleCalc{

    public AnotherCalc(){
        super();
    }
    public AnotherCalc(int a, int b){
        super(a,b);

    }
    public int Mul(){
        return this.getX() * this.getY();
    }

    public int Div(){

        int y = this.getY();
        if(y == 0)
            return 0;
        return this.getX() / y;
    }
}
