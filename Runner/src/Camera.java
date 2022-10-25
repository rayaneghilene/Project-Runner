
public class Camera {
    private Integer x;
    private Integer y;

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Camera(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Abscisse : "+x + " et ordonnée : " + y;
    }
}
