package com;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DefaultProperties(defaultFallback = "strMethod4")
public class FeignController {

    //@Qualifier("proivderImpl")
    @Autowired
    private ProviderInterface providerInterface;

    @GetMapping("/str")
    @HystrixCommand
    public String strMethon(){
        return providerInterface.test();
    }
    @GetMapping("str2")
    @HystrixCommand(fallbackMethod = "strMethod3",commandProperties =@HystrixProperty(name =
            "execution.isolation.thread.timeoutInMilliseconds",value = "3000"))
    public String strMethod2() throws InterruptedException {
        //Thread.sleep(5000);
        return providerInterface.test2();
    }
    public String strMethod3(){
        return "str2 is down!";
    }
    public String strMethod4(){
        return "strMethod4 is down!";
    }

//    @Value("${version}")
//    private  String version;
//    @GetMapping("/version")
//    public String versionMethon(){
//        return version;
//    }
}
