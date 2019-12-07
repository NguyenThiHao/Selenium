import java.awt.List;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Double> getListPrice(){
		List<Double> listPrice = new ArrayList<>();
		try{
			List<WebElement> hotelPriceListPerPage = avaiPage.getHotelPriceList();
			System.out.println("Add price hotel to List");
			for(int i = 0; i < hotelPriceListPerPage.count; i++){
				double price = convertPriceStringToFloat(hotelPriceListPerPage.get(i).getText());
				System.out.println(price);
				listPrice.add(price);
			}
			while (checkNextBtnClickable()){
				System.out.println("Click Next Button");
				avaiPage.getNextBtn().click();
				hotelPriceListPerPage = avaiPage.getHotelPriceList();
				for(int i = 0; i < hotelPriceListPerPage.size(); i++){
					double price = convertPriceStringToFloat(hotelPriceListPerPage.get(i).getText());
					System.out.println(price);
					listPrice.add(price);
				}
			}
		}
		catch(NullPointerException n){
			System.out.println("Error NullPointerException");
		}
		System.out.println("Size list price: " + listPrice.size());
		return listPrice;
	}

	private boolean checkNextBtnClickable() {
		// TODO Auto-generated method stub
		return false;
	}

}
