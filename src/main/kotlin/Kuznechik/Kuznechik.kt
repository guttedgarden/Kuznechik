package Kuznechik

import java.security.MessageDigest

class Kuznechik {

    // Массив для хранения итерационных констант
    private val iterC = arrayOfNulls<ByteArray>(32)

    // Массив для хранения ключей
    private val iterK = arrayOfNulls<ByteArray>(10)

    // Таблица прямого нелинейного преобразования
    private val pi = intArrayToByteArray(
        intArrayOf(
            252, 238, 221, 17, 207, 110, 49, 22, 251, 196, 250, 218, 35, 197, 4, 77,
            233, 119, 240, 219, 147, 46, 153, 186, 23, 54, 241, 187, 20, 205, 95, 193,
            249, 24, 101, 90, 226, 92, 239, 33, 129, 28, 60, 66, 139, 1, 142, 79,
            5, 132, 2, 174, 227, 106, 143, 160, 6, 11, 237, 152, 127, 212, 211, 31,
            235, 52, 44, 81, 234, 200, 72, 171, 242, 42, 104, 162, 253, 58, 206, 204,
            181, 112, 14, 86, 8, 12, 118, 18, 191, 114, 19, 71, 156, 183, 93, 135,
            21, 161, 150, 41, 16, 123, 154, 199, 243, 145, 120, 111, 157, 158, 178, 177,
            50, 117, 25, 61, 255, 53, 138, 126, 109, 84, 198, 128, 195, 189, 13, 87,
            223, 245, 36, 169, 62, 168, 67, 201, 215, 121, 214, 246, 124, 34, 185, 3,
            224, 15, 236, 222, 122, 148, 176, 188, 220, 232, 40, 80, 78, 51, 10, 74,
            167, 151, 96, 115, 30, 0, 98, 68, 26, 184, 56, 130, 100, 159, 38, 65,
            173, 69, 70, 146, 39, 94, 85, 47, 140, 163, 165, 125, 105, 213, 149, 59,
            7, 88, 179, 64, 134, 172, 29, 247, 48, 55, 107, 228, 136, 217, 231, 137,
            225, 27, 131, 73, 76, 63, 248, 254, 141, 83, 170, 144, 202, 216, 133, 97,
            32, 113, 103, 164, 45, 43, 9, 91, 203, 155, 37, 208, 190, 229, 108, 82,
            89, 166, 116, 210, 230, 244, 180, 192, 209, 102, 175, 194, 57, 75, 99, 182
        )
    )

    // Таблица обратного нелинейного преобразования
    private val reversePi = intArrayToByteArray(
        intArrayOf(
            165, 45, 50, 143, 14, 48, 56, 192, 84, 230, 158, 57, 85, 126, 82, 145,
            100, 3, 87, 90, 28, 96, 7, 24, 33, 114, 168, 209, 41, 198, 164, 63,
            224, 39, 141, 12, 130, 234, 174, 180, 154, 99, 73, 229, 66, 228, 21, 183,
            200, 6, 112, 157, 65, 117, 25, 201, 170, 252, 77, 191, 42, 115, 132, 213,
            195, 175, 43, 134, 167, 177, 178, 91, 70, 211, 159, 253, 212, 15, 156, 47,
            155, 67, 239, 217, 121, 182, 83, 127, 193, 240, 35, 231, 37, 94, 181, 30,
            162, 223, 166, 254, 172, 34, 249, 226, 74, 188, 53, 202, 238, 120, 5, 107,
            81, 225, 89, 163, 242, 113, 86, 17, 106, 137, 148, 101, 140, 187, 119, 60,
            123, 40, 171, 210, 49, 222, 196, 95, 204, 207, 118, 44, 184, 216, 46, 54,
            219, 105, 179, 20, 149, 190, 98, 161, 59, 22, 102, 233, 92, 108, 109, 173,
            55, 97, 75, 185, 227, 186, 241, 160, 133, 131, 218, 71, 197, 176, 51, 250,
            150, 111, 110, 194, 246, 80, 255, 93, 169, 142, 23, 27, 151, 125, 236, 88,
            247, 31, 251, 124, 9, 13, 122, 103, 69, 135, 220, 232, 79, 29, 78, 4,
            235, 248, 243, 62, 61, 189, 138, 136, 221, 205, 11, 19, 152, 2, 147, 128,
            144, 208, 36, 52, 203, 237, 244, 206, 153, 16, 68, 64, 146, 58, 1, 38,
            18, 26, 72, 104, 245, 129, 139, 199, 214, 32, 10, 8, 0, 76, 215, 116
        )
    )

    // Вектор линейного преобразования
    private val lVector = intArrayToByteArray(
        intArrayOf(148, 32, 133, 16, 194, 192, 1, 251, 1, 192, 194, 16, 133, 32, 148, 1)
    )


    private fun sha512(input: ByteArray): ByteArray {
        val md = MessageDigest.getInstance("SHA-512")
        return md.digest(input).copyOf(32);
    }

    /**
     * Функция преобразует входную строку str в хэш-код длины 32 байта.
     *
     * @param str Входная строка, которую нужно преобразовать в хэш-код.
     * @return Возвращает хэш-код в виде строки, содержащей 64 символа, каждый из которых представляет один байт хэша в шестнадцатеричном виде.
     */
    private fun lengthTo32Bytes(str: String): String {
        var res: ByteArray = sha512(str.toByteArray())

        // Вычисление хэш-значения с использованием итерации
        repeat(50) {
            res = sha512(res)
        }

        // Преобразование массива байтов хэш-значения в строку в шестнадцатеричном формате
        return res.joinToString("") { byte -> "%02x".format(byte) }
    }

    // Операция XOR между двумя байтовыми массивами
    private fun xor(firstVec: ByteArray?, secondVec: ByteArray?): ByteArray {
        val output = ByteArray(16)
        firstVec?.forEachIndexed { index, byte ->
            output[index] =((byte.toInt() xor secondVec?.get(index)?.toInt()!!)).toByte()
        }
        return output
    }

    // Преобразования ячейки Фейстеля
    private fun feistelNetwork(firstKey: ByteArray, secondKey: ByteArray, iterConst: ByteArray?): Array<ByteArray> {
        var state: ByteArray? = ByteArray(16)
        state = xor(firstKey, iterConst)
        state = sBoxSubstitution(state)
        state = lTransformation(state)
        return arrayOf(xor(state, secondKey), firstKey.copyOf(firstKey.size))
    }

    // Расчет раундовых ключей
    private fun expandKeys(key: ByteArray) {
        val iterNum = arrayOfNulls<ByteArray>(32)
        for (i in 0..31) {
            iterNum[i] = byteArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (i + 1).toByte())
            iterC[i] = lTransformation(iterNum[i])
        }
        var a = ByteArray(16)
        for (i in 0..15) {
            a[i] = key[i]
        }
        var b = ByteArray(16)

        for ((j, i) in (16..31).withIndex()) {
            b[j] = key[i]
        }

        // Первые два итерационных ключа равны паре мастер-ключа
        iterK[0] = b;
        iterK[1] = a;
        var tmp: Array<ByteArray>;
        for (i in 0..3) {
            for (j in 0..7) {
                tmp = feistelNetwork(a, b, iterC[j + 8 * i])
                a = tmp[1]
                b = tmp[0]
            }
            iterK[2 * i + 2] = a
            iterK[2 * i + 3] = b
        }
    }

    // Операция замены байтов путем применения нелинейной биективного преобразования (преобразование S)
    private fun sBoxSubstitution(input: ByteArray): ByteArray {
        val output = ByteArray(16);
        for (i in 0 until 16) {
            val t = input[i].toInt() and 0xff;
            output[i] = pi[t];
        }
        return output;
    }

    // Обратная операция замены байтов путем применения нелинейной биективного преобразования (преобразование S)
    private fun sBoxSubstitutionReverse(input: ByteArray): ByteArray {
        val output = ByteArray(16);
        for (i in 0 until 16) {
            val t = input[i].toInt() and 0xff;
            output[i] = reversePi[t];
        }
        return output;
    }

    /**
     * Умножение двух байтовых чисел в конечном поле Галуа GF(2^8)
     *
     * В теле функции происходит итерационный процесс, в котором переменные a и b сдвигаются на один бит в каждой итерации,
     * а переменная p вычисляется как XOR от самой себя и переменной a, если младший бит переменной b равен единице.
     * Также происходит проверка старшего бита переменной a, и если он установлен, то переменная a XOR-ится с константой 0xc3.
     * Итерации продолжаются до тех пор, пока не будут рассмотрены все 8 битов переменной b.
     */
    private fun multiplicateGaloisField(a: Byte, b: Byte): Byte {
        var a = a
        var b = b
        var p: Byte = 0
        var hiBitSet: Byte
        var counter: Byte = 0
        while (counter < 8 && a.toInt() != 0 && b.toInt() != 0) {
            if (b.toInt() and 1 != 0) {
                p = (p.toInt() xor a.toInt()).toByte()
            }
            hiBitSet = (a.toInt() and 0x80).toByte()
            a = (a.toInt() shl 1).toByte()
            if (hiBitSet.toInt() != 0) {
                a = (a.toInt() xor 0xc3).toByte()
            }
            b = (b.toInt() shr 1).toByte()
            counter++
        }
        return p
    }

    // Преобразование R (умножение + сдвиг).
    private fun rTransformation(input: ByteArray?): ByteArray {
        var aZero: Byte = 0
        val state = ByteArray(16)
        for (i in 0..15) {
            aZero = (aZero.toInt() xor multiplicateGaloisField(input!![i], lVector[i]).toInt()).toByte()
        }
        for (i in 15 downTo 1) {
            state[i] = input!![i - 1]
        }
        state[0] = aZero
        return state
    }

    // Обратное преобразование R
    private fun rTransformationReverse(input: ByteArray): ByteArray {
        var aLast = input[0]
        val state = ByteArray(16)
        for (i in 0..14) {
            state[i] = input[i + 1]
        }
        for (i in 15 downTo 0) {
            aLast = (aLast.toInt() xor multiplicateGaloisField(state[i], lVector[i]).toInt()).toByte()
        }
        state[15] = aLast
        return state
    }
    
    // Линейное преобразование (преобразование L)
    private fun lTransformation(input: ByteArray?): ByteArray? {
        var state = input
        repeat(16) {
            state = rTransformation(state)
        }
        return state
    }

    // Обратное линейное преобразование (преобразование L)
    private fun lTransformationReverse(input: ByteArray): ByteArray {
        var state = input
        repeat(16) {
            state = rTransformationReverse(state)
        }
        return state
    }

    public fun encrypt(data: ByteArray, masterKey: String): ByteArray {
        expandKeys(lengthTo32Bytes(masterKey).toByteArray())
        val numOfBlocks: Int
        val numberOfNull: Int
        var originText = data
        var encryptedText = ByteArray(0)
        if (data.size % 16 == 0) {
            numOfBlocks = data.size / 16
            encryptedText = encryptedText.copyOf(data.size)
        } else {
            numOfBlocks = data.size / 16 + 1
            numberOfNull = numOfBlocks * 16 - data.size
            originText = originText.copyOf(originText.size + numberOfNull)
            encryptedText = encryptedText.copyOf(originText.size)
            if (numberOfNull == 1) {
                originText[originText.size - 1] = 0x80.toByte()
            } else {
                for (i in originText.indices.reversed()) {
                    if (i == originText.size - 1) {
                        originText[originText.size - 1] = ((-127).toByte())
                    } else if (originText[i].toInt() != 0) {
                        originText[i + 1] = 0x01
                        break
                    }
                }
            }
        }
        for (i in 0 until numOfBlocks) {
            var block: ByteArray? = ByteArray(16)
            for (j in 0..15) {
                block!![j] = originText[i * 16 + j]
            }
            for (j in 0..8) {
                block = xor(block, iterK[j])
                block = sBoxSubstitution(block)
                block = lTransformation(block)
            }
            block = xor(block, iterK[9])
            for (j in 0..15) {
                encryptedText[i * 16 + j] = block[j]
            }
        }
        return encryptedText
    }

    public fun decrypt(data: ByteArray, masterKey: String): ByteArray {
        expandKeys(lengthTo32Bytes(masterKey).toByteArray())
        val numOfBlocks = data.size / 16
        var decrText = ByteArray(data.size)
        for (i in 0 until numOfBlocks) {
            var block = ByteArray(16)
            for (j in 0..15) {
                block[j] = data[i * 16 + j]
            }
            block = xor(block, iterK[9])
            for (j in 8 downTo 0) {
                block = lTransformationReverse(block)
                block = sBoxSubstitutionReverse(block)
                block = xor(block, iterK[j])
            }
            for (j in 0..15) {
                decrText[i * 16 + j] = block[j]
            }
            if (i == numOfBlocks - 1 && (decrText[decrText.size - 1].toInt().toByte() == (-127).toByte() || decrText[decrText.size - 1].toInt() == 0x80)) {
                if (decrText[decrText.size - 1].toInt().toByte() == (-127).toByte()) {
                    var zero = 0
                    for (j in decrText.size - 1 downTo 1) {
                        if (decrText[j].toInt().toByte() == (-127).toByte() || decrText[j].toInt() == 0x01 || decrText[j].toInt() == 0) {
                            zero++
                        } else {
                            break
                        }
                    }
                    decrText = decrText.copyOf(decrText.size - zero)
                }
                if (decrText[decrText.size - 1].toInt() == 0x80) {
                    decrText = decrText.copyOf(decrText.size - 1)
                }
            }
        }
        return decrText
    }

    companion object {
        fun intArrayToByteArray(res: IntArray): ByteArray {
            return res.map { it.toByte() }.toByteArray()
        }
    }
}