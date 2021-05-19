package hojinClass.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hojinClass.domain.ClassVO;
import hojinClass.service.ClassService;

@Controller
public class ClassController {
	private ClassService classService;
	private List<ClassVO> favAllList;
	private List<ClassVO> list;

	public void setClassService(ClassService classService) {
		this.classService = classService;
	}

	@RequestMapping("/main")
	public String classMain(Model model, HttpServletRequest request) {
		int listNum = 1;// 겹치지않는 인덱싱
		list = classService.mainFavClass();
		for (ClassVO vo3 : list) {
			model.addAttribute("FavTITLE" + listNum, vo3.getTITLE());
			model.addAttribute("FavCURR1IMG" + listNum, vo3.getCURR1IMG());
			request.setAttribute("FavTITLE" + listNum, vo3.getTITLE());
			++listNum;
		}
		list.clear();
		listNum = 1;
		list = classService.mainAllClass();
		for (ClassVO vo1 : list) {
			model.addAttribute("AllTITLE" + listNum, vo1.getTITLE());
			model.addAttribute("AllCURR1IMG" + listNum, vo1.getCURR1IMG());
			request.setAttribute("AllTITLE" + listNum, vo1.getTITLE());
			++listNum;
		}
		list.clear();
		return "mainClass";
	}

	@RequestMapping("/oneClass")
	public String oneClass(Model model, HttpServletRequest request) {

		String ocVal = "";

			if (request.getParameter("selectTitle").equals("빈 클래스")) {
				ocVal = "classNull";
			} else {
				String selectTitle = (String) request.getParameter("selectTitle");
				ClassVO vo = (ClassVO) classService.selectOneClass(selectTitle);
				model.addAttribute("NICKNAME", vo.getNICKNAME());
				model.addAttribute("TITLE", vo.getTITLE());
				model.addAttribute("INTRO", vo.getINTRO());
				model.addAttribute("CURR1IMG", vo.getCURR1IMG());
				model.addAttribute("CURR1CONT", vo.getCURR1CONT());
				model.addAttribute("CURR2IMG", vo.getCURR2IMG());
				model.addAttribute("CURR2CONT", vo.getCURR2CONT());
				model.addAttribute("CURR3IMG", vo.getCURR3IMG());
				model.addAttribute("CURR3CONT", vo.getCURR3CONT());
				model.addAttribute("MENTOR", vo.getMENTOR());
				model.addAttribute("ITEM", vo.getITEM());
				model.addAttribute("PLACE", vo.getPLACE());
				model.addAttribute("CNT", vo.getCNT());
				model.addAttribute("CLS_DATE", vo.getCLS_DATE());
				ocVal = "selectClass";
			}
		return ocVal;
	}// oneClass end

	@RequestMapping("/favAll")
	public String favAll(Model model, HttpServletResponse response, HttpServletRequest request) {

		String faVal = "";


			int selBlock = 1;// 페이지선택값
			int quanBlock = 0;// 페이지개수
			int modelIndex = 1;// el로 표시될 값 구분 인덱스(model key index)
			favAllList = classService.allFavClass();
			int pageNum = favAllList.size();

			System.out.println("pageNum:" + pageNum);
			if (pageNum % 3 == 0) {
				quanBlock = pageNum / 3;
			} else if (pageNum % 3 != 0) {
				quanBlock = (pageNum / 3) + 1;
			}
			request.setAttribute("quanBlock", quanBlock);

			// 처음favAll이 실행된후 favAll이 실행되어 request에 selBlock(페이지선택)값이 들어있는경우 실행
			if (request.getParameter("selBlock") != null) {
				selBlock = Integer.parseInt(request.getParameter("selBlock"));
			}

			// selBlock(페이지선택값)을 이용하여 뷰에 선택된 페이지에 표시될 클래스값을 model에 담는 로직
			if (selBlock != quanBlock) {
				for (int i = (selBlock - 1) * 3; i <= ((selBlock - 1) * 3) + 2; ++i) {
					ClassVO vo4 = (ClassVO) favAllList.get(i);
					model.addAttribute("FavTITLE" + modelIndex, vo4.getTITLE());
					model.addAttribute("FavCURR1IMG" + modelIndex, vo4.getCURR1IMG());
					request.setAttribute("FavTITLE" + modelIndex, vo4.getTITLE());
					++modelIndex;
				}
			} else if (selBlock == quanBlock) {
				int iter = pageNum % 3;
				for (int j = (selBlock - 1) * 3; j <= (((selBlock - 1) * 3) + (iter - 1)); ++j) {
					ClassVO vo5 = (ClassVO) favAllList.get(j);
					model.addAttribute("FavTITLE" + modelIndex, vo5.getTITLE());
					model.addAttribute("FavCURR1IMG" + modelIndex, vo5.getCURR1IMG());
					request.setAttribute("FavTITLE" + modelIndex, vo5.getTITLE());
					++modelIndex;
				}
				for (int k = ((selBlock - 1) * 3) + iter; k <= quanBlock * 3; ++k) {
					model.addAttribute("FavTITLE" + modelIndex, "빈 클래스");
					model.addAttribute("FavCURR1IMG" + modelIndex, "빈 이미지");
					request.setAttribute("FavTITLE" + modelIndex, "빈 클래스");
					++modelIndex;
				}
			} // else if

			favAllList.clear();
			
			if(request.getParameter("selectTitle")==null) {
				faVal = "favAllClass";
			}else {
				
			if (request.getParameter("selectTitle").equals("빈 클래스")) {
				faVal = "classNull";
			}else {
				faVal = "favAllClass";
			}
			
			}//null check else
				

		return faVal;
	}// favAll end

}
