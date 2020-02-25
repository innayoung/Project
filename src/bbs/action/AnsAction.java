package bbs.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatis.dao.BbsDAO;
import mybatis.vo.CommVO;

public class AnsAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		String cPage = request.getParameter("cPage");
		String b_idx = request.getParameter("b_idx");
		
		CommVO cvo = new CommVO();
		
		cvo.setWriter(request.getParameter("writer"));
		cvo.setContent(request.getParameter("content"));
		cvo.setPwd(request.getParameter("pwd"));
		cvo.setIp(request.getRemoteAddr()); //ip
		cvo.setB_idx(b_idx); 
		
		BbsDAO.addAns(cvo);
				
		request.setAttribute("cPage", cPage);
		request.setAttribute("b_idx", b_idx);
		
		return "ans";
	}

}
