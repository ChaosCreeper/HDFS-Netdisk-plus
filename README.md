# HDFS-Netdisk-plus
## 基本描述
基于HDFS和jsp的云盘,糊弄课设,实际上并没有完整的功能,但是可以上传文件,总之通过了答辩
项目原版来自于 https://github.com/longshilin/HDFS-Netdisc ,在其基础上改善了可能靠谱的下载功能,并且尝试添加了注册账户的功能,然而因为课设答辩糊弄过去了所以没完成.
~~事实上并没有经过测试和运行~~

## 这个代码可能存在的问题
1. 注册页面的相关代码需要修改
2. 下载功能可能不管用,你需要自己去github上找其他的代码修改
3. 事实上只有上传和下载和一些简单的目录文件管理,以及用户登录登出,功能过分的简单
4. 因为是在windows上运行的伪分布式,所以只能拿来糊弄人
5. 有些多余的文件,你得看看哪些是多余的
6. javabean其实并没有被使用
7. 前端页面有错字

## 如何部署
### 用了啥
- windows10
- Hadoop3.1.3
- mysql8.0 J-connect代码里有
- IDEA Maven JSP servlet Tomcat9 ~~剩下的自己去代码看~~
### 部署过程
1. 下载hadoop3.1.3后 按照教程 https://blog.csdn.net/qq_35160479/article/details/125328530 安装hadoop,其中对于替换bin文件夹的过程建议用 https://github.com/cdarlint/winutils/tree/master/hadoop-3.1.2/bin 替换 然后继续按照教程走
2. 打开项目, 在IDEA弹出的窗口选择maven打开,等依赖下好
3. 配置项目内的hadoop-config文件夹内三个xml文件的内容,按照步骤一的内容进行修改,代码其他地方需要修改路径的均已表注,按需填入 ~~测试的可以不用管~~
4. 在mysql内建一个用户表,包含用户名,密码和邮箱,id自增,修改好对应的驱动相关内容
5. 运行hadoop伪分布集群,按照配置jsp项目的方式配置运行
6. 不出意外应该可以用了,~~出了意外去问拿着自己的报错内容去问CSDN StackOverflow~~
