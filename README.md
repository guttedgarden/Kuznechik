# Алгоритм блочного шифрования ГОСТ Р 34.12-2015 «Кузнечик»

Кузнечик - симметричный алгоритм блочного шифрования с размером блока 128 бит и длиной ключа 256 бит, использующий для генерации раундовых.
Генерация мастер ключа происходит путем хеширование (SHA-512) исходного ключа и созданием из него копии байтового массива длинной 32 элемента.
## Использование

### Шифрование ###

```kotlin
val text = "Hello world! Привет мир!";
val key = "riowjewqoije21io3j21312321";

val kuznechik: Kuznechik = Kuznechik();
val encryptByteArray:ByteArray = kuznechik.encrypt(text.toByteArray(), key);
val encryptString:String = String(encryptByteArray);
```

### Дешифрование ###
```kotlin
val text = ...
val key = "riowjewqoije21io3j21312321";

val kuznechik: Kuznechik = Kuznechik();
val decryptByteArray:ByteArray = kuznechik.decrypt(text.toByteArray(), key);
val decryptString:String = String(decryptByteArray);
```

### Результат работы ###
![plot](./src/out.png)