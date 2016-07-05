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
    public List<View> getChilds() {
        return childs;
    }

    public void addView(View view){
        childs.add(view);
    }

    public View findViewById(int id){
        View candidate = null;
        for (View view: childs) {
            if (view.getId()==id)
                candidate=view;
        }
        return candidate;
    }

    public void removeViewById(int id){
        for (View view: childs) {
            if (view.getId() == id) {
                childs.remove(view);
            }
        }
    }
}
