package exp09.data;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        double side1 = 0.0, side2 = 0.0, side3 = 0.0;
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            try {
                System.out.print("请输入三角形的三条边长：");
                side1 = input.nextDouble();
                side2 = input.nextDouble();
                side3 = input.nextDouble();
                Triangle tri = new Triangle(side1, side2, side3);
                System.out.printf("三角形的面积为%.2f", tri.getArea());
                flag = false;

            }catch (IllegalTriangleException e){
                System.out.println(e.getMessage());
                input.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println(e.toString() + ": 输入的边长不是实数");
                input.nextLine();
            }
        }

    }
}
