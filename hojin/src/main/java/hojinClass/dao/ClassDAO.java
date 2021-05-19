package hojinClass.dao;

import java.util.List;

import hojinClass.domain.ClassVO;

public interface ClassDAO {
	public abstract List<ClassVO> mainFavList();
	public abstract List<ClassVO> mainAllList();
	public abstract List<ClassVO> allFavList();
	public abstract List<ClassVO> allAllList();
	public abstract ClassVO selectOneClass(String title);
	public abstract void addCnt(String title);
}
