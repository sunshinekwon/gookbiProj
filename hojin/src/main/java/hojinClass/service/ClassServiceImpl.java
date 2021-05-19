package hojinClass.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hojinClass.dao.ClassDAO;
import hojinClass.domain.ClassVO;

@Service
public class ClassServiceImpl implements ClassService {
	
	private ClassDAO classDao;
	public void setClassDAO(ClassDAO classDao) {
		this.classDao = classDao;
	}
	
	public ClassDAO getClassDAO() {
		return classDao;
	}
	
	public List<ClassVO> mainFavClass() {
		// TODO Auto-generated method stub
		return classDao.mainFavList();
	}

	public List<ClassVO> mainAllClass() {
		// TODO Auto-generated method stub
		return classDao.mainAllList();
	}

	public List<ClassVO> allFavClass() {
		// TODO Auto-generated method stub
		return classDao.allFavList();
	}

	public List<ClassVO> allAllClass() {
		// TODO Auto-generated method stub
		return classDao.allAllList();
	}
	
	public ClassVO selectOneClass(String title) {
		// TODO Auto-generated method stub
		classDao.addCnt(title);
		ClassVO vo = (ClassVO)classDao.selectOneClass(title);
		return vo;
	}
	
}
