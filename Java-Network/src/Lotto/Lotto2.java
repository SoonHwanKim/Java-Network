package Lotto;

import java.util.ArrayList;
import java.util.Arrays;

public class Lotto2 {
	//횟수별 6개의 로또번호 저장을 위한 2차원 배열 선언
	private int [][] lottos; // 5000원이면 5줄 발급
	private int money; // 로또샵에 주는 돈
	public void inputMoney(int i) {
		this.money = money;
		lottos = new int[money/1000][6];
	}

	public void extractNum() {
		int count = 0;  //로또 횟수
		int i = 0; // 로또 횟수
		int num = 0;
		for (count = 0; count < lottos.length; count++) {
			while (true) {
				num = vote();//추출된 랜덤숫자를 담는다.
				if (isDupl(count, num)) { //중복여부를 체크한다. 중복로직을 통과했다면 (= 중복되지 않는 숫자라면)
					lottos[count][i] = num; // 그 숫자를 담는다.
					i++;
					if (i == lottos[0].length){
						i = 0;
						break; // 종료한다.
					}
				}
			}
		}
		
	}

	public void printLotto() {
		System.out.println("**********부자되세여*************");
		for (int i = 0; i < lottos.length; i++) {
			sort(lottos[i]);
			for (int j = 0; j < lottos[0].length; j++) {
				System.out.print(lottos[i][j]+"\t");
			}
			System.out.println();
		}

		
	}
	private int vote(){
		return (int) (Math.random()*45+1); // 랜덤숫자 발생 1 부터 45 까지
	}
	/**
	 * 앞에서 추출된 숫자가 뒤에서 다시 추출되는 것을 막기 위해서
	 * 숫자 중복여부를 체크해야함
	 * count => money/1000 개념으로 돈에 따른 로또 횟수
	 */
	private boolean isDupl(int count, int randomNum){
		for (int i = 0; i < lottos[count].length; i++) {
			if (lottos[count][i] == randomNum) { //lottos [i][i] ==randomNum
				return false;
				
			}
		}
		return true;
	}
	

	/**
	 * 카운트 별로 로또번호 오름차순 정렬
	 * @param arr
	 */
	private void sort(int[] arr){
		for (int i = 0; i < lottos[0].length; i++) {
			Arrays.sort(arr);
		}
		
	}

}
