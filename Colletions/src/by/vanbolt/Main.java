package by.vanbolt;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	private static ArrayList<Mobile>mobiles = new ArrayList<Mobile>();
	private static Random r = new Random();
	public static void main(String[] args){
		for(int i=0; i<1000000; i++){
			mobiles.add(new Mobile(r.nextInt(9999999), "sadasdasd"));
		}
		for(Mobile m: mobiles){
			System.out.println(m.getNumber()+" "+m.getName());
		}
	}
}
