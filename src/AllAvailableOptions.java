public class AllAvailableOptions {

    public static int COUNT = 3;

    public static void main(String[] args){
        int[] regularNum={1,2,3,4,5};//,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
        int[] strongNum={1,2,3,4,5,6,7};
        int[] tempArray= new int[COUNT];
        int i=0,j=0,k=0;

        printOptions(regularNum,i,tempArray,j,k);
    }

    public static void printOptions(int[] regularNum,int position1,int[] tempArray,int position2,int position3){
        //int temp;
        if (position2 == tempArray.length){
            for (int i=0;i< tempArray.length;i++){
                System.out.print(tempArray[i]);
                if (i< tempArray.length-1){
                    System.out.print(",");
                }
            }
            System.out.print("\n");
            printOptions(regularNum,position1,tempArray,position2-1,position3);
        }
        else if (position1 == regularNum.length) {
            return;
        }
        else {
            //temp = regularNum[position1];
            tempArray[position2] = regularNum[position1];
            //regularNum[position1] = -1;
            printOptions(regularNum, position1 + 1, tempArray, position2 + 1,position3);
            //regularNum[position1] = temp;

            if (temp == tempArray[position3] && position1 != regularNum.length - COUNT - 1) {
                printOptions(regularNum, position1+2, tempArray, position3+1,position3+1);
            } else {
                return;
            }
        }
    }
}