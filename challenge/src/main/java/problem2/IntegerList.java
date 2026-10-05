package problem2;

public class IntegerList
{
    int[] list; //values in the list
    private int size  ;
    private int numberOfElemnts  ;
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

        int[]  newList  =  new int[this.list.length +1 ] ;
        for ( int i =0 ; i < newList.length -1 ; i++) {
            newList[i] = this.list[i] ;
        }
        newList[this.list.length] = newVal ;

        this.list =  newList ;

        this.numberOfElemnts  ++   ;
    }

    public void removeFirst(int newVal) {
        for ( int i =0 ; i < this.list.length  ; i++) {
            if ( this.list[i] == newVal) {
                int remove_idx =  i ;
                int[] newList  = new int[this.list.length] ;

                for ( int j =0 ; j < this.list.length ; j++) {
                    if (j != remove_idx) {
                        newList[j] = this.list[j] ;
                    }
                    else {
                        continue;
                    }


                }

                this.list = newList ;
                this.numberOfElemnts -- ;

                break;
            }



        }


    }

    public void removeAll(int newVal) {

        int[] newList  =  new int[this.list.length] ;
        int count_removed  = 0 ;
        for ( int i =0 ; i < this.list.length  ; i++) {
            if (this.list[i] == newVal ) {
                count_removed ++;
                continue ;
            } else {
                newList[i] =  this.list[i] ;
            }
        }
        this.numberOfElemnts = this.numberOfElemnts - count_removed ;

        this.list  = newList ;


    }

}