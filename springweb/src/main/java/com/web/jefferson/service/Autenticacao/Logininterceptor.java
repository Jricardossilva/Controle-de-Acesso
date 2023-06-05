package com.web.jefferson.service.Autenticacao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.web.jefferson.service.CookieService;

public class Logininterceptor implements HandlerInterceptor {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		if(CookieService.getCookie(request, "usuarioId") != null){
	            return true;
	    }
	      
	      response.sendRedirect("/login");
	      return false;
	   }

	   // @Override
	   // public void postHandle(HttpServletRequest request, HttpServletResponse response, 
	   //    Object handler, ModelAndView modelAndView) throws Exception {
	      
	   //    System.out.println("Post Handle method is Calling");
	   // }
	   // @Override
	   // public void afterCompletion
	   //    (HttpServletRequest request, HttpServletResponse response, Object 
	   //    handler, Exception exception) throws Exception {
	      
	   //    System.out.println("Request and Response is completed");
	   // }
}
