package my.test.hutool.convert;

import java.util.Arrays;
import java.util.List;

import cn.hutool.core.convert.Convert;

public class ConvertTest {

	public static void main(String[] args) {
		int a = 1;
		long[] b = {1,2,3,4,5};
		String str = Convert.toStr(a);
		String str2 = Convert.toStr(b);
		System.out.println("----------------转string----------------");
		System.out.println(str.equals(String.valueOf(a)));
		System.out.println(str2);
		System.out.println(Arrays.toString(b));
		
		System.out.println("----------------转list----------------");
		List<?> list = Convert.toList(Long.class, b);
		System.out.println(list);
		
		System.out.println("----------------转数组----------------");
		Long[] longArray = Convert.toLongArray(a);
		System.out.println(Arrays.toString(longArray));
	}
	
}
