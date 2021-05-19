package hojinClass.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import hojinClass.domain.ClassVO;

@Repository
public class ClassDAOImpl implements ClassDAO {
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public ClassDAOImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	public List<ClassVO> mainFavList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("mainFavClass");
	}

	public List<ClassVO> mainAllList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("mainAllClass");
	}

	public List<ClassVO> allFavList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("listFavClass");
	}

	public List<ClassVO> allAllList() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList("listAllClass");
	}

	public ClassVO selectOneClass(String title) {
		// TODO Auto-generated method stub
		ClassVO vo = (ClassVO)sqlSessionTemplate.selectOne("selectOneClass",title);
		return vo;
	}

	public void addCnt(String title) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.update("addCnt",title);
	}

}
