## Zad 4 - 1

Przypisanie post inkrementacji jest ciekawe.
samo "i++" prawidłowo dodało by 1 do i, jednak i=i++ wygląda zupełnie inaczej.
- najpierw wykonywane jest przypsanie i=i następnie wydawało by się, że i zostanie powiększone o 1, a jednak nie. Moim zdaniem i zostaje wpisana przez kompilator do "bufora A" w którym jest  rzechowywany wynik. i znowu do "bufora B", dalej wartość bufora B jest wpisywana do A, a potem bufor B jest inkrementowany. Dlatego ta jedynka nam ginie
- kolejna operacja inkrementacja, a potem przypisanie.
- Inkrementacja jest wykonywana względem dodawania. ładujemy jedno i do bufora A, drugie i ładujemy do B i inkrementujemy. następnie wykonujemy dodawanie i post inkrementacje na sumie.