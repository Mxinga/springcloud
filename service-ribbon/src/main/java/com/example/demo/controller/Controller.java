package com.example.demo.controller;

/**
 * Created by Administrator on 2018/5/29.
 */
public class Controller {

    /**
     * http://www.mamicode.com/info-detail-2253352.html
     * 分布式项目 N个子系统协作，RPC
     *      restful：约束 、原则 符合的便是restful 架构和服务
     *      soap：数据交换协议规范，基于xml符合http协议
     *      rpc：隐藏底层通讯细节、请求响应模型
     *          RMI：用java.rmi包、基于java Remote method proto 和java原生序列化
     *          Hessian：基HTTP、二进制解码、提供rmi功能
     *          thrift：可伸缩、跨语言框架、描述类型、接口的文件生成通信代码
     *          springcloud：提快速构建分布式系统的工具
     *          dubbo：rpc服务调用、spring无缝集成
     * 接口通信、低耦合，灵活部署
     * 远程通信、接口开发增加工作量——》soa
     *
     */
    public void testControllerForTrancport(){

        //集群：相同应用部署多台、负载均衡

        /**
         * soa service oriented architecture  面向服务 ：服务、表现层
         * 业务系统分解多个组件，每个组件独立提供离散、自治、可复用的服务
         * 通过服务的组合和编排来实现 上层业务的流程、简化维护 将险 伸缩灵活
         *  采用ESB企业服务总线 EnterpriseService Bus 反/序列化 重
         *  传统中间件与xml 、web 服务 相结合的产物
         * 演进：
         *
         * 微服务架构：个服务隔离、自治、独立 也可系统应用
         *  http+rest+json
         *
         */
    }

    /**
     * 分布式系统提供工具：配置管理、服务发现、断路器、路由
     * 负载均衡、微代理、事件总线、全局锁、决策竞选、分布式会话
     */
    public void springCloudDescribe(){
        /**
         *Eureka：服务注册于发现  注册服务器、java客户端
         *  简化交互、（基于流量 资源利用率 出错状态）轮询负载均衡器 故障切换
         *  ribbon：负载均衡客户端 类似nginx反向代理  feign默认集成ribbon开启@loadBalanced
         *
         * zuul：路由网关 路由转发、过滤器  zuul、ribbon结合实现负载均衡
         *
         * hystrix断路器 解决分布式系统交互超时、容错
         *  服务雪崩：因为某个服务不能用整个系统不能用
         *  策略：
         *      流量控制：网关限流、用户交互限流、关闭重试
         *      改进缓存模式
         *      服务自动扩容
         *      服务调用者降级服务
         *   解决、缓解服务雪崩的方案
         *      熔断：调用慢、大量超时、熔断对该服务的调用，后面的请求直接放回
         *          请求判断算法：无锁循环队列计数，个熔断器10bucket，1s一bucket，记录请求成败超拒，超50%且10s超20请求拦截
         *          恢复机制：被熔断的请求，5s容许部分请求通过，请求健康RT<250ms 健康恢复
         *          报警：打日志、异常请求超过设定报警
         *      隔离：不同请求使用线程池 资源隔离 资源耗尽直返 单独部署重要的服务
         *          线程池：池存储、处理请求，设置任务返回处理超时时间，资源消耗、洪峰不急
         *          信号量：原子计数器（信号量）多少线程运行，请求来判计数器，超、丢，不、执操请+1 请返器-1
         *      限流：预防、设置QPS(处理流量） 超过直返
         *
         *    超时：
         *      请求等待：任务入队列时设入队列时间 if队头任务入队列Time>超时时间 超弃
         *      请求运行：线程池get
         */

        /**
         * 熔断机制：下游服务现问题、保运行、提供降级服务的机制
         *  通过返缓存数据或既定数据避整体雪崩
         */


    }

}
