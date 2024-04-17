package com.jsonStub.Model;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {
    private static final Faker faker = new Faker();
    public static ResponseDTO generateRandomResponse(int count) {
        List<PersonData> dataList = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            // Генерируем случайные имя и фамилию с использованием библиотеки Faker
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            String id = UUID.randomUUID().toString();

            // Создаем объект PersonData и добавляем его в список
            dataList.add(new PersonData(lastName, firstName, id));
        }
        // Создаем ResponseDTO с данными списка
        return new ResponseDTO(dataList);
    }
}