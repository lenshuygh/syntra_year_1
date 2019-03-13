package playground.comparing;

public class Box implements Comparable<Box>{
    private int height;
    private int width;
    private int dept;

    public Box(int height, int width, int dept) {
        this.height = height;
        this.width = width;
        this.dept = dept;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDept() {
        return dept;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    @Override
    public int compareTo(Box otherBox) {
        return this.getHeight() - otherBox.getHeight();
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", dept=" + dept +
                '}';
    }
}
