package edu.kh.project.myPage.model.mapper;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;

=======
>>>>>>> 43c5f4090ea8257d26844ede19ab394317a20fde
import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;
import edu.kh.project.myPage.model.dto.UploadFile;

@Mapper
public interface MyPageMapper {

<<<<<<< HEAD
	/** 회원 정보 수정 SQL 
=======
	/** 회원 수정 SQL 실행
>>>>>>> 43c5f4090ea8257d26844ede19ab394317a20fde
	 * @param inputMember
	 * @return
	 */
	int updateInfo(Member inputMember);

<<<<<<< HEAD
	/** 회원의 암호화된 비밀번호 조회
	 * @param memberNo 
	 * @return 암호화된 비밀번호
	 */
	String selectPw(int memberNo);

	/** 비밀번호 변경
	 * @param paramMap
	 * @return result 
	 */
	int changePw(Map<String, Object> paramMap);

	/** 회원 탈퇴 SQL (update)
=======
	/** 로그인한 회원 확인 SQL 실행
	 * @param memberNo
	 * @return
	 */
	String selectPw(int memberNo);

	/** 비밀번호 변경 SQL 실행
	 * @param member
	 * @return
	 */
	int changePw(Member member);

	/** 회원 탈퇴 SQL(update)
>>>>>>> 43c5f4090ea8257d26844ede19ab394317a20fde
	 * @param memberNo
	 * @return
	 */
	int secession(int memberNo);

<<<<<<< HEAD
	/** 파일 정보를 DB에 삽입 SQL (insert)
=======
	/** 파일 정보를 DB에 삽입하는 SQL (insert)
>>>>>>> 43c5f4090ea8257d26844ede19ab394317a20fde
	 * @param uf
	 * @return
	 */
	int insertUploadFile(UploadFile uf);

<<<<<<< HEAD
	/** 파일 목록 조회하는 SQL
	 * @param memberNo
	 * @return
	 */
	List<UploadFile> fileList(int memberNo);

	/** 프로필 이미지 변경 SQL 구문
	 * @param member
	 * @return
	 */
	int profile(Member member);
	
	
	
	
	
}
=======
}
>>>>>>> 43c5f4090ea8257d26844ede19ab394317a20fde
