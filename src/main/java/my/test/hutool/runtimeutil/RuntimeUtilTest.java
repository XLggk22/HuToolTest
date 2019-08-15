package my.test.hutool.runtimeutil;

import cn.hutool.core.util.RuntimeUtil;

public class RuntimeUtilTest {

	public static void main(String[] args) {
		//在当前系统下执行命令
		String execForStr = RuntimeUtil.execForStr("ipconfig");
		System.out.println(execForStr);
		
		String execForStr2 = RuntimeUtil.execForStr("cmd /c dir");
		System.out.println(execForStr2);
	}
}
