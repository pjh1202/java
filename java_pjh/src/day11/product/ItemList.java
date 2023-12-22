package day11.product;

public class ItemList {
	//제품명, 제품수량, 매출내역 조회용 변수
	String item, date;
	int itemCount = 0, num = 0, price=0, sales=0;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public ItemList(String item, int itemCount, int price) {
		this.item = item;
		this.itemCount = itemCount;
		this.price = price;
		}
	
	public void printItem() {
		System.out.println(item + " : " + price + "    개수 : " + itemCount);
	}
	
}
