package sdk;

/**
 * Created by pabloalbertos on 30/06/16.
 */
public class Fragment {
    final int id;
    Layout root;

    public Fragment(int id) {
        this.id = id;
    }

    public void onCreateView(Layout layout){
        this.root = layout;
    }

    public Layout getRoot() {
        return root;
    }

    public int getId() {
        return id;
    }

    public void onResume(){
        System.out.println("Acitividad resumida");
    }

    public void onDestroy(){
        System.out.println("Acitividad destruida");
    }
}
