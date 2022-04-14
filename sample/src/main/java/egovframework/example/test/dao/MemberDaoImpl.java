package egovframework.example.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import egovframework.example.test.service.MemberMapper;
import egovframework.example.test.vo.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<MemberVO> selectMemberList(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> login(MemberVO memberVO) throws Exception {
		MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
		return mapper.login(memberVO);
	}


}
