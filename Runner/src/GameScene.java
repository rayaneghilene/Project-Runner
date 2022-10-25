import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;

public class GameScene extends Scene{
    private Camera one = new Camera(40, 60);

    private StaticThing left = new StaticThing(10,30,"desert.png");
    private StaticThing right= new StaticThing(15,30,"desert.png");

    public GameScene(Parent parent, double v, double v1, boolean b, SceneAntialiasing sceneAntialiasing, Camera one) {
        super(parent, v, v1, b, sceneAntialiasing);
        this.one = one;
    }


}
