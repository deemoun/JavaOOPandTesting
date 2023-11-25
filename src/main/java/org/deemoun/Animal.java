package org.deemoun;

public class Animal {

    /* Первым делом в нашем классе мы описываем переменные, где будем хранить значения наших данных
    Слово private означает, что переменную можно прочитать ТОЛЬКО в данном классе
    Таким образом работает ИНКАПСУЛЯЦИЯ - скрытие переменной в пределах только конкретного класса
     */
    private String name;
    private int age;

    // Здесь идет конструктор класса, в данном случае он пустой
    public Animal() {
    }

    /* Здесь мы создаем геттеры и сеттеры (getters and setters)
     В программирование это обычно означает пары методов для чтения и записи в переменную
     Переменная у нас указана в самом вверху.
     Итак, getName() и setName()
     а потом getAge() и setAge()
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
