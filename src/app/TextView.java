package app;

/**
 * Created by pabloalbertos on 29/06/16.
 */
public class TextView extends View {

    private String text;

    public TextView(int id) {
        super(id);
    }

    public TextView(int id, int x, int height, int y, int width) {
        super(id, x, height, y, width);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
