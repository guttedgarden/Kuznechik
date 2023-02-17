import Kuznechik.Kuznechik
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val text = "Hello world! Путь праведника труден, ибо препятствуют ему себялюбивые и тираны из злых людей. Блажен тот пастырь, кто во имя милосердия и доброты ведёт слабых за собой сквозь долину тьмы. Ибо именно он и есть тот самый, кто воистину печётся о ближних своих и возвращает детей заблудших. И совершу над ними великое мщение наказаниями яростными, над теми, кто замыслит отравить и повредить братьям моим. И узнаешь ты, что имя моё Господь, когда мщение моё падёт на тебя."
    val key = "5464354234qeweqwretrety5643241231231231"
    println("-------------ВХОДНЫЕ ПАРАМЕТРЫ-------------")
    println("Текст: $text")
    println("Мастер ключ: $key")
    val textByte: ByteArray = text.toByteArray();
    print("Текст в байтах: ")
    for (byte in textByte) {
        print(byte)
    }
    val kuznechik: Kuznechik = Kuznechik()
    var encryptByteArray: ByteArray;
    val executionTimeEncrypt = measureTimeMillis {
        encryptByteArray = kuznechik.encrypt(text.toByteArray(), key)
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
        decryptedByteArray = kuznechik.decrypt(encryptByteArray, key)
    }
    println("Время затраченное на дешифрование: $executionTimeDecrypt мс.")
    println("Дешифрованный текст: ${String(decryptedByteArray)}")
    print("Дешифрованный байты: ")
    for (b in decryptedByteArray) {
        print(b)
    }
}