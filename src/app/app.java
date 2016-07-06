package app;

import sdk.Button;
import sdk.EditText;
import sdk.Layout;
import sdk.TextView;

/**
 * Created by pabloalbertos on 05/07/16.
 */
public class App {

    private static final int ID_LAYOUT1=1;
    private static final int ID_TEXTVIEW1=2;
    private static final int ID_BUTTON1=3;
    private static final int ID_EDITTEXT1=4;
    private static final int ID_MYFRAGMENT1=5;
    private static final int ID_MYFRAGMENT2=6;
    private static final int ID_LAYOUT2=7;
    private static final int ID_TEXTVIEW2=8;
    private static final int ID_BUTTON2=9;
    private static final int ID_EDITTEXT2=10;

    public static void main(String[] args) {

        Layout layout1 = new Layout(ID_LAYOUT1);

        TextView textView1 = new TextView(ID_TEXTVIEW1,12,21,100,100);
        textView1.setText("I'm fragment tv 1");
        layout1.addView(textView1);

        Button button1 = new Button(ID_BUTTON1,21,54,140,120);
        button1.setText("I'm fragment bt 1");
        layout1.addView(button1);

        EditText editText1 = new EditText(ID_EDITTEXT1,62,32,140,120);
        editText1.setText("I'm fragment et 1");
        layout1.addView(editText1);

        MyFragment1 myFragment1 = new MyFragment1(ID_MYFRAGMENT1);
        myFragment1.onCreateView(layout1);

        MyFragment2 myFragment2 = new MyFragment2(ID_MYFRAGMENT2);
        myFragment2.onCreateView(layout1);

        Layout layout2 = new Layout(ID_LAYOUT2);

        TextView textview1 = new TextView(ID_TEXTVIEW2,12,21,100,100);
        textview1.setText("I'm fragment tv 1");
        layout2.addView(textview1);

        Button button2 = new Button(ID_BUTTON2,21,54,140,120);
        button2.setText("I'm fragment bt 1");
        layout2.addView(button2);

        EditText editText2 = new EditText(ID_EDITTEXT2,62,32,140,120);
        editText2.setText("I'm fragment et 1");
        layout2.addView(editText2);

        MyActivity myActivity = new  MyActivity();
        myActivity.onCreateView(layout2);
        myActivity.addFragment(myFragment1);
        myActivity.addFragment(myFragment2);

    }
}
