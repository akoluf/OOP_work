## Шаги реализации

##### Определите алгоритм, который подвержен частым изменениям. Также подойдёт алгоритм, имеющий несколько вариаций, которые выбираются во время выполнения программы.

##### Создайте интерфейс стратегий, описывающий этот алгоритм. Он должен быть общим для всех вариантов алгоритма.

##### Поместите вариации алгоритма в собственные классы, которые реализуют этот интерфейс.

##### В классе контекста создайте поле для хранения ссылки на текущий объект-стратегию, а также метод для её изменения. Убедитесь в том, что контекст работает с этим объектом только через общий интерфейс стратегий.

###### Клиенты контекста должны подавать в него соответствующий объект-стратегию, когда хотят, чтобы контекст вёл себя определённым образом.



## Преимущества 
##### Горячая замена алгоритмов на лету.
##### Изолирует код и данные алгоритмов от остальных классов.
##### Уход от наследования к делегированию.
##### Реализует принцип открытости/закрытости.
## Недостатки
##### Усложняет программу за счёт дополнительных классов.
##### Клиент должен знать, в чём состоит разница между стратегиями, чтобы выбрать подходящую.