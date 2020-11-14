package com;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallback = ProivderImpl.class)
    public interface ProviderInterface {
        @GetMapping("/t1")
        public String test();

        @GetMapping("/test2")
        public String test2();
}
