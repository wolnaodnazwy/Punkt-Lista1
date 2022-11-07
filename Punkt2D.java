public class Punkt2D {
    private float x;
    private float y;
    public Punkt2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float GetX(){ return x; }
    public float GetY(){ return y; }
    public void Print(){ System.out.println("x: " + x + " y: " + y);}
};