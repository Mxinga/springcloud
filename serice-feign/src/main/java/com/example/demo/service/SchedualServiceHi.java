package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**client-eureka
 * Created by Administrator on 2018/5/30.
 */
@FeignClient(value="CLIENT-EUREKA",fallback=SchedualServiceHiHystric.class)
public interface SchedualServiceHi  {

    @RequestMapping(value="/hi",method= RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value="name")String name);

}
