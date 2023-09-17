# Programming design patterns and principles

(Implemented, using Java v17)

## Creational Patterns

### Factory Method:

> The Factory Method pattern is a creational design pattern that provides an interface for creating objects in a
> superclass but allows subclasses to alter the type of objects that will be created. It's a way to delegate the
> responsibility of instantiating objects to subclasses, promoting loose coupling between the client code and the
> concrete classes it uses.

### Abstract Factory

> The Abstract Factory pattern is another creational design pattern, like the Factory Method pattern, but it provides an
> interface for creating families of related or dependent objects without specifying their concrete classes. While both
> patterns deal with object creation, they serve different purposes, and the choice between them depends on your
> specific
> design requirements.

### Singleton

> A Singleton is a design pattern in software engineering that restricts the instantiation of a class to a single
> instance and provides a global point of access to that instance. In other words, it ensures that a class has only one
> instance in the entire application and provides a way to access that instance from any part of the code.

### Builder

> The Builder Pattern is a design pattern used in software engineering for building complex objects step by step. It
> offers several advantages and is particularly useful in situations where you need to create objects with many optional
> parameters or configurations.

### Prototype

> The Prototype Pattern is a design pattern used in software engineering to create new objects by copying an existing
> object, known as the prototype. It provides a way to create new objects with minimal effort and without the need for
> complex initialization logic.

## Structural Patterns

### Adapter

> The Adapter Pattern is a design pattern used in software engineering to allow two incompatible interfaces to work
> together. It acts as a bridge between two interfaces that are not compatible with each other due to differences in
> method signatures, parameter types, or behavior.

### Bridge

> The Bridge Pattern is a structural design pattern used in software engineering to separate an object's abstraction
> from its implementation so that both can vary independently. It achieves this by creating two separate hierarchies of
> classes—one for the abstraction and one for the implementation—linked together by a bridge interface.

### Composite

> The Composite Pattern is a structural design pattern used in software engineering to compose objects into tree-like
> structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of
> objects (composites) uniformly.

### Decorator

> The Decorator Pattern is a structural design pattern used in software engineering to dynamically extend the behavior
> of objects without altering their original class or modifying their code. It involves creating a set of decorator
> classes that are used to wrap concrete components. Decorators add new responsibilities or modify existing ones of
> objects at runtime, allowing for more flexible and reusable code.

### Facade

> The Facade Pattern is a structural design pattern used in software engineering to provide a simplified, unified
> interface to a set of interfaces or a complex subsystem. It acts as a single entry point for a group of related
> functionalities, making it easier for clients to interact with the system.

### Flyweight

> The Flyweight Pattern is a structural design pattern used in software engineering to minimize memory usage and improve
> performance when dealing with a large number of objects that have a significant amount of shared, intrinsic (
> invariant)
> state. It achieves this by sharing common state among multiple objects instead of duplicating it for each instance.

### Proxy

> The Proxy Pattern is a structural design pattern used in software engineering to provide a surrogate or placeholder
> for another object to control access to it. It allows you to add an additional level of control over the interaction
> with the real object.

## Behavioral patterns

### Chain of responsibility

> The Chain of Responsibility Pattern is a behavioral design pattern used in software engineering to create a chain of
> objects that can handle a request or perform an action. It decouples the sender of a request from its receivers and
> allows multiple objects to process the request independently.

### Command

> A Command Interface, often referred to simply as the Command Pattern, is a behavioral design pattern used in software
> engineering to encapsulate a request as an object, thereby allowing for parameterization of clients with queues,
> requests, and operations. It turns a request into a stand-alone object with its own state, which can be passed,
> stored,
> and executed independently.

### Interpreter

> The Interpreter Pattern is a behavioral design pattern used in software engineering to define a grammar for a language
> and provide an interpreter to evaluate or interpret expressions in that language. It allows you to represent sentences
> or expressions in a domain-specific language (DSL) and interpret them step by step.

### Iterator

> The Iterator Pattern is a behavioral design pattern used in software engineering to provide a standardized way to
> traverse and access elements in a collection without exposing the underlying structure of that collection.

### Mediator

> The Mediator Pattern is a behavioral design pattern used in software engineering to promote loose coupling between
> components or objects by centralizing their communication through a mediator or coordinator. It aims to reduce direct
> relationships between components and encourages a more organized and maintainable system.

### Memento

> The Memento Pattern is a behavioral design pattern used in software engineering to capture and externalize an object's
> internal state so that the object can be restored to that state later. It allows you to save and restore an object's
> state without exposing the details of its implementation.

### Observer

> The Observer Pattern is a behavioral design pattern used in software engineering to establish a one-to-many dependency
> relationship between objects so that when one object (the subject or observable) changes state, all its dependents (
> observers) are notified and updated automatically.

### State

> The State Pattern is a behavioral design pattern used in software engineering to represent the state of an object as
> an individual object and to manage state transitions in a clean and organized manner.

### Strategy

> The Strategy Pattern is a behavioral design pattern that allows you to define a family of interchangeable algorithms,
> encapsulate each one as a separate class, and make them interchangeable. It enables clients to choose the appropriate
> algorithm at runtime without altering the client's code.

### Template method

> The Template Method Pattern is a behavioral design pattern used in software engineering to define the skeleton or
> structure of an algorithm in a method but allow subclasses to provide specific implementations of some steps of the
> algorithm. It promotes code reusability and helps enforce a consistent structure for related algorithms while allowing
> customization of certain parts of those algorithms.

### Visitor

> The Visitor Pattern is a behavioral design pattern used in software engineering to represent an operation to be
> performed on the elements of an object structure. It allows you to define a new operation without changing the classes
> of the elements on which it operates. The Visitor Pattern separates the algorithm from the object structure, promoting
> extensibility and maintainability.

# 🇺🇦 Патерни проектування та принципи програмування

(Реалізовано, використовуючи Java v17)

## Патерни створення

### Фабричний метод (Factory Method):

> Паттерн "Фабричний метод" є паттерном створення у дизайні програмного забезпечення, який надає інтерфейс для створення
> об'єктів у суперкласі, але дозволяє підкласам змінювати типи об'єктів, які будуть створені. Це спосіб делегувати
> відповідальність за створення об'єктів підкласам, сприяючи слабкому зв'язку між клієнтським кодом і конкретними
> класами, які він використовує.

### Абстрактна фабрика (Abstract Factory):

> Паттерн "Абстрактна фабрика" є ще одним паттерном створення, подібним до паттерна "Фабричний метод", але він надає
> інтерфейс для створення сімейств пов'язаних або залежних об'єктів без вказівки їх конкретних класів. Хоча обидва
> паттерни займаються створенням об'єктів, вони виконують різні завдання, і вибір між ними залежить від конкретних
> вимог дизайну.

### Одинак (Singleton):

> Одинак - це паттерн проектування в інженерії програмного забезпечення, який обмежує створення об'єкта класу до
> одного екземпляра і надає глобальну точку доступу до цього екземпляра. Іншими словами, цей паттерн забезпечує наявність
> тільки одного екземпляра класу в усьому додатку і надає можливість доступу до цього екземпляра з будь-якої частини
> коду.

### Будівельник (Builder):

> Паттерн "Будівельник" - це паттерн проектування, який використовується в інженерії програмного забезпечення для
> поетапної побудови складних об'єктів. Він пропонує кілька переваг і особливо корисний у випадках, коли вам потрібно
> створити об'єкти з багатьма необов'язковими параметрами або конфігураціями.

### Прототип (Prototype):

> Паттерн "Прототип" - це паттерн проектування, який використовується в інженерії програмного забезпечення для створення
> нових об'єктів шляхом копіювання існуючого об'єкта, відомого як прототип. Він надає можливість створювати нові об'єкти
> з мінімальними зусиллями і без потреби у складній логіці ініціалізації.

## Структурні патерни

### Адаптер (Adapter):

> Паттерн "Адаптер" - це паттерн проектування, який використовується в інженерії програмного забезпечення для забезпечення
> спільної роботи двох несумісних інтерфейсів. Він діє як міст між двома інтерфейсами, які не сумісні між собою через
> різницю у сигнатурі методів, типах параметрів або поведінції.

### Міст (Bridge):

> Паттерн "Міст" - це структурний паттерн проектування, який використовується в інженерії програмного забезпечення для
> відокремлення абстракції об'єкта від його реалізації так, щоб обидва можна було змінювати незалежно один від одного. Для
> досягнення цього створюються дві окремі ієрархії класів - одна для абстракції і одна для реалізації, які пов'язані
> між собою інтерф

ейсом-мостом.

### Композит (Composite):

> Паттерн "Композит" - це структурний паттерн проектування, який використовується в інженерії програмного забезпечення
> для компонування об'єктів в деревоподібні структури для представлення ієрархій типу "частина-ціле". Він дозволяє
> клієнтам обробляти окремі об'єкти і композиції об'єктів (композити) уніфіковано.

### Декоратор (Decorator):

> Паттерн "Декоратор" - це структурний паттерн проектування, який використовується в інженерії програмного забезпечення
> для динамічного розширення поведінки об'єктів без зміни їхнього початкового класу або модифікації їх коду. Він
> передбачає створення набору декораторів, які використовуються для обгортання конкретних компонентів. Декоратори
> додають нові відповідальності або змінюють існуючі у об'єктів під час виконання, що дозволяє отримати більш гнучкий
> і повторно використовуваний код.

### Фасад (Facade):

> Паттерн "Фасад" - це структурний паттерн проектування, який використовується в інженерії програмного забезпечення для
> надання спрощеного, єдиної точки доступу до набору інтерфейсів або складної підсистеми. Він діє як єдиний вхід для
> групи пов'язаних функцій, що спрощує взаємодію клієнтів з системою.

### Легковажливий (Flyweight):

> Паттерн "Легковажливий" - це структурний паттерн проектування, який використовується в інженерії програмного
> забезпечення для мінімізації використання пам'яті і покращення продуктивності при роботі з великою кількістю
> об'єктів, які мають значну кількість спільних, внутрішніх (незмінних) станів. Він досягає цього шляхом спільного
> використання загального стану серед кількох об'єктів замість дублювання його для кожного екземпляра.

### Замісник (Proxy):

> Паттерн "Замісник" - це структурний паттерн проектування, який використовується в інженерії програмного забезпечення,
> щоб надати замісник або плейсхолдер для іншого об'єкта для контролю доступу до нього. Він дозволяє додати додатковий
> рівень управління взаємодією з реальним об'єктом.

## Поведінкові патерни

### Ланцюг відповідальності (Chain of responsibility):

> Паттерн "Ланцюг відповідальності" - це поведінковий паттерн проектування, який використовується в інженерії
> програмного забезпечення для створення ланцюга об'єктів, які можуть обробляти запит або виконувати дію. Він розриває
> зв'язок між відправником запиту і його отримувачами і дозволяє кільком об'єктам обробляти запити незалежно один від
> одного.

### Команда (Command):

> Паттерн "Команда", також відомий як інтерфейс "Команда", - це поведінковий паттерн проектування, який
> використовується в інженерії програмного забезпечення для інкапсуляції запиту як об'єкта, тим самим дозволяючи
> параметризувати клієнтів чергами, запитами та операціями. Він перетворює запит в окремий об'єкт з в

ласним станом, який
> може бути переданий, збережений і виконаний незалежно.

### Інтерпретатор (Interpreter):

> Паттерн "Інтерпретатор" - це поведінковий паттерн проектування, який використовується в інженерії програмного
> забезпечення для визначення граматики мови і надання інтерпретатора для оцінки або інтерпретації виразів в цій мові.
> Він дозволяє представляти речення або вирази в мові, специфічній для області, і інтерпретувати їх крок за кроком.

### Ітератор (Iterator):

> Паттерн "Ітератор" - це поведінковий паттерн проектування, який використовується в інженерії програмного забезпечення,
> для надання стандартизованого способу обходу і доступу до елементів в колекції, не розкриваючи структуру цієї
> колекції.

### Медіатор (Mediator):

> Паттерн "Медіатор" - це поведінковий паттерн проектування, який використовується в інженерії програмного
> забезпечення для підтримки слабкого зв'язку між компонентами або об'єктами за допомогою централізованого посередника
> або координатора. Він спрямований на зменшення прямих відносин між компонентами і сприяє більш організованій і
> підтримуваній системі.

### Запам'ятовувальник (Memento):

> Паттерн "Запам'ятовувальник" - це поведінковий паттерн проектування, який використовується в інженерії програмного
> забезпечення для захоплення і зовнішнього відображення внутрішнього стану об'єкта, щоб пізніше можна було відновити
> об'єкт до цього стану. Він дозволяє зберігати і відновлювати стан об'єкта без розкриття деталей його реалізації.

### Спостерігач (Observer):

> Паттерн "Спостерігач" - це поведінковий паттерн проектування, який використовується в інженерії програмного
> забезпечення для встановлення відношення один-до-багатьох між об'єктами, так що коли один об'єкт (спостережуваний)
> змінює свій стан, всі його залежності (спостерігачі) автоматично повідомляються і оновлюються.

### Стан (State):

> Паттерн "Стан" - це поведінковий паттерн проектування, який використовується в інженерії програмного забезпечення,
> щоб представити стан об'єкта як окремий об'єкт і керувати переходами між станами в чистий і організований спосіб.

### Стратегія (Strategy):

> Паттерн "Стратегія" - це поведінковий паттерн проектування, який дозволяє визначити сімейство обмінюваних алгоритмів,
> інкапсулювати кожен з них в окремому класі і зробити їх взаємозамінними. Він дозволяє клієнтам вибирати
> відповідний алгоритм під час виконання без зміни коду клієнта.

### Шаблонний метод (Template Method):

> Паттерн "Шаблонний метод" - це поведінковий паттерн проектування, який використовується в інженерії програмного
> забезпечення для визначення скелету або структури алгоритму в методі, але дозволяє підкласам надавати конкретні
> реалізації деяких кроків алгоритму. Він сприяє повторному використанню коду і допомагає забезпечити послідовну структуру
> для пов'язаних ал

горитмів, дозволяючи при цьому налаштовувати певні частини цих алгоритмів.

### Відвідувач (Visitor):

> Паттерн "Відвідувач" - це поведінковий паттерн проектування, який використовується в інженерії програмного
> забезпечення для представлення операції, яку слід виконати над елементами структури об'єкта. Він дозволяє
> визначити нову операцію без зміни класів об'єктів, над якими вона виконується. Паттерн "Відвідувач" розділяє
> алгоритм від структури об'єкта, сприяючи розширенню та обслуговуванню коду.