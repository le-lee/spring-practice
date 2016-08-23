对反射知识点的学习和实践
Class文件由类装载器装载后，在JVM中将形成一份描述Class结构的元信息对象，
通过这个对象可以获知Class的结构信息：构造函数，属性，和方法，我们可以通过
元信息调用Class对象的功能。

在实践过程中发现了一个有趣的东西，就是关于java中基本类型和其对应的包装类的关系
报出如下异常，说我的Car类里没有定义Integer类型的setter方法，嗯，是的，我定义的是int型的
java.lang.NoSuchMethodException: com.neo.reflect.Car.setMaxSpeed(java.lang.Integer)
修改后正常运行，但是对于包装类和基本数据类型的知识，有点含糊，于是 查阅了stackoverflow，已经有人讨论过相关的问题，那我也记录下
如下:int.class和Integer。class是不同滴
   标题： What is the difference between Integer.class, Integer.type and int.class?
   链接：http://stackoverflow.com/questions/22470985/integer-class-vs-int-class
   
   同时也贴上一个关于反射很好的讲解，里面涉及到java的类加载器的知识，类加载的步骤
http://blog.csdn.net/xiaoxian8023/article/details/9154227