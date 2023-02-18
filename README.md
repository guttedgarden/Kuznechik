# Алгоритм блочного шифрования ГОСТ Р 34.12-2015 «Кузнечик»

Кузнечик - симметричный алгоритм блочного шифрования с размером блока 128 бит и длиной ключа 256 бит,  использующий для генерации раундовых ключей подстановчно-перестановочную сеть (Substitution-Permutation network).
Генерация мастер ключа происходит путем хеширования (SHA-512) исходного ключа и созданием из него копии байтового массива длинной 32 элемента. 

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
```text
-------------ВХОДНЫЕ ПАРАМЕТРЫ-------------
Текст: Hello world! Привет мир!
Мастер ключ: 5464354234qeweqwretrety5643241231231231
Текст в байтах: 72101108108111321191111141081003332-48-97-47-128-48-72-48-78-48-75-47-12632-48-68-48-72-47-12833


-------------ШИФРОВАНИЕ-------------
Время затраченное на шифрование: 63 мс.
Шифрованный текст: ����K��Ҩ�;��5ǕÅ��2�	͟6��8�s�N�|W��[�ш�
Шифрованные байты: -66-111-73-4475-6-73-46-8814-835923-39-4453-57-107-61-12327-95-6050-779-51-9754-71-1008-9456-61115-12878-12212487-82-4091-54-47-120-85


-------------ДЕШИФРОВАНИЕ-------------
Время затраченное на дешифрование: 11 мс.
Дешифрованный текст: Hello world! Привет мир!
Дешифрованные байты: 72101108108111321191111141081003332-48-97-47-128-48-72-48-78-48-75-47-12632-48-68-48-72-47-12833
```