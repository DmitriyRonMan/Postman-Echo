[![Build status](https://ci.appveyor.com/api/projects/status/4ksp0odslpe4j99j?svg=true)](https://ci.appveyor.com/project/DmitriyRonMan/postman-echo)

## Задача №3: Postman Echo ##

**Важно:** эту задачу нужно выполнять в отдельном репозитории.

В этой задаче мы сэмулируем ситуацию, в которой SUT уже запущен, а мы из теста просто обращаемся к нему.

Есть специальный сервис, предназначенный для тестирования HTTP-запросов. Называется он Postman Echo. Никогда не тестируйте автоматизированными средствами веб-сервисы, если у вас нет на это письменного разрешения или если веб-сервисы специально не предназначены для этого.

Мы можем отправлять туда запросы и получать ответы.

С GET-запросами мы немного потренировались, теперь нас будут интересовать POST-запросы, а именно отправка тела запроса:

<code>// Given - When - Then

// Предусловия

given()

.baseUri("https://postman-echo.com")

.body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)

// Выполняемые действия

.when()

.post("/post")

// Проверки

.then()

.statusCode(200)

.body(/* --> ваша проверка здесь <-- */)

;</code>

Что нужно сделать:

1. Создайте новый проект на базе Gradle.
2. Добавьте необходимые зависимости. Если вы не пишите схему, то только REST assured.
3. Напишите тест, взяв сам запрос из кода выше.
4. Изучите ответ и напишите JSONPath-выражение вместо строк <code>/* --> ваша проверка здесь <--*/</code>, которое проверит, что в нужном поле хранятся отправленные вами данные. Обратите внимание, теперь у вас не массив, а объект.