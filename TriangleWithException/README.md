带异常处理的三角形类
===



代码要求：
---


#### 定义一个名为 IllegalTriangleException 的异常类：<br/>
* 继承类 `java.lang.Exception`。 <br/>
* 按照父类`Exception`的所有构造方法为`IllegalTriangleException`定义构造方法，每个方法都直接调用对应的父类构造方法。<br/>


#### 定义一个名为 Triangle 类表示三角形：<br/>
* 3个double类型的数据域，side1, side2, side3 分别代表三角形的3个边的长度。 <br/>
* 一个有参构造方法, 方法头：`public Triangle(double side1, double side2, double side3) throws IllegalTriangleException`。 <br/> 
构造方法首先检查参数的3个边长能否构成三角形，如果不能，则抛出一个`IllegalTriangleException`类型异常，异常的提示信息形式为："10.00, 3.00, 3.00 不能构成三角形, 原因是: 3.00 + 3.00 < 10.00 "。 <br/>
如果能构成三角形，则初始化数据域。 <br/>
* 对数据域进行封装，set方法方法头：`public void setSide1(double side1) throws IllegalTriangleException`。 <br/>
方法首先检查参数的3个边长能否构成三角形，如果不能，则抛出一个`IllegalTriangleException`类型异常，异常的提示信息形式为："10.00, 3.00, 3.00 不能构成三角形, 原因是: 3.00 + 3.00 < 10.00 " <br/>
如果能构成三角形，则设置对应数据域。 <br/>
* 一个计算三角面积的方法, `public double getArea()`。 <br/>


#### 定义一个名为Main的主类：
* 输入三角形三边边长 <br/> 
* 使用异常处理检查：输入的数据是否是合理的实数、输入的数据是否能构成三角形 <br/>
* 如果检查不通过，则输出提示信息后，要求重新输入 <br/>
* 如果检查通过，则输出三角形的面积。<br/>
