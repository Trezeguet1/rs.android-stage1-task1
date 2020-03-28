package subtask1

class HappyArray {

        //initializing an input array of integers

fun convertToHappy(sadArray: IntArray): IntArray {
    var input = sadArray.toMutableList()

    for (i in 1 until sadArray.size - 1) {
        if (sadArray[i] > sadArray[i + 1] + sadArray[i - 1] ) {
            input.remove(sadArray[i])
        }
    }

        //using collections in Kotlin
    if (isSadArray(input.toIntArray())) input = convertToHappy(input.toIntArray()).toMutableList()

    return input.toIntArray()
}
        //the loop conditions in the sad array
fun isSadArray(sadArray: IntArray): Boolean {
    for (i in 1 until sadArray.size - 1) {
        if (sadArray[i] > sadArray[i + 1] + sadArray[i - 1] ) {
            return true
        }
    }
        //returning array values
    return false
	    }
	}

