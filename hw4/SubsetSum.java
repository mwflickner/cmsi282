public class SubsetSum {
    
    public static void main(String[] args) {
        System.out.println("\nall positive numbers");
        
    
        int[] list2 = new int[] {1, 3, 5};
        System.out.println(hasSubset(list2, 4));

        int[] list7 = new int[] {1, 3, 5};
        System.out.println(hasSubset(list7, 6) + "\n");

        System.out.println("\nSome negative, some positive numbers");
        
        int[] list1 = new int[] {4, -2, 3};
        System.out.println(hasSubset(list1, 7));

        int[] list3 = new int[] {4, -2, 3};
        System.out.println(hasSubset(list3, -2));

        int[] list4 = new int[] {4, -2, 3};
        System.out.println(hasSubset(list4, 1));
        
        System.out.println("\nall negative numbers");

        int[] list5 = new int[] {-4, -2, -3};
        System.out.println(hasSubset(list5, -7));

        int[] list6 = new int[] {-4, -2, -3};
        System.out.println(hasSubset(list6, -9));

        int[] list8 = new int[] {-4, -2, -3};
        System.out.println(hasSubset(list8, -4));

    }

    //top down backtracking
    public static boolean hasSubset(int[] list, int sum) {
        
        int negativeSum = 0;
        int positiveSum = 0;
        boolean[][] possibleSums;

        if (sum == 0) {
            return true;
        }

        if (list.length == 0 && sum != 0) {
            return false;
        }

        for (int i = 0; i < list.length ; i++ ) {
            if (list[i] < 0) {
                negativeSum += list[i];
            } else if (list[i] > 0) {
                positiveSum += list[i];
            }
        }

        if (sum > positiveSum || sum < negativeSum) {
            return false;
        }

        int widthOfTable = Math.abs(negativeSum) + positiveSum + 1;

        possibleSums = new boolean[list.length][widthOfTable];

        int index0 = Math.abs(negativeSum);
        
        //empty set always possible
        possibleSums[0][index0] = true;
        
        for(int i = 0; i < list.length ; i++ ) {
            for (int j = 0; j < widthOfTable ; j ++ ) {
                
                if (i > 0) {
                    if (possibleSums[i - 1][j] == true) {
                        possibleSums[i][j] = true;
                    }
                }

                if (j == index0 + list[i] ) {
                    possibleSums[i][j] = true;
                }

                if (possibleSums[i][j] == true && i > 0 && ((j + list[i] > 0)) &&(j + list[i] <= widthOfTable - 1)) {
                    possibleSums[i][(j + list[i])]  = true;
                }
            }
        }
        return possibleSums[list.length - 1][widthOfTable - 1];
    }
}

