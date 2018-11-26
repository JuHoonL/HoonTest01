package com.biz.lottonums;

import java.util.ArrayList;
import java.util.Collections;

public class MakeLottoNums {
	public static void main(String[] args) {
		ArrayList<Integer> intNum = new ArrayList();
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 45 ; j++){
				intNum.add(j+1);
			}
			Collections.shuffle(intNum);
			
			ArrayList<Integer> lottoNum = new ArrayList();
			for(int k = 0 ; k < 6 ; k++) {
				lottoNum.add(intNum.get(k));
			}
			System.out.println(lottoNum);
		}
	}
}
