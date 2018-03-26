Загальний опис
 Розробити web-аплікацію  для зберігання та обробки інформації про пацієнтів та медичні записи(коментарі) про пацієнтів. 
 Програма повинна  включати наступні можливості:
        Додавання пацієнта
        Редагування даних про пацієнта
        Перегляд всіх пацієнтів.
        Пошук пацієнта.
        Перегляд даних пацієнта.
        Додавання, редагування медичних записів (коментарів)   пацієнта.
        
        
  Технічні вимоги
      Результат роботи потрібно  задеплоїти на хостингу (до прикладу heroku) 
      Код програми зберігати за допомогою системи контролю версій Git  і також має  бути доступ до коду для перегляду в інтернеті, 
      наприклад на сайті GitHub чи BitBucket.
      Код має відповідати загальним нормам написання коду Code convention відповідно до мови і технології. 
	    https://github.com/mgechev/angularjs-style-guide/blob/master/README-ru-ru.md
      https://developer.mozilla.org/ru/docs/Mozilla/Developer_guide/Coding_Style
      
      
Вимоги до технологій 
Front end частину реалізувати на Angular 1,5 (або 5).
Beck end частина - на javascript ( nodejs ) чи на java (Spring boot)




      Коли відкривається сторінка сайту, зліва відображається список існуючих пацієнтів, поле для фільтрування (пошуку) 
          пацієнтів та кнопка додавання пацієнтів.
      Автоматично при завантаженні сторінки вибирається перший пацієнт і його інформація відображається справа.
      При виборі іншого пацієнта у правій панелі відображається його інформація.
      При натисканні  на кнопку Edit права панелька змінюється  на панельку редагування пацієнта.  
      Після закінчення редагування відкриваєтесь знову панелька відображення пацієнта.
      На панельці перегляду даних про пацієнта є сіра панель на які відображаються коментарі про пацієнта. 
      Знизу є поле для введення нових коментарів, та кнопка + для збереження їх.
      При натисканні на кнопку delete пацієнт видаляється з списку.
      При натисканні на Cancel  редагування чи додавання нового пацієнта.
