package app;

/**
 * Created by pabloalbertos on 29/06/16.
 */
public class Button extends TextView {

    public Button(int id) {
        super(id);
    }

    public Button(int id, int x, int height, int y, int width) {
        super(id, x, height, y, width);
    }

    public void onClick(){
        System.out.println("Button clicked");
    }
}
