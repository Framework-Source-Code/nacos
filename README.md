Nocas 源码阅读

git clone下来后

```
mvn -Prelease-nacos clean install -U -Dmaven.test.skip=true
```

distribution模块下target 报错一般是jar包没down下来，因为网络各种原因。

将nacos-server-x.x.x.zip或者nacos-server-x.x.x.tar.gz 解压

```
cd bin
sh startup.sh -m standalone
```

启动》》》
