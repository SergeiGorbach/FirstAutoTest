package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);
        bankAccount.credit(600);
        bankAccount.debit(500);


        System.out.println(bankAccount.getBalance());
	/*Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
	Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.

	        int[] array = new int[14];
        int n = 0;
        for (int i=0; i<array.length; i++){
            array[i] = (int) (Math.random()*9);
            System.out.println(array[i]);
            if (array[i]%2 ==0){
                n++;
            }
        }
        System.out.println(n);

	*/

    }

    /*Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.
        public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }*/

}

