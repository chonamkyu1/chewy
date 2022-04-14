package egovframework.example.test.cotroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.test.service.MemberService;
import egovframework.example.test.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	// 메인
	@RequestMapping(value="/main.do", method = RequestMethod.GET)
	public String mainPage() {
		return "main";
	}
	
	// 로그인
	
//	@RequestMapping(value="/test1.do", method = RequestMethod.GET)
//	public String loginPage() {
//		System.out.println("로그인페이지");
//		return "test1";
//	}
	
	@RequestMapping(value="/login.do", method = RequestMethod.GET)
	public String loginPage() {
		System.out.println("로그인페이지");
		return "login";
	}
	
	// 로그인
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String login(MemberVO memberVO, Model model, HttpSession session) throws Exception{
		System.out.println("memberService.login(memberVO) : " + memberService.login(memberVO));
		
		List<MemberVO> login = memberService.login(memberVO);
		if (!login.isEmpty()) {
			model.addAttribute("login", login);
			session.setAttribute("memberVO", memberVO);
			System.out.println("POST 로그인"); 
			System.out.println("memberVo : " + memberVO);
			// vo값 들어왔는지 확인할 때 jsp 파일안 input태그에 name값이 입력되어있지않으면 매핑이 안된다.
			System.out.println("로그인 성공");
			return "redirect:main.do";
		} else {
			System.out.println("로그인 실패");
			return "login";
		}
		
		
//		MemberVO login = memberService.login(memberVO.getM_email(), memberVO.getM_password());
//		
//		if(login != null) {
//			System.out.println("로그인 성공");
//			System.out.println("login : " + login);
//			return "redirect:main.do";
//		} else {
//			System.out.println("로그인 실패");
//			return "login.do";
//		}
		
	}


	
}


