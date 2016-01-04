public class KirkmanRow{
    private int[] row = new int[3];

    public KirkmanRow(int left, int center, int right){
        this.row[0] = left;
        this.row[1] = center;
        this.row[2] = right;
    }

    public int left(){
        return this.row[0];
    }

    public void setLeft(int newLeft){
        this.row[0] = newLeft;
    }

    public int center(){
        return this.row[1];
    }

    public void setCenter(int newCenter){
        return this.row[1];
    }

    public int right(){
        return this.row[2];
    }

    public void setRight(int newRight){
        return this.row[2];
    }

    public int getIndex(int index){
        if(index < 0 || index > 2){
            throw new IllegalArgumentException();
        }
        return this.row[index];
    }

    public void setIndex(int index, int value){
        this.row[index] = value;
    }

    public boolean rowAscending(){
        if(row[0]<row[1]<row[2]){
            return true;
        }
        else{
            return false;
        }
    }

    //returns true if this is less than other
    public boolean isLessThan(KirkmanRow other, int index){
        if(index < 0 || index > 2){
            throw new IllegalArgumentException();
        }
        if(other.getIndex(index) > this.getIndex(index)){
            return true;
        }
        return false;
    }


}