public class Main {
    public static void main(String[] args) {
        Rectangle cn1 = new Rectangle(7, 8);
        System.out.println("Chieu dai truoc khi doi: " + cn1.height);
        System.out.println("Chieu rong truoc khi doi: " + cn1.width);
        cn1.height=10;
        cn1.width=6;
        System.out.println("Chieu dai sau khi doi: "+cn1.height);
        System.out.println("Chieu rong sau khi doi: "+cn1.width);
        System.out.println("Dien tich hinh chu nhat: "+cn1.S());
        System.out.println("Chu vi hinh chu nhat: "+cn1.P());
    }

}
