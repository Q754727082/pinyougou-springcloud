package com;

import org.springframework.stereotype.Component;

@Component
public class ProivderImpl implements ProviderInterface {
    @Override
    public String test() {
        return "服務器正在維護中...";
    }

    @Override
    public String test2() {
        return "service is down!";
    }
}
