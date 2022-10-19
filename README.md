# **common-api组件**
所有的业务的api服务接口定义，都要依赖common-api组件，common-api组件是最基础核心的组件，定义了整个API接口相关规范。
# **接入使用**
二方库：
```xml
<dependency>
    <groupId>io.github.acticfox</groupId>
    <artifactId>common-api</artifactId>
    version>1.0.0-SNAPSHOT</version>
</dependency>
```
# **使用规范**
## **1.PO\DO\VO\POJO基类**
| **定义** | **用途** | **备注** |
| --- | --- | --- |
| BaseObject | 对象定义基类，其中的
PO\\DO\\VO都需要继承该类 | 
 |

## **2.通用参数定义**
| **定义** | **用途** | **备注** |
| --- | --- | --- |
| Limit | 主要⽤于分⻚，提取数据
offset-length | 
 |
| Order | ⽤于排序使⽤ | 
 |
| OrderLimit | 上述Limit Order组合 | 
 |

## **3.result定义**
| **定义** | **用途** | **备注** |
| --- | --- | --- |
| **定义** | **用途** | **备注** |
| ResultList | 分⻚返回的结果list | 
 |
| PageResult | 分⻚结果定义 | 
 |
| ResultDTO | RPC普通接⼝返回的调⽤
结果 | 
 |

## **4.enums定义**
| **枚举定义** | **用途** | **备注** |
| --- | --- | --- |
| ErrCodeEnum | 错误码定义接⼝，业务应⽤
所有错误码定义，需要实现
该接⼝ | 
 |
| ExceptionCodeEnum | 异常错误码实现 | 
 |
| SecurityFieldType | 安全字段注解定义，⽇志打印环
节忽略或者格式化，定义了相关
类型 | 
 |

## **5.exception定义**
| **异常定义** | **用途** | **备注** |
| --- | --- | --- |
| BusinessException | 业务异常定义 | 
 |
| RetriableException | 可重试异常，⽤于定义⼀些幂等
可重试错误码异常 | 
 |

## **6.通用annotation定义**
| **注解定义** | **用途** | **备注** |
| --- | --- | --- |
| CacheType | value值使⽤
FieldTypeEnum枚举，orm
映射⽀持枚举和int/string
code码进⾏映射，同时⽀持
json序列化和反序列化 | 
 |
| FieldType | value值使⽤
CacheTypeEnum枚举，默
认使⽤LRU_Redis，基于redis
的⼆级缓存 | 
 |
| IgnoreRpcLog | 添加注解⽤于标识是否打印
rpclog，可⽤于接⼝以及⽅法上 | 
 |
| SecurityField | 安全字段注解定义，⽇志打印环
节忽略或者格式化 | 
 |

## **7.dempotence注解定义**
具体使用参考[distributed-tools](http://wiki.zhichubaohost.com/pages/viewpage.action?pageId=24709406)中的幂等组件。
## **8.基础工具类定义**
| **定义** | **用途** | **备注** |
| --- | --- | --- |
| AssertUtils | 断⾔⼯具类 | 
 |
| ResultDTOUtil | ResultDTO⼯具类 | 
 |


