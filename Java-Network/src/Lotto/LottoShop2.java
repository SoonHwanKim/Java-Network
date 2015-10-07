package Lotto;
/**
 * 
 * @file_name  : SBS.java
 * @author     : sevuo@naver.com
 * @date       : 2015. 10. 7.
 * @story      : 로또 추첨(스윙)
 */
public class LottoShop2 {
	public static void main(String[] args) {
		System.out.println("행운의 로또");
		Lotto2 lotto = new Lotto2();
		lotto.inputMoney(5000);
		lotto.extractNum();
		lotto.printLotto();
		
	}

}
