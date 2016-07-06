package sdk;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pabloalbertos on 30/06/16.
 */
public class Activity {

    Layout root;
    List<Fragment> fragments = new ArrayList<>();

    public void onCreateView(Layout view){
        this.root = view;
    }

    public void onResume(){
        System.out.println("Acitividad resumida");
    }

    public void onDestroy(){
        System.out.println("Acitividad destruida");
    }

    public List<Fragment> getFragments() {
        return fragments;
    }

    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }

    public Fragment findFragmentById(int id){
        Fragment candidate = null;
        for (Fragment fragment:fragments) {
            if (fragment.getId()==id){
                candidate=fragment;
            }
        }
        return candidate;
    }

    public void removeViewById(int id){
        for (Fragment fragment:fragments) {
            if (fragment.getId()==id){
                fragments.remove(fragment);
            }
        }
    }
}
