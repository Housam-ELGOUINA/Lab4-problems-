package problem2;

public class IntegerList
{
    int[] list; //values in the list
    private int size  ;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        this.size ++  ;
        int[] newList =  new int[this.size] ;
        for ( int i =0 ; i < this.list.length ; i++) {
            newList[i]  = this.list[i];
        }

        this.list  =  newList ;
    }


    public void addElement(int newVal) {
        if ( this.list.length == this.size) {
            increaseSize();
        }
        this.list[this.size] = newVal ;
    }
}