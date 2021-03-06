/**
 * Created by Shantanu Johri on 20-02-2017.
 */
fun main(args: Array<String>){
    println("Kotlin ini")
    val data = arrayOf(
            arrayOf(intArrayOf(0, 0), intArrayOf(0)),
            arrayOf(intArrayOf(0, 1), intArrayOf(0)),
            arrayOf(intArrayOf(1, 0), intArrayOf(0)),
            arrayOf(intArrayOf(1, 1), intArrayOf(1))
    )
    val LEARNINGRATE : Double = 0.05
    var INITIAL_WEIGHTS: DoubleArray = doubleArrayOf(Math.random(), Math.random())
    var epochNumber: Int = 0
    var errorFlag: Boolean = true
    var error: Double = 0.0
    var adjustedWeights: DoubleArray
    while(errorFlag){
        print(epochNumber++)
        errorFlag = false
        for(i in data.indices){
            val weightedSum: Double = calculateWeightedSum(data[i][0], INITIAL_WEIGHTS )
            val result: Int = applyActivationFunction(weightedSum)
            error = (data[i][1][0] - result).toDouble()
            if(error!= 0.0){
                errorFlag = true
            }
            adjustedWeights = adjustWeights(data[i][0], INITIAL_WEIGHTS, error, LEARNINGRATE)
    println(" " + error + "    " + adjustedWeights)
            INITIAL_WEIGHTS = adjustedWeights;
        }
    }


}
fun print(epoch: Int){
println("w1 " )
    }
fun calculateWeightedSum(data: IntArray, weights: DoubleArray): Double{
    var  weightedSum: Double = 0.0
    for (i in data.indices) {
        weightedSum  +=   data[i] * weights[i]
    }
    return weightedSum
}
fun applyActivationFunction(weightedSum: Double): Int{
    var result: Int = 0
    if(weightedSum > 1){
        result = 1
    }
    return result
}
fun adjustWeights(data: IntArray, weights: DoubleArray, error: Double, learningRate: Double): DoubleArray{
    val adjustedWeights = DoubleArray(weights.size)
    for (i in weights.indices) {
        adjustedWeights[i] = learningRate * error * data[i] + weights[i]
    }
    return adjustedWeights
}
