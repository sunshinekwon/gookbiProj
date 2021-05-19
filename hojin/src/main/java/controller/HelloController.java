package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//스프링 mvc에서 컨트롤러로 사용한다고 선언 
@Controller
public class HelloController {
	//메서드가 처리할 경로 지정(클라이언트에서 요청하는 경로)
	@RequestMapping("/hello")
	public String hello(
				//Model 파라미터 : 컨트롤러의 처리 결과를 뷰에 전달하는 역할
				Model model,
				//Requestparam : http요청 값을 메서드의 파라미터로 전달하는 역할
				@RequestParam(value="name", required = false)
				String name) {
			model.addAttribute("greeting", "안녕하세요, "+name);//greeting 속성에 값을 설정
			return "hello"; //컨트롤러의 처리결과를 보여줄 뷰 이름 지정 hello.jsp <- .jsp는 자동적으로 붙는다.
			//spring-mvc에 설정한 <mvc:jsp prefix="/WEB-INF/view/" /> 이녀석이 앞에붙고 중간에 이메소드의 return값인 hello 그 뒤에 .jsp가 붙어서 최종적으로
			// /WEB-INF/view/ + hello + .jsp -> /WEB-INF/view/hello.jsp 가 만들어진다.
	}
			
}
