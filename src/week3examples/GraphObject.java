package week3examples;

public class GraphObject {
    private String color;
    private int xCoord;
    private int yCoord;
    private String caption;

    public GraphObject() {
        this.color = "black";
        this.xCoord = 0;
        this.yCoord = 0;
        this.caption = "";
    }

    public GraphObject(String caption, String color, int xCoord, int yCoord) {
        this.color = color;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    @Override
    public String toString() {
        return "GraphObject{" +
                "caption='" + caption + '\'' +
                ", color='" + color + '\'' +
                ", xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                '}';
    }
}
