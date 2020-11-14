package com.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class APIFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
                HttpServletRequest request = currentContext.getRequest();
                String token = request.getParameter("token");
                System.out.println(token);

//                if (!"123".equals(token)) {
//                    currentContext.setSendZuulResponse(false);
//                    currentContext.setResponseStatusCode(400);
//                    //  把提示信息显示到 页面
//                    try {
//                currentContext.getResponse().getWriter().write("token is invalid");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        return null;
    }
}
