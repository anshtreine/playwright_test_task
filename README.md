**Подготовительные шаги**
1. Скачиваем java 11.0.2 для [Windows](https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_windows-x64_bin.zip), [MacOS](https://download.java.net/java/GA/jdk10/10.0.2/19aef61b38124481863b1413dce1855f/13/openjdk-10.0.2_osx-x64_bin.tar.gz) или [Linux](https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_linux-x64_bin.tar.gz)
2. Скачиваем IntelliJ IDEA [тут](https://www.jetbrains.com/products/compare/?product=idea&product=idea-ce)
3. Устанавливаем java и IDEA
4. Настроить переменную PATH. [Статья для всех платформ](https://www.java.com/ru/download/help/path.html)
5. Проверить что команда в консоле/терминале "java -version" отрабатывает успешно

**Скачивание и настройка проекта**
1. Открываем IDEA и нажимаем 'Get from VCS'
2. Указываем путь, по которому будет скачиваться проект
3. Указываем URL "https://github.com/anshtreine/playwright_test_task"
4. При первом открытии проекта может быть сообщение **Trust and Open Project?**. В таком случае нажимаем **Trust Project** (такое сообщение для этого проекта больше не появится)
5. В открытом окне IDEA мы нажимаем на "File" -> "Project Structure". В разделе "Project" Устанавливаем нашу 11.0.2 версию java через "Add JDK"(опция появится при клике на выпадающий список SDK)
6. Сохраняем изменения и закрываем настройки


**Настройка запуска тестов**
Настройка локального запуска тестов состоит 

1. 
   
