package org.deemoun;

/* Класс КОТ наследуется от класса Animal
   Это значит, что все методы из класса Animal - доступны нам
 */
public class Cat extends Animal {
    /* В классе Cat - метод getMeow и setMeow ДОПОЛНЯЮТ функции из класса Animal
     Таким образом - мы добавляем новый функционал в наш класс
     */
    private String meow;

    // Здесь снова используются геттеры и сеттеры, как и в классе Animal
    public String getMeow() {
        return "Cat meow is: " + meow;
    }

    public void setMeow(String name) {
        this.meow = name;
    }

}
