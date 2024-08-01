package mymy;

import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {

		int list[] = makeList();
		
		printList(list);
		
		oddList(list);
		
		int add = addList(list);
		System.out.println("\n['임의의 수로 이루어진 배열'의 합]: " + add);
		
		int small = smallList(list);
		System.out.println("\n[가장 작은 수의 위치(인덱스)]: " + small);
		
		ArrayList<Integer> three = threeList(list);
        System.out.println("[3의 배수]" + three);
		
	}
	
	// 6. 배열의 수들을 한 줄에 10개씩 출력하는 함수
    private static void printList(int[] list) {
    	System.out.println("\n[임의의 수로 이루어진 배열]");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
            if ((i + 1) % 10 == 0) { // 10번째 숫자마다 줄바꿈
                System.out.println();
            }
        }
    }
	
	// 1. 1부터 999까지의 100개의 임의의 수로 이루어진 배열을 생성하는 함수를 호출하여 배열을 생성
    private static int[] makeList() {
        int[] list = new int[100]; // 100개의 정수 배열 생성
        for (int i = 0; i < 100; i++) { // 배열의 각 요소에 대해 반복
            list[i] = (int) (Math.random() * 1000); // 0에서 999 사이의 랜덤 정수를 생성하여 배열에 할당
        } 
        return list; 
    }
    
    // 2.인덱스가 홀수인 수들을 출력하는 함수
    private static void oddList(int[] list) {
        System.out.println("\n[홀수 인덱스 값 출력]");
        for (int i = 0; i < list.length; i++) {
        	if (i%2 != 0) {
        		System.out.println("array[" + i + "] = " + list[i]);
        	}
        }
    }
    
    
    // 3.배열의 수들의 합을 반환하는 함수
    private static int addList(int[] list) {
    	  int sum = 0;
        
        for (int i = 0; i < list.length; i++) {
        	sum += list[i];
        }
        return sum;
    }
    
    // 4.가장 작은 수의 위치(인덱스)를 반환하는 함수
    private static int smallList(int[] list) {
    	
    	int small = 1;
    	
    	for (int i = 0; i < list.length; i++) {
        	if(list[i] < list[small]) {
        		small = i;
        	}
        }
        return small;	
    }
    
    // 5. 3의 배수만을 새로운 배열에 복사하여 리턴하는 함수
    private static ArrayList<Integer> threeList(int[] list) { 
    	
        ArrayList<Integer> list3 = new ArrayList<>(); // 3의 배수를 저장할 리스트
        
        for (int i=0; i<list.length; i++) { // 배열의 각 요소에 대해 반복
            if (list[i] % 3 == 0) {
                list3.add(list[i]); // 3의 배수인 경우 리스트에 추가
            }
        }
        return list3; // 결과 배열 반환
    }
}