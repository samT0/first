package com.yc.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * ��̨��̬ҳ��ķ���������
 * @author ܲ��
 *
 */
public class BackForwardInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String path=request.getServletPath();
		System.out.println(path+"��������±��");
		path=path.substring(path.lastIndexOf("/"));
		//�ڲ�ת��
		request.getRequestDispatcher("/WEB-INF/manager/"+path).forward(request, response);
		return false;  
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
