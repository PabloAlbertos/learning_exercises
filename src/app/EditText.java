package app;

/**
 * Created by pabloalbertos on 29/06/16.
 */
public class EditText extends TextView {

    public EditText(int id) {
        super(id);
    }

    public EditText(int id, int x, int height, int y, int width) {
        super(id, x, height, y, width);
    }

    public void onTextChangeListener(){
        System.out.println("Someone is writing");
    }
}
