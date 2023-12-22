package day11.product;
//제품을 관리하는 프로그램 구현
		/*
		 * 메뉴
		 * 1. 제품입고
		 *  - 제품을 판매하기 위해 다른 곳에서 제품을 구매
		 *  - 기존에 있는 제품의 경우에는 수량만 추가
		 * 2. 제품판매
		 *  - 입고된 제품을 판매
		 * 3. 제품수정[가격] *가격만
		 * 4. 매출내역조회
		 *  - 일자별로 조회
		 * 5. 종료
		 */
import java.util.Scanner;

//판매내역이 일자별로 저장되어야 함 -> 판매할 때 일자를 입력받고 뭐가 판매됐는지, 얼마나 판매됐는지, 매출이 얼마인지를
//다른 배열에 기록해서 일자를 검색하면 그 일자에 맞는 모든 정보들이 나와야함 2중배열까지는 필요없고
//출력할 떄 일자는 한번만 출력하고 나머지 정보들만 쭉 나열
public class ProductMain {
	static int count = 0, salesCount = 0;//제품 총 수량
	private static Scanner scanner = new Scanner(System.in);
	private static ItemList[] itemList = new ItemList[5];
	private static SalesList[] salesList = new SalesList[5];
	//판매일 따라서 num2, sales를 따로 저장
	
 	public static void main(String[] args) {
		int menu;
		do {
			printMenu();
			menu = scanner.nextInt();
			run(menu);
		} while(menu!=6);
			
	}
	private static void run(int menu) {
		switch(menu) {
		case 1:
			addItem();
			break;
		case 2:
			saleItem();
			break;
		case 3:
			updateItem();
			break;
		case 4:
			showSaleList();
			break;
		case 5:
			deleteItem();
			break;
		case 6:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴 선택");
			break;
		}
	}
	private static void deleteItem() {
		if(count==0) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		for(int i=0; i<count; i++) {
			itemList[i].printItem();
		}
		System.out.print("삭제할 제품을 입력해주세요 : ");
		String user = scanner.next();
		for(int i=0; i<count; i++) {
			if(user.equals(itemList[i].getItem())) {
				count--;
				ItemList[] tmp2 = new ItemList[itemList.length];
				System.arraycopy(itemList,0,tmp2,0,itemList.length);
				System.arraycopy(tmp2, i+1, itemList, i, count-i);
				System.out.println("삭제 완료");
				return;
			}
		}
		System.out.println("찾으시는 제품이 없습니다.");
	}
	private static void addItem() {
		System.out.print("입고할 제품 이름 : ");
		String item = scanner.next();
		for(int i=0; i<count; i++) {
			if(item.equals(itemList[i].getItem())) {
				System.out.print("기존에 있는 제품입니다.\n추가하실 수량을 입력해주세요 : ");
				int itemCount = scanner.nextInt();
				itemList[i].setItemCount(itemList[i].getItemCount()+itemCount);
				return;
			}	
		}
		System.out.print("입고할 제품 가격 : ");
		int price = scanner.nextInt();
		System.out.print("입고할 제품 수량 : ");
		int itemCount = scanner.nextInt();
		
		ItemList il = new ItemList(item, itemCount, price);
		itemList[count++] = il;
		System.out.println("정상적으로 입력되었습니다.");
		
		if(count<itemList.length) {
			return;
		}
		addList();
	}
	private static void addList() {
		ItemList[] tmpList = new ItemList[itemList.length + 5];
		System.arraycopy(itemList, 0, tmpList, 0, count);
		itemList = tmpList;
	}
	private static void saleItem() {
		System.out.println("---제품내역---");
		for(int i=0; i<count; i++) {
			itemList[i].printItem();
		}
		System.out.println("--------------");
		System.out.print("판매하실 제품 이름 입력 : ");
		String user = scanner.next();
		for(int i=0; i<count; i++) {
			if(user.equals(itemList[i].getItem())) {
				if(itemList[i].getItemCount()<=0) {
					System.out.println("제품의 수량이 없습니다.");
					return;
				}
				itemList[i].printItem();
				System.out.print("판매할 수량 입력 : ");
				int itemCount = scanner.nextInt();//판매할 수량
				if(itemCount > itemList[i].getItemCount()) {
					System.out.println("최대수량으로 수정합니다.");
					itemCount = itemList[i].getItemCount();
				}
				
				
				int tmp = itemList[i].getItemCount(); //기존의 저장되어 있던 제품 수량
				itemList[i].setItemCount(tmp-itemCount);//수량번경완료
				System.out.print("일자 입력 : ");
				String date = scanner.next();
				int sales = itemCount*itemList[i].getPrice();
				SalesList sl = new SalesList(user, date, sales, itemCount);
				salesList[salesCount++] = sl;
				System.out.println("정상적으로 판매되었습니다.");
				if(salesCount<salesList.length) {
					return;
				}
				SalesList[] tmpList3 = new SalesList[salesList.length + 5];
				System.arraycopy(salesList, 0, tmpList3, 0, count);
				salesList = tmpList3;
				
				//count--;
				
				/*if(itemList[i].getItemCount()<=0) {
					ItemList[] tmp2 = new ItemList[itemList.length];
					System.arraycopy(itemList,0,tmp2,0,itemList.length);
					System.arraycopy(tmp2, i+1, itemList, i, count-i);
				}
				*/
			}
		}
		System.out.println("찾으시는 제품이 없습니다.");
	}
	private static void updateItem() {
		System.out.println("---제품내역---");
		for(int i=0; i<count; i++) {
			itemList[i].printItem();
		}
		System.out.println("--------------");
		System.out.print("수정하실 제품 이름 입력 : ");
		String user = scanner.next();
		for(int i=0; i<count; i++) {
			if(user.equals(itemList[i].getItem())) {
				itemList[i].printItem();
				System.out.print("수정할 가격 입력 : ");
				int itemPrice = scanner.nextInt();//판매할 수량
				itemList[i].setPrice(itemPrice);
				System.out.println("정상적으로 수정되었습니다.");
				return;
			}
		}
		System.out.println("찾으시는 제품이 없습니다.");
	}
	private static void showSaleList() {
		//매출 내역 조회
		int index=0; 
		System.out.print("조회 일자 입력 : ");
		String date = scanner.next();
		for(int i=0; i<salesCount; i++) {
			if(date.equals(salesList[i].getDate())) {
				index++;
				salesList[i].printSales();
			}
		}
		if(index == 0) {
			System.out.println("매출정보가 없습니다.");
		}
	}
	private static void printMenu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 제품 입고");
		System.out.println("2. 제품 판매");
		System.out.println("3. 제품 가격 수정");
		System.out.println("4. 매출 내역 조회");
		System.out.println("5. 제품 삭제");
		System.out.println("6. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
	}
}
