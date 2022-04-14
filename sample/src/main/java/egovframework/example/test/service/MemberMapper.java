package egovframework.example.test.service;

import java.util.List;

import egovframework.example.test.vo.MemberVO;

public interface MemberMapper {

//	public MemberVO login(String m_id, String m_password) throws Exception;
	public List<MemberVO> login(MemberVO memberVO) throws Exception;
}
