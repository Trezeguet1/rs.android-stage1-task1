package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    // Input: Two integers, n (the number of digits in the number) and
    // k (the maximum number of changes allowed) and n—digit String of numbers that
    // Sandy must attempt to make palindromic.

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {

        var changes = k;
        var result = ""
        val pairs = mutableListOf<String>()

            //Sample Output
        if (n < digitString.length) return "-1"

        for (i in 0 until digitString.length / 2) {
            pairs.add("${digitString[i]}${digitString[digitString.length - 1 - i]}")
        }
            //Explanation

        for (index in pairs.indices) {
            val count = pairs.count { it.first() != it.last() }

            if (changes > count && pairs[index] != "99") {
                pairs[index] = "99"
                changes -= 2
            } else if (changes == count && pairs[index].first() != pairs[index].last()) {
                if (pairs[index].first() > pairs[index].last()) {
                    pairs[index] = pairs[index].first().toString().repeat(2)
                } else {
                    pairs[index] = pairs[index].last().toString().repeat(2)
                }
                changes -= 1
            } else if (changes < count) return "-1"
        }

        //Palindromes are strings that read the same from the left or right, for example madam or 0110.

        pairs.forEach {
            result += it.first()
        }

        return "$result${result.reversed()}"
    }
}
        //end.