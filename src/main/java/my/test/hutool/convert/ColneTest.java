package my.test.hutool.convert;

import cn.hutool.core.clone.CloneSupport;
import cn.hutool.core.clone.Cloneable;

public class ColneTest {

	public static void main(String[] args) {
		System.out.println("----------------cat----------------");
		Cat cat = new Cat();
		Cat cat2 = cat.clone();
		cat.name = "猫星人";
		System.out.println(cat.toString());
		System.out.println(cat2.toString());
		
		System.out.println("----------------catFormer----------------");
		CatFormer catFormer = new CatFormer();
		CatFormer catFormer2 = null;
		try {
			catFormer2 = catFormer.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catFormer.name = "猫星人";
		System.out.println(catFormer.toString());
		System.out.println(catFormer2.toString());
		System.out.println(catFormer.name.hashCode());
		System.out.println(catFormer2.name.hashCode());
		
		System.out.println("----------------dog----------------");
		Dog dog = new Dog();
		Dog dog2 = dog.clone();
		dog.name = "旺财";
		System.out.println(dog.toString());
		System.out.println(dog2.toString());
		
		
	}
	
	/**
	 * 接口泛型克隆
	 * @author rbh011
	 *
	 */
	private static class Cat implements Cloneable<Cat>{
		private String name = "miaomiao";
	    private int age = 2;
		
		@Override
		public Cat clone(){
			try {
				return (Cat)super.clone();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		@Override
		public String toString() {
			return "name:" + name + ",age:"+age;
		}
	}
	
	
	/**
	 * 原生的clone接口，其实没啥区别
	 * @author rbh011
	 *
	 */
	private static class CatFormer implements java.lang.Cloneable{
		
		private String name = "simiaomiao";
	    private int age = 2;
		
		@Override
		protected CatFormer clone() throws CloneNotSupportedException {
			return (CatFormer)super.clone();
		}
		
		@Override
		public String toString() {
	    	// TODO Auto-generated method stub
	    	return "name:" + name + ",age:"+age;
	    }
	}
	
	/**
	 * 累泛型克隆
	 * @author rbh011
	 *
	 */
	private static class Dog extends CloneSupport<Dog>{
	    private String name = "wangwang";
	    private int age = 3;
	    
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "name:" + name + ",age:"+age;
	    }
	}
	
}
