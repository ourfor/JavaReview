Java考试的内容实在太多了，今天先把各种了之间的关系复习一下。

> 在所有的连线中，没有特殊图形的一端均表示线的结束，起始端是没有任何图形的。

# 依赖关系

- UML中表示方法:用一条带箭头的虚线连接两个类的UML图，其中结束端即箭头指向被依赖的类
- 定义: 如果一个类作为另一个类某个方法的返回值类型或者参数类型，那么这两个类就构成了依赖关系。

例如: 台式电脑需要连接电源🔌供电(指电能而非机箱内的电源)才能启动，电源供电并不是台式电脑的属性(成员)，而是作为电脑💻启动这个方法不可或缺的条件。电脑和电能就构成了依赖关系。

Code of Computer:
```java
class Computer{
	boolean switch=false;

	boolean Boot(EPower e){
		return (e.state==true)&&switch?true:false;	
	}
}
```
Code of EPower:
```java
class EPower{
	boolean state=false;	
}
```




