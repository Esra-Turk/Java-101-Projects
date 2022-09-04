# Maaş Hesaplayıcı

Java'da sınıflar kullanarak	çalışan bilgilerini ekrana yazdıran program

Employee Sınıfının Nitelikleri

- name : Çalışanın adı ve soyadı
- salary : Çalışanın maaşı
- workHours : Haftalık çalışma saati
- hireYear : İşe başlangıç yılı

Employee Sınıfının Metotları

- Employee(name,salary,workHours,hireYear): constructor metot


- tax() : Maaşa uygulanan vergiyi hesaplar.
  
    - Çalışanın maaşı 1000 TL'den az ise vergi uygulanmaz.
  
    - Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanır.


- bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde mesai ücreti hesaplanır.


- raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışı hesaplanır. Şuan ki yıl 2022.
  
    - Çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılır.
 
    - Çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılır.
  
    - Çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılır.


- printWorker() : Çalışana ait bilgileri ekrana bastırır.

**Senaryo**

```
**********Çalışan Bilgileri**********
Adı: Esra Türk
Maaşı: 2348.0
Çalışma saati: 45
Başlangıç yılı: 2010
Vergi Borcu: 70.44
Mesai ücreti:150
Maaş artışı: 234.8
Toplam maaş: 2582.8
Vergisiz ve mesai ücretleriyle Maaşı: 2662.36

```

## Source

[Patika.dev](https://www.patika.dev/tr)