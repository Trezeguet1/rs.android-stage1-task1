package subtask3

class BillCounter {

    //How to return int array from list of inputs?
    //return arrayList[] = {u1,u2,u3,u4,u5};

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val listBill = bill.toMutableList()
        listBill.removeAt(k)
        val difference = b - (listBill.sum() / 2)

        return if (difference == 0) "Bon Appetit" else difference.toString()
    }
}
