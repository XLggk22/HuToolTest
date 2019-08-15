package my.test.hutool.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;

public class IOUtilsTest {

	public static void main(String[] args) {
		String srcPath = "C:\\Users\\rbh011\\Desktop\\testlog\\960evo.png";
		String destPath = "C:\\Users\\rbh011\\Desktop\\testlog\\960evo1.png";
		
		//copy方式二
		BufferedInputStream is = FileUtil.getInputStream(FileUtil.file(srcPath));
		BufferedOutputStream os = FileUtil.getOutputStream(destPath);
		long copy = IoUtil.copy(is, os);
		IoUtil.close(is);
		IoUtil.close(os);
		System.out.println("copy:"+copy);
		
		//copy方式一	不用手动关闭流
		FileUtil.copy(srcPath, destPath, true);
		System.out.println(3*0.1==0.3);
		
	}
}
