package ru.vsu.shegoleva;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ServiceRequest> requests = new ArrayList<>();

        while (true) {
            System.out.println("Выберите тип заявки:");
            System.out.println("1. Заявка на ремонт автомобиля");
            System.out.println("2. Заявка на обслуживание техники");
            System.out.println("3. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                // Ввод данных для заявки на ремонт автомобиля
                System.out.print("Введите ID заявки: ");
                int requestId = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                System.out.print("Введите имя клиента: ");
                String clientName = scanner.nextLine();
                System.out.print("Введите телефон клиента: ");
                String clientPhone = scanner.nextLine();
                IndividualClient client = new IndividualClient(clientName, clientPhone);

                System.out.print("Введите марку автомобиля: ");
                String carMake = scanner.nextLine();

                System.out.print("Введите год выпуска автомобиля: ");
                int carYear = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Введите количество мест в автомобиле: ");
                int numberOfSeats = scanner.nextInt();
                scanner.nextLine();

                PassengerCar car = new PassengerCar(carMake, carYear, numberOfSeats);

                System.out.print("Введите описание проблемы: ");
                String description = scanner.nextLine();

                RepairRequest repairRequest = new RepairRequest(requestId, client, car, description);
                requests.add(repairRequest);
            } else if (choice == 2) {
                // Ввод данных для заявки на обслуживание техники
                System.out.print("Введите ID заявки: ");
                int requestId = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Введите тип оборудования: ");
                String equipmentType = scanner.nextLine();

                System.out.print("Введите описание проблемы: ");
                String description = scanner.nextLine();

                MaintenanceRequest maintenanceRequest = new MaintenanceRequest(requestId, equipmentType, description);
                requests.add(maintenanceRequest);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Неверный выбор.");
            }
        }

        // Вывод информации о заявках
        System.out.println("\nСписок заявок:");
        for (ServiceRequest request : requests) {
            System.out.println(request);
        }

        scanner.close();
    }
}
