package egovframework.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.example.test.dao.MemberDao;
import egovframework.example.test.vo.MemberVO;


@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao; 
	
	@Override
	public List<MemberVO> selectMemberList(MemberVO memberVO) throws Exception {
		return null;
	}

	@Override
	public List<MemberVO> login(MemberVO memberVO) throws Exception {
		return memberDao.login(memberVO);
	}

//	@Override
//	public MemberVO login(String m_email, String m_password) throws Exception {
//		return memberDao.login(m_email, m_password);
//	}
	
}
