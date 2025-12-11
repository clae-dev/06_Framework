package edu.kh.project.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

// 프로그램 전체적으로 사용될 유용한 기능 모음
public class Utility {
	
<<<<<<< HEAD
	public static int seqNum = 1; // 1 ~ 99999 반복 
=======
	public static int seqNum = 1;	// 1 ~ 99999 반복
>>>>>>> 43c5f4090ea8257d26844ede19ab394317a20fde
	
	public static String fileRename(String originalFileName) {
		// 20251211100330_00001.jpg
		
<<<<<<< HEAD
		// SimpleDateFormat : 시간을 원하는 형태의 문자열로 간단히 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		// java.util.Date() : 현재 시간을 저장한 자바 객체
=======
		// SimpleDateFormat : 시간을 원하는 형태의 문자열로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		// java.util.Date() : 현재 서버상 시간을 저장한 자바 객체
>>>>>>> 43c5f4090ea8257d26844ede19ab394317a20fde
		String date = sdf.format(new Date());
		
		String number = String.format("%05d", seqNum);
		
<<<<<<< HEAD
		seqNum++; // 1증가
		if(seqNum == 100000) seqNum = 1;
		
		// 확장자 구하기
		// String.substring(인덱스);
		// - 문자열을 인덱스부터 끝까지 잘라낸 결과를 반환
		
		// String.lastIndexOf("찾을문자열")
		// - 문자열에서 마지막 "찾을문자열"의 인덱스를 반환
		
		// originalFileName == 짱구.jpg
		
		String ext = originalFileName.substring(
						originalFileName.lastIndexOf("."));
		
		// ext == .jpg
		
		return date + "_" + number + ext; // 20251211100330_00001.jpg
		
	}
}
=======
		seqNum++;	// 1씩 증가
		if(seqNum == 100000) seqNum = 1; // 99999 넘으면 1로 초기화
		
		// 확장자 구하기
		// String.substring(인덱스);
		// > 문자열을 인덱스부터 끝까지 잘라낸 결과를 반환
		
		
		// String.lastIndexOf("찾을 문자열")
		// > 문자열에서 마지막 "찾을 문자열"의 인덱스를 반환
		
		// originalFileName == 짱구.jpg
		// lastIndexOf로 . 찾기
		// substring에 .이 있는 인덱스 넣어서 끝까지 잘라낸 결과 반환
		
		String ext = originalFileName.substring(originalFileName.lastIndexOf("."));
		// ext == .jpg
		
		String result = date + "_" + number + ext;
		
		return result;
	}
}
>>>>>>> 43c5f4090ea8257d26844ede19ab394317a20fde
