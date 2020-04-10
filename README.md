# GoingMerry
黄金梅丽号是草帽海贼团的第一艘海贼船，是一艘骨架结构、三角帆全都使用船尾中央掌舵法的“卡拉维尔帆船”(Caravel)，船首为羊头，造型可爱。是草帽海贼团重要伙伴之一。 当草帽海贼团在司法岛受困时，梅利（船精灵）向冰山恳求让它最后航行一次，去救路飞一行人，梅利号化身的“船之精灵”在关键的时候顺利地救出了路飞一行人，但因大限已至，于途中寿命耗尽。路飞以火葬仪式送黄金梅利号最后一程，就此结束了黄金梅利号伟大的使命。
                                                                                                       ————摘自百度百科
                                                                                                       
## 摘要                                                                                              
这是毕业以后第一次跟哲宝宝一起做项目，取名GoingMerry，是希望我们项目能够一帆风顺，也希望黄金梅丽号能够给我们216带来好运气。

## 更新
集成Swagger2，同时自动生成简单的API测试说明，生成后访问地址为 http://localhost:8080/doc.html
添加通用Mapper的Example用法支持，详细用法请看官方说明（[Example 用法](https://github.com/abel533/Mapper/wiki/6.example)）。

## 简介
一个简单的又不简单的博客系统

## 特征&提供
- 统一响应结果封装及生成工具
- 统一异常处理
- 简单的接口签名认证
- 常用基础方法抽象封装
- 使用Druid Spring Boot Starter 集成Druid数据库连接池与监控
- 使用FastJsonHttpMessageConverter，提高JSON序列化速度
- 集成MyBatis、通用Mapper插件、PageHelper分页插件，实现单表业务零SQL
- 另有彩蛋，待你探索
 
## 开发建议
- 表名，建议使用小写，多个单词使用下划线拼接
- Model内成员变量建议与表字段数量对应，如需扩展成员变量（比如连表查询）建议创建DTO，否则需在扩展的成员变量上加```@Transient```注解，详情见[通用Mapper插件文档说明](https://mapperhelper.github.io/docs/2.use/)
- 建议业务失败直接使用```ServiceException("message")```抛出，由统一异常处理器来封装业务失败的响应结果，比如```throw new ServiceException("该手机号已被注册")```，会直接被封装为```{"code":400,"message":"该手机号已被注册"}```返回，无需自己处理，尽情抛出
- 需要工具类的话建议先从```apache-commons-*```和```guava```中找，实在没有再造轮子或引入类库，尽量精简项目
- 开发规范建议遵循阿里巴巴Java开发手册（[最新版下载](https://github.com/alibaba/p3c))
- 建议在公司内部使用[ShowDoc](https://github.com/star7th/showdoc)、[SpringFox-Swagger2](https://github.com/springfox/springfox) 、[RAP](https://github.com/thx/RAP)等开源项目来编写、管理API文档
 
## 技术选型&文档
- Spring Boot（[查看Spring Boot学习&使用指南](http://www.jianshu.com/p/1a9fd8936bd8)）
- MyBatis（[查看官方中文文档](http://www.mybatis.org/mybatis-3/zh/index.html)）
- MyBatisb通用Mapper插件（[查看官方中文文档](https://mapperhelper.github.io/docs/)）
- MyBatis PageHelper分页插件（[查看官方中文文档](https://pagehelper.github.io/)）
- Druid Spring Boot Starter（[查看官方中文文档](https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter/)）
- Fastjson（[查看官方中文文档](https://github.com/Alibaba/fastjson/wiki/%E9%A6%96%E9%A1%B5)）
- swagger2 ([查看官方文档](https://swagger.io/docs/))
- 其他略

## License
无，纯粹开源分享，感谢[Fork](https://github.com/lihengming/spring-boot-api-project-seed/) 的提供的思路。
