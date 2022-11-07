public class Wektor3D {
    private float x;
    private float y;
    private float z;

    public Wektor3D(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Wektor3D(Punkt3D point1, Punkt3D point2){
        x = point2.GetX() - point1.GetX();
        y = point2.GetY() - point1.GetY();
        z = point2.GetZ() - point1.GetZ();
    }
    public float GetX(){ return x; }
    public float GetY(){ return y; }
    public float GetZ(){ return z; }
    public Wektor3D Add(Wektor3D vector){
        float x1 = x + vector.GetX();
        float y1 = y + vector.GetY();
        float z1 = z + vector.GetZ();
        return new Wektor3D(x1, y1, z1);
    }
    public  Wektor3D Subtract(Wektor3D vector){
        float x1 = x - vector.GetX();
        float y1 = y - vector.GetY();
        float z1 = z - vector.GetZ();
        return new Wektor3D(x1, y1, z1);
    }
    public float Scalar(Wektor3D vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }
    public Wektor3D CrossProduct(Wektor3D vector){
        float helpX = x;
        float helpY = y;
        float x1 = (y * vector.GetZ()) - (z * vector.GetY());
        float y1 = (z * vector.GetX()) - (helpX * vector.GetZ());
        float z1 = (helpX * vector.GetY()) - (helpY * vector.GetX());
        return new Wektor3D(x1, y1, z1);
    }
};