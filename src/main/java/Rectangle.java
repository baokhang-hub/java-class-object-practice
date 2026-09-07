public class Rectangle {
    int height;
    int width;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    public int S() {
        return this.height * this.width;
    }

    public int P() {
        return (this.height + this.width) * 2;
    }
}