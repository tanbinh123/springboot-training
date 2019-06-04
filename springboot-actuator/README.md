## 启动端点 endpoint
默认只启动了 health 和 info 端点，可以通过配置修改：
```
management.endpoints.web.exposure.include=health,info,beans,env,metrics
management.endpoints.web.exposure.include=*
```