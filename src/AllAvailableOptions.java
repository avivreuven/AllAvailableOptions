public class AllAvailableOptions {

    public static int COUNT = 6;

    public static void main(String[] args){
        int[] regularNum={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
        int[] strongNum={1,2,3,4,5,6,7};
        int[] tempArray= new int[COUNT];
        int i,j=0,k=0;
        double sum;
        for (i=0;i<COUNT;i++) {
            tempArray[i]=i;
        }
        //sum = combinationResult(regularNum.length,COUNT)*strongNum.length;
        //System.out.println(sum);
        printOptions(regularNum,tempArray,strongNum);
    }


    public static double combinationResult(int n,int r){
        double a=1,b=1,c=1;
        for (int i=1;i <= n;i++){
            a=a*i;
        }
        for (int i=1;i <= r;i++){
            b=b*i;
        }
        for (int i=1;i <= n-r;i++){
            c=c*i;
        }
        return (a/(b*c));
    }

    public static void printOptions(int[] regularNum,int[] tempArray,int[] strongNum){
        while (tempArray[0] != regularNum.length-(COUNT-1)){
            for (int i = COUNT - 1; i >= 0; i--) {
                if (tempArray[i] == regularNum.length - (COUNT - (i + 1))) {
                    if (i == 0) {
                        return;
                    }
                    tempArray[i - 1]++;
                    if (COUNT-(i) >= 2) {
                        for (int j = i; j < COUNT; j++) {
                            tempArray[j] = tempArray[j - 1] + 1;
                        }
                    } else {
                        tempArray[i] = tempArray[i - 1] + 1;
                    }
                }
            }
            for (int j=0;j<strongNum.length;j++) {
                for (int i = 0; i < COUNT; i++) {
                    System.out.print(regularNum[tempArray[i]]);
                    if (i != COUNT - 1) {
                        System.out.print(",");
                    }
                }
                System.out.print(" ["+strongNum[j]+"]\n");
            }
            tempArray[COUNT - 1]++;
        }
    }
}