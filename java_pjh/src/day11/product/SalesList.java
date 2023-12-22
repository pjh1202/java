package day11.product;

public class SalesList {
	int sales, num; 
	String item, date;

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public SalesList(String item, String date, int sales, int num) {
		this.sales = sales;
		this.date = date;
		this.num = num;
		this.item = item;
	}
	
	public void printSales() {
		System.out.println(item + " 제품은" + num + "개 팔렸습니다.\n" + "매출 : " + sales);
	}
	
}
