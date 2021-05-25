package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArray1 = intArrayOf()
        sadArray1 = sadArray
        var  x = 0
        var happyArray = arrayListOf<Int>()

        if(sadArray.isEmpty()) return sadArray

        while (x < 4){
            var a = sadArray1.size - 1
            var sizeSad = sadArray1.size - 3
            happyArray.add(sadArray1[0])
            for (i in 0 .. sizeSad){
                var sum = sadArray1[i]+sadArray1[i + 2]
                if(sum > sadArray1[i + 1]){
                    happyArray.add(sadArray1[i + 1])
                }
            }
            happyArray.add(sadArray1[a])
            sadArray1 = happyArray.toIntArray()
            happyArray = arrayListOf()
            x++
        }
        return sadArray1
    }
}
