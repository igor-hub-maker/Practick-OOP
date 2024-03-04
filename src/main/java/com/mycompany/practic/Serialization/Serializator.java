package com.mycompany.practic.Serialization;

import java.io.*;
import com.mycompany.practic.calculation.CalculationResult;
/**
 * Клас для демонстрації в діалоговому режимі збереження та відновлення стану об'єкта, використовуючи серіалізацію.
 */
public class Serializator {
    // Метод для серіалізації об'єкта
    public static void serializeResult(String fileName, CalculationResult object) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            object.writeExternal(outputStream);
        }
    }

    // Метод для десеріалізації об'єкта
    public static CalculationResult deserializeResult(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            CalculationResult result = new CalculationResult();
            result.readExternal(inputStream);
            return result;
        }
    }
}

