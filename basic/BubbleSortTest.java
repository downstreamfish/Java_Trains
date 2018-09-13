public class BubbleSortTest{
	public static void main(String[] args){
		int[] arr = {6,4,2,10,9,5};
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void bubbleSort(int[] arr){
		
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j + 1]){
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
				
			}
			System.out.println("第" + i + "次排序后的结果：");
				for(int k = 0; k < arr.length; k++){
					System.out.print(arr[k] + " ");
				}
			System.out.println();
		}
	}

}
