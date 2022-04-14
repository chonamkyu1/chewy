package egovframework.example.test.service;

import java.util.List;

import egovframework.example.test.vo.MemberVO;

public interface MemberService {
	
	public List<MemberVO> selectMemberList(MemberVO memberVO) throws Exception;
	//MemberVO login(String m_email, String m_password) throws Exception; // 로그인
	public List<MemberVO> login(MemberVO memberVO) throws Exception; // 로그인
}
