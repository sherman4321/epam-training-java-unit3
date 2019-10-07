package Unit3.Counter;

public class Counter {
    private int count;
    private int leftRange;
    private int rightRange;

    public Counter() {
        this.count = 0;
        this.leftRange = 0;
        this.rightRange = 100;
    }

    public Counter(int count, int leftRange, int rightRange) {
        this.count = count;
        this.leftRange = leftRange;
        this.rightRange = rightRange;
    }

    public boolean isOnLeftBound(){
        if( count == leftRange){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isOnRightBound(){
        if( count == rightRange){
            return true;
        }
        else{
            return false;
        }
    }

    public void countUp(){
        if(count != rightRange){
            count++;
        }
        else{
            return;
        }
    }

    public void countDown(){
        if(count != leftRange){
            count--;
        }
        else{
            return;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLeftRange() {
        return leftRange;
    }

    public void setLeftRange(int leftRange) {
        this.leftRange = leftRange;
    }

    public int getRightRange() {
        return rightRange;
    }

    public void setRightRange(int rightRange) {
        this.rightRange = rightRange;
    }
}
