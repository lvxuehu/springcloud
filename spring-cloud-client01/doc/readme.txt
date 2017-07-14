spring-cloud调用服务有两种方式，

一种是Ribbon+RestTemplate,

另外一种是Feign。

Ribbon是一个基于HTTP和TCP客户端的负载均衡器，其实feign也使用了ribbon, 只要使用@FeignClient时，ribbon就会自动使用。