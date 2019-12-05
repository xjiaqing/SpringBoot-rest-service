#### Spring Boot

##### Build a RESTful Web Service

[原文地址](https://spring.io/guides/gs/rest-service/)

@SpringBootApplication 是一个简便的注解，包含以下内容:

- @Configuration: 将类标记为应用上下文的 Bean 定义的源

- @EnableAutoConfiguration: 告诉 Spring boot 根据类路径设置，其他的 Bean 和各种属性设置开始添加 Bean

- @ComponentScan: 告诉 Spring 在包中寻找其他组件，配置服务等

注解 @RequestMapping 表示到 /greeting 的 http 请求将会被映射到 greeting 方法

- 示例没有指明具体的 HTTP 请求方法(GET/POST/PUT), @RequestMapping 默认映射所有的 HTTP 方法. 可以使用 @RequestMapping(method=GET) 来指明具体的方法

- 注解 @RequestParam 把 http query 中的参数 name 的值当做 name 参数传给 greeting() 方法，如果在 query string 中没有 name 参数，则会使用 defaultValue 的值

- Spring 的 HTTP 消息转换器会将 Greeting 对象自动转换为 JSON. 由于 Jackson 2 位于 classpath z中，因此会自动选择 Spring 的 MappingJackson2HttpMessageConverter 来将 Greeting 转为 JSON
