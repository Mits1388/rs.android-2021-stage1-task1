package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var arraySum = arrayListOf<Int>()

        var i = 0
        val s = bill.size

        while (i < s){
            if( k != i) arraySum.add(bill[i])
            i++
        }

        val item = arraySum.sum()/2

        if(item == b){
            return "bon appetit"
        }else{
            val debt =  b - item
            return "$debt"
        }
    }
}
