package egovframework.example.test.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import egovframework.example.test.vo.MemberVO;

public interface MemberDao {
	public List<MemberVO> selectMemberList(MemberVO memberVO) throws Exception;
	//public MemberVO login(String m_email, String m_password) throws Exception;
	public List<MemberVO> login(MemberVO memberVO) throws Exception;	
}
