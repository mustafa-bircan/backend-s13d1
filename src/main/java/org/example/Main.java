package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // **shouldWakeUp Metodu**
    // Köpek havlıyorsa ve gece saatlerinde havlıyorsa true döner, aksi halde false.
    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false; // Geçersiz saat
        }
        return isBarking && (clock < 8 || clock >= 20); // Gece havlıyorsa uyanmalıyız
    }

    // **hasTeen Metodu**
    // 3 yaştan herhangi biri 13-19 arasındaysa true döner, değilse false.
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    // **isCatPlaying Metodu**
    // Kedinin oyun oynadığı sıcaklık aralığını kontrol eder.
    // Yazın üst limit 45, diğer mevsimlerde 35'tir.
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int upperLimit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= upperLimit;
    }

    // **area (Dikdörtgen Alan Hesaplama) Metodu**
    // Genişlik ve yükseklik negatifse -1 döner, aksi halde alan hesaplar.
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1; // Geçersiz değer
        }
        return width * height;
    }

    // **area (Daire Alan Hesaplama) Metodu**
    // Yarıçap negatifse -1 döner, aksi halde dairenin alanını hesaplar.
    public static double area(double radius) {
        if (radius < 0) {
            return -1; // Geçersiz değer
        }
        return radius * radius * Math.PI;
    }
}
