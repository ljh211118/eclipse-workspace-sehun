import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Store store1 = new Store();
		
		Product water = new Product("물", 700);
		store1.setProducts(water);
		Product peach = new Product("복숭아", 30000);
		store1.setProducts(peach);
		Product rice = new Product("햇반", 1000);
		store1.setProducts(rice);
		
		Customer customer1 = new Customer("이정현", 24, "010-1111-1111");
		Customer customer2 = new Customer("함지수", 25, "010-2222-2222");
		
		// 날짜 지정 - 오늘
		Date date1 = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("YYYY년 MM월 dd일 HH:mm:ss");
		String today = format1.format(date1);
		System.out.println("오늘 : " + today);
		
		// 날짜 지정 - 내일
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date1);
		calendar1.add(Calendar.DATE, 1);
		String tomorrow = format1.format(calendar1.getTime());
		System.out.println("내일 : " + tomorrow);
		
		// 날짜 지정 - 어제
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(date1);
		calendar2.add(Calendar.DATE, -1);
		String yesterday = format1.format(calendar2.getTime());
		System.out.println("어제 : " + yesterday);
		
		// 해시맵
		HashMap<String, ArrayList<Product>> dayToSoldProductList = new HashMap<String, ArrayList<Product>>();
		HashMap<String, Integer> dayToTotal = new HashMap<String, Integer>();
		//// 해시맵은 키와 값을 객체로 저장하기 때문에 int 대신 integer를 사용함
		
        // 첫 번째 고객 결제
        store1.pay(customer1, rice, today, dayToSoldProductList, dayToTotal);
        store1.pay(customer1, peach, today, dayToSoldProductList, dayToTotal);
        
        // 두 번째 고객 결제
        store1.pay(customer2, water, tomorrow, dayToSoldProductList, dayToTotal);
		
		for(String key : dayToSoldProductList.keySet()) {
			System.out.println("결제일자 : " + key + ", 상품금액 : " + dayToSoldProductList.get(key));
		}
		
		for(String key : dayToSoldProductList.keySet()) {
			System.out.println("결제일자 : " + key + ", 매출액 : " + dayToTotal.get(key));
		}
		
	}

}
