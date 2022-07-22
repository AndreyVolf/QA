package SimpleTests;

import org.junit.Test;

import java.util.Scanner;

public class MainNas {
    public static  void main(String[] args)
    {

        System.out.println(" Система расчета стоимости топлива");
        //System.out.println(LocalDateTime.now());
        Scanner sc = new Scanner(System.in);
        int fuelType = sc.nextInt();
        int amount = sc.nextInt();

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double fuelprice = 0;
          if (fuelType == 92) {
            fuelprice = fuel92price;
        }
         else if (fuelType == 95)
         {
             fuelprice = fuel95price;
            }else{

                System.out.println("указан неверный тип топлива");
            }
            if (amount < 1) {
                System.out.println("Указано слишком малое количество топлива");
                amount = 0;
            }
            System.out.println("Цена выбранного топлива: " + fuelprice + " руб.");

            double totalPrice = fuelprice * amount;
            System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");


        }
    }



