<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	boolean value;
	// BbsDAO.del(b_idx, pwd)의 결과 - true and false 받기
	Object obj = request.getAttribute("value");
	
	if(obj != null){
		value = (boolean)obj;
			if(value){
%>
		{"res":"ok"}
<% 				
			}else{
%>
		{"res":"no"}
<% 				
			}//안쪽 if의 끝		
	}//if의 끝
%>


