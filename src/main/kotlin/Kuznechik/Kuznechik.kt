package Kuznechik

class Kuznechik {

    // Значения для нелинейного преобразования множества двоичных векторов (преобразование S)
    // The code defines an array of unsigned 8-bit integers named "pi" which contains the hexadecimal representation of some binary data.
    private val pi: ByteArray = byteArrayOf(
        0xFC.toByte(), 0xEE.toByte(), 0xDD.toByte(), 0x11.toByte(), 0xCF.toByte(), 0x6E.toByte(), 0x31.toByte(), 0x16.toByte(),
        0xFB.toByte(), 0xC4.toByte(), 0xFA.toByte(), 0xDA.toByte(), 0x23.toByte(), 0xC5.toByte(), 0x04.toByte(), 0x4D.toByte(),
        0xE9.toByte(), 0x77.toByte(), 0xF0.toByte(), 0xDB.toByte(), 0x93.toByte(), 0x2E.toByte(), 0x99.toByte(), 0xBA.toByte(),
        0x17.toByte(), 0x36.toByte(), 0xF1.toByte(), 0xBB.toByte(), 0x14.toByte(), 0xCD.toByte(), 0x5F.toByte(), 0xC1.toByte(),
        0xF9.toByte(), 0x18.toByte(), 0x65.toByte(), 0x5A.toByte(), 0xE2.toByte(), 0x5C.toByte(), 0xEF.toByte(), 0x21.toByte(),
        0x81.toByte(), 0x1C.toByte(), 0x3C.toByte(), 0x42.toByte(), 0x8B.toByte(), 0x01.toByte(), 0x8E.toByte(), 0x4F.toByte(),
        0x05.toByte(), 0x84.toByte(), 0x02.toByte(), 0xAE.toByte(), 0xE3.toByte(), 0x6A.toByte(), 0x8F.toByte(), 0xA0.toByte(),
        0x06.toByte(), 0x0B.toByte(), 0xED.toByte(), 0x98.toByte(), 0x7F.toByte(), 0xD4.toByte(), 0xD3.toByte(), 0x1F.toByte(),
        0xEB.toByte(), 0x34.toByte(), 0x2C.toByte(), 0x51.toByte(), 0xEA.toByte(), 0xC8.toByte(), 0x48.toByte(), 0xAB.toByte(),
        0xF2.toByte(), 0x2A.toByte(), 0x68.toByte(), 0xA2.toByte(), 0xFD.toByte(), 0x3A.toByte(), 0xCE.toByte(), 0xCC.toByte(),
        0xB5.toByte(), 0x70.toByte(), 0x0E.toByte(), 0x56.toByte(), 0x08.toByte(), 0x0C.toByte(), 0x76.toByte(), 0x12.toByte(),
        0xBF.toByte(), 0x72.toByte(), 0x13.toByte(), 0x47.toByte(), 0x9C.toByte(), 0xB7.toByte(), 0x5D.toByte(), 0x87.toByte(),
        0x15.toByte(), 0xA1.toByte(), 0x96.toByte(), 0x29.toByte(), 0x10.toByte(), 0x7B.toByte(), 0x9A.toByte(), 0xC7.toByte(),
        0xF3.toByte(), 0x91.toByte(), 0x78.toByte(), 0x6F.toByte(), 0x9D.toByte(), 0x9E.toByte(), 0xB2.toByte(), 0xB1.toByte(),
        0x32.toByte(), 0x75.toByte(), 0x19.toByte(), 0x3D.toByte(), 0xFF.toByte(), 0x35.toByte(), 0x8A.toByte(), 0x7E.toByte(),
        0x6D.toByte(), 0x54.toByte(), 0xC6.toByte(), 0x80.toByte(), 0xC3.toByte(), 0xBD.toByte(), 0x0D.toByte(), 0x57.toByte(),
        0xDF.toByte(), 0xF5.toByte(), 0x24.toByte(), 0xA9.toByte(), 0x3E.toByte(), 0xA8.toByte(), 0x43.toByte(), 0xC9.toByte(),
        0xD7.toByte(), 0x79.toByte(), 0xD6.toByte(), 0xF6.toByte(), 0x7C.toByte(), 0x22.toByte(), 0xB9.toByte(), 0x03.toByte(),
        0xE0.toByte(), 0x0F.toByte(), 0xEC.toByte(), 0xDE.toByte(), 0x7A.toByte(), 0x94.toByte(), 0xB0.toByte(), 0xBC.toByte(),
        0xDC.toByte(), 0xE8.toByte(), 0x28.toByte(), 0x50.toByte(), 0x4E.toByte(), 0x33.toByte(), 0x0A.toByte(), 0x4A.toByte(),
        0xA7.toByte(), 0x97.toByte(), 0x60.toByte(), 0x73.toByte(), 0x1E.toByte(), 0x00.toByte(), 0x62.toByte(), 0x44.toByte(),
        0x1A.toByte(), 0xB8.toByte(), 0x38.toByte(), 0x82.toByte(), 0x64.toByte(), 0x9F.toByte(), 0x26.toByte(), 0x41.toByte(),
        0xAD.toByte(), 0x45.toByte(), 0x46.toByte(), 0x92.toByte(), 0x27.toByte(), 0x5E.toByte(), 0x55.toByte(), 0x2F.toByte(),
        0x8C.toByte(), 0xA3.toByte(), 0xA5.toByte(), 0x7D.toByte(), 0x69.toByte(), 0xD5.toByte(), 0x95.toByte(), 0x3B.toByte(),
        0x07.toByte(), 0x58.toByte(), 0xB3.toByte(), 0x40.toByte(), 0x86.toByte(), 0xAC.toByte(), 0x1D.toByte(), 0xF7.toByte(),
        0x30.toByte(), 0x37.toByte(), 0x6B.toByte(), 0xE4.toByte(), 0x88.toByte(), 0xD9.toByte(), 0xE7.toByte(), 0x89.toByte(),
        0xE1.toByte(), 0x1B.toByte(), 0x83.toByte(), 0x49.toByte(), 0x4C.toByte(), 0x3F.toByte(), 0xF8.toByte(), 0xFE.toByte(),
        0x8D.toByte(), 0x53.toByte(), 0xAA.toByte(), 0x90.toByte(), 0xCA.toByte(), 0xD8.toByte(), 0x85.toByte(), 0x61.toByte(),
        0x20.toByte(), 0x71.toByte(), 0x67.toByte(), 0xA4.toByte(), 0x2D.toByte(), 0x2B.toByte(), 0x09.toByte(), 0x5B.toByte(),
        0xCB.toByte(), 0x9B.toByte(), 0x25.toByte(), 0xD0.toByte(), 0xBE.toByte(), 0xE5.toByte(), 0x6C.toByte(), 0x52.toByte(),
        0x59.toByte(), 0xA6.toByte(), 0x74.toByte(), 0xD2.toByte(), 0xE6.toByte(), 0xF4.toByte(), 0xB4.toByte(), 0xC0.toByte(),
        0xD1.toByte(), 0x66.toByte(), 0xAF.toByte(), 0xC2.toByte(), 0x39.toByte(), 0x4B.toByte(), 0x63.toByte(), 0xB6.toByte()
    )

    // Значения для обратного нелинейного преобразования множества двоичных векторов (обратное преобразование S)
    // This appears to be an array of UInt8 values that represents the reverse of the first few thousand decimal places of Pi.
    private val reversePi: ByteArray = byteArrayOf(
        0xA5.toByte(), 0x2D.toByte(), 0x32.toByte(), 0x8F.toByte(), 0x0E.toByte(), 0x30.toByte(), 0x38.toByte(), 0xC0.toByte(),
        0x54.toByte(), 0xE6.toByte(), 0x9E.toByte(), 0x39.toByte(), 0x55.toByte(), 0x7E.toByte(), 0x52.toByte(), 0x91.toByte(),
        0x64.toByte(), 0x03.toByte(), 0x57.toByte(), 0x5A.toByte(), 0x1C.toByte(), 0x60.toByte(), 0x07.toByte(), 0x18.toByte(),
        0x21.toByte(), 0x72.toByte(), 0xA8.toByte(), 0xD1.toByte(), 0x29.toByte(), 0xC6.toByte(), 0xA4.toByte(), 0x3F.toByte(),
        0xE0.toByte(), 0x27.toByte(), 0x8D.toByte(), 0x0C.toByte(), 0x82.toByte(), 0xEA.toByte(), 0xAE.toByte(), 0xB4.toByte(),
        0x9A.toByte(), 0x63.toByte(), 0x49.toByte(), 0xE5.toByte(), 0x42.toByte(), 0xE4.toByte(), 0x15.toByte(), 0xB7.toByte(),
        0xC8.toByte(), 0x06.toByte(), 0x70.toByte(), 0x9D.toByte(), 0x41.toByte(), 0x75.toByte(), 0x19.toByte(), 0xC9.toByte(),
        0xAA.toByte(), 0xFC.toByte(), 0x4D.toByte(), 0xBF.toByte(), 0x2A.toByte(), 0x73.toByte(), 0x84.toByte(), 0xD5.toByte(),
        0xC3.toByte(), 0xAF.toByte(), 0x2B.toByte(), 0x86.toByte(), 0xA7.toByte(), 0xB1.toByte(), 0xB2.toByte(), 0x5B.toByte(),
        0x46.toByte(), 0xD3.toByte(), 0x9F.toByte(), 0xFD.toByte(), 0xD4.toByte(), 0x0F.toByte(), 0x9C.toByte(), 0x2F.toByte(),
        0x9B.toByte(), 0x43.toByte(), 0xEF.toByte(), 0xD9.toByte(), 0x79.toByte(), 0xB6.toByte(), 0x53.toByte(), 0x7F.toByte(),
        0xC1.toByte(), 0xF0.toByte(), 0x23.toByte(), 0xE7.toByte(), 0x25.toByte(), 0x5E.toByte(), 0xB5.toByte(), 0x1E.toByte(),
        0xA2.toByte(), 0xDF.toByte(), 0xA6.toByte(), 0xFE.toByte(), 0xAC.toByte(), 0x22.toByte(), 0xF9.toByte(), 0xE2.toByte(),
        0x4A.toByte(), 0xBC.toByte(), 0x35.toByte(), 0xCA.toByte(), 0xEE.toByte(), 0x78.toByte(), 0x05.toByte(), 0x6B.toByte(),
        0x51.toByte(), 0xE1.toByte(), 0x59.toByte(), 0xA3.toByte(), 0xF2.toByte(), 0x71.toByte(), 0x56.toByte(), 0x11.toByte(),
        0x6A.toByte(), 0x89.toByte(), 0x94.toByte(), 0x65.toByte(), 0x8C.toByte(), 0xBB.toByte(), 0x77.toByte(), 0x3C.toByte(),
        0x7B.toByte(), 0x28.toByte(), 0xAB.toByte(), 0xD2.toByte(), 0x31.toByte(), 0xDE.toByte(), 0xC4.toByte(), 0x5F.toByte(),
        0xCC.toByte(), 0xCF.toByte(), 0x76.toByte(), 0x2C.toByte(), 0xB8.toByte(), 0xD8.toByte(), 0x2E.toByte(), 0x36.toByte(),
        0xDB.toByte(), 0x69.toByte(), 0xB3.toByte(), 0x14.toByte(), 0x95.toByte(), 0xBE.toByte(), 0x62.toByte(), 0xA1.toByte(),
        0x3B.toByte(), 0x16.toByte(), 0x66.toByte(), 0xE9.toByte(), 0x5C.toByte(), 0x6C.toByte(), 0x6D.toByte(), 0xAD.toByte(),
        0x37.toByte(), 0x61.toByte(), 0x4B.toByte(), 0xB9.toByte(), 0xE3.toByte(), 0xBA.toByte(), 0xF1.toByte(), 0xA0.toByte(),
        0x85.toByte(), 0x83.toByte(), 0xDA.toByte(), 0x47.toByte(), 0xC5.toByte(), 0xB0.toByte(), 0x33.toByte(), 0xFA.toByte(),
        0x96.toByte(), 0x6F.toByte(), 0x6E.toByte(), 0xC2.toByte(), 0xF6.toByte(), 0x50.toByte(), 0xFF.toByte(), 0x5D.toByte(),
        0xA9.toByte(), 0x8E.toByte(), 0x17.toByte(), 0x1B.toByte(), 0x97.toByte(), 0x7D.toByte(), 0xEC.toByte(), 0x58.toByte(),
        0xF7.toByte(), 0x1F.toByte(), 0xFB.toByte(), 0x7C.toByte(), 0x09.toByte(), 0x0D.toByte(), 0x7A.toByte(), 0x67.toByte(),
        0x45.toByte(), 0x87.toByte(), 0xDC.toByte(), 0xE8.toByte(), 0x4F.toByte(), 0x1D.toByte(), 0x4E.toByte(), 0x04.toByte(),
        0xEB.toByte(), 0xF8.toByte(), 0xF3.toByte(), 0x3E.toByte(), 0x3D.toByte(), 0xBD.toByte(), 0x8A.toByte(), 0x88.toByte(),
        0xDD.toByte(), 0xCD.toByte(), 0x0B.toByte(), 0x13.toByte(), 0x98.toByte(), 0x02.toByte(), 0x93.toByte(), 0x80.toByte(),
        0x90.toByte(), 0xD0.toByte(), 0x24.toByte(), 0x34.toByte(), 0xCB.toByte(), 0xED.toByte(), 0xF4.toByte(), 0xCE.toByte(),
        0x99.toByte(), 0x10.toByte(), 0x44.toByte(), 0x40.toByte(), 0x92.toByte(), 0x3A.toByte(), 0x01.toByte(), 0x26.toByte(),
        0x12.toByte(), 0x1A.toByte(), 0x48.toByte(), 0x68.toByte(), 0xF5.toByte(), 0x81.toByte(), 0x8B.toByte(), 0xC7.toByte(),
        0xD6.toByte(), 0x20.toByte(), 0x0A.toByte(), 0x08.toByte(), 0x00.toByte(), 0x4C.toByte(), 0xD7.toByte(), 0x74.toByte()
    )

    // L-вектор для реализации R-преобразования
    private val lVector: List<UByte> = listOf(
        148u, 32u, 133u, 16u, 194u, 192u, 1u, 251u,
        1u, 192u, 194u, 16u, 133u, 32u, 148u, 1u
    )

    // Массив для хранения итерационных констант С (32) 16 байт каждая
    // It creates a two-dimensional array called iterC with 32 rows and 16 columns, where each element is initialized with the minimum value of type UByte.
    private val iterC = Array(32) { Array(16) { Byte.MIN_VALUE } }

    // Массив для хранения ключей шифрования K (10) 64 бита
    // It creates a two-dimensional array called iterK with 10 rows and 64 columns, where each element is initialized with the minimum value of type UByte.
    private val iterK = Array(10) { Array(64) { Byte.MIN_VALUE } }

    /**
     * Функция XOR
     *
     * The function returns an array of UByte values, which is the result of a bitwise XOR operation performed element-wise on the two input arrays.
     *
     * The function initializes an empty array called result with Array(16) { UByte.MIN_VALUE } to store the result of the XOR operation.
     * Then, it uses a for loop to iterate over each element of the input arrays.
     * For each iteration, it computes the XOR of the corresponding elements of the two arrays and stores the result in the corresponding position of the result array.
     *
     * Finally, the result array is returned as the output of the function.
     */
//    fun getXOR(firstVector: Array<UByte>, secondVector: Array<UByte>): Array<UByte> {
//        val result = Array(16) { UByte.MIN_VALUE }
//        for (i in 0 until 16) {
//            result[i] = firstVector[i] xor secondVector[i]
//        }
//        return result
//    }
    private fun getXOR(firstVector: ByteArray, secondVector: ByteArray): ByteArray {
        val result = ByteArray(16) { 0x00 }
        for (i in 0 until 16) {
            result[i] = (firstVector[i].toInt() xor secondVector[i].toInt()).toByte()
        }
        return result
    }

    /**
     * Функция S преобразования (возможен баг)
     *
     * This code is a function in Kotlin that takes an array of 16 Byte values as input, performs a transformation on each element, and returns a new array of 16 Byte values.
     *
     * The function initializes a new array outData of 16 Byte.MIN_VALUE elements.
     *
     * In the for loop, it iterates over the elements of the input array inData with an index i. For each iteration, it performs the following transformation:
     *
     * outData[i] = pi[inData[i].toInt() and 0xff]
     *
     * The pi array is used as a lookup table to map the input value to a new value.
     * The input value is converted from a Byte type to an Int type using toInt() and then bitwise ANDed with 0xff to ensure that the value remains within the range of valid Byte values (-128 to 127).
     * The resulting integer is used as an index into the pi array to retrieve a corresponding value, which is then assigned to the current element of the outData array.
     *
     * Finally, the transformed outData array is returned as the result of the function.
     */
//    fun getS(inData: Array<Byte>): Array<Byte> {
//        val outData = Array(16) { Byte.MIN_VALUE }
//        for (i in 0 until 16) {
//            outData[i] = pi[inData[i].toInt() and 0xff]
//        }
//        return outData
//    }
    private fun getS(inData: ByteArray): ByteArray {
        val outData = ByteArray(16) { Byte.MIN_VALUE }
        for (i in 0 until 16) {
            outData[i] = pi[inData[i].toInt() and 0xff]
        }
        return outData
    }

    /**
     * ФУНКЦИЯ ОБРАТНОГО S ПРЕОБРАЗОВАНИЯ
     *
     * Этот код реализует функцию, которая вычисляет обратное преобразование массива inData с помощью таблицы reversePi.
     * Для каждого индекса i в массиве inData, она вычисляет соответствующее значение в reversePi и добавляет его в выходной массив outData.
     * В конечном итоге функция возвращает массив outData.
     */
//    fun getReverseS(inData: Array<Byte>): Array<Byte> {
//        val outData = Array(16) { Byte.MIN_VALUE }
//        for (i in 0 until 16) {
//            outData[i] = reversePi[inData[i].toInt() and 0xff]
//        }
//        return outData
//    }
    private fun getReverseS(inData: ByteArray): ByteArray {
        val outData = ByteArray(16) { Byte.MIN_VALUE }
        for (i in 0 until 16) {
            outData[i] = reversePi[inData[i].toInt() and 0xff]
        }
        return outData
    }

    /**
     * Этот код выполняет умножение в поле Галуа. Он принимает два значения типа Byte, a и b, и возвращает одно значение типа Byte - результат умножения.
     *
     * Он создает две временные переменные tempA и tempB, которые равны переданным значениям a и b. Затем выполняет цикл, пока обе переменные не равны нулю.
     *
     * Внутри цикла, если первый бит в tempB равен 1, то c выполняет операцию XOR с tempA.
     * Если младший бит в tempA равен 1, то tempA выполняет сдвиг влево и XOR с 0xC3.
     * Если младший бит в tempA равен 0, то tempA просто сдвигается влево. Затем tempB сдвигается вправо.
     *
     * После завершения цикла, функция возвращает значение c, которое является результатом умножения.
     */
    private fun multiplicateGaloisField(a: Byte, b: Byte): Byte {
        var c: Byte = 0
        var tempA = a
        var tempB = b
        while (tempA.toInt() != 0 && tempB.toInt() != 0) {
            if ((tempB.toInt() and 1) != 0) {
                c = (c.toInt() xor tempA.toInt()).toByte()
            }
            if ((tempA.toInt() and 0x80) != 0) {
                tempA = (tempA.toInt() shl 1 xor 0xC3).toByte()
            } else {
                tempA = (tempA.toInt() shl 1).toByte()
            }
            tempB = (tempB.toInt() shr 1).toByte()
        }
        return c
    }

    /**
     * ПРЕОБРАЗОВАНИЕ R (умножение + сдвиг)
     *
     * Этот код осуществляет трансформацию массива байтов.
     * Для этого он создает временный массив интерн (16 байт), в который заносит значения из исходного массива с изменением порядка элементов.
     * Также, в цикле, каждый байт исходного массива складывается с элементом вектора lVector с помощью функции multiplicateGaluaField.
     * Результат этой операции заносится в переменную aZero. В конечном итоге, переменная aZero заносится в первый элемент массива intern.
     *
     * И возвращается массив intern.
     */
    private fun getTransformationR(state: ByteArray): ByteArray {
        var aZero: Byte = 0
        val intern: ByteArray = ByteArray(16) { 0x00 }

        for (i in 0 until 16) {
            if (i == 15) {
                intern[0] = state[i]
            } else {
                intern[i + 1] = state[i] // move bytes towards the least significant digit
            }
            aZero = (aZero.toInt() xor multiplicateGaloisField(state[i], lVector[i].toByte()).toInt()).toByte()
        }

        // write result of addition to last byte
        intern[0] = aZero
        return intern
    }

    /**
     * ПРЕОБРАЗОВАНИЕ L
     *
     * Он принимает входные данные в виде массива байт ByteArray и возвращает результат в виде массива байт ByteArray.
     *
     * Внутри функции создается переменная intern, которая принимает входные данные. Затем в цикле repeat(15) 15 раз вызывается функция getTransformationR с переменной intern в качестве аргумента.
     *
     * В итоге, после 15 вызовов функции getTransformationR, intern является результатом функции getTransformationL, который возвращается.
     *
     * Функция getTransformationR производит некоторые действия с массивом байтов state и возвращает результат в виде массива байтов.
     */
    private fun getTransformationL(inData: ByteArray): ByteArray {
        var intern = inData
        repeat(15) {
            intern = getTransformationR(intern)
        }
        return intern
    }

    private fun getTransformationLForFN(inData: ByteArray): ByteArray {
        val outData = ByteArray(inData.size) { 0x00 }
        var intern = inData
        repeat(16) {
            intern = getTransformationR(intern)
        }
        outData.forEachIndexed { index, _ -> outData[index] = intern[index] }
        return outData
    }

    // ОБРАТНОЕ ПРЕОБРАЗОВАНИЕ R
    private fun getReverseR(state: ByteArray): ByteArray {
        var i = 15
        var aLast: Byte = state[0]
        val intern: ByteArray = ByteArray(16) { 0x00 }
        while (i != 0) {
            intern[i - 1] = state[i]
            aLast = (aLast.toInt() xor multiplicateGaloisField(intern[i - 1], lVector[i - 1].toByte()).toInt()).toByte()
            i--
        }
        intern[15] = aLast
        return intern
    }

    //ОБРАТНОЕ ПРЕОБРАЗОВАНИЕ L
    fun getReverseL(inData: ByteArray): ByteArray {
        val outData = ByteArray(inData.size)
        var intern = inData
        for (i in 0 until 16) {
            intern = getReverseR(intern)
        }
        outData.forEachIndexed { index, _ -> outData[index] = intern[index] }
        return outData
    }

    //ФУНКЦИЯ РАСЧЕТА КОНСТАНТ
    private fun getIterativeConstants() {
        val iterativeNumbers = Array(32) {
            ByteArray(16) { 0.toByte() }
        }

        for (i in 0 until 32) {
            for (j in 0 until 16) {
                iterativeNumbers[i][j] = 0
            }
            iterativeNumbers[i][0] = (i + 1).toByte()
        }

        for (i in 0 until 32) {
            iterC[i] = getTransformationL(inData = iterativeNumbers[i]).toTypedArray()
        }

        println("ИТЕРАЦИОННЫЕ КОНСТАНТЫ____________________________")
        var i = 1
        do {
            for (const in iterC) {
                println("Константа № $i: $const")
                i += 1
            }
        } while (i != 33)
        println("ИТЕРАЦИОННЫЕ КОНСТАНТЫ____________________________\n")
    }
    // Функция, выполняющая преобразования ячейки Фейстеля
    private fun getFeistelNetwork(firstKey: ByteArray, secondKey: ByteArray, iterConst: ByteArray): Array<ByteArray> {
        var inter: ByteArray = ByteArray(0x00)

        inter = getXOR(firstKey, iterConst)
        inter = getS(inter)
        inter = getTransformationLForFN(inter)

        val outKeyOne = getXOR(inter, secondKey)
        return arrayOf(outKeyOne, firstKey)
    }

    // функция расчета раундовых ключей
    fun expandKeys(keyOne: ByteArray, keyTwo: ByteArray) {
        // Инициализация массива iter12, iter34 с двумя элементами, каждый из которых является массивом из 16 байт со значением 0x00
        var iter12 = Array(2) { ByteArray(16) { 0x00.toByte() } } // предыдущая пара ключей
        var iter34 = Array(2) { ByteArray(16) { 0x00.toByte() } } // текущая пара ключей

        getIterativeConstants() //вычисляем итерационные константы

        // Первые два итерационных ключа равны паре мастер ключа
        iter12[0] = keyOne
        iter12[1] = keyTwo

        for (i in 0 until 4) {
            iter34 = getFeistelNetwork(iter12[0], iter12[1], iterC[0 + 8 * i].toByteArray())
            iter12 = getFeistelNetwork(iter34[0], iter34[1], iterC[1 + 8 * i].toByteArray())
            iter34 = getFeistelNetwork(iter12[0], iter12[1], iterC[2 + 8 * i].toByteArray())
            iter12 = getFeistelNetwork(iter12[0], iter12[1], iterC[3 + 8 * i].toByteArray())
            iter34 = getFeistelNetwork(iter12[0], iter12[1], iterC[4 + 8 * i].toByteArray())
            iter12 = getFeistelNetwork(iter34[0], iter34[1], iterC[5 + 8 * i].toByteArray())
            iter34 = getFeistelNetwork(iter12[0], iter12[1], iterC[6 + 8 * i].toByteArray())
            iter12 = getFeistelNetwork(iter34[0], iter34[1], iterC[7 + 8 * i].toByteArray())

            iterK[2 * i + 2] = iter12[0].toTypedArray()
            iterK[2 * i + 3] = iter12[1].toTypedArray()
        }
        println("Iterative keys:")
        for (i in 1..10) {
            println("Key #$i: ${(iterK[i - 1])}")
        }
        println("Iterative keys:")
    }

    // Функция шифрования блока
    public fun kuznechikEncryption(block: ByteArray): ByteArray {
        var outBlk = block

        for (i in 0 until 9) {
            outBlk = getXOR(iterK[i].toByteArray(), outBlk)
            outBlk = getS(outBlk)
            outBlk = getTransformationLForFN(outBlk)
        }

        outBlk = getXOR(outBlk, iterK[9].toByteArray())
        return outBlk
    }

    // Функция расшифрования блока
    public fun kuznechikDencryption(blk: ByteArray): ByteArray {
        var outBlk = blk
        var i = 8
        outBlk = getXOR(outBlk, iterK[9].toByteArray())
        while (i >= 0) {
            outBlk = getReverseL(outBlk)
            outBlk = getReverseS(outBlk)
            outBlk = getXOR(iterK[i].toByteArray(), outBlk)
            i -= 1
        }
        return outBlk
    }

//    fun stringToArray(txt: String): List<String> {
//        var openText = txt
//        var array = mutableListOf<String>()
//        var tempStr = ""
//        var tempChar = ""
//
//        while (openText.isNotEmpty()) {
//            for (i in 1..2) {
//                tempChar = openText[0].toString()
//                openText = openText.substring(1)
//                tempStr += tempChar
//            }
//            array.add(tempStr)
//            tempStr = ""
//        }
//
//        //return array.toTypedArray()
//        return array
//    }

    private fun stringToArray(txt: String): Array<String> {
        var openText = txt
        var array = mutableListOf<String>()

        while (openText.isNotEmpty()) {
            array.add(openText.substring(0, 2))
            openText = openText.substring(2)
        }
        return array.toTypedArray()
    }

    private fun convertArrayToBytes(arr: Array<String>): ByteArray {
        return arr.map{Integer.parseInt(it, 16).toByte()}.toByteArray()
    }

    // Функция подготавливает открытый текск к шифрованию
    public fun stringToBytes(stringToEncryption: String): ByteArray {
        val arrayOfString = stringToArray(stringToEncryption)
        return convertArrayToBytes(arrayOfString)
    }

}