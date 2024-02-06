package com.fall23.demoqa;

public class ImplicitWait {

   /* Selenium waiting methods
    Implicit Wait
    Implicit Wait, или неявное ожидание, — пожалуй, самый популярный способ ожидания в Selenium благодаря своей легкости в использовании.

    Чтобы использовать Implicit Wait в автотестестах, достаточно:

    установить его всего 1 раз,
    указать вручную лимит ожидания.
    После того, как команда исполнится, Implicit Wait будет действовать на протяжении всего пробега автотестов и ожидать указанное время прежде, чем выбросить NoSuchElementException (или не выбрасывать, если необходимый элемент на странице найден). Не устанавливать Implicit Wait равносильно нулевому лимиту времени, и исключение пробросится сразу.

    Чтобы установить Implicit Wait, необходимо написать всего одну строку после установки драйвера, и таким образом мы установим лимит ожидания 10 секунд:
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/

}
