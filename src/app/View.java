package app;

/**
 * Created by pabloalbertos on 29/06/16.
 */
public class View {

    private final int id;
    private int x;
    private int y;
    private int height;
    private int width;

    public View(int id) {
        this.id = id;
        this.x = -1;
        this.y = -1;
        this.height = -1;
        this.width = -1;
    }

    public View(int id, int x, int height, int y, int width) {
        this.id = id;
        this.x = x;
        this.height = height;
        this.y = y;
        this.width = width;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setSize(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void show(){
        System.out.println("x: " + x + " y: " + y + " height: " + height + " width: "+ width);
    }
}



