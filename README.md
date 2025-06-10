<h1>🧩 Microservices Architecture with Spring Boot, Eureka & Docker</h1>

<p>
  Bu proje, <strong>Spring Boot</strong> ve <strong>Spring Cloud Eureka</strong> ile geliştirilmiş bir <em>Mikroservis Mimarisi</em> örneğidir. 
  Servisler birbirinden bağımsız olarak geliştirilmiş, ölçeklenebilirlik ve yönetilebilirlik göz önünde bulundurularak yapılandırılmıştır.
</p>

<h2>📁 Proje Yapısı</h2>

<pre>
C:.
├───.idea
├───.mvn
├───<strong>customer</strong>             # Müşteri servisi
│   └───src/main/java/com/bugra/customer
├───<strong>fraud</strong>                # Fraud (dolandırıcılık) kontrol servisi
│   └───src/main/java/com/bugra/eureka/fraud
├───<strong>eureka-server</strong>       # Eureka servis keşif sunucusu
│   └───src/main/java/com/bugra/eureka
├───<strong>database</strong>            # Veritabanı başlatma dosyaları
│   └───init
└───<strong>docker-compose.yml</strong>  # Tüm servisleri başlatmak için Docker Compose konfigürasyonu
</pre>

<h2>🧱 Kullanılan Teknolojiler</h2>
<ul>
  <li>Java 17</li>
  <li>Spring Boot</li>
  <li>Spring Web</li>
  <li>Spring Data JPA</li>
  <li>PostgreSQL</li>
  <li>Spring Cloud Eureka</li>
  <li>Maven</li>
  <li>Docker & Docker Compose</li>
</ul>

<h2>🔌 Servis Açıklamaları</h2>
<ul>
  <li><strong>Customer Service:</strong> Kullanıcı kayıtlarını yönetir.</li>
  <li><strong>Fraud Service:</strong> Kullanıcıların sahte olup olmadığını kontrol eder.</li>
  <li><strong>Eureka Server:</strong> Tüm servislerin birbirini keşfetmesini sağlar.</li>
</ul>

<h2>🚀 Başlatma Talimatları</h2>
<ol>
  <li>Veritabanı yapılandırmasını <code>database/init</code> klasörüne yerleştirin.</li>
  <li>Her mikroservisin içinde bulunan <code>Dockerfile</code> dosyaları ile Docker image'ları oluşturun.</li>
  <li>Proje kök dizinindeki <code>docker-compose.yml</code> dosyası ile tüm servisleri ayağa kaldırın:</li>
</ol>

<pre><code>docker-compose up --build</code></pre>

<h2>📬 İletişim</h2>
<p>
  Geliştirici: <strong>Buğra Karaahmetoğlu</strong><br>
  GitHub: <a href="https://github.com/Bugrakaraahmetoglu" target="_blank">github.com/Bugrakaraahmetoglu</a><br>
  LinkedIn: <a href="https://www.linkedin.com/in/bugra-karaahmetoglu-0297ba261/" target="_blank">linkedin.com/in/bugra-karaahmetoglu</a><br>
  Mail: <a href="mailto:bugrakaraahmetoglu@gmail.com">bugrakaraahmetoglu@gmail.com</a>
</p>
