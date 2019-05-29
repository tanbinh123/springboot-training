# 测试session的使用
Session在后端创建，返回到浏览器时，会生成一个属性为JSESSIONID的cookie，这个
属性的值正是session.getId();

用户以后访问时，都会携带着这个cookie,后端会根据这个cookie找到对应的会话。