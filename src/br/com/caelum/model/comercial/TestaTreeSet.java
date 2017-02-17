package br.com.caelum.model.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaTreeSet{
	public static void main(String[] args) {
		List<Integer> conta = new ArrayList<>();
		for (int i = 1000; i > 0; i--) {
			conta.add(i);
		}
		Collections.reverse(conta);
		for (Integer i : conta) {
			System.out.println(i);
		}
	}
}	