package collisionMap;

import java.util.HashMap;

public class HashMapCollisionExample {
    public static void main(String[] args) {
        HashMap<Key, String> map = new HashMap<>();

        // Создаем два разных ключа
        Key key1 = new Key("123");
        Key key2 = new Key("321");

        // Добавляем их в HashMap
        map.put(key1, "Value1");
        map.put(key2, "Value2");

        // Выводим значения
        System.out.println("Hashcode key1: " + key1.hashCode());
        System.out.println("Hashcode key2: " + key2.hashCode());

        System.out.println("Value for key1: " + map.get(key1)); // Выводит Value1
        System.out.println("Value for key2: " + map.get(key2)); // Выводит Value2
    }
}

class Key {
    private String value;

    public Key(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        // Умышленно возвращаем одинаковый хэш-код для демонстрации
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Key key = (Key) obj;
        return value.equals(key.value); // Равенство только если строки совпадают
    }

    @Override
    public String toString() {
        return value;
    }
}
