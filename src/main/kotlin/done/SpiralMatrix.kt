package done

class SpiralMatrix {

    fun test() {
        val matrix: Array<IntArray> = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8 , 9))
        println(spiralOrder(matrix))
    }

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val result = mutableListOf<Int>()


        var left = 0
        var right = matrix[0].size - 1
        var up = 0
        var bottom = matrix.size - 1

        var direction = 1;
        while (true) {
            if (direction % 4 == 1) {
                if (left > right)
                    break
                for (i in left..right)
                    result.add(matrix[up][i])
                up++
            } else if (direction % 4 == 2) {
                if (up > bottom)
                    break
                for (i in up..bottom)
                    result.add(matrix[i][right])
                right--
            } else if (direction % 4 == 3) {
                if (left > right)
                    break
                for (i in right downTo left)
                    result.add(matrix[bottom][i])
                bottom--
            } else if (direction % 4 == 0) {
                if (up > bottom)
                    break
                for (i in bottom downTo up)
                    result.add(matrix[i][left])
                left++
            }

            direction++

        }

        return result
    }
}
