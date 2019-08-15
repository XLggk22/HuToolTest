package my.test.hutool.date;

import java.util.Date;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;

public class DateUtilTest {

	public static void main(String[] args) {
		//计时器
		TimeInterval timer = DateUtil.timer();
		
		//-----------------获取时间-------------------
		//当前时间
		Date date = DateUtil.date();
		System.out.println(date);
		
		Date date2 = DateUtil.date(new Date());
		System.out.println(date2);
		
		//当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
		String date3 = DateUtil.now();
		System.out.println(date3);
		
		//当前日期字符串，格式：yyyy-MM-dd
		String date4 = DateUtil.today();
		System.out.println(date4);
		
		//-----------------格式化-------------------
		
		//时间格式转化	支持多种格式
		String dateStr = "2017-03-06";
		Date date5 = DateUtil.parse(dateStr);
		System.out.println(date5);
		
		//时间格式化	2017-03-01 00:00:00
		String dateStr2 = DateUtil.formatDate(DateUtil.date());
		System.out.println(dateStr2);
		
		//时间格式化	2017-03-01
		String dateStr3 = DateUtil.formatDateTime(DateUtil.date());
		System.out.println(dateStr3);
		
		//时间格式化	00:00:00
		String timeStr = DateUtil.formatTime(DateUtil.date());
		System.out.println(timeStr);
		
		//-----------------开始和结束时间-------------------
		//一天的开始，结果：2017-03-01 00:00:00
		DateTime beginOfDay = DateUtil.beginOfDay(DateUtil.date());
		//一天的开始，结果：2017-03-01 00:00:00
		DateTime beginOfMonth = DateUtil.beginOfMonth(DateUtil.date());
		System.out.println("日初："+beginOfDay);
		System.out.println("月初："+beginOfMonth);
		
		//-----------------日期时间偏移-------------------
		DateTime offsetDay = DateUtil.offsetDay(DateUtil.date(), -1);
		DateTime offsetMonth = DateUtil.offsetMonth(DateUtil.date(), -1);
		DateTime lastWeek = DateUtil.lastWeek();
		System.out.println("前一天："+offsetDay);
		System.out.println("上个月："+offsetMonth);
		System.out.println("上周："+lastWeek);
		
		System.out.println("花费毫秒数："+timer.interval());
		System.out.println("花费毫秒数："+timer.intervalRestart());
		System.out.println("花费毫秒数："+timer.intervalMinute());
		System.out.println("你妹呀！");


		DateTime dateTime = DateUtil.parseDate("2019-01-30");
		DateTime dateTime1 = DateUtil.offsetMonth(dateTime, 1);
		System.out.println(dateTime1);
		
	}
}
