package my.test.hutool.imageutil;

import java.io.IOException;

import javax.imageio.ImageIO;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ImageUtil;

public class ImageUtilTest {

	public static void main(String[] args) {
		String srcPath = "C:\\Users\\rbh011\\Desktop\\testlog\\960evo.png";
		String destPath = "C:\\Users\\rbh011\\Desktop\\testlog\\960evo2.png";
		//复制图片  并调整图片大小
		ImageUtil.scale(FileUtil.file(srcPath), FileUtil.file(destPath), 0.5f);
		
		//调整图片大小
		try {
			ImageUtil.scale(ImageIO.read(FileUtil.file(destPath)), 0.1f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}