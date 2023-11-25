package org.deemoun;

public class Main
{

    public static void main (String[]args)
    {
        // main - главная функция - отсюда вызываем все остальные
        // создаем экземпляр класс Кот
        Cat cat = new Cat ();

        /* После создания экземпляра класса - мы можем вызывать методы из класса Cat
        В этом случае - мы сначала устанавливаем значение 5 и имя (setAge и setName),
        а потом выводим результат используя метод getName() и getAge()
         */

        cat.setAge (5);
        cat.setName ("Alisa");

        /* Здесь наглядный пример вложенных функций. Сначала мы пишем System.out.println
        а потом внутри вкладываем метод чтения данных из переменные, в которые мы записали
        значения (смотри описание в классе Animal)
         */

        // Сначала в классе Cat мы вызываем функции, которые уже ЕСТЬ в базовом классе Animal
        System.out.println (cat.getName ());
        System.out.println (cat.getAge ());

        // А потом мы используем функции, которые мы добавили именно в классе Cat

        cat.setMeow("Meowwww");
        cat.getMeow();
        System.out.println(cat.getMeow());
    }

}