# Boks Maçı

Java'da sınıflar kullanarak boks maçı oyunu

Sınıflar: Fighter ve Ring

Fighter sınıfının nitelikleri:

- name: Boksörün adı

- damage: Boksörün aldığı hasar

- health: Boksörün kalan canı

- weight: Boksörün kilosu

- dodge: Boksörün savurduğu hasar

Fighter sınıfının metotları:

- Fighter(String name, int damage, int health, int weight, double dodge): Constructor metot

- hit(Fighter foe): Boksörler birbirlerine vurur.

- dodge(): Boksörlerin hasarı savurup savuramadığını belirler.


Ring sınıfının nitelikleri:

- f1 : Boksör 1

- f2: Boksör 2

- minWeight: Boksör siklet aralığı

- maxWeight: Boksör siklet aralığı

Ring sınıfının metotları

- Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight): Constructor metot

- run(): Maç başlar

- checkWeight: Boksörlerin sikletlerini karşılaştırır.

- isWin() : Hangi boksörün kazandığını belirler.

- printScore(): Boksörlerin kalan canlarını ekrana yazar.

**Senaryo**

```
======== YENİ ROUND ===========
Şans : 1
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can 	:100
Alex Kalan Can 	:80

======== YENİ ROUND ===========
Şans : 5
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can 	:100
Alex Kalan Can 	:65

======== YENİ ROUND ===========
Şans : 0
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can 	:100
Alex Kalan Can 	:50

======== YENİ ROUND ===========
Şans : 8
------------
Alex => Marc 10 hasar vurdu.
------------
Marc Kalan Can 	:90
Alex Kalan Can 	:50

======== YENİ ROUND ===========
Şans : 7
------------
Alex => Marc 10 hasar vurdu.
------------
Marc Kalan Can 	:80
Alex Kalan Can 	:50

======== YENİ ROUND ===========
Şans : 1
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can 	:80
Alex Kalan Can 	:35

======== YENİ ROUND ===========
Şans : 2
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can 	:80
Alex Kalan Can 	:20

======== YENİ ROUND ===========
Şans : 3
------------
Marc => Alex 15 hasar vurdu.
------------
Marc Kalan Can 	:80
Alex Kalan Can 	:5

======== YENİ ROUND ===========
Şans : 9
------------
Alex => Marc 10 hasar vurdu.
------------
Marc Kalan Can 	:70
Alex Kalan Can 	:5

======== YENİ ROUND ===========
Şans : 2
------------
Marc => Alex 15 hasar vurdu.
Maçı Kazanan : Marc

```

## SOURCE

[Patika.dev](https://www.patika.dev/tr)