class Area {
    public static void main(String[] args) {
        int height = 1;
        int width = 3;
        int radius = 2;
        int area = height * width;
        double area2 = 3.14 * radius * radius;
        double area3 = 0.5 * width * height;
        System.out.println("Area of Rectangle " + area);
        System.out.println("Area of Circle " + area2);
        System.out.println("Area of Triangle " + area3);
    }
}