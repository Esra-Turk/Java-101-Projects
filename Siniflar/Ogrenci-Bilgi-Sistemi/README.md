# Java sınıflar ile Öğrenci Not Sistemi

Öğrenci bilgi sisteminde öğrencilerin ve 3 derslerinin notları, sözlü notları, genel ortalamaları, ders bazında ortalamaları, öğrencilerin kimlik bilgileri; dersin öğretmenlerinin isim, numara ve branş bilgileri yer almaktadır. Öğrenci, öğretmen ve dersler için 3 farklı class oluşturularak çözülmüştür.

Course Sınıfı Özellikleri :

- Nitelikler : name,code,prefix,note,finalGrade,courseTeacher

- Metotlar : Course() , addTeacher() , printTeacher()

Teacher Sınıfı Özellikleri :

- Nitelikler : name,phoneNumber,branch

- Metotlar : Teacher()

Student Sınıfı Özellikleri :

- Nitelikler : name,stuNo,classes,c1,c2,c3,avarage,isPass,avarage1,avarage2,avarage3

- Metotlar : Student(), addBulkExamNote(), addFinalGradeNote(), isPass(), calcAvarage(), printNote()

**Program Çıktısı**

```
Fazıl Öz sınıfı başarılı bir şekilde geçmiştir
Matematik notu: 45	Matematik sözlü notu: 85
Tarih notu: 78		Tarih sözlü notu: 90
Fizik notu: 98		Fizik sözlü notu: 70
Tüm Derslerin Ortalaması: 75.26667
*************************************************
Esra Türk sınıfta kalmıştır
Matematik notu: 20	Matematik sözlü notu: 50
Tarih notu: 30		Tarih sözlü notu: 50
Fizik notu: 50		Fizik sözlü notu: 55
Tüm Derslerin Ortalaması: 37.0
*************************************************
Elif Kızılkaya sınıfı başarılı bir şekilde geçmiştir
Matematik notu: 90	Matematik sözlü notu: 100
Tarih notu: 50		Tarih sözlü notu: 55
Fizik notu: 78		Fizik sözlü notu: 85
Tüm Derslerin Ortalaması: 74.13333

```

## Source

[Patika.dev](https://www.patika.dev/tr)