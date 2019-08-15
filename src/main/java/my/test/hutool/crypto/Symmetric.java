package my.test.hutool.crypto;

import my.test.hutool.Student;
import org.junit.Test;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

/**
 * 对称加密
 * @author rbh011
 *
 */
public class Symmetric {

	@Test
	public void aseTest(){
		String content = "test中文";

		//随机生成密钥
		byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();

		//构建
		SymmetricCrypto aes = new SymmetricCrypto(SymmetricAlgorithm.AES, key);

		//加密
		byte[] encrypt = aes.encrypt(content);
		
		//解密
		byte[] decrypt = aes.decrypt(encrypt);

		//加密为16进制表示
		String encryptHex = aes.encryptHex(content);
		System.out.println("加密后："+encryptHex);
		//解密为字符串
		String decryptStr = aes.decryptStr(encryptHex, CharsetUtil.CHARSET_UTF_8);
		System.out.println("解密后："+decryptStr);
	}
}
