package my.test.hutool.util;

import cn.hutool.core.util.IdcardUtil;

public class IdcardUtilTest {
	
	public static void main(String[] args) {
		String ID_18 = "321083197812162119";
		String ID_15 = "150102880730303";
		
		//-----------------校验身份证-------------------
		boolean validCard = IdcardUtil.isValidCard(ID_18);
		boolean validCard2 = IdcardUtil.isValidCard(ID_15);
		System.out.println(validCard); 
		System.out.println(validCard2); 
		
		//-----------------获取生日、性别-------------------
		String birthByIdCard = IdcardUtil.getBirthByIdCard(ID_18);
		System.out.println(birthByIdCard);
		int genderByIdCard = IdcardUtil.getGenderByIdCard(ID_18);
		System.out.println("性别："+genderByIdCard);
	}

}
