package exp09.data;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if(side1 + side2 < side3){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side1 + "+" + side2 + "<" + side3);
        }else if(side1 + side3 < side2){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side1 + "+" + side3 + "<" + side2);
        }else if (side2 + side3 < side1){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side2 + "+" + side3 + "<" + side1);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) throws IllegalTriangleException{
        if(side1 + side2 < side3){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side1 + "+" + side2 + "<" + side3);
        }else if(side1 + side3 < side2){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side1 + "+" + side3 + "<" + side2);
        }else if (side2 + side3 < side1){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side2 + "+" + side3 + "<" + side1);
        }
        this.side1 = side1;
    }

    public void setSide2(double side2) throws IllegalTriangleException{
        if(side1 + side2 < side3){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side1 + "+" + side2 + "<" + side3);
        }else if(side1 + side3 < side2){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side1 + "+" + side3 + "<" + side2);
        }else if (side2 + side3 < side1){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side2 + "+" + side3 + "<" + side1);
        }
        this.side2 = side2;
    }

    public void setSide3(double side3) throws IllegalTriangleException{
        if(side1 + side2 < side3){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side1 + "+" + side2 + "<" + side3);
        }else if(side1 + side3 < side2){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side1 + "+" + side3 + "<" + side2);
        }else if (side2 + side3 < side1){
            throw new IllegalTriangleException(side1 + "," + side2 + "," + side3 + "不能构成三角形，原因是：" +
                    side2 + "+" + side3 + "<" + side1);
        }
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
