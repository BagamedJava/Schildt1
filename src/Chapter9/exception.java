package Chapter9;

public class exception {
/*




Исключение = ошибка, которая возникает в процессе выполнения программы
Преимущество обработки исключений - автоматическая реакция на многие ошибки, избавляет от необходимости
писать вручную соответствующий код.

Все исключения представлены отдельными классами. Все классы являются потомками класса Throwable
Есть два подкласса:

1. Exception
Ошибки, которые связаны с работой программы. Относятся ошибки: деления на нуль, выхода за пределы массива и
обращения к файлам. Эти ошибки следует обрабатывать в самой программе.
Важный подкласс - RuntimeException - служит для представления различных видов ошибок, часто возникающих во время
выполнения программы


2. Error
Относится к ошибкам, которые возникают в JVM(виртуальная машина Java), а не в прикладной программе.


Есть пять ключевых слов:
1. try
- Инструкции, в которых требуется отследить исключение, заключаются в блок try.

2. catch
try и catch используются вместе.
В этом блоке обрабатываются исключения

3. throw
- Чтобы сгенерировать исключение вручную, следует воспользоваться инструкцией throw

4. throws
- Если возникает потребность обработать исключение за пределами метода, в котором они возникают, в этом случае их
нужно указывать с помощью ключевого слова throws

5. finally
- Код, который в любом случае должен быть выполнен после выхода из блока try, помещается в блок finally

Эти ключевые слова создают подсистему, в которой использование 1го ключ.слова почти всегда автоматически влечет
за собой использование другого


try {
// блок кода, в котором должны отслеживаться ошибки
}
catch (тип_исключения_1 объект_исключения) {
// обработчик исключения тип_исключения_1
}
catch (тип_исключения_2 объект_исключения){
// обработчик исключения тип_исключения_2
}

С одни блоком try может быть связано несколько инструкций catch




359 страница










































































 */
}
