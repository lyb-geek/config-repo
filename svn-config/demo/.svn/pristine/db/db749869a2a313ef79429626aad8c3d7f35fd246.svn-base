package com.springcloud.demo.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class MyPreFilter extends ZuulFilter {
	private static final Logger logger = LoggerFactory.getLogger(MyPreFilter.class);

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		String addr = request.getRemoteAddr();
		logger.info("请求的地址: {}", addr);
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
