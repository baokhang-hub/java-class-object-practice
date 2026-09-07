public class Main {
    public static void main(String[] args) {
        //bt1
        Rectangle cn1 = new Rectangle(7, 8);
        System.out.println("Chieu dai truoc khi doi: " + cn1.height);
        System.out.println("Chieu rong truoc khi doi: " + cn1.width);
        cn1.height = 10;
        cn1.width = 6;
        System.out.println("Chieu dai sau khi doi: " + cn1.height);
        System.out.println("Chieu rong sau khi doi: " + cn1.width);
        System.out.println("Dien tich hinh chu nhat: " + cn1.S());
        System.out.println("Chu vi hinh chu nhat: " + cn1.P());

        //bt2
        double[] scores1 = {10, 9, 9};
        double[] scores2 = {7, 9, 8};
        Student sv1 = new Student("Khang", 21, scores1);
        Student sv2 = new Student("Phuong", 21, scores2);


        if (sv1.getAverage() > sv2.getAverage()) {
            sv1.displayInfo();
            System.out.println("Diem trung binh: " + sv1.getAverage());
        } else if (sv1.getAverage() < sv2.getAverage()) {
            sv2.displayInfo();
            System.out.println("Diem trung binh: "+sv2.getAverage());
        }else {
            sv1.displayInfo();
            sv2.displayInfo();
            System.out.println("Diem trung binh: " + sv1.getAverage());
            System.out.println("Diem trung binh: "+sv2.getAverage());
        }
    }

}
