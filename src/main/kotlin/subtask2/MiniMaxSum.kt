package subtask2

class MiniMaxSum {

    //Complete the following function
        //System.out.println("All unit entered");
    fun getResult(input: IntArray): IntArray {

    val sumList = mutableListOf<Int>()

    for (i in input) {
        sumList.add( input.sum() - i )
    }
        //returning array values
    return arrayOf(sumList.min()!!, sumList.max()!!).toIntArray()
}
}
