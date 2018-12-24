# Flowable工作流

------

***环境：***

**spring-boot2.0.2**

**jdk1.8+**

**flowable6.3.0**

------



## 一、 什么是flowable

　　[对于flowable是什么以及关于此框架的具体信息可以参看此项目的官方文档](https://www.flowable.org/docs/userguide/index.html)



## 二、运行demo

-  启动demo

```
mvn spring-boot:run
```

- 创建一个流程

```
http://localhost:8080/expense/add?userId=123&money=123321
返回：提交成功.流程Id为：2501
```

- 查询待办列表

```
http://localhost:8080/expense/list?userId=123
输出：Task[id=2507, name=出差报销]
```

- 同意申请

```
http://localhost:8080/expense/apply?taskId=2507
返回：processed ok!
```

- 生成流程图

```
http://localhost:8080/expense/processDiagram?processId=2501
```

