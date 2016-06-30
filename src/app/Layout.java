package app;

import java.util.List;

/**
 * Created by pabloalbertos on 30/06/16.
 */
public class Layout extends View {

    List<View> childs;

    public Layout(int id, int x, int height, int y, int width) {
        super(id, x, height, y, width);
    }

    public Layout(int id) {
        super(id);
    }

}
