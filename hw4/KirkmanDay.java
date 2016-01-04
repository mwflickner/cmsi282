public class KirkmanDay{

    private KirkmanRow[] kDay = new KirkmanRow[5];

    public KirkmanDay(KirkmanRow row1, KirkmanRow row2, KirkmanRow row3, KirkmanRow row4, KirkmanRow row5){
        this.kDay[0] = row1;
        this.kDay[1] = row2;
        this.kDay[2] = row3;
        this.kDay[3] = row4;
        this.kDay[4] = row5;
    }

    public setRow(int rowNum, int index, int value){
        this.kDay[rowNum].setIndex(index, value);
    }

    public boolean abc(){
        if((kDay[0].left() == 1) && (kDay[1].left() == 2) && (kDay[2].left() ==3)){
            return true;
        }
        return false;
    }

    public boolean leftColumnOrderd(){
        if(kDay[0].left() < kDay[1].left() < kDay[2].left() < kDay[3].left() < kDay[4].left()){
            return true;
        }
        return false;
    }

    public void swapGirl(KirkmanRow rowA, int indexA, KirkmanRow rowB, int indexB){
        int temp = rowB.getIndex(indexB);
        rowB.setIndex(indexB, rowA.getIndex(indexA));
        rowA.setIndex(indexA, temp);
    }

    //returns true if other is greater than this
    pubic boolean topMiddleIncreases(int other){
        if(this.kDay[0].center() < other){
            return true;
        }
        return false;
    }

}