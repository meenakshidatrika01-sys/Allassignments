public class Multidimensional {
    public static void main(String[] args) {
        int[][] numbers = {{3,5,7},{2,4,6}};
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
