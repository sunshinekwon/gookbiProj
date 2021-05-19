package hojinClass.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hojinClass.domain.ClassVO;

@Service
public interface ClassService {
	public abstract List<ClassVO> mainFavClass();
	public abstract List<ClassVO> mainAllClass();
	public abstract List<ClassVO> allFavClass();
	public abstract List<ClassVO> allAllClass();
	public abstract ClassVO selectOneClass(String title);
}
