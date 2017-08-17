
注解实现spring声明式事务


springAOP应用  springJDBC 事务处理

spring声明式事务处理中的事务传播行为
propagation:
REQUIRED(默认值):当前方法和调用方法总会在事务中执行。如果当前方法存在事务，即使用该事务，如果不存在事务
                               立即开启一个新的事物
NEVER:总是在非事务地执行,不开启事务
NOT_SUPPORTED:总是在非事务地执行，如果当前存在事务，将当前事务挂起
SUPPORTS：如果存在一个事务，支持当前事务，如果没有事务，则非事务执行
REQUIRES_NEW：总是新建一个事务，如果当前有事务存在，会把当前事务挂起
MANDATORY：如果存在一个事务，支持当前事务，如果没有事务，抛出异常
NESTED:如果存在一个事务，会在事务的嵌套下执行，如果不存在事务，同REQUIRED

结论：常用REQUIRED


spring声明式事务处理中的事务隔离级别

脏读
幻读
不可重复读
DEFAULT：数据库默认的隔离级别
SERIALIZABLE：串行化 最高的隔离级别
READ_COMMITTED： 读已提交  幻读 不可重复读
READ_UNCOMMITTED: 读未提交   脏读 幻读 不可重复读
REPEATABLE_READ：可重复读     幻读
@Transactional

SpringAOP
    代理模式（静态代理，动态代理）
    解决共通逻辑与核心逻辑之间耦合处理
    7个名词    4大核心组成部分（目标  切面  切入点  通知  ）
    配置文件和注解实现

Spring AOP应用
Spring声明式事务    配置文件和注解实现
   事务的隔离级别、事务的传播行为
 
SpringIOC
SpringAOP
Spring JDBC
Spring 声明式事务


    

    























