public class ItemsReverted {
    public static void main(String[] args) {

        showItemsReverted(new int[]{1, 2, 3});
    }


        public static void showItemsReverted(int[] array){
            if (array.length == 0) {
                System.out.println("Array is empty");
            } else {
                for (int i = 0; i < array.length; i ++){
                    System.out.println(array[array.length - 1 -i]);
                }
                // for (int i = array.length - 1; i >= 0; i--) {
                //     System.out.println(array[i]);
                // }
            }
        }
}


