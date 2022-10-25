import javax.swing.text.html.ImageView;


public class StaticThing {
    private double sizeX;
    private double sizeY;

    private String FileName;
    private ImageView imageView;


    public StaticThing(double sizeX, double sizeY, String fileName) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.FileName = fileName;

    }

    public ImageView getImageView() {
        return imageView;
    }
}
