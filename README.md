🕹️ LearningJavaWithFun Projesi README
 
Bu depo, Java diliyle programlama öğrenme sürecinde geliştirilmiş eğlenceli ve basit konsol tabanlı oyunları içermektedir. Proje, temel Java konularını pekiştirmek ve basit algoritmalar oluşturmayı pratik etmek amacıyla oluşturulmuştur.
 
📁 Proje Yapısı
 
Proje, IntelliJ IDEA ile oluşturulmuş bir Java projesidir. Ana oyunlar src klasörü altında ayrı paketler/klasörler halinde düzenlenmiştir.
Plain Text
LearningJavaWithFun/
├── .idea/
├── out/
├── src/
│   ├── Fizz_Buzz/
│   │   └── Fizz_Buzz_Oyunu.java
│   ├── Sayi_Tahmin_Etme_Oyunu/
│   │   └── Sayi_Tahminleme_Oyunu.java
│   └── Tas_Kagit_Makas_Oyunu/
│       └── Tas_Kagit_Makas_Oyunu.java
├── .gitignore
├── LearningJavaWithFun.iml
└── ...


 
🎮 İçerdiği Oyunlar
 
 
1. ⚡ FizzBuzz Oyunu
 
Paket: Fizz_Buzz
Sınıf: Fizz_Buzz_Oyunu.java
Açıklama: Kullanıcıdan pozitif bir tam sayı alınır. Program 1'den başlayarak girilen sayıya kadar tüm tam sayıları yan yana yazdırır, ancak şu kurallara uyar:
3'e bölünebilen sayılar yerine "fizz" yazdırılır.
5'e bölünebilen sayılar yerine "buzz" yazdırılır.
Hem 3'e hem de 5'e bölünebilen sayılar yerine "fizzBuzz" yazdırılır.
 
2. 🔢 Sayı Tahminleme Oyunu
 
Paket: Sayi_Tahmin_Etme_Oyunu
Sınıf: Sayi_Tahminleme_Oyunu.java
Açıklama: Program, 1 ile 100 arasında rastgele bir sayı üretir. Kullanıcının bu sayıyı tahmin etmesini ister.
Kullanıcı her tahminde kaçıncı denemesinde olduğunu görür.
Doğru tahmin ettiğinde tebrik edilir ve kaçıncı tahminde bildiği söylenir.
Tahmin, doğru sayıya çok yakınsa ( $\pm 5$ aralığında) "Çok yaklaştınız" ipucu verilir.
Diğer yanlış tahminlerde tekrar denemesi istenir.
 
3. ✂️ Taş Kağıt Makas Oyunu
 
Paket: Tas_Kagit_Makas_Oyunu
Sınıf: Tas_Kagit_Makas_Oyunu.java
Açıklama: Kullanıcının bilgisayara karşı oynadığı klasik bir Taş-Kağıt-Makas oyunudur.
Kullanıcı Taş için 1, Kağıt için 2, Makas için 3 girer.
Bilgisayar rastgele seçim yapar.
Oyunun galibi, 5 skora ilk ulaşan kişi olur.
Oyun Kuralları:
Kağıt taşı sarar (Kağıt kazanır).
Taş makası kırar (Taş kazanır).
Makas kağıdı keser (Makas kazanır).
 
🛠️ Nasıl Çalıştırılır?
 
Bu depoyu yerel bilgisayarınıza klonlayın:
Bash
 
Plain Text
git clone https://github.com/KULLANICI_ADINIZ/LearningJavaWithFun.git

Projeyi IntelliJ IDEA gibi bir Java IDE'sinde açın.
Çalıştırmak istediğiniz oyunun (Fizz_Buzz_Oyunu.java, Sayi_Tahminleme_Oyunu.java, veya Tas_Kagit_Makas_Oyunu.java) main metodunu içeren sınıfı bulun.
İlgili sınıfı çalıştırarak oyunu konsol üzerinde oynayabilirsiniz.

---

🕹️ LearningJavaWithFun Project README (English)

This repository contains fun and simple console-based games developed during the process of learning programming with the Java language. The project was created to reinforce fundamental Java concepts and to practice building basic algorithms.

📁 Project Structure

The project is a Java project created using IntelliJ IDEA. The main games are organized under the src directory in separate packages/folders.

LearningJavaWithFun/
├── .idea/
├── out/
├── src/
│   ├── Fizz_Buzz/
│   │   └── Fizz_Buzz_Oyunu.java
│   ├── Sayi_Tahmin_Etme_Oyunu/
│   │   └── Sayi_Tahminleme_Oyunu.java
│   └── Tas_Kagit_Makas_Oyunu/
│       └── Tas_Kagit_Makas_Oyunu.java
├── .gitignore
├── LearningJavaWithFun.iml
└── ...

🎮 Included Games
1. ⚡ FizzBuzz Game

Package: Fizz_Buzz
Class: Fizz_Buzz_Oyunu.java
Description:
The program takes a positive integer from the user. Starting from 1 up to the entered number, it prints all integers side by side while following these rules:
Numbers divisible by 3 are replaced with "fizz".
Numbers divisible by 5 are replaced with "buzz".
Numbers divisible by both 3 and 5 are replaced with "fizzBuzz".

2. 🔢 Number Guessing Game

Package: Sayi_Tahmin_Etme_Oyunu
Class: Sayi_Tahminleme_Oyunu.java
Description:
The program generates a random number between 1 and 100 and asks the user to guess it.

Features include:
The user sees the attempt count for each guess.
When the user guesses correctly, they are congratulated and told how many attempts it took.
If the guess is very close (within ±5), the program gives a hint: "You are very close!"
For other incorrect guesses, the user is asked to try again.

3. ✂️ Rock-Paper-Scissors Game

Package: Tas_Kagit_Makas_Oyunu
Class: Tas_Kagit_Makas_Oyunu.java
Description:
A classic Rock-Paper-Scissors game played against the computer.

User inputs:
1 for Rock
2 for Paper
3 for Scissors

The computer makes a random choice.
The first to reach 5 points wins the game.

Game Rules:

Paper wraps Rock → Paper wins
Rock breaks Scissors → Rock wins
Scissors cut Paper → Scissors win

🛠️ How to Run

Clone this repository to your local machine:

git clone https://github.com/YOUR_USERNAME/LearningJavaWithFun.git


Open the project in a Java IDE such as IntelliJ IDEA.

Locate the class containing the main method for the game you wish to run
(Fizz_Buzz_Oyunu.java, Sayi_Tahminleme_Oyunu.java, or Tas_Kagit_Makas_Oyunu.java).
Run the selected class and play the game via the console.



