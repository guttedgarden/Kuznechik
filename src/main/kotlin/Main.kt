import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val text = "Hello world! Привет мир!"
    val key = "5464354234qeweqwretrety5643241231231231"
    println("-------------ВХОДНЫЕ ПАРАМЕТРЫ-------------")
    println("Текст: $text")
    println("Мастер ключ: $key")
    val textByte: ByteArray = text.toByteArray();
    print("Текст в байтах: ")
    for (byte in textByte) {
        print(byte)
    }
    val grasshopper: Grasshopper = Grasshopper()
    var encryptByteArray: ByteArray;
    val executionTimeEncrypt = measureTimeMillis {
        encryptByteArray = grasshopper.encrypt(text.toByteArray(), key)
    }
    println("\n\n\n\n-------------ШИФРОВАНИЕ-------------")
    println("Время затраченное на шифрование: $executionTimeEncrypt мс.")
    println("Шифрованный текст: ${String(encryptByteArray)}")
    print("Шифрованный байты: ")
    for (byte in encryptByteArray) {
        print(byte)
    }
    println("\n\n\n\n-------------ДЕШИФРОВАНИЕ-------------")
    var decryptedByteArray: ByteArray;
    val executionTimeDecrypt = measureTimeMillis {
        decryptedByteArray = grasshopper.decrypt(encryptByteArray, key)
    }
    println("Время затраченное на дешифрование: $executionTimeDecrypt мс.")
    println("Дешифрованный текст: ${String(decryptedByteArray)}")
    print("Дешифрованный байты: ")
    for (b in decryptedByteArray) {
        print(b)
    }
}