# Tugas-PBO-Pertemuan-Ketiga
 Penerapan Abstrak Class, Overload  serta Override dan Implementasi pada Pemrograman Berorientasi  Obyek
# Abstrak Class
 Abstract class adalah jenis kelas dalam Java yang tidak bisa dibuat objeknya 
secara langsung. Di dalamnya biasanya terdapat satu atau lebih abstract method 
yaitu method yang hanya ditulis deklarasinya tanpa isi. Meski begitu, abstract class 
juga bisa memiliki atribut dan method yang sudah lengkap implementasinya.
# Perbedaan Abstrak Class dan Interface 
 Interface digunakan untuk menetapkan aturan atau perilaku yang harus dimiliki 
oleh kelas yang mengikutinya.Satu kelas bisa mengikuti banyak interface sekaligus, 
karena interface hanya berisi implementasi method tanpa isi. Ini berbeda dengan 
abstract class, di mana satu kelas hanya bisa mewarisi satu abstract class saja.
# Langkah-langkah Pembuatan Project dengan Abstrack Class dan Interface
1.	Langkah Awal membuat package yang didalamnya ada 3 Class Abstract 3 interface kemudian konkret class (MobilAmfibi) yang dipanggil dalam kelas (Main).
2.	Membuat Superclass Abstract (Transportasi), buat atribut sesuai kebutuhan dan constructor kan untuk menginisialisasi atribut, dan buat juga method abstract.
3. membuat Abstract Class KendaraanDarat yang extends dengan superclass abstract (Transportasi), ditambah method abstrak.
4. membuat Abstract Class KendaraanMesin yang extends dengan class abstract (KendaraanDarat), ditambah method abstrak.
5. membuat 3 Interface dengan masing-masing 1 method.
6. membuat konkret class (MobilAmfibi) dan implementasi semua method, baik dari class abstract dan interface.
7. membuat Main class
8. hasil Output
# Overload 
 Overload terjadi saat sebuah kelas punya beberapa metode dengan nama yang 
sama, tapi parameter yang berbeda baik dari segi jumlah maupun jenis tipe 
datanya. 
# Override 
 Override terjadi saat sebuah kelas turunan (subclass) menulis ulang metode 
yang sudah ada di kelas induknya (superclass). 
# Langkah-langkah Pembuatan Project dengan Overload dan Override
1.	Buat class yang berisi beberapa method yang memilki nama yang sama namun parameter yang berbeda, maka itu disebut overload.
2.	Buat class baru yang di extends dengan class Restoran, lalu isi dengan method yang memilki nama yang sama dengan method yang ada di superclass, itulah yang disebut override.
3.	Buat class main dan jalankan.
4.	Hasil output
# PBOO3
